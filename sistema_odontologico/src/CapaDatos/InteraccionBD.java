/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vladimir
 */
public class InteraccionBD {

    Conexion c = new Conexion();
    Connection cn = c.conexion();
    PreparedStatement pst = null;

    public void Guardar(String sql) throws SQLException {
        pst = cn.prepareStatement(sql);
        pst.executeUpdate();
    }

    public void Modificar(String sql) throws SQLException {
        pst = cn.prepareStatement(sql);
        pst.executeUpdate();
    }

    public void Eliminar(String sql) throws SQLException {
        pst = cn.prepareStatement(sql);
        pst.executeUpdate();
    }

    public ResultSet Listar(String sql) throws SQLException {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }

    public Connection getConexion() {
        return cn;
    }

    public PreparedStatement getPST() {
        return pst;
    }
}
