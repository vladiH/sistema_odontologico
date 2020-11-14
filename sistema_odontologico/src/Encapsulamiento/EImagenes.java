/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author YURI VLADIMIR
 */
public class EImagenes {

    public static String getIdCliente() {
        return IdCliente;
    }

    public static void setIdCliente(String IdCliente) {
        EImagenes.IdCliente = IdCliente;
    }

    public static int getIdImagen() {
        return IdImagen;
    }

    public static void setIdImagen(int IdImagen) {
        EImagenes.IdImagen = IdImagen;
    }

    public static int getIdHistorial() {
        return IdHistorial;
    }

    public static void setIdHistorial(int IdHistorial) {
        EImagenes.IdHistorial = IdHistorial;
    }

    public static String getFecha() {
        return Fecha;
    }

    public static void setFecha(String Fecha) {
        EImagenes.Fecha = Fecha;
    }

    public static String[] getNombres() {
        return Nombres;
    }

    public static void setNombres(String[] Nombres) {
        EImagenes.Nombres = Nombres;
    }

    public static String getNombre() {
        return Nombre;
    }

    public static void setNombre(String Nombre) {
        EImagenes.Nombre = Nombre;
    }
    private static int IdImagen = 0;
    private static int IdHistorial = 0;
    private static String Fecha = "";
    private static String Nombre;
    private static String[] Nombres;
    private static String IdCliente = "0";
}
