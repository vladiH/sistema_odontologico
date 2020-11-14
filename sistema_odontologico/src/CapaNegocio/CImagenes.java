/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.InteraccionBD;
import CapaDiseño.Imagen;
import Encapsulamiento.EImagenes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author YURI VLADIMIR
 */
public class CImagenes {

    static String sql = "";
    static Connection cn = null;
    static PreparedStatement pst = null;

    public static void copiar(File original, File copia) {
        FileInputStream archivoOriginal = null;
        FileOutputStream archivoCopia = null;
        if ((original != null) && (copia != null)) {
            try {
                copia.createNewFile();
                archivoOriginal = new FileInputStream(original);
                archivoCopia = new FileOutputStream(copia);
//lectura por segmentos de 0.5MB
                byte buffer[] = new byte[512 * 1024];
                int nbLectura;
                while ((nbLectura = archivoOriginal.read(buffer)) != -1) {
                    archivoCopia.write(buffer, 0, nbLectura);
                }
            } catch (IOException ex) {
                Errores.Error("No se puede copiar imagen");
            }
        }
    }

    public static void Eliminar(File archivo) {
        if (archivo.delete()) {
            Errores.Exito("Borrado");
        } else {
            Errores.Error("No se puede eliminar");
        }
    }

    public static String ObtenerRuta() {
        return System.getProperties().getProperty("user.dir");
    }

    public static boolean Guardar() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);

            String[] imagenes = EImagenes.getNombres();
            for (int i = 0; i < imagenes.length; i++) {
                sql = "insert into imagen values ('" + imagenes[i] + "','" + EImagenes.getFecha() + "',"
                        + EImagenes.getIdHistorial() + "," + EImagenes.getIdCliente() + "," + "NULL" + ");";
                bd.Guardar(sql);
            }
            cn.commit();
            return true;
        } catch (SQLException ex) {
            System.err.println("ERROR: " + ex.getMessage());
            if (cn != null) {
                System.out.println("Rollback");
                try {
                    //deshace todos los cambios realizados en los datos
                    cn.rollback();
                } catch (SQLException ex1) {
                    System.err.println("No se pudo deshacer" + ex1.getMessage());
                }
            }
        } finally {
            System.out.println("cierra conexion a la base de datos");
            try {
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return false;
    }

    public static void Listar() {

        try {

            ResultSet rs = null;
            InteraccionBD bd = new InteraccionBD();
            DefaultListModel modelo = new DefaultListModel();

            sql = "select Imagen from imagen where IdCliente=" + EImagenes.getIdCliente() + " order by Fecha;";
            rs = bd.Listar(sql);
            String[] datos = new String[1];
            while (rs.next()) {
                datos[0] = rs.getString(1);
                modelo.addElement(datos[0]);
                Imagen.listImagen.setModel(modelo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String BuscarId() {

        try {

            ResultSet rs = null;
            InteraccionBD bd = new InteraccionBD();

            sql = "select IdImagen from imagen where IdCliente=" + EImagenes.getIdCliente() + " and IdHistorial=" + EImagenes.getIdHistorial() + " and Imagen='" + EImagenes.getNombre() + "';";
            rs = bd.Listar(sql);
            String[] datos = new String[1];
            while (rs.next()) {
                datos[0] = rs.getString(1);
            }
            return datos[0];
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static boolean Eliminar() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "delete from imagen where IdImagen=" + EImagenes.getIdCliente() + ";";
            bd.Eliminar(sql);
            cn.commit();
            return true;
        } catch (SQLException ex) {
            System.err.println("ERROR: " + ex.getMessage());
            if (cn != null) {
                System.out.println("Rollback");
                try {
                    //deshace todos los cambios realizados en los datos
                    cn.rollback();
                } catch (SQLException ex1) {
                    System.err.println("No se pudo deshacer" + ex1.getMessage());
                }
            }
        } finally {
            System.out.println("cierra conexion a la base de datos");
            try {
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return false;
    }
}
