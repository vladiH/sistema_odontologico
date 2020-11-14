/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.InteraccionBD;
import CapaDiseño.Ingreso;
import Encapsulamiento.ECliente;
import Encapsulamiento.EEgresosVsIngresos;
import Encapsulamiento.EIngresos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author vladimir
 */
public class CIngresos {

    static String sql = "";
    static Connection cn = null;
    static PreparedStatement pst = null;

    public static Double Listar_Ingresos() {
        try {
            double Total = 0;
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            DefaultTableModel modelo = new DefaultTableModel() {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };//( DefaultTableModel) formCliente.tblCliente.getModel();
            modelo.addColumn("Apellido Paterno");
            modelo.addColumn("Apellido Materno");
            modelo.addColumn("Nombre");
            modelo.addColumn("Fecha");
            modelo.addColumn("Total S./");

            Ingreso.tbIngresos.setModel(modelo);
            sql = "create temporary table aux1 as(select Fecha, Importe, IdCliente from cuota where Fecha like '%" + EIngresos.getFecha() + "%');";
            bd.Modificar(sql);
            sql = "create temporary table aux2 as(select c.ApellidoPaterno, c.ApellidoMaterno, c.Nombre, cu.Fecha,cu.Importe from clientes c inner join aux1 cu on c.IdCliente=cu.IdCliente and c.IdDoctor=" + ECliente.getIdDoctor() + ");";
            bd.Modificar(sql);
            sql = "select  ApellidoPaterno,ApellidoMaterno,Nombre, Fecha,sum(Importe) as Monto from aux2 group by ApellidoPaterno,ApellidoMaterno,Nombre,Fecha order by Fecha";
            ResultSet rs = bd.Listar(sql);
            String[] datos = new String[5];
            String Monto = "";
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = Errores.FormatoFecha(rs.getString(4));
                Monto = rs.getString(5);
                datos[4] = Monto;
                Total = Total + Double.parseDouble(Monto);
                modelo.addRow(datos);
            }

            Ingreso.tbIngresos.setModel(modelo);
            //ancho y altura de las celdas de la tabla
            TableColumn columna;
            columna = Ingreso.tbIngresos.getColumnModel().getColumn(0);
            columna.setPreferredWidth(200);
            columna.setMaxWidth(200);
            columna.setMinWidth(200);
//115
            columna = Ingreso.tbIngresos.getColumnModel().getColumn(1);
            columna.setPreferredWidth(200);
            columna.setMaxWidth(200);
            columna.setMinWidth(200);

            columna = Ingreso.tbIngresos.getColumnModel().getColumn(2);
            columna.setPreferredWidth(150);
            columna.setMaxWidth(150);
            columna.setMinWidth(150);

            columna = Ingreso.tbIngresos.getColumnModel().getColumn(3);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);
            columna = Ingreso.tbIngresos.getColumnModel().getColumn(4);
            columna.setPreferredWidth(90);
            columna.setMaxWidth(90);
            columna.setMinWidth(90);

            //centramos elementos de la tabla
//            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//            //cabeceras
//            Ingreso.tbIngresos.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//            Ingreso.tbIngresos.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//            Ingreso.tbIngresos.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//            Ingreso.tbIngresos.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//            Ingreso.tbIngresos.getColumnModel().getColumn(4).setHeaderRenderer(Alinear);
//
//            //celdas
//            Ingreso.tbIngresos.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//            Ingreso.tbIngresos.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//            Ingreso.tbIngresos.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//            Ingreso.tbIngresos.getColumnModel().getColumn(3).setCellRenderer(Alinear);
//            Ingreso.tbIngresos.getColumnModel().getColumn(4).setCellRenderer(Alinear);
            Ingreso.tbIngresos.setRowHeight(30);
            Ingreso.tbIngresos.setDefaultRenderer(Object.class, new PintarCeldas());
            cn.commit();
            return Total;
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
        return 0.0;
    }

    public static ResultSet Grafico() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "create temporary table aux1 as(select cu.Fecha,cu.Importe from clientes c inner join cuota cu on c.IdCliente=cu.IdCliente and cu.Fecha like '%" + EIngresos.getFecha() + "%' and c.IdDoctor=" + ECliente.getIdDoctor() + " order by cu.Fecha);";
            bd.Modificar(sql);

            sql = "select Fecha,sum(Importe) as Total from aux1 group by Fecha";
            
            cn.commit();
            return bd.Listar(sql);
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
        } 
//        finally {
//            System.out.println("cierra conexion a la base de datos");
//            try {
//                if (pst != null) {
//                    pst.close();
//                }
//                if (cn != null) {
//                    cn.close();
//                }
//            } catch (SQLException ex) {
//                System.err.println(ex.getMessage());
//            }
//        }
        return null;
    }

    public static ResultSet GraficoVs() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "create temporary table aux1 as(select cu.Fecha,cu.Importe from clientes c inner join cuota cu on c.IdCliente=cu.IdCliente and cu.Fecha like '%" + EEgresosVsIngresos.getFechaIngresos() + "%' and c.IdDoctor=" + ECliente.getIdDoctor() + " order by cu.Fecha);";
            bd.Modificar(sql);

            sql = "select Fecha,sum(Importe) as Total from aux1 group by Fecha";
            cn.commit();
            return bd.Listar(sql);
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
        } 
//        finally {
//            System.out.println("cierra conexion a la base de datos");
//            try {
//                if (pst != null) {
//                    pst.close();
//                }
//                if (cn != null) {
//                    cn.close();
//                }
//            } catch (SQLException ex) {
//                System.err.println(ex.getMessage());
//            }
//        }
        return null;
    }
}
