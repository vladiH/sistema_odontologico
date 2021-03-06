/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDiseño;

import Encapsulamiento.ECita;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author vladimir
 */
public class ClientesBuscados extends javax.swing.JDialog {

    /**
     * Creates new form ClientesBuscados
     */
    public ClientesBuscados() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagen/Logo.png"));
        setIconImage(icon);
//        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagen/wallpaper.jpg"));
//        Image imgEscalada = imgIcon.getImage().getScaledInstance(lbImagen.getWidth(),
//                lbImagen.getHeight(), Image.SCALE_SMOOTH);
//        Icon iconoEscalado = new ImageIcon(imgEscalada);
//        lbImagen.setIcon(iconoEscalado);
        this.setModal(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientesBuscados = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resultado de la busqueda");
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(464, 291));
        setMinimumSize(new java.awt.Dimension(464, 291));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Clientes ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setLayout(null);

        tblClientesBuscados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 255), null), null)));
        tblClientesBuscados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblClientesBuscados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblClientesBuscados.setGridColor(new java.awt.Color(255, 255, 255));
        tblClientesBuscados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesBuscadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientesBuscados);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 452, 217);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(367, 250, 81, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientesBuscadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesBuscadosMouseClicked
        int row = tblClientesBuscados.getSelectedRow();
        NuevaCita.txtAP.setText(tblClientesBuscados.getValueAt(row, 0).toString());
        NuevaCita.txtAM.setText(tblClientesBuscados.getValueAt(row, 1).toString());
        NuevaCita.txtN.setText(tblClientesBuscados.getValueAt(row, 2).toString());
        NuevaCita.txtT.setText(tblClientesBuscados.getValueAt(row, 3).toString());
        ECita.setIdCliente(Integer.parseInt(tblClientesBuscados.getValueAt(row, 4).toString()));
        dispose();
    }//GEN-LAST:event_tblClientesBuscadosMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientesBuscados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesBuscados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesBuscados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesBuscados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesBuscados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblClientesBuscados;
    // End of variables declaration//GEN-END:variables
}
