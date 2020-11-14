/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import javax.swing.JOptionPane;

/**
 *
 * @author vladimir
 */
public class Errores {

    public static void Error(String Mensaje) {
        JOptionPane.showMessageDialog(null, Mensaje, "Error Inesperado", JOptionPane.WARNING_MESSAGE);
    }

    public static void Exito(String Mensaje) {
        JOptionPane.showMessageDialog(null, Mensaje, "Operacion exitosa", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void Aviso(String Mensaje) {
        JOptionPane.showMessageDialog(null, Mensaje, "Login", JOptionPane.QUESTION_MESSAGE);
    }

    public static String FormatoFecha(String fecha) {
        String[] Fecha = fecha.split("-");
        return Fecha[2] + "-" + Fecha[1] + "-" + Fecha[0];
    }
}
