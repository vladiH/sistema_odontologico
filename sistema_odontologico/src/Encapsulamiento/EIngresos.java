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
public class EIngresos {

    private static String Fecha = "";

    public static String getFecha() {
        return Fecha;
    }

    public static void setFecha(String Fecha) {
        EIngresos.Fecha = Fecha;
    }
}
