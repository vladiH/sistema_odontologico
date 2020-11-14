/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.InteraccionBD;
import CapaDiseño.Cita;
import CapaDiseño.ClientesBuscados;
import CapaDiseño.ConsultarFecha;
import Encapsulamiento.ECita;
import Encapsulamiento.ECliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author vladimir
 */
public class CCita {

    static String sql = "";
    static Connection cn = null;
    static PreparedStatement pst = null;

    public static boolean Guardar() {

        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "insert into citas values ('" + ECita.getHora() + "','" + ECita.getFecha() + "'"
                    + ",'" + ECita.getMotivo() + "'," + ECita.getIdCliente() + "," + "NULL" + ");";
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

    public static boolean Guardar1() {

        try {
            int IdCliente = 0;
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "insert into clientes values ('" + ECliente.getApellidoPaterno() + "','" + ECliente.getApellidoMaterno() + "'"
                    + ",'" + ECliente.getNombre() + "','" + ECliente.getDNI() + "','" + ECliente.getTelefono() + "'," + ECliente.getIdDoctor() + "," + "NULL" + ");";
            bd.Guardar(sql);
            sql = "select IdCliente from clientes";
            ResultSet rs = bd.Listar(sql);
            while (rs.last()) {
                IdCliente = rs.getInt(1);
                break;
            }
            sql = "insert into cliente values (" + ECliente.getEdad() + ",'" + ECliente.getFechaNacimiento() + "'"
                    + ",'" + ECliente.getDireccion() + "','" + ECliente.getParentesco() + "'," + IdCliente + ");";
            bd.Guardar(sql);
            sql = "insert into citas values ('" + ECita.getHora() + "','" + ECita.getFecha() + "'"
                    + ",'" + ECita.getMotivo() + "'," + IdCliente + "," + "NULL" + ");";
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

            ClientesBuscados.tblClientesBuscados.setModel(modelo);
            sql = "select ApellidoPaterno, ApellidoMaterno, Nombre, Telefono, IdCliente from clientes where Nombre like '%" + ECliente.getNombre() + "%' and IdDoctor=" + ECliente.getIdDoctor() + " order by ApellidoPaterno;";
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
            ClientesBuscados.tblClientesBuscados.setModel(modelo);
            //ancho y altura de las celdas de la tabla
            TableColumn columna;
            columna = ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(0);
            columna.setPreferredWidth(130);
            columna.setMaxWidth(130);
            columna.setMinWidth(130);

            columna = ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(1);
            columna.setPreferredWidth(130);
            columna.setMaxWidth(130);
            columna.setMinWidth(130);

            columna = ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(2);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

            columna = ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(3);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

//            //centramos elementos de la tabla
//            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//            //cabeceras
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//            //celdas
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(3).setCellRenderer(Alinear);
            ClientesBuscados.tblClientesBuscados.setRowHeight(30);

            ClientesBuscados.tblClientesBuscados.setDefaultRenderer(Object.class, new PintarCeldas());
        } catch (Exception ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Consulta() {
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
            modelo.addColumn("Hora");
            modelo.addColumn("Fecha");

            ConsultarFecha.tblConsultarFecha.setModel(modelo);
            sql = "select ApellidoPaterno, ApellidoMaterno, Nombre, Hora, Fecha from citas c inner join clientes cl on c.IdCliente=cl.IdCliente and c.Fecha like '%" + ECita.getFecha() + "%' and IdDoctor=" + ECliente.getIdDoctor() + " order by c.Fecha";
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
            ConsultarFecha.tblConsultarFecha.setModel(modelo);
            //ancho y altura de las celdas de la tabla
            TableColumn columna;
            columna = ConsultarFecha.tblConsultarFecha.getColumnModel().getColumn(0);
            columna.setPreferredWidth(130);
            columna.setMaxWidth(130);
            columna.setMinWidth(130);

            columna = ConsultarFecha.tblConsultarFecha.getColumnModel().getColumn(1);
            columna.setPreferredWidth(130);
            columna.setMaxWidth(130);
            columna.setMinWidth(130);

            columna = ConsultarFecha.tblConsultarFecha.getColumnModel().getColumn(2);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

            columna = ConsultarFecha.tblConsultarFecha.getColumnModel().getColumn(3);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

            columna = ConsultarFecha.tblConsultarFecha.getColumnModel().getColumn(4);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

//            //centramos elementos de la tabla
//            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//            //cabeceras
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//            //celdas
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//            ClientesBuscados.tblClientesBuscados.getColumnModel().getColumn(3).setCellRenderer(Alinear);
            ConsultarFecha.tblConsultarFecha.setRowHeight(30);

            ConsultarFecha.tblConsultarFecha.setDefaultRenderer(Object.class, new PintarCeldas());
        } catch (Exception ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Listar_Por_Fecha() {
        try {
            InteraccionBD bd = new InteraccionBD();
            DefaultTableModel modelo = new DefaultTableModel() {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };//( DefaultTableModel) formCliente.tblCliente.getModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora");
            modelo.addColumn("IdCliente");
            modelo.addColumn("IdCita");
            //modelo de dias de la semana
            DefaultTableModel modelo1 = new DefaultTableModel() {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };//( DefaultTableModel) formCliente.tblCliente.getModel();
            modelo1.addColumn("Nombre");
            modelo1.addColumn("Fecha");
            modelo1.addColumn("Hora");
            modelo1.addColumn("IdCliente");
            modelo1.addColumn("IdCita");

            DefaultTableModel modelo2 = new DefaultTableModel() {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };//( DefaultTableModel) formCliente.tblCliente.getModel();
            modelo2.addColumn("Nombre");
            modelo2.addColumn("Fecha");
            modelo2.addColumn("Hora");
            modelo2.addColumn("IdCliente");
            modelo2.addColumn("IdCita");

            DefaultTableModel modelo3 = new DefaultTableModel() {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };//( DefaultTableModel) formCliente.tblCliente.getModel();
            modelo3.addColumn("Nombre");
            modelo3.addColumn("Fecha");
            modelo3.addColumn("Hora");
            modelo3.addColumn("IdCliente");
            modelo3.addColumn("IdCita");

            DefaultTableModel modelo4 = new DefaultTableModel() {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };//( DefaultTableModel) formCliente.tblCliente.getModel();
            modelo4.addColumn("Nombre");
            modelo4.addColumn("Fecha");
            modelo4.addColumn("Hora");
            modelo4.addColumn("IdCliente");
            modelo4.addColumn("IdCita");

            DefaultTableModel modelo5 = new DefaultTableModel() {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };//( DefaultTableModel) formCliente.tblCliente.getModel();
            modelo5.addColumn("Nombre");
            modelo5.addColumn("Fecha");
            modelo5.addColumn("Hora");
            modelo5.addColumn("IdCliente");
            modelo5.addColumn("IdCita");

            DefaultTableModel modelo6 = new DefaultTableModel() {

                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };//( DefaultTableModel) formCliente.tblCliente.getModel();
            modelo6.addColumn("Nombre");
            modelo6.addColumn("Fecha");
            modelo6.addColumn("Hora");
            modelo6.addColumn("IdCliente");
            modelo6.addColumn("IdCita");
            Cita.tbListaCitas.setModel(modelo);
            //tablas por semana
            Cita.tbSemana.setModel(modelo1);
            Cita.tbSemana1.setModel(modelo2);
            Cita.tbSemana2.setModel(modelo3);
            Cita.tbSemana3.setModel(modelo4);
            Cita.tbSemana4.setModel(modelo5);
            Cita.tbSemana5.setModel(modelo6);

            sql = "select Nombre, Fecha, Hora, c.IdCliente, c.IdCita from citas c inner join clientes cl on c.IdCliente=cl.IdCliente and c.Fecha like '%" + ECita.getFecha() + "%' and IdDoctor=" + ECliente.getIdDoctor() + " order by c.Fecha";
            ResultSet rs = bd.Listar(sql);
            String[] datos = new String[5];
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = Errores.FormatoFecha(rs.getString(2));
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                String fecha = Errores.FormatoFecha(rs.getString(2));
                modelo.addRow(datos);
                if (getDiaSemana(fecha) == 2) {
                    modelo1.addRow(datos);
                    Lunes(modelo1);
                } else if (getDiaSemana(fecha) == 3) {
                    modelo2.addRow(datos);
                    Martes(modelo2);
                } else if (getDiaSemana(fecha) == 4) {
                    modelo3.addRow(datos);
                    Miercoles(modelo3);
                } else if (getDiaSemana(fecha) == 5) {
                    modelo4.addRow(datos);
                    Jueves(modelo4);
                } else if (getDiaSemana(fecha) == 6) {
                    modelo5.addRow(datos);
                    Viernes(modelo5);
                } else if (getDiaSemana(fecha) == 7) {
                    modelo6.addRow(datos);
                    Sabado(modelo6);
                }

            }
            Cita.tbListaCitas.setModel(modelo);
            //ancho y altura de las celdas de la tabla
            TableColumn columna;
            columna = Cita.tbListaCitas.getColumnModel().getColumn(0);
            columna.setPreferredWidth(130);
            columna.setMaxWidth(130);
            columna.setMinWidth(130);

            columna = Cita.tbListaCitas.getColumnModel().getColumn(1);
            columna.setPreferredWidth(80);
            columna.setMaxWidth(80);
            columna.setMinWidth(80);

            columna = Cita.tbListaCitas.getColumnModel().getColumn(2);
            columna.setPreferredWidth(80);
            columna.setMaxWidth(80);
            columna.setMinWidth(80);

            columna = Cita.tbListaCitas.getColumnModel().getColumn(3);
            columna.setPreferredWidth(0);
            columna.setMaxWidth(0);
            columna.setMinWidth(0);

            //centramos elementos de la tabla
//            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//            Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//            //cabeceras
//            Cita.tbListaCitas.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//            Cita.tbListaCitas.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//            Cita.tbListaCitas.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//            Cita.tbListaCitas.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//            //celdas
//            Cita.tbListaCitas.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//            Cita.tbListaCitas.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//            Cita.tbListaCitas.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//            Cita.tbListaCitas.getColumnModel().getColumn(3).setCellRenderer(Alinear);
            Cita.tbListaCitas.setRowHeight(30);
            Cita.tbListaCitas.setDefaultRenderer(Object.class, new PintarCeldas());
        } catch (Exception ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getDiaSemana(String fecha) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaActual = null;
            fechaActual = df.parse(fecha);
            GregorianCalendar fechaCalendario = new GregorianCalendar();
            fechaCalendario.setTime(fechaActual);
            int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
            return diaSemana;
        } catch (Exception ex) {
            return -1;
        }
    }

    public static void Lunes(DefaultTableModel modelo) {
        Cita.tbSemana.setModel(modelo);
        //ancho y altura de las celdas de la tabla
        TableColumn columna;
        columna = Cita.tbSemana.getColumnModel().getColumn(0);
        columna.setPreferredWidth(140);
        columna.setMaxWidth(140);
        columna.setMinWidth(140);

        columna = Cita.tbSemana.getColumnModel().getColumn(1);
        columna.setPreferredWidth(85);
        columna.setMaxWidth(85);
        columna.setMinWidth(85);

        columna = Cita.tbSemana.getColumnModel().getColumn(2);
        columna.setPreferredWidth(80);
        columna.setMaxWidth(80);
        columna.setMinWidth(80);

        columna = Cita.tbSemana.getColumnModel().getColumn(3);
        columna.setPreferredWidth(0);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);

//        //centramos elementos de la tabla
//        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//        //cabeceras
//        Cita.tbSemana.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//        Cita.tbSemana.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//        Cita.tbSemana.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//        Cita.tbSemana.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//        //celdas
//        Cita.tbSemana.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//        Cita.tbSemana.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//        Cita.tbSemana.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//        Cita.tbSemana.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        Cita.tbSemana.setRowHeight(30);
        Cita.tbSemana.setDefaultRenderer(Object.class, new PintarCeldas());
    }

    public static void Martes(DefaultTableModel modelo) {
        Cita.tbSemana1.setModel(modelo);
        //ancho y altura de las celdas de la tabla
        TableColumn columna;
        columna = Cita.tbSemana1.getColumnModel().getColumn(0);
        columna.setPreferredWidth(140);
        columna.setMaxWidth(140);
        columna.setMinWidth(140);

        columna = Cita.tbSemana1.getColumnModel().getColumn(1);
        columna.setPreferredWidth(85);
        columna.setMaxWidth(85);
        columna.setMinWidth(85);

        columna = Cita.tbSemana1.getColumnModel().getColumn(2);
        columna.setPreferredWidth(80);
        columna.setMaxWidth(80);
        columna.setMinWidth(80);

        columna = Cita.tbSemana1.getColumnModel().getColumn(3);
        columna.setPreferredWidth(0);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);

        //centramos elementos de la tabla
//        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//        //cabeceras
//        Cita.tbSemana1.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//        Cita.tbSemana1.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//        Cita.tbSemana1.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//        Cita.tbSemana1.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//        //celdas
//        Cita.tbSemana1.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//        Cita.tbSemana1.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//        Cita.tbSemana1.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//        Cita.tbSemana1.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        Cita.tbSemana1.setRowHeight(30);
        Cita.tbSemana1.setDefaultRenderer(Object.class, new PintarCeldas());
    }

    public static void Miercoles(DefaultTableModel modelo) {
        Cita.tbSemana2.setModel(modelo);
        //ancho y altura de las celdas de la tabla
        TableColumn columna;
        columna = Cita.tbSemana2.getColumnModel().getColumn(0);
        columna.setPreferredWidth(140);
        columna.setMaxWidth(140);
        columna.setMinWidth(140);

        columna = Cita.tbSemana2.getColumnModel().getColumn(1);
        columna.setPreferredWidth(85);
        columna.setMaxWidth(85);
        columna.setMinWidth(85);

        columna = Cita.tbSemana2.getColumnModel().getColumn(2);
        columna.setPreferredWidth(80);
        columna.setMaxWidth(80);
        columna.setMinWidth(80);

        columna = Cita.tbSemana2.getColumnModel().getColumn(3);
        columna.setPreferredWidth(0);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);

        //centramos elementos de la tabla
//        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//        //cabeceras
//        Cita.tbSemana2.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//        Cita.tbSemana2.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//        Cita.tbSemana2.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//        Cita.tbSemana2.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//        //celdas
//        Cita.tbSemana2.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//        Cita.tbSemana2.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//        Cita.tbSemana2.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//        Cita.tbSemana2.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        Cita.tbSemana2.setRowHeight(30);
        Cita.tbSemana2.setDefaultRenderer(Object.class, new PintarCeldas());
    }

