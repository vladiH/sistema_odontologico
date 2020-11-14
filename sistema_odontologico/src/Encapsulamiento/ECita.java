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
public class ECita {

    public static String getFecha() {
        return Fecha;
    }

    public static void setFecha(String Fecha) {
        ECita.Fecha = Fecha;
    }

    public static String getHora() {
        return Hora;
    }

    public static void setHora(String Hora) {
        ECita.Hora = Hora;
    }

    public static String getMotivo() {
        return Motivo;
    }

    public static void setMotivo(String Motivo) {
        ECita.Motivo = Motivo;
    }

    public static int getIdCita() {
        return IdCita;
    }

    public static void setIdCita(int IdCita) {
        ECita.IdCita = IdCita;
    }

    public static int getIdCliente() {
        return IdCliente;
    }

    public static void setIdCliente(int IdCliente) {
        ECita.IdCliente = IdCliente;
    }

    private static String Fecha = "";
    private static String Hora = "";
    private static String Motivo = "";
    private static int IdCita = 0;
    private static int IdCliente = 0;
}
