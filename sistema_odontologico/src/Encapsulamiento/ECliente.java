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
public class ECliente {

    private static String ApellidoPaterno;
    private static String ApellidoMaterno;
    private static String Nombre;
    private static String DNI;
    private static String Telefono;
    private static String Edad;
    private static String FechaNacimiento;
    private static String Direccion;
    private static String Parentesco;
    private static int IdDoctor;
    private static int IdCliente;

    public static int getIdCliente() {
        return IdCliente;
    }

    public static void setIdCliente(int IdCliente) {
        ECliente.IdCliente = IdCliente;
    }

    public static String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public static void setApellidoPaterno(String aApellidoPaterno) {
        ApellidoPaterno = aApellidoPaterno;
    }

    public static String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public static void setApellidoMaterno(String aApellidoMaterno) {
        ApellidoMaterno = aApellidoMaterno;
    }

    public static String getNombre() {
        return Nombre;
    }

    public static void setNombre(String aNombre) {
        Nombre = aNombre;
    }

    public static String getDNI() {
        return DNI;
    }

    public static void setDNI(String aDNI) {
        DNI = aDNI;
    }

    public static String getTelefono() {
        return Telefono;
    }

    public static void setTelefono(String aTelefono) {
        Telefono = aTelefono;
    }

    public static String getEdad() {
        return Edad;
    }

    public static void setEdad(String aEdad) {
        Edad = aEdad;
    }

    public static String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public static void setFechaNacimiento(String aFechaNacimiento) {
        FechaNacimiento = aFechaNacimiento;
    }

    public static String getDireccion() {
        return Direccion;
    }

    public static void setDireccion(String aDireccion) {
        Direccion = aDireccion;
    }

    public static String getParentesco() {
        return Parentesco;
    }

    public static void setParentesco(String aParentesco) {
        Parentesco = aParentesco;
    }

    public static int getIdDoctor() {
        return IdDoctor;
    }

    public static void setIdDoctor(int aIdCliente) {
        IdDoctor = aIdCliente;
    }
}