    public static void Jueves(DefaultTableModel modelo) {
        Cita.tbSemana3.setModel(modelo);
        //ancho y altura de las celdas de la tabla
        TableColumn columna;
        columna = Cita.tbSemana3.getColumnModel().getColumn(0);
        columna.setPreferredWidth(140);
        columna.setMaxWidth(140);
        columna.setMinWidth(140);

        columna = Cita.tbSemana3.getColumnModel().getColumn(1);
        columna.setPreferredWidth(85);
        columna.setMaxWidth(85);
        columna.setMinWidth(85);

        columna = Cita.tbSemana3.getColumnModel().getColumn(2);
        columna.setPreferredWidth(80);
        columna.setMaxWidth(80);
        columna.setMinWidth(80);

        columna = Cita.tbSemana3.getColumnModel().getColumn(3);
        columna.setPreferredWidth(0);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);

        //centramos elementos de la tabla
//        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//        //cabeceras
//        Cita.tbSemana3.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//        Cita.tbSemana3.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//        Cita.tbSemana3.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//        Cita.tbSemana3.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//        //celdas
//        Cita.tbSemana3.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//        Cita.tbSemana3.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//        Cita.tbSemana3.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//        Cita.tbSemana3.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        Cita.tbSemana3.setRowHeight(30);
        Cita.tbSemana3.setDefaultRenderer(Object.class, new PintarCeldas());
    }

    public static void Viernes(DefaultTableModel modelo) {
        Cita.tbSemana4.setModel(modelo);
        //ancho y altura de las celdas de la tabla
        TableColumn columna;
        columna = Cita.tbSemana4.getColumnModel().getColumn(0);
        columna.setPreferredWidth(140);
        columna.setMaxWidth(140);
        columna.setMinWidth(140);

        columna = Cita.tbSemana4.getColumnModel().getColumn(1);
        columna.setPreferredWidth(85);
        columna.setMaxWidth(85);
        columna.setMinWidth(85);

        columna = Cita.tbSemana4.getColumnModel().getColumn(2);
        columna.setPreferredWidth(80);
        columna.setMaxWidth(80);
        columna.setMinWidth(80);

        columna = Cita.tbSemana4.getColumnModel().getColumn(3);
        columna.setPreferredWidth(0);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);

        //centramos elementos de la tabla
