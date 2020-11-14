/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDiseño;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author NayshaNaydu
 */
public class PanelExodoncia extends javax.swing.JPanel {

    /**
     * Creates new form PanelExodoncia
     */
    public PanelExodoncia() {
        initComponents();
        //***************************************
        txtPrecioParcial1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });

        //*****************************************************
        txtPrecioParcial2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        //***************************************************************
        txtPrecioParcial3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });

        //*******************************************
        txtPrecioParcial4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        //********************************************
        txtPrecioParcial5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });

        //***************************************
        txtPrecioParcial6.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
//***************************************************
        txtPrecioParcial7.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        //*********************************************
        txtPrecioParcial8.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        //************************************
        txtPrecioParcial9.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        //************************************
        txtPrecioNormal10.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        //************************************
        txtPrecioNormal11.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        //************************************
        txtPieza1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        //************************************
        txtPieza2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        txtPrecioParcial12.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {

                    e.consume();  // ignorar el evento de teclado

                }
            }
        });
        txtPrecioParcial13.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {

                    e.consume();  // ignorar el evento de teclado

                }
            }
        });
        txtPrecioParcial14.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {

                    e.consume();  // ignorar el evento de teclado

                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupoBotones = new javax.swing.ButtonGroup();
        subPanelExodoncia = new javax.swing.JPanel();
        rbOpcion3 = new javax.swing.JRadioButton();
        txtPrecioNormal1 = new javax.swing.JTextField();
        txtPrecioNormal2 = new javax.swing.JTextField();
        txtPrecioNormal3 = new javax.swing.JTextField();
        txtPrecioParcial1 = new javax.swing.JTextField();
        txtPrecioParcial2 = new javax.swing.JTextField();
        txtPrecioParcial3 = new javax.swing.JTextField();
        rbOpcion1 = new javax.swing.JRadioButton();
        rbOpcion2 = new javax.swing.JRadioButton();
        rbOpcion4 = new javax.swing.JRadioButton();
        txtPrecioNormal4 = new javax.swing.JTextField();
        txtPrecioParcial4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        subPanelCoronaPuenteIncrustrada = new javax.swing.JPanel();
        rbOpcion6 = new javax.swing.JRadioButton();
        rbOpcion7 = new javax.swing.JRadioButton();
        rbOpcion8 = new javax.swing.JRadioButton();
        rbOpcion9 = new javax.swing.JRadioButton();
        txtPrecioNormal5 = new javax.swing.JTextField();
        txtPrecioNormal6 = new javax.swing.JTextField();
        txtPrecioNormal7 = new javax.swing.JTextField();
        txtPrecioNormal8 = new javax.swing.JTextField();
        txtPrecioNormal9 = new javax.swing.JTextField();
        txtPrecioParcial5 = new javax.swing.JTextField();
        txtPrecioParcial6 = new javax.swing.JTextField();
        txtPrecioParcial7 = new javax.swing.JTextField();
        txtPrecioParcial8 = new javax.swing.JTextField();
        txtPrecioParcial9 = new javax.swing.JTextField();
        rbOpcion5 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        subPanelPuente = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtPrecioNormal10 = new javax.swing.JTextField();
        txtTotal1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPieza1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtPrecioNormal11 = new javax.swing.JTextField();
        txtTotal2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtPieza2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelPPR = new javax.swing.JPanel();
        rbOpcion12 = new javax.swing.JRadioButton();
        rbOpcion13 = new javax.swing.JRadioButton();
        txtPrecioNormal12 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtPrecioNormal13 = new javax.swing.JTextField();
        txtPrecioParcial13 = new javax.swing.JTextField();
        txtPrecioParcial12 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        panelPPR1 = new javax.swing.JPanel();
        rbOpcion14 = new javax.swing.JRadioButton();
        txtPrecioNormal14 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtPrecioParcial14 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);
        setMinimumSize(new java.awt.Dimension(1000, 530));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(990, 530));

        subPanelExodoncia.setBackground(new java.awt.Color(0, 0, 51));
        subPanelExodoncia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXODONCIA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        subPanelExodoncia.setForeground(new java.awt.Color(255, 255, 255));
        subPanelExodoncia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subPanelExodoncia.setPreferredSize(new java.awt.Dimension(400, 220));

        rbOpcion3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion3.setText("3° Molar Recta");
        rbOpcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion4MouseClicked(evt);
            }
        });

        txtPrecioNormal1.setEditable(false);
        txtPrecioNormal1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal1.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioNormal2.setEditable(false);
        txtPrecioNormal2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal2.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioNormal3.setEditable(false);
        txtPrecioNormal3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal3.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial1.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial2.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial3.setPreferredSize(new java.awt.Dimension(40, 25));

        rbOpcion1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion1.setText("Raiz");
        rbOpcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion4MouseClicked(evt);
            }
        });

        rbOpcion2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion2.setText("Posicion Normal");
        rbOpcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion4MouseClicked(evt);
            }
        });

        rbOpcion4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion4.setText("3° Molar Quirurgica");
        rbOpcion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion4MouseClicked(evt);
            }
        });

        txtPrecioNormal4.setEditable(false);
        txtPrecioNormal4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal4.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial4.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("S/.");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("S/.");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("S/.");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("S/.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Precio Parcial");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Precio Normal");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setFocusCycleRoot(true);

        javax.swing.GroupLayout subPanelExodonciaLayout = new javax.swing.GroupLayout(subPanelExodoncia);
        subPanelExodoncia.setLayout(subPanelExodonciaLayout);
        subPanelExodonciaLayout.setHorizontalGroup(
            subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelExodonciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbOpcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelExodonciaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelExodonciaLayout.createSequentialGroup()
                        .addGroup(subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(subPanelExodonciaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(subPanelExodonciaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(subPanelExodonciaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(subPanelExodonciaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addGap(64, 64, 64)
                        .addGroup(subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecioParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioParcial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioParcial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioParcial4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );
        subPanelExodonciaLayout.setVerticalGroup(
            subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelExodonciaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioNormal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(rbOpcion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioNormal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecioParcial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOpcion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcion3)
                    .addComponent(txtPrecioNormal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioParcial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelExodonciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioNormal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioParcial4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOpcion4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subPanelCoronaPuenteIncrustrada.setBackground(new java.awt.Color(0, 0, 51));
        subPanelCoronaPuenteIncrustrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROTESIS FIJA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        subPanelCoronaPuenteIncrustrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subPanelCoronaPuenteIncrustrada.setPreferredSize(new java.awt.Dimension(400, 220));

        rbOpcion6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion6.setText("Ivocron");
        rbOpcion6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion6rbOpcion5MouseClicked(evt);
            }
        });

        rbOpcion7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion7.setText("Belglas");
        rbOpcion7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion7rbOpcion5MouseClicked(evt);
            }
        });

        rbOpcion8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion8.setText("Porcelana");
        rbOpcion8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion8rbOpcion5MouseClicked(evt);
            }
        });

        rbOpcion9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion9.setText("Carrilas Ivostar");
        rbOpcion9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion9MouseClicked(evt);
            }
        });

        txtPrecioNormal5.setEditable(false);
        txtPrecioNormal5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal5.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioNormal6.setEditable(false);
        txtPrecioNormal6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal6.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioNormal7.setEditable(false);
        txtPrecioNormal7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal7.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioNormal8.setEditable(false);
        txtPrecioNormal8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal8.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioNormal9.setEditable(false);
        txtPrecioNormal9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal9.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial5.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial6.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial7.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial8.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial9.setPreferredSize(new java.awt.Dimension(40, 25));

        rbOpcion5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion5.setText("Metal");
        rbOpcion5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion5rbOpcion5MouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("S/.");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("S/.");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("S/.");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("S/.");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("S/.");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Precio Normal");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setFocusCycleRoot(true);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio Parcial");

        javax.swing.GroupLayout subPanelCoronaPuenteIncrustradaLayout = new javax.swing.GroupLayout(subPanelCoronaPuenteIncrustrada);
        subPanelCoronaPuenteIncrustrada.setLayout(subPanelCoronaPuenteIncrustradaLayout);
        subPanelCoronaPuenteIncrustradaLayout.setHorizontalGroup(
            subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbOpcion9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcion8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcion6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(rbOpcion5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                                .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecioNormal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPrecioNormal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPrecioNormal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecioNormal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecioNormal9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioParcial5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioParcial6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioParcial8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioParcial9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrecioParcial7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subPanelCoronaPuenteIncrustradaLayout.setVerticalGroup(
            subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelCoronaPuenteIncrustradaLayout.createSequentialGroup()
                .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcion5)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecioNormal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecioNormal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOpcion6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioNormal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecioParcial7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOpcion7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioNormal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrecioParcial8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOpcion8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanelCoronaPuenteIncrustradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbOpcion9)
                    .addComponent(txtPrecioNormal9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        subPanelPuente.setBackground(new java.awt.Color(0, 0, 51));
        subPanelPuente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PUENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        subPanelPuente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subPanelPuente.setPreferredSize(new java.awt.Dimension(400, 220));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPrecioNormal10.setEditable(false);
        txtPrecioNormal10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal10.setPreferredSize(new java.awt.Dimension(40, 25));

        txtTotal1.setEditable(false);
        txtTotal1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtTotal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtTotal1.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel10.setText("S/.");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setText("Pieza a Pieza");

        txtPieza1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPieza1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPieza1.setText("0");
        txtPieza1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPieza1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPieza1.setPreferredSize(new java.awt.Dimension(40, 25));
        txtPieza1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioNormal10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 174, Short.MAX_VALUE)
                    .addComponent(txtPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 175, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioNormal10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPrecioNormal11.setEditable(false);
        txtPrecioNormal11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal11.setToolTipText("");
        txtPrecioNormal11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal11.setPreferredSize(new java.awt.Dimension(40, 25));

        txtTotal2.setEditable(false);
        txtTotal2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtTotal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtTotal2.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel11.setText("S/.");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setText("Pieza a Pieza");

        txtPieza2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPieza2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPieza2.setText("0");
        txtPieza2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPieza2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPieza2.setPreferredSize(new java.awt.Dimension(40, 25));
        txtPieza2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(txtPieza2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioNormal11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(txtTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioNormal11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel19)
                    .addComponent(txtPieza2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("Precio Normal");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.setFocusCycleRoot(true);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel20.setText("Piezas");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel20.setFocusCycleRoot(true);

        javax.swing.GroupLayout subPanelPuenteLayout = new javax.swing.GroupLayout(subPanelPuente);
        subPanelPuente.setLayout(subPanelPuenteLayout);
        subPanelPuenteLayout.setHorizontalGroup(
            subPanelPuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelPuenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(28, 28, 28)
                .addComponent(jLabel16)
                .addGap(33, 33, 33)
                .addComponent(jLabel17)
                .addGap(39, 39, 39))
            .addGroup(subPanelPuenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(subPanelPuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subPanelPuenteLayout.setVerticalGroup(
            subPanelPuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelPuenteLayout.createSequentialGroup()
                .addGroup(subPanelPuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panelPPR.setBackground(new java.awt.Color(0, 0, 51));
        panelPPR.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROTESIS PARCIAL REMOVIBLE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelPPR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelPPR.setPreferredSize(new java.awt.Dimension(400, 220));

        rbOpcion12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion12.setText("Base Metalica");
        rbOpcion12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion12rbOpcion4MouseClicked(evt);
            }
        });

        rbOpcion13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion13.setText("Acrilico");
        rbOpcion13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion13rbOpcion4MouseClicked(evt);
            }
        });

        txtPrecioNormal12.setEditable(false);
        txtPrecioNormal12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal12.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("S/.");

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("S/.");

        txtPrecioNormal13.setEditable(false);
        txtPrecioNormal13.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal13.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial13.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial13.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial12.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Precio Parcial");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel31.setText("Precio Normal");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel31.setFocusCycleRoot(true);

        javax.swing.GroupLayout panelPPRLayout = new javax.swing.GroupLayout(panelPPR);
        panelPPR.setLayout(panelPPRLayout);
        panelPPRLayout.setHorizontalGroup(
            panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPPRLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbOpcion13, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(rbOpcion12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPPRLayout.createSequentialGroup()
                        .addGroup(panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPPRLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(txtPrecioParcial13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPPRLayout.createSequentialGroup()
                                .addGroup(panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelPPRLayout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecioNormal12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel31))
                                .addGap(64, 64, 64)
                                .addComponent(txtPrecioParcial12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)))
                .addGap(22, 22, 22))
        );
        panelPPRLayout.setVerticalGroup(
            panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPPRLayout.createSequentialGroup()
                .addGroup(panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPPRLayout.createSequentialGroup()
                        .addComponent(rbOpcion12)
                        .addGap(18, 18, 18)
                        .addComponent(rbOpcion13))
                    .addGroup(panelPPRLayout.createSequentialGroup()
                        .addGroup(panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioParcial12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioNormal12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrecioNormal13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29))
                            .addComponent(txtPrecioParcial13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9))
        );

        panelPPR1.setBackground(new java.awt.Color(0, 0, 51));
        panelPPR1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROTESIS TOTAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelPPR1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelPPR1.setPreferredSize(new java.awt.Dimension(400, 220));

        rbOpcion14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion14.setText("Protesis Total");
        rbOpcion14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion14rbOpcion4MouseClicked(evt);
            }
        });

        txtPrecioNormal14.setEditable(false);
        txtPrecioNormal14.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal14.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal14.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("S/.");

        txtPrecioParcial14.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial14.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Precio Parcial");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel35.setText("Precio Normal");
        jLabel35.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel35.setFocusCycleRoot(true);

        javax.swing.GroupLayout panelPPR1Layout = new javax.swing.GroupLayout(panelPPR1);
        panelPPR1.setLayout(panelPPR1Layout);
        panelPPR1Layout.setHorizontalGroup(
            panelPPR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPPR1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rbOpcion14, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(panelPPR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPPR1Layout.createSequentialGroup()
                        .addGroup(panelPPR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPPR1Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel35))
                        .addGap(64, 64, 64)
                        .addComponent(txtPrecioParcial14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21))
        );
        panelPPR1Layout.setVerticalGroup(
            panelPPR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPPR1Layout.createSequentialGroup()
                .addGroup(panelPPR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPPR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioParcial14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioNormal14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(rbOpcion14))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subPanelPuente, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(subPanelExodoncia, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subPanelCoronaPuenteIncrustrada, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(panelPPR, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(panelPPR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subPanelCoronaPuenteIncrustrada, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(subPanelExodoncia, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPPR, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelPPR1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(subPanelPuente, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbOpcion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion4MouseClicked
        // TODO add your handling code here:
        //EstaSelecionado();
    }//GEN-LAST:event_rbOpcion4MouseClicked

    private void rbOpcion5rbOpcion5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion5rbOpcion5MouseClicked
        // TODO add your handling code here:
        //EstaSelecionado();
    }//GEN-LAST:event_rbOpcion5rbOpcion5MouseClicked

    private void rbOpcion6rbOpcion5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion6rbOpcion5MouseClicked
        // TODO add your handling code here:
        //EstaSelecionado();
    }//GEN-LAST:event_rbOpcion6rbOpcion5MouseClicked

    private void rbOpcion7rbOpcion5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion7rbOpcion5MouseClicked
        // TODO add your handling code here:
        //EstaSelecionado();
    }//GEN-LAST:event_rbOpcion7rbOpcion5MouseClicked

    private void rbOpcion8rbOpcion5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion8rbOpcion5MouseClicked
        // TODO add your handling code here:
        //EstaSelecionado();
    }//GEN-LAST:event_rbOpcion8rbOpcion5MouseClicked

    private void rbOpcion9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion9MouseClicked
        // TODO add your handling code here:
        //EstaSelecionado();
    }//GEN-LAST:event_rbOpcion9MouseClicked

    private void rbOpcion12rbOpcion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion12rbOpcion4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcion12rbOpcion4MouseClicked

    private void rbOpcion13rbOpcion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion13rbOpcion4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcion13rbOpcion4MouseClicked

    private void rbOpcion14rbOpcion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion14rbOpcion4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcion14rbOpcion4MouseClicked

    private void FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FocusLost
         if (txtPieza1.getText().equals("")) {
            txtPieza1.setText("0");
        }
        if (txtPieza2.getText().equals("")) {
            txtPieza2.setText("0");
        }
    }//GEN-LAST:event_FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGrupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panelPPR;
    private javax.swing.JPanel panelPPR1;
    public static javax.swing.JRadioButton rbOpcion1;
    public static javax.swing.JRadioButton rbOpcion12;
    public static javax.swing.JRadioButton rbOpcion13;
    public static javax.swing.JRadioButton rbOpcion14;
    public static javax.swing.JRadioButton rbOpcion2;
    public static javax.swing.JRadioButton rbOpcion3;
    public static javax.swing.JRadioButton rbOpcion4;
    public static javax.swing.JRadioButton rbOpcion5;
    public static javax.swing.JRadioButton rbOpcion6;
    public static javax.swing.JRadioButton rbOpcion7;
    public static javax.swing.JRadioButton rbOpcion8;
    public static javax.swing.JRadioButton rbOpcion9;
    private javax.swing.JPanel subPanelCoronaPuenteIncrustrada;
    private javax.swing.JPanel subPanelExodoncia;
    private javax.swing.JPanel subPanelPuente;
    public static javax.swing.JTextField txtPieza1;
    public static javax.swing.JTextField txtPieza2;
    public static javax.swing.JTextField txtPrecioNormal1;
    public static javax.swing.JTextField txtPrecioNormal10;
    public static javax.swing.JTextField txtPrecioNormal11;
    public static javax.swing.JTextField txtPrecioNormal12;
    public static javax.swing.JTextField txtPrecioNormal13;
    public static javax.swing.JTextField txtPrecioNormal14;
    public static javax.swing.JTextField txtPrecioNormal2;
    public static javax.swing.JTextField txtPrecioNormal3;
    public static javax.swing.JTextField txtPrecioNormal4;
    public static javax.swing.JTextField txtPrecioNormal5;
    public static javax.swing.JTextField txtPrecioNormal6;
    public static javax.swing.JTextField txtPrecioNormal7;
    public static javax.swing.JTextField txtPrecioNormal8;
    public static javax.swing.JTextField txtPrecioNormal9;
    public static javax.swing.JTextField txtPrecioParcial1;
    public static javax.swing.JTextField txtPrecioParcial12;
    public static javax.swing.JTextField txtPrecioParcial13;
    public static javax.swing.JTextField txtPrecioParcial14;
    public static javax.swing.JTextField txtPrecioParcial2;
    public static javax.swing.JTextField txtPrecioParcial3;
    public static javax.swing.JTextField txtPrecioParcial4;
    public static javax.swing.JTextField txtPrecioParcial5;
    public static javax.swing.JTextField txtPrecioParcial6;
    public static javax.swing.JTextField txtPrecioParcial7;
    public static javax.swing.JTextField txtPrecioParcial8;
    public static javax.swing.JTextField txtPrecioParcial9;
    public static javax.swing.JTextField txtTotal1;
    public static javax.swing.JTextField txtTotal2;
    // End of variables declaration//GEN-END:variables
}
