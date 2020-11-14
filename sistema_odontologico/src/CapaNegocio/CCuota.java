/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.InteraccionBD;
import CapaDiseño.Cuotas;
import Encapsulamiento.ECuota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author vladimir
 */
public class CCuota {

    static String sql = "";
    static Connection cn = null;
    static PreparedStatement pst = null;

    public static boolean Guardar() {
        try {
            int IdHistorial = 0;
            ResultSet rs = null;
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "select IdHistorial from historial_clinico where IdCrearH=" + ECuota.getIdCrearHistorial() + ";";
            rs = bd.Listar(sql);
            while (rs.next()) {
                IdHistorial = rs.getInt(1);
            }
            sql = "insert into cuota values ('" + ECuota.getFecha() + "','" + ECuota.getNroCuota() + "'"
                    + ",'" + ECuota.getImporte() + "','" + ECuota.getHora() + "'," + IdHistorial + "," + ECuota.getIdCliente() + "," + "NULL" + ");";
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

    public static boolean Eliminar() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "delete from cuota where IdCuota=" + ECuota.getIdCuota() + ";";
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

    public static void Listar() {

        try {

            ResultSet rs = null;
            InteraccionBD bd = new InteraccionBD();
            DefaultTableModel modelo = new DefaultTableModel() {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };//( DefaultTableModel) formCliente.tblCliente.getModel();
            modelo.addColumn("N°");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora");
            modelo.addColumn("Deja S./");
            modelo.addColumn("Saldo S./");
            modelo.addColumn("Id");
            Cuotas.tblCuotas.setModel(modelo);

            sql = "select NroCuota, Fecha, Hora, Importe, IdCuota from cuota where IdCliente=" + ECuota.getIdCliente() + " order by Fecha;";
            rs = bd.Listar(sql);
            String[] datos = new String[6];
            double saldo = 0;
            while (rs.next()) {
                saldo = saldo + rs.getDouble(4);
                datos[0] = rs.getString(1);
                datos[1] = Errores.FormatoFecha(rs.getString(2));
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[5] = rs.getString(5);
                datos[4] = String.valueOf(Double.parseDouble(Cuotas.txtPrecioPactado.getText()) - saldo);
                modelo.addRow(datos);

            }
            Cuotas.tblCuotas.getRowCount();

            Cuotas.tblCuotas.setModel(modelo);
            //ancho y altura de las celdas de la tabla
            TableColumn columna;
            columna = Cuotas.tblCuotas.getColumnModel().getColumn(0);
            columna.setPreferredWidth(30);
            columna.setMaxWidth(30);
            columna.setMinWidth(30);

            columna = Cuotas.tblCuotas.getColumnModel().getColumn(1);
            columna.setPreferredWidth(120);
            columna.setMaxWidth(120);
            columna.setMinWidth(120);

            columna = Cuotas.tblCuotas.getColumnModel().getColumn(2);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

            columna = Cuotas.tblCuotas.getColumnModel().getColumn(3);
            columna.setPreferredWidth(120);
            columna.setMaxWidth(120);
            columna.setMinWidth(120);

            columna = Cuotas.tblCuotas.getColumnModel().getColumn(4);
            columna.setPreferredWidth(120);
            columna.setMaxWidth(120);
            columna.setMinWidth(120);

            //centramos elementos de la tabla
//            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//            //cabeceras
//            Cuotas.tblCuotas.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//            Cuotas.tblCuotas.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//            Cuotas.tblCuotas.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//            Cuotas.tblCuotas.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//            Cuotas.tblCuotas.getColumnModel().getColumn(4).setHeaderRenderer(Alinear);
//            //celdas
//            Cuotas.tblCuotas.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//            Cuotas.tblCuotas.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//            Cuotas.tblCuotas.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//            Cuotas.tblCuotas.getColumnModel().getColumn(3).setCellRenderer(Alinear);
//            Cuotas.tblCuotas.getColumnModel().getColumn(4).setCellRenderer(Alinear);
            Cuotas.tblCuotas.setRowHeight(30);
            Cuotas.tblCuotas.setDefaultRenderer(Object.class, new PintarCeldas());
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