//        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//        //cabeceras
//        Cita.tbSemana4.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//        Cita.tbSemana4.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//        Cita.tbSemana4.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//        Cita.tbSemana4.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//        //celdas
//        Cita.tbSemana4.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//        Cita.tbSemana4.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//        Cita.tbSemana4.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//        Cita.tbSemana.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        Cita.tbSemana4.setRowHeight(30);
        Cita.tbSemana4.setDefaultRenderer(Object.class, new PintarCeldas());
    }

    public static void Sabado(DefaultTableModel modelo) {
        Cita.tbSemana5.setModel(modelo);
        //ancho y altura de las celdas de la tabla
        TableColumn columna;
        columna = Cita.tbSemana5.getColumnModel().getColumn(0);
        columna.setPreferredWidth(140);
        columna.setMaxWidth(140);
        columna.setMinWidth(140);

        columna = Cita.tbSemana5.getColumnModel().getColumn(1);
        columna.setPreferredWidth(85);
        columna.setMaxWidth(85);
        columna.setMinWidth(85);

        columna = Cita.tbSemana5.getColumnModel().getColumn(2);
        columna.setPreferredWidth(80);
        columna.setMaxWidth(80);
        columna.setMinWidth(80);

        columna = Cita.tbSemana5.getColumnModel().getColumn(3);
        columna.setPreferredWidth(0);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);

        //centramos elementos de la tabla
