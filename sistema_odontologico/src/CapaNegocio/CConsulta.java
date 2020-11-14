/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.InteraccionBD;
import CapaDiseño.ConsultaCliente;
import Encapsulamiento.ECliente;
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
public class CConsulta {

    private static String sql = "";

    public static ResultSet RecuperarInformacion() {
        try {
            InteraccionBD bd = new InteraccionBD();
            sql = "select concat(Nombre,' ',ApellidoPaterno,' ',ApellidoMaterno) as NombreCompleto, Cop, CelularClaro, CelularMovistar,Direccion,Departamento,Correo from doctor where IdDoctor=" + ECliente.getIdDoctor() + " ";
            return bd.Listar(sql);
        } catch (SQLException ex) {
            return null;
        }
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
            modelo.addColumn("DNI");
            modelo.addColumn("Id");

            ConsultaCliente.tblClienteConsulta.setModel(modelo);
            sql = "select ApellidoPaterno, ApellidoMaterno, Nombre, DNI, IdCliente from clientes where Nombre like '%" + ECliente.getNombre() + "%' and IdDoctor=" + ECliente.getIdDoctor() + " order by ApellidoPaterno;";
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
            ConsultaCliente.tblClienteConsulta.setModel(modelo);
            //ancho y altura de las celdas de la tabla
            TableColumn columna;
            columna = ConsultaCliente.tblClienteConsulta.getColumnModel().getColumn(0);
            columna.setPreferredWidth(130);
            columna.setMaxWidth(130);
            columna.setMinWidth(130);

            columna = ConsultaCliente.tblClienteConsulta.getColumnModel().getColumn(1);
            columna.setPreferredWidth(130);
            columna.setMaxWidth(130);
            columna.setMinWidth(130);

            columna = ConsultaCliente.tblClienteConsulta.getColumnModel().getColumn(2);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);

            columna = ConsultaCliente.tblClienteConsulta.getColumnModel().getColumn(3);
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
            ConsultaCliente.tblClienteConsulta.setRowHeight(30);

            ConsultaCliente.tblClienteConsulta.setDefaultRenderer(Object.class, new PintarCeldas());
        } catch (Exception ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
