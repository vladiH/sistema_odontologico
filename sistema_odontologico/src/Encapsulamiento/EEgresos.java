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
public class EEgresos extends ECliente {

    public static String getRazonSocial() {
        return RazonSocial;
    }

    public static void setRazonSocial(String RazonSocial) {
        EEgresos.RazonSocial = RazonSocial;
    }

    public static String getNombreMaterial() {
        return NombreMaterial;
    }

    public static void setNombreMaterial(String NombreMaterial) {
        EEgresos.NombreMaterial = NombreMaterial;
    }

    public static double getPrecio() {
        return Precio;
    }

    public static void setPrecio(double Precio) {
        EEgresos.Precio = Precio;
    }

    public static String getDescripcion() {
        return Descripcion;
    }

    public static void setDescripcion(String Descripcion) {
        EEgresos.Descripcion = Descripcion;
    }

    public static String getFecha() {
        return Fecha;
    }

    public static void setFecha(String Fecha) {
        EEgresos.Fecha = Fecha;
    }

    public static String getHora() {
        return Hora;
    }

    public static void setHora(String Hora) {
        EEgresos.Hora = Hora;
    }

    public static int getIdEgreso() {
        return IdEgreso;
    }

    public static void setIdEgreso(int IdEgreso) {
        EEgresos.IdEgreso = IdEgreso;
    }
    private static int IdProveedor;

    public static int getIdProveedor() {
        return IdProveedor;
    }

    public static void setIdProveedor(int IdProveedor) {
        EEgresos.IdProveedor = IdProveedor;
    }
    private static String RazonSocial;
    private static String NombreMaterial;
    private static double Precio;
    private static String Descripcion;
    private static String Fecha;
    private static String Hora;
    private static int IdEgreso;
}
