/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author vladimir
 */
public class PintarCeldas extends DefaultTableCellRenderer {

    private Component componente;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hastFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hastFocus, row, column);
        // super.
        super.setHorizontalAlignment(SwingConstants.CENTER);
        super.setFont(new java.awt.Font("Arial", 1, 12));
        if (row % 2 == 0) {

            componente.setBackground(new java.awt.Color(255,204,102));
        } else {
            componente.setBackground(new java.awt.Color(255, 255, 255));
        }
        return componente;
    }
}
