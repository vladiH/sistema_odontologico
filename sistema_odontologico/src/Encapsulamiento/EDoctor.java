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
public class EDoctor {

    public static String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public static void setApellidoPaterno(String ApellidoPaterno) {
        EDoctor.ApellidoPaterno = ApellidoPaterno;
    }

    public static String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public static void setApellidoMaterno(String ApellidoMaterno) {
        EDoctor.ApellidoMaterno = ApellidoMaterno;
    }

    public static String getNombre() {
        return Nombre;
    }

    public static void setNombre(String Nombre) {
        EDoctor.Nombre = Nombre;
    }

    public static String getUsuario() {
        return Usuario;
    }

    public static void setUsuario(String Usuario) {
        EDoctor.Usuario = Usuario;
    }

    public static String getContrasena() {
        return Contrasena;
    }

    public static void setContrasena(String Contrasena) {
        EDoctor.Contrasena = Contrasena;
    }

    public static String getCOP() {
        return COP;
    }

    public static void setCOP(String COP) {
        EDoctor.COP = COP;
    }

    public static String getCelularClaro() {
        return CelularClaro;
    }

    public static void setCelularClaro(String CelularClaro) {
        EDoctor.CelularClaro = CelularClaro;
    }

    public static String getCelularMovistar() {
        return CelularMovistar;
    }

    public static void setCelularMovistar(String CelularMovistar) {
        EDoctor.CelularMovistar = CelularMovistar;
    }

    public static String getCorreo() {
        return Correo;
    }

    public static void setCorreo(String Correo) {
        EDoctor.Correo = Correo;
    }

    public static String getDireccion() {
        return Direccion;
    }

    public static void setDireccion(String Direccion) {
        EDoctor.Direccion = Direccion;
    }

    public static String getDepartamento() {
        return Departamento;
    }

    public static void setDepartamento(String Departamento) {
        EDoctor.Departamento = Departamento;
    }
    private static String CelularClaro = "";
    private static String CelularMovistar = "";
    private static String Correo = "";
    private static String Direccion = "";
    private static String Departamento = "";
    private static String ApellidoPaterno = "";
    private static String ApellidoMaterno = "";
    private static String Nombre = "";
    private static String Usuario = "";
    private static String Contrasena = "";
    private static String COP = "0";
}
