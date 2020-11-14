/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author vladimir
 */
public class ECuota {

    public static int getIdCrearHistorial() {
        return IdCrearHistorial;
    }

    public static void setIdCrearHistorial(int IdCrearHistorial) {
        ECuota.IdCrearHistorial = IdCrearHistorial;
    }

    public static String getFecha() {
        return Fecha;
    }

    public static void setFecha(String Fecha) {
        ECuota.Fecha = Fecha;
    }

    public static int getNroCuota() {
        return NroCuota;
    }

    public static void setNroCuota(int NroCuota) {
        ECuota.NroCuota = NroCuota;
    }

    public static double getImporte() {
        return Importe;
    }

    public static void setImporte(double Importe) {
        ECuota.Importe = Importe;
    }

    public static String getHora() {
        return Hora;
    }

    public static void setHora(String Hora) {
        ECuota.Hora = Hora;
    }

    public static int getIdCuota() {
        return IdCuota;
    }

    public static void setIdCuota(int IdCuota) {
        ECuota.IdCuota = IdCuota;
    }

    public static String getIdCliente() {
        return IdCliente;
    }

    public static void setIdCliente(String IdCliente) {
        ECuota.IdCliente = IdCliente;
    }
    private static String IdCliente = "0";
    private static int IdCuota = 0;
    private static int IdCrearHistorial = 0;
    private static String Fecha = "";
    private static int NroCuota = 0;
    private static double Importe = 0;
    private static String Hora = "";
}
