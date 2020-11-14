/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.InteraccionBD;
import CapaDiseño.Cliente;
import Encapsulamiento.ECliente;
import Encapsulamiento.EPrecio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vladimir
 */
public class CPrecio {

    static String sql = "";
    static ResultSet rs = null;
    static Connection cn = null;
    static PreparedStatement pst = null;

    public static boolean GuardarHistorial() {
        try {
            int IdPrecio = 0;
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "insert into precio values ('" + EPrecio.getCepillaje() + "','"
                    + EPrecio.getCepilladoProfilaxico() + "','" + EPrecio.getFluorizacion()
                    + "','" + EPrecio.getBanqueamiento() + "','" + EPrecio.getCarieSimple()
                    + "','" + EPrecio.getCarieCompuesta()
                    + "','" + EPrecio.getCarieRecompuesta()
                    + "','" + EPrecio.getEndoMultiRadicular()
                    + "','" + EPrecio.getEndoUniRadicular() + "','" + EPrecio.getBioPulpectomia()
                    + "','" + EPrecio.getNecroPulpectomia() + "','" + EPrecio.getOrtodonciaI()
                    + "','" + EPrecio.getOrtodonciaII() + "','" + EPrecio.getRecementacion()
                    + "','" + EPrecio.getSellantes()
                    + "','" + EPrecio.getBarniz() + "','" + EPrecio.getCariostatico()
                    + "','" + EPrecio.getFibraVidrio() + "','" + EPrecio.getRaiz()
                    + "','" + EPrecio.getPosicionNormal() + "','" + EPrecio.getMolarRecta()
                    + "','" + EPrecio.getMolarQuirurgica() + "','" + EPrecio.getPuente1()
                    + "','" + EPrecio.getPuente2()
                    + "','" + EPrecio.getMetal()
                    + "','" + EPrecio.getIvocron() + "','" + EPrecio.getBelga()
                    + "','" + EPrecio.getPorcelana() + "','" + EPrecio.getCarrillas()
                    + "','" + EPrecio.getBaseMetalica() + "','" + EPrecio.getAcrilico()
                    + "','" + EPrecio.getProtesisTotal() + "'," + "NULL" + ");";
            bd.Guardar(sql);
            sql = "select IdPrecio from precio";
            rs = bd.Listar(sql);
            while (rs.next()) {
                IdPrecio = rs.getInt(1);
            }
            sql = "insert into precio_tratamiento values('" + Errores.FormatoFecha(Cliente.lbFecha.getText()) + "'," + ECliente.getIdDoctor() + "," + IdPrecio + ")";
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

    public static ResultSet Mostrar() {
        try {
            int IdPrecio = 0;
            InteraccionBD bd = new InteraccionBD();
            sql = "select IdPrecio from precio_tratamiento where IdDoctor=" + ECliente.getIdDoctor() + ";";
            rs = bd.Listar(sql);
            while (rs.last()) {
                IdPrecio = rs.getInt(1);
                break;
            }
            sql = "select * from precio where IdPrecio=" + IdPrecio + ";";
            return bd.Listar(sql);

        } catch (SQLException ex) {
            Logger.getLogger(CPrecio.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