//        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
//        Alinear.setHorizontalAlignment(SwingConstants.CENTER);//.LEFT .RIGHT .CENTER
//
//        //cabeceras
//        Cita.tbSemana5.getColumnModel().getColumn(0).setHeaderRenderer(Alinear);
//        Cita.tbSemana5.getColumnModel().getColumn(1).setHeaderRenderer(Alinear);
//        Cita.tbSemana5.getColumnModel().getColumn(2).setHeaderRenderer(Alinear);
//        Cita.tbSemana5.getColumnModel().getColumn(3).setHeaderRenderer(Alinear);
//        //celdas
//        Cita.tbSemana5.getColumnModel().getColumn(0).setCellRenderer(Alinear);
//        Cita.tbSemana5.getColumnModel().getColumn(1).setCellRenderer(Alinear);
//        Cita.tbSemana5.getColumnModel().getColumn(2).setCellRenderer(Alinear);
//        Cita.tbSemana5.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        Cita.tbSemana5.setRowHeight(30);
        Cita.tbSemana5.setDefaultRenderer(Object.class, new PintarCeldas());
    }

    public static ResultSet BuscarId() {
        try {
            InteraccionBD bd = new InteraccionBD();
            sql = "select ApellidoPaterno, ApellidoMaterno, Nombre,DNI, Telefono, Hora, Fecha, Motivo, cl.IdCliente "
                    + "from citas c inner join clientes cl on c.IdCliente=cl.IdCliente and c.IdCliente=" + ECita.getIdCliente() + " and c.IdCita=" + ECita.getIdCita() + " ;";

            return bd.Listar(sql);
        } catch (Exception ex) {
            return null;
        }
    }

    public static boolean Modificar() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "update citas set Hora='" + ECita.getHora() + "', Fecha='" + ECita.getFecha() + "', Motivo='" + ECita.getMotivo() + "' where IdCita=" + ECita.getIdCita() + ";";
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
            sql = "delete from citas where IdCliente=" + ECita.getIdCliente() + " and IdCita=" + ECita.getIdCita() + ";";
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
