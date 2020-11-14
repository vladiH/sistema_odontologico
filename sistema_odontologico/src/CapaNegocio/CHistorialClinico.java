/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.InteraccionBD;
import CapaDiseño.Cliente;
import Encapsulamiento.ECliente;
import Encapsulamiento.EHistorial;
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
public class CHistorialClinico {

    static String sql = "";
    static Connection cn = null;
    static PreparedStatement pst = null;

    public static boolean Crear() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "insert into crear_historial values ('" + EHistorial.getFecha() + "','" + EHistorial.getHora() + "','" + EHistorial.getNroHistorial() + "','" + EHistorial.getTratamiento() + "','" + ECliente.getIdCliente() + "'," + "NULL" + ");";
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

    public static boolean EliminarHistorial() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "delete from crear_historial where IdCliente=" + Cliente.txtIdCliente.getText() + " and NroHistorial=" + Cliente.cbNroHistorial.getSelectedItem() + ";";
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

    public static ResultSet Recuperar_Id_Creacion_Historial() {
        try {
            InteraccionBD bd = new InteraccionBD();
            sql = "select IdCrearH, Fecha, Tratamiento from crear_historial where IdCliente=" + Cliente.txtIdCliente.getText() + " and NroHistorial=" + Cliente.cbNroHistorial.getSelectedItem() + ";";
            return bd.Listar(sql);
        } catch (SQLException ex) {
            return null;
        }
    }

    public static boolean GuardarHistorial() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "insert into historial_clinico values ('" + EHistorial.getCepillaje() + "','"
                    + EHistorial.getCepilladoProfilaxico() + "','" + EHistorial.getFluorizacion()
                    + "','" + EHistorial.getBanqueamiento() + "','" + EHistorial.getCarieSimple()
                    + "','" + EHistorial.getPieza1() + "','" + EHistorial.getCarieCompuesta()
                    + "','" + EHistorial.getPieza2() + "','" + EHistorial.getCarieRecompuesta()
                    + "','" + EHistorial.getPieza3() + "','" + EHistorial.getEndoMultiRadicular()
                    + "','" + EHistorial.getEndoUniRadicular() + "','" + EHistorial.getBioPulpectomia()
                    + "','" + EHistorial.getNecroPulpectomia() + "','" + EHistorial.getOrtodonciaI()
                    + "','" + EHistorial.getOrtodonciaII() + "','" + EHistorial.getRecementacion()
                    + "','" + EHistorial.getPieza4() + "','" + EHistorial.getSellantes()
                    + "','" + EHistorial.getBarniz() + "','" + EHistorial.getCariostatico()
                    + "','" + EHistorial.getFibraVidrio() + "','" + EHistorial.getRaiz()
                    + "','" + EHistorial.getPosicionNormal() + "','" + EHistorial.getMolarRecta()
                    + "','" + EHistorial.getMolarQuirurgica() + "','" + EHistorial.getPuente1()
                    + "','" + EHistorial.getPieza5() + "','" + EHistorial.getPuente2()
                    + "','" + EHistorial.getPieza6() + "','" + EHistorial.getMetal()
                    + "','" + EHistorial.getIvocron() + "','" + EHistorial.getBelga()
                    + "','" + EHistorial.getPorcelana() + "','" + EHistorial.getCarrillas()
                    + "','" + EHistorial.getBaseMetalica() + "','" + EHistorial.getAcrilico()
                    + "','" + EHistorial.getProtesisTotal() + "','" + EHistorial.getDientes()
                    + "','" + EHistorial.getMasInformacion() + "','" + EHistorial.getPrecioPactado()
                    + "','" + EHistorial.getIdCrearHistorial()
                    + "'," + "NULL" + ");";
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

    public static boolean ActualizarHistorial() {
        try {
            InteraccionBD bd = new InteraccionBD();
            cn = bd.getConexion();
            pst = bd.getPST();
            cn.setAutoCommit(false);
            sql = "update  historial_clinico set Cepillaje='" + EHistorial.getCepillaje() + "', CepillajeProfilaxis='"
                    + EHistorial.getCepilladoProfilaxico() + "', Fluorizacion='" + EHistorial.getFluorizacion()
                    + "', BlanqueamientoDental='" + EHistorial.getBanqueamiento() + "',CarieSimple='" + EHistorial.getCarieSimple()
                    + "',Piezas1='" + EHistorial.getPieza1() + "',CarieCompuesta='" + EHistorial.getCarieCompuesta()
                    + "', Piezas2='" + EHistorial.getPieza2() + "',CarieRecompuesta='" + EHistorial.getCarieRecompuesta()
                    + "', Piezas3='" + EHistorial.getPieza3() + "', EndoMultiRadicular='" + EHistorial.getEndoMultiRadicular()
                    + "', EndoUniRadicular='" + EHistorial.getEndoUniRadicular() + "', BioPulpectomia='" + EHistorial.getBioPulpectomia()
                    + "', NecroPulpectomia='" + EHistorial.getNecroPulpectomia() + "', OrtodonciaI='" + EHistorial.getOrtodonciaI()
                    + "', OrtodonciaII='" + EHistorial.getOrtodonciaII() + "', Recementacion='" + EHistorial.getRecementacion()
                    + "',Piezas4='" + EHistorial.getPieza4() + "',Sellantes='" + EHistorial.getSellantes()
                    + "',Barniz='" + EHistorial.getBarniz() + "',Cariostatico='" + EHistorial.getCariostatico()
                    + "',FibraVidrioColado='" + EHistorial.getFibraVidrio() + "',Raiz='" + EHistorial.getRaiz()
                    + "',PosicionNormal='" + EHistorial.getPosicionNormal() + "',TerceraMolarRecta='" + EHistorial.getMolarRecta()
                    + "',TerceraMolarQuirurgica='" + EHistorial.getMolarQuirurgica() + "',PuenteSuperior='" + EHistorial.getPuente1()
                    + "',Piezas5='" + EHistorial.getPieza5() + "',PuenteInferior='" + EHistorial.getPuente2()
                    + "',Piezas6='" + EHistorial.getPieza6() + "',Metal='" + EHistorial.getMetal()
                    + "',Ivocron='" + EHistorial.getIvocron() + "',Belglas='" + EHistorial.getBelga()
                    + "',Porcelana='" + EHistorial.getPorcelana() + "',CarrilasIvostar='" + EHistorial.getCarrillas()
                    + "',BaseMetalica='" + EHistorial.getBaseMetalica() + "',Acrilico='" + EHistorial.getAcrilico()
                    + "',ProtesisTotal='" + EHistorial.getProtesisTotal() + "',Dientes='" + EHistorial.getDientes()
                    + "',MasInformacion='" + EHistorial.getMasInformacion() + "',PrecioPactado='" + EHistorial.getPrecioPactado() + "' where IdCrearH=" + EHistorial.getIdCrearHistorial() + ";";
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

    public static ResultSet ListarTramiento(int IdCrearHistorial) {

        try {
            InteraccionBD bd = new InteraccionBD();
            sql = "select * from historial_clinico where IdCrearH=" + IdCrearHistorial + ";";
            return bd.Listar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CHistorialClinico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static boolean VerificarExisteIdHistorialClinicoEnHistorial_clinico(int IdCrearHistorial) {

        try {
            InteraccionBD bd = new InteraccionBD();
            sql = "select IdCrearH from historial_clinico where IdCrearH=" + IdCrearHistorial + ";";
            ResultSet rs1 = bd.Listar(sql);
            if (rs1.next() == true) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }

    }

}
