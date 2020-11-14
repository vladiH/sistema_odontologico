/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.InteraccionBD;
import Encapsulamiento.ECliente;
import CapaDiseño.Cliente;
import static CapaNegocio.CCita.cn;
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
public class CCliente {

    static String sql = "";
    static Connection cn = null;
    static PreparedStatement pst = null;

    public static boolean Guardar() {
        try {
            int IdCliente = 0;
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "insert into clientes values ('" + ECliente.getApellidoPaterno() + "','" + ECliente.getApellidoMaterno() + "'"
                    + ",'" + ECliente.getNombre() + "','" + ECliente.getDNI() + "','" + ECliente.getTelefono() + "'," + ECliente.getIdDoctor() + "," + "NULL" + ");";
            bd.Guardar(sql);
            sql = "select IdCliente from clientes where ApellidoPaterno='" + ECliente.getApellidoPaterno() + "' and ApellidoMaterno='" + ECliente.getApellidoMaterno()
                    + "' and DNI=" + ECliente.getDNI() + ";";
            ResultSet rs = bd.Listar(sql);
            while (rs.last()) {
                IdCliente = rs.getInt(1);
                break;
            }
            sql = "insert into cliente values (" + ECliente.getEdad() + ",'" + ECliente.getFechaNacimiento() + "'"
                    + ",'" + ECliente.getDireccion() + "','" + ECliente.getParentesco() + "'," + IdCliente + ");";
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

            Cliente.tblListaCliente.setModel(modelo);
            sql = "select ApellidoPaterno, ApellidoMaterno, Nombre, Telefono, IdCliente from clientes where IdDoctor=" + ECliente.getIdDoctor() + " order by ApellidoPaterno;";
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
            Cliente.tblListaCliente.setModel(modelo);
            //ancho y altura de las celdas de la tabla
            TableColumn columna;
            columna = Cliente.tblListaCliente.getColumnModel().getColumn(0);
            columna.setPreferredWidth(110);
            columna.setMaxWidth(110);
            columna.setMinWidth(105);

            columna = Cliente.tblListaCliente.getColumnModel().getColumn(1);
            columna.setPreferredWidth(110);
            columna.setMaxWidth(110);
            columna.setMinWidth(110);

            columna = Cliente.tblListaCliente.getColumnModel().getColumn(2);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

            columna = Cliente.tblListaCliente.getColumnModel().getColumn(3);
            columna.setPreferredWidth(90);
            columna.setMaxWidth(90);
            columna.setMinWidth(90);

            //centramos elementos de la tabla
//            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//
//            //cabeceras
//          
//            Cliente.tblListaCliente.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//            //celdas
//            Cliente.tblListaCliente.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(3).setCellRenderer(Alinear);
            Cliente.tblListaCliente.setRowHeight(30);

            Cliente.tblListaCliente.setDefaultRenderer(Object.class, new PintarCeldas());
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ResultSet Copiar_a_Formularios(int Codigo) {
        try {
            InteraccionBD bd = new InteraccionBD();
            sql = "select ApellidoPaterno, ApellidoMaterno, Nombre, DNI, Telefono, "
                    + "Edad,FechaNacimiento, Direccion, Parentesco from clientes c1 left outer join cliente c2 on c1.IdCliente=c2.IdCliente and c1.IdCliente=" + Codigo + " where c2.IdCliente is not null";
            return bd.Listar(sql);
        } catch (SQLException ex) {
            System.err.println(ex);
            return null;
        }

    }

    public static ResultSet Copiar_a_ComboBox() {
        try {
            InteraccionBD bd = new InteraccionBD();
            sql = "select NroHistorial from crear_historial where IdCliente=" + Cliente.txtIdCliente.getText() + ";";
            return bd.Listar(sql);
        } catch (SQLException ex) {
            System.err.println(ex);
            return null;
        }
    }

    public static boolean Actualizar() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "update clientes set ApellidoPaterno='" + ECliente.getApellidoPaterno() + "', ApellidoMaterno='" + ECliente.getApellidoMaterno() + "', Nombre='" + ECliente.getNombre() + "'"
                    + ", DNI=" + ECliente.getDNI() + ", Telefono=" + ECliente.getTelefono() + " where IdCliente=" + ECliente.getIdCliente() + ";";
            bd.Modificar(sql);
            sql = "update cliente set Edad='" + ECliente.getEdad() + "', FechaNacimiento='" + ECliente.getFechaNacimiento() + "', Direccion='" + ECliente.getDireccion() + "'"
                    + ", Parentesco='" + ECliente.getParentesco() + "' where IdCliente=" + ECliente.getIdCliente() + ";";
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

    public static boolean Eliminar() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "delete from clientes where IdCliente=" + ECliente.getIdCliente() + " and IdDoctor=" + ECliente.getIdDoctor() + ";";
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

    public static void Buscar(int Op, int idDoctor, String Fb) {
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

            Cliente.tblListaCliente.setModel(modelo);
            if (Op == 0) {
                sql = "select ApellidoPaterno, ApellidoMaterno, Nombre, Telefono, IdCliente from clientes where ApellidoPaterno like '%" + Fb + "%' and IdDoctor=" + idDoctor + " order by ApellidoPaterno;";
            }
            if (Op == 1) {
                sql = "select ApellidoPaterno, ApellidoMaterno, Nombre, Telefono, IdCliente from clientes where ApellidoMaterno like '%" + Fb + "%' and IdDoctor=" + idDoctor + " order by ApellidoMaterno;";
            }
            if (Op == 2) {
                sql = "select ApellidoPaterno, ApellidoMaterno, Nombre, Telefono, IdCliente from clientes where Nombre like '%" + Fb + "%' and IdDoctor=" + idDoctor + " order by Nombre;";
            }

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
            Cliente.tblListaCliente.setModel(modelo);
            //ancho y altura de las celdas de la tabla
            TableColumn columna;
            columna = Cliente.tblListaCliente.getColumnModel().getColumn(0);
            columna.setPreferredWidth(110);
            columna.setMaxWidth(110);
            columna.setMinWidth(110);

            columna = Cliente.tblListaCliente.getColumnModel().getColumn(1);
            columna.setPreferredWidth(110);
            columna.setMaxWidth(110);
            columna.setMinWidth(110);

            columna = Cliente.tblListaCliente.getColumnModel().getColumn(2);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

            columna = Cliente.tblListaCliente.getColumnModel().getColumn(3);
            columna.setPreferredWidth(90);
            columna.setMaxWidth(90);
            columna.setMinWidth(90);

            //centramos elementos de la tabla
//            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//            //cabeceras
//            Cliente.tblListaCliente.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//            //celdas
//            Cliente.tblListaCliente.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//            Cliente.tblListaCliente.getColumnModel().getColumn(3).setCellRenderer(Alinear);
//
//            Cliente.tblListaCliente.setRowHeight(50);
            Cliente.tblListaCliente.setRowHeight(30);

            Cliente.tblListaCliente.setDefaultRenderer(Object.class, new PintarCeldas());

        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
}
