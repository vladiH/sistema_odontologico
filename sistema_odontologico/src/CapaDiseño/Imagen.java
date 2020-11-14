/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDiseño;

import CapaNegocio.CImagenes;
import CapaNegocio.Errores;
import Encapsulamiento.EImagenes;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author YURI VLADIMIR
 */
public class Imagen extends javax.swing.JDialog {

    private JFileChooser fileChooser;
    DefaultListModel modelo = new DefaultListModel();

    /**
     * Creates new form Imagenes
     */
    public Imagen() {
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagen/Logo.png"));
        setIconImage(icon);
        this.setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImagen = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listImagen = new javax.swing.JList();
        btnBorrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelImagen = new javax.swing.JLabel();

        setTitle("Imagenes");

        panelImagen.setBackground(new java.awt.Color(240, 242, 190));
        panelImagen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 255), null), null)));
        panelImagen.setForeground(new java.awt.Color(216, 240, 110));

        panelOpciones.setBackground(new java.awt.Color(204, 176, 181));
        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 255), null), null), "Mis imagenes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 102, 102))); // NOI18N

        btnAbrir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirMouseClicked(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        listImagen.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        listImagen.setToolTipText("");
        listImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listImagenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listImagen);

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 176, 181));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 255), null), null), "Galeria", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        labelImagen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelImagen.setForeground(new java.awt.Color(0, 102, 102));
        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/galeria.png"))); // NOI18N
        labelImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImagenLayout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(236, 236, 236))
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImagenLayout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnBorrar)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirMouseClicked

        fileChooser = new JFileChooser();
        //Añadiendole un filtro
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg & png", "JPG", "PNG");
        fileChooser.setFileFilter(filter);

        //Valor que tomara el fileChooser
        int regresaValor = fileChooser.showOpenDialog(null);
        //Accion del fileChooser
        if (regresaValor == JFileChooser.APPROVE_OPTION) {
            //Crear propiedades para ser utilizadas por fileChooser
            File archivoElegido = fileChooser.getSelectedFile();
            //Obteniendo la direccion del archivo
            String direccion = archivoElegido.getPath();

            //obtener la direccion de copia
            String appPath = CImagenes.ObtenerRuta();
            File miDir = new File(appPath + "\\" + archivoElegido.getName());

            //Bloque try-catch para errores
            try {
                ImageIcon fot = new ImageIcon(direccion);
                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(labelImagen.getWidth(), labelImagen.getHeight(), Image.SCALE_DEFAULT));
                labelImagen.setIcon(icono);
                this.repaint();
                //System.out.println(archivoElegido+"-"+ miDir);
                CImagenes.copiar(archivoElegido, miDir);

                //agregar datos al jlist
                modelo.addElement(archivoElegido.getName());
                listImagen.setModel(modelo);

            } catch (Exception es) {
                Errores.Error("No se puede copiar imagen");
            }
        }
    }//GEN-LAST:event_btnAbrirMouseClicked

    private void listImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listImagenMouseClicked
        int item = listImagen.locationToIndex(evt.getPoint());
        if (item >= 0) {
            ImageIcon fot = new ImageIcon(CImagenes.ObtenerRuta() + "\\" + listImagen.getModel().getElementAt(item));
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(labelImagen.getWidth(), labelImagen.getHeight(), Image.SCALE_DEFAULT));
            labelImagen.setIcon(icono);
            this.repaint();
        }
    }//GEN-LAST:event_listImagenMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        int seleccion1 = JOptionPane.showOptionDialog(null, "¿Esta seguro de eliminar?"/*componente padre*/, //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");
        if (seleccion1 != -1) {
            if ((seleccion1 + 1) == 1) {
                String appPath = CImagenes.ObtenerRuta();
                int item = listImagen.locationToIndex(evt.getPoint());
                if (item >= 0) {
                    File miDir = new File(appPath + "\\" + listImagen.getModel().getElementAt(item));
                    EImagenes.setIdCliente(Tratamientos.txtIdCliente.getText());
                    EImagenes.setIdHistorial(Integer.parseInt(Tratamientos.txtIdCrearH.getText()));
                    EImagenes.setNombre(listImagen.getModel().getElementAt(item).toString());
                    String id = CImagenes.BuscarId();
                    if (id != null) {
                        EImagenes.setIdImagen(Integer.parseInt(id));
                        if (CImagenes.Eliminar()) {
                            CImagenes.Eliminar(miDir);
                            modelo.remove(item);
                        } else {
                            Errores.Error("Imagen no eliminada");
                        }
                    } else {
                        Errores.Error("No existe imagen en la base de datos");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        int seleccion1 = JOptionPane.showOptionDialog(null, "¿Esta seguro de guardar?"/*componente padre*/, //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");
        if (seleccion1 != -1) {
            if ((seleccion1 + 1) == 1) {
                if (listImagen.getModel().getSize() == 0) {
                    Errores.Error("No existe imagen cargada");
                } else {
                    String[] imagen = new String[listImagen.getModel().getSize()];
                    EImagenes.setIdCliente(Tratamientos.txtIdCliente.getText());
                    EImagenes.setIdHistorial(Integer.parseInt(Tratamientos.txtIdCrearH.getText()));
                    String[] Fecha = Cliente.lbFecha.getText().split("-");
                    EImagenes.setFecha(Fecha[2] + "-" + Fecha[1] + "-" + Fecha[0]);
                    for (int i = 0; i < listImagen.getModel().getSize(); i++) {
                        imagen[i] = listImagen.getModel().getElementAt(i).toString();
                    }
                    EImagenes.setNombres(imagen);
                    if (CImagenes.Guardar()) {
                        Errores.Exito("Imagen guardada");
                    } else {
                        Errores.Error("Imagen no guardada");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

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
            java.util.logging.Logger.getLogger(Imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imagen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImagen;
    public static javax.swing.JList listImagen;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables
}
