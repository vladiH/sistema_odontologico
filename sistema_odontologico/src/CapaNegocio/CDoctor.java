/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import Encapsulamiento.EDoctor;
import CapaDatos.InteraccionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vladimir
 */
public class CDoctor {

    static String sql = "";
    static Connection cn = null;
    static PreparedStatement pst = null;

    public static boolean Guardar() {
        try {
            sql = "insert into doctor values('" + EDoctor.getApellidoPaterno() + "','" + EDoctor.getApellidoMaterno() + "',"
                    + "'" + EDoctor.getNombre() + "','" + EDoctor.getUsuario() + "','" + EDoctor.getContrasena() + "',"
                    + "'" + EDoctor.getCOP() + "','" + EDoctor.getCelularClaro() + "','" + EDoctor.getCelularMovistar() + "','"
                    + EDoctor.getCorreo() + "','" + EDoctor.getDireccion() + "','" + EDoctor.getDepartamento() + "'," + "NULL" + ");";
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            bd.Guardar(sql);
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

    public static int Buscar() throws SQLException {
        sql = "select Contrasena, Nombre, ApellidoPaterno, ApellidoMaterno, IdDoctor from doctor where Usuario='" + EDoctor.getUsuario() + "';";
        InteraccionBD bd = new InteraccionBD();
        ResultSet rs = bd.Listar(sql);
        while (rs.next()) {
            String c = rs.getString(1);
            if (c.equals(EDoctor.getContrasena())) {
                Errores.Exito("BIEN VENIDO\n " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                return rs.getInt(5);
            }
        }
        return 0;
    }

    public static boolean Actualizar() {
        try {
            sql = "update doctor set Contrasena='" + EDoctor.getContrasena() + "' where Usuario='" + EDoctor.getUsuario() + "' and Contrasena='" + EDoctor.getNombre() + "';";
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            bd.Modificar(sql);
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
