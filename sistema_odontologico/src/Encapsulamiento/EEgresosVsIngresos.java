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
public class EEgresosVsIngresos{

    public static String getFechaIngresos() {
        return FechaIngresos;
    }

    public static void setFechaIngresos(String FechaIngresos) {
        EEgresosVsIngresos.FechaIngresos = FechaIngresos;
    }

    public static String getFechaEgresos() {
        return FechaEgresos;
    }

    public static void setFechaEgresos(String FechaEgresos) {
        EEgresosVsIngresos.FechaEgresos = FechaEgresos;
    }

    private static String FechaIngresos = "";
    private static String FechaEgresos = "";
}
