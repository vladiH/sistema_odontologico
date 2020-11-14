/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.InteraccionBD;
import CapaDiseño.Egresos;
import CapaDiseño.ProveedoresBuscados;
import Encapsulamiento.ECliente;
import Encapsulamiento.EEgresos;
import Encapsulamiento.EEgresosVsIngresos;
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
public class CEgreso {

    static String sql = "";
    static Connection cn = null;
    static PreparedStatement pst = null;

    public static boolean Guardar() {
        try {
            int IdProveedor = 0;
            int IdMaterial = 0;
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "insert into proveedor values ('" + EEgresos.getApellidoPaterno() + "','" + EEgresos.getApellidoMaterno() + "'"
                    + ",'" + EEgresos.getNombre() + "','" + EEgresos.getTelefono() + "','" + EEgresos.getRazonSocial() + "'," + EEgresos.getIdDoctor() + "," + "NULL" + ");";
            bd.Guardar(sql);
            sql = "select IdProveedor from proveedor";
            ResultSet rs = bd.Listar(sql);
            while (rs.next()) {
                IdProveedor = rs.getInt(1);
            }
            sql = "insert into material values ('" + EEgresos.getNombreMaterial() + "','" + EEgresos.getPrecio() + "'"
                    + ",'" + EEgresos.getDescripcion() + "'," + "NULL" + ");";
            bd.Guardar(sql);
            sql = "select IdMaterial from material";
            rs = bd.Listar(sql);
            while (rs.next()) {
                IdMaterial = rs.getInt(1);
            }
            sql = "insert into material_proveedor values ('" + EEgresos.getFecha() + "','" + EEgresos.getHora() + "'"
                    + "," + IdProveedor + "," + IdMaterial + ");";
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

    public static boolean Guardar_Proveedor_Existente() {
        try {
            ResultSet rs;
            int IdMaterial = 0;
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "insert into material values ('" + EEgresos.getNombreMaterial() + "','" + EEgresos.getPrecio() + "'"
                    + ",'" + EEgresos.getDescripcion() + "'," + "NULL" + ");";
            bd.Guardar(sql);
            sql = "select IdMaterial from material";
            rs = bd.Listar(sql);
            while (rs.next()) {
                IdMaterial = rs.getInt(1);
            }
            sql = "insert into material_proveedor values ('" + EEgresos.getFecha() + "','" + EEgresos.getHora() + "'"
                    + "," + EEgresos.getIdProveedor() + "," + IdMaterial + ");";
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

    public static void Listar() {
        try {
            InteraccionBD bd = new InteraccionBD();
            DefaultTableModel modelo = new DefaultTableModel() {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };//( DefaultTableModel) formCliente.tblCliente.getModel();
            modelo.addColumn("Apellido Paterno");
            modelo.addColumn("Apellido Materno");
            modelo.addColumn("Nombre");
            modelo.addColumn("Telefono");
            modelo.addColumn("Id");

            ProveedoresBuscados.tblClientesBuscados.setModel(modelo);
            sql = "select ApellidoPaterno, ApellidoMaterno, Nombre, Telefono, IdProveedor from proveedor where Nombre like '%" + EEgresos.getNombre() + "%' and IdDoctor=" + ECliente.getIdDoctor() + " order by ApellidoPaterno;";
            ResultSet rs = bd.Listar(sql);
            String[] datos = new String[5];
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);

            }
            ProveedoresBuscados.tblClientesBuscados.setModel(modelo);
            //ancho y altura de las celdas de la tabla
            TableColumn columna;
            columna = ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(0);
            columna.setPreferredWidth(130);
            columna.setMaxWidth(130);
            columna.setMinWidth(130);

            columna = ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(1);
            columna.setPreferredWidth(130);
            columna.setMaxWidth(130);
            columna.setMinWidth(130);

            columna = ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(2);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

            columna = ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(3);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

            //centramos elementos de la tabla
//            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//            //cabeceras
//            ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//            ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//            ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//            ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//            //celdas
//            ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//            ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//            ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//            ProveedoresBuscados.tblClientesBuscados.getColumnModel().getColumn(3).setCellRenderer(Alinear);
            ProveedoresBuscados.tblClientesBuscados.setRowHeight(30);
            ProveedoresBuscados.tblClientesBuscados.setDefaultRenderer(Object.class, new PintarCeldas());
        } catch (Exception ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Double Listar_Egresos_Proveedor() {
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
            modelo.addColumn("Proveedor");
            modelo.addColumn("Telefono");
            modelo.addColumn("Razon Social");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora");
            modelo.addColumn("Material");
            modelo.addColumn("S./");
            modelo.addColumn("Descripcion");
            modelo.addColumn("IdMaterial");
            modelo.addColumn("IdProveedor");

            Egresos.tbEgresos.setModel(modelo);
            sql = "CREATE TEMPORARY TABLE IF NOT EXISTS auxiliar AS (SELECT ApellidoPaterno, ApellidoMaterno,Nombre as NombreProveedor,Telefono, RazonSocial, Fecha, Hora, mp.IdMaterial, p.IdProveedor "
                    + "FROM proveedor p inner join material_proveedor mp on p.IdProveedor=mp.IdProveedor and mp.Fecha like '%" + EEgresos.getFecha() + "%' and IdDoctor=" + ECliente.getIdDoctor() + ");";
            bd.Modificar(sql);
            cn.commit();
            sql = "select ApellidoPaterno, ApellidoMaterno,NombreProveedor, Telefono, RazonSocial, Fecha, Hora, Nombre as NombreMaterial, "
                    + "Importe, Descripcion, a.IdMaterial, a.IdProveedor from auxiliar a inner join material m on a.IdMaterial=m.IdMaterial order by a.Fecha";
            ResultSet rs = bd.Listar(sql);
            String[] datos = new String[12];
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = Errores.FormatoFecha(rs.getString(6));
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                double total = Double.parseDouble(rs.getString(9));
                datos[8] = String.valueOf(total);
                Total = Total + total;
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                modelo.addRow(datos);

            }

            Egresos.tbEgresos.setModel(modelo);
            //ancho y altura de las celdas de la tabla
            TableColumn columna;
            columna = Egresos.tbEgresos.getColumnModel().getColumn(0);
            columna.setPreferredWidth(0);
            columna.setMaxWidth(0);
            columna.setMinWidth(0);
//115
            columna = Egresos.tbEgresos.getColumnModel().getColumn(1);
            columna.setPreferredWidth(0);
            columna.setMaxWidth(0);
            columna.setMinWidth(0);

            columna = Egresos.tbEgresos.getColumnModel().getColumn(2);
            columna.setPreferredWidth(120);
            columna.setMaxWidth(120);
            columna.setMinWidth(120);

            columna = Egresos.tbEgresos.getColumnModel().getColumn(3);
            columna.setPreferredWidth(80);
            columna.setMaxWidth(80);
            columna.setMinWidth(80);

            columna = Egresos.tbEgresos.getColumnModel().getColumn(4);
            columna.setPreferredWidth(110);
            columna.setMaxWidth(110);
            columna.setMinWidth(110);

            columna = Egresos.tbEgresos.getColumnModel().getColumn(5);
            columna.setPreferredWidth(70);
            columna.setMaxWidth(70);
            columna.setMinWidth(70);

            columna = Egresos.tbEgresos.getColumnModel().getColumn(6);
            columna.setPreferredWidth(0);
            columna.setMaxWidth(0);
            columna.setMinWidth(0);

            columna = Egresos.tbEgresos.getColumnModel().getColumn(7);
            columna.setPreferredWidth(90);
            columna.setMaxWidth(90);
            columna.setMinWidth(90);

            columna = Egresos.tbEgresos.getColumnModel().getColumn(8);
            columna.setPreferredWidth(50);
            columna.setMaxWidth(50);
            columna.setMinWidth(50);

            columna = Egresos.tbEgresos.getColumnModel().getColumn(9);
            columna.setPreferredWidth(200);
            columna.setMaxWidth(200);
            columna.setMinWidth(200);

            columna = Egresos.tbEgresos.getColumnModel().getColumn(10);
            columna.setPreferredWidth(0);
            columna.setMaxWidth(0);
            columna.setMinWidth(0);

            columna = Egresos.tbEgresos.getColumnModel().getColumn(11);
            columna.setPreferredWidth(0);
            columna.setMaxWidth(0);
            columna.setMinWidth(0);

            //centramos elementos de la tabla
//            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//            //cabeceras
//            Egresos.tbEgresos.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(4).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(5).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(6).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(7).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(8).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(9).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(10).setHeaderRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(11).setHeaderRenderer(Alinear);
//            //celdas
//            Egresos.tbEgresos.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(3).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(4).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(5).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(6).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(7).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(8).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(9).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(10).setCellRenderer(Alinear);
//            Egresos.tbEgresos.getColumnModel().getColumn(11).setCellRenderer(Alinear);
            Egresos.tbEgresos.setRowHeight(30);
            Egresos.tbEgresos.setDefaultRenderer(Object.class, new PintarCeldas());
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
            sql = "CREATE TEMPORARY TABLE IF NOT EXISTS auxiliar AS (SELECT Fecha, mp.IdMaterial FROM proveedor p inner join material_proveedor mp on p.IdProveedor=mp.IdProveedor and mp.Fecha like '%" + EEgresos.getFecha() + "%' and IdDoctor=" + ECliente.getIdDoctor() + ");";
            bd.Modificar(sql);
            sql = "CREATE TEMPORARY TABLE IF NOT EXISTS proveedor_material AS (select Fecha,Importe from auxiliar a inner join material m on a.IdMaterial=m.IdMaterial);";
            bd.Modificar(sql);
            sql = "select Fecha,Sum(Importe) as Total from proveedor_material group by Fecha";
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
            sql = "CREATE TEMPORARY TABLE IF NOT EXISTS auxiliar AS (SELECT Fecha, mp.IdMaterial FROM proveedor p inner join material_proveedor mp on p.IdProveedor=mp.IdProveedor and mp.Fecha like '%" + EEgresosVsIngresos.getFechaEgresos() + "%' and IdDoctor=" + ECliente.getIdDoctor() + ");";
            bd.Modificar(sql);
            sql = "CREATE TEMPORARY TABLE IF NOT EXISTS proveedor_material AS (select Fecha,Importe from auxiliar a inner join material m on a.IdMaterial=m.IdMaterial);";
            bd.Modificar(sql);
            sql = "select Fecha,Sum(Importe) as Total from proveedor_material group by Fecha";
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

    public static boolean Eliminar() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "delete from material where IdMaterial=" + EEgresos.getIdEgreso() + ";";
            bd.Eliminar(sql);
            cn.commit();
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
