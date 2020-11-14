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
public class PanelEndodoncia extends javax.swing.JPanel {

    /**
     * Creates new form PanelEndodoncia
     */
    public PanelEndodoncia() {
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

        //*************************************
        txtPrecioParcial10.addKeyListener(new KeyAdapter() {
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

        //*************************************************
        txtPrecioParcial11.addKeyListener(new KeyAdapter() {
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
        txtPrecioNormal7.addKeyListener(new KeyAdapter() {
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
        //*********************************
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupoBotones = new javax.swing.ButtonGroup();
        bgGrupoBotones2 = new javax.swing.ButtonGroup();
        bgGrupoBotones3 = new javax.swing.ButtonGroup();
        PanelPricipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rbOpcion1 = new javax.swing.JRadioButton();
        txtPrecioNormal1 = new javax.swing.JTextField();
        txtPrecioParcial1 = new javax.swing.JTextField();
        rbOpcion2 = new javax.swing.JRadioButton();
        txtPrecioNormal2 = new javax.swing.JTextField();
        txtPrecioParcial2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbOpcion3 = new javax.swing.JRadioButton();
        txtPrecioNormal3 = new javax.swing.JTextField();
        txtPrecioParcial3 = new javax.swing.JTextField();
        rbOpcion4 = new javax.swing.JRadioButton();
        txtPrecioNormal4 = new javax.swing.JTextField();
        txtPrecioParcial4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PanelPricipal3 = new javax.swing.JPanel();
        txtPrecioNormal11 = new javax.swing.JTextField();
        txtPrecioParcial11 = new javax.swing.JTextField();
        rbOpcion11 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PanelPricipal1 = new javax.swing.JPanel();
        txtPrecioNormal5 = new javax.swing.JTextField();
        txtPrecioNormal6 = new javax.swing.JTextField();
        txtPrecioParcial5 = new javax.swing.JTextField();
        txtPrecioParcial6 = new javax.swing.JTextField();
        rbOpcion5 = new javax.swing.JRadioButton();
        rbOpcion6 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PanelPricipal2 = new javax.swing.JPanel();
        txtPrecioNormal9 = new javax.swing.JTextField();
        txtPrecioNormal10 = new javax.swing.JTextField();
        txtPrecioParcial9 = new javax.swing.JTextField();
        txtPrecioParcial10 = new javax.swing.JTextField();
        rbOpcion9 = new javax.swing.JRadioButton();
        rbOpcion10 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        PanelPricipal4 = new javax.swing.JPanel();
        txtPrecioNormal7 = new javax.swing.JTextField();
        txtPrecioNormal8 = new javax.swing.JTextField();
        txtTotal1 = new javax.swing.JTextField();
        txtPrecioParcial8 = new javax.swing.JTextField();
        rbOpcion8 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlabeltotal = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPieza1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jlabeltotal1 = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.textHighlightText);
        setForeground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);
        setMinimumSize(new java.awt.Dimension(800, 530));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(990, 510));

        PanelPricipal.setBackground(new java.awt.Color(0, 0, 51));
        PanelPricipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENDODONCIA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelPricipal.setPreferredSize(new java.awt.Dimension(400, 245));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbOpcion1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion1.setText("Endo MULTIradicular");
        rbOpcion1.addMouseListener(new java.awt.event.MouseAdapter() {
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

        txtPrecioParcial1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial1.setPreferredSize(new java.awt.Dimension(40, 25));

        rbOpcion2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion2.setText("Endo UNIradiculares");
        rbOpcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion4MouseClicked(evt);
            }
        });

        txtPrecioNormal2.setEditable(false);
        txtPrecioNormal2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal2.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial2.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel1.setText("S/.");

        jLabel2.setText("S/.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(rbOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrecioNormal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrecioNormal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioParcial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcion1)
                    .addComponent(txtPrecioNormal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcion2)
                    .addComponent(txtPrecioNormal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbOpcion3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion3.setText("BIOpulpectomia");
        rbOpcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion4MouseClicked(evt);
            }
        });

        txtPrecioNormal3.setEditable(false);
        txtPrecioNormal3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal3.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial3.setPreferredSize(new java.awt.Dimension(40, 25));

        rbOpcion4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion4.setText("NECROpulpectomia");
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

        jLabel3.setText("S/.");

        jLabel4.setText("S/.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbOpcion4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(rbOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioNormal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioParcial4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioNormal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioParcial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioNormal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecioParcial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbOpcion3)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcion4)
                    .addComponent(txtPrecioNormal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Precio Parcial");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Precio Normal");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setFocusCycleRoot(true);

        javax.swing.GroupLayout PanelPricipalLayout = new javax.swing.GroupLayout(PanelPricipal);
        PanelPricipal.setLayout(PanelPricipalLayout);
        PanelPricipalLayout.setHorizontalGroup(
            PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPricipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipalLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addGap(21, 21, 21))
                            .addGroup(PanelPricipalLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))))
                    .addGroup(PanelPricipalLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelPricipalLayout.setVerticalGroup(
            PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipalLayout.createSequentialGroup()
                .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        PanelPricipal3.setBackground(new java.awt.Color(0, 0, 51));
        PanelPricipal3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRATAMIENTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelPricipal3.setPreferredSize(new java.awt.Dimension(380, 100));

        txtPrecioNormal11.setEditable(false);
        txtPrecioNormal11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal11.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial11.setPreferredSize(new java.awt.Dimension(40, 25));

        rbOpcion11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion11.setText("Fibra Vidrio-Colado");
        rbOpcion11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion11MouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("S/.");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Precio Parcial");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel21.setText("Precio Normal");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel21.setFocusCycleRoot(true);

        javax.swing.GroupLayout PanelPricipal3Layout = new javax.swing.GroupLayout(PanelPricipal3);
        PanelPricipal3.setLayout(PanelPricipal3Layout);
        PanelPricipal3Layout.setHorizontalGroup(
            PanelPricipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(rbOpcion11, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(PanelPricipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addGroup(PanelPricipal3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(4, 4, 4)
                        .addComponent(txtPrecioNormal11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelPricipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecioParcial11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap())
        );
        PanelPricipal3Layout.setVerticalGroup(
            PanelPricipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(rbOpcion11)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(PanelPricipal3Layout.createSequentialGroup()
                .addGroup(PanelPricipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(PanelPricipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPricipal3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11))
                    .addComponent(txtPrecioNormal11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelPricipal1.setBackground(new java.awt.Color(0, 0, 51));
        PanelPricipal1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRATAMIENTO ESTETICO II", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelPricipal1.setPreferredSize(new java.awt.Dimension(400, 130));

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

        txtPrecioParcial5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial5.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial6.setPreferredSize(new java.awt.Dimension(40, 25));

        rbOpcion5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion5.setText("Ortodoncia I");
        rbOpcion5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion5rbOpcion2MouseClicked(evt);
            }
        });
        rbOpcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOpcion5ActionPerformed(evt);
            }
        });

        rbOpcion6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion6.setText("Ortodoncia II");
        rbOpcion6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion6MouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("S/.");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("S/.");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Precio Parcial");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Precio Normal");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel15.setFocusCycleRoot(true);

        javax.swing.GroupLayout PanelPricipal1Layout = new javax.swing.GroupLayout(PanelPricipal1);
        PanelPricipal1.setLayout(PanelPricipal1Layout);
        PanelPricipal1Layout.setHorizontalGroup(
            PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbOpcion6, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(rbOpcion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal1Layout.createSequentialGroup()
                        .addGroup(PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPricipal1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecioParcial5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPricipal1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecioParcial6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)))
                .addGap(29, 29, 29))
        );
        PanelPricipal1Layout.setVerticalGroup(
            PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal1Layout.createSequentialGroup()
                .addGroup(PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(2, 2, 2)
                .addGroup(PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioNormal5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecioParcial5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(rbOpcion5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcion6)
                    .addComponent(txtPrecioNormal6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20))
        );

        PanelPricipal2.setBackground(new java.awt.Color(0, 0, 51));
        PanelPricipal2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRATAMIENTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelPricipal2.setPreferredSize(new java.awt.Dimension(380, 130));

        txtPrecioNormal9.setEditable(false);
        txtPrecioNormal9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal9.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioNormal10.setEditable(false);
        txtPrecioNormal10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal10.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial9.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial10.setPreferredSize(new java.awt.Dimension(40, 25));

        rbOpcion9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion9.setText("Barniz");
        rbOpcion9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion9rbOpcion2MouseClicked(evt);
            }
        });

        rbOpcion10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion10.setText("Cariostatico");
        rbOpcion10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion10MouseClicked(evt);
            }
        });
        rbOpcion10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOpcion10ActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("S/.");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("S/.");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Precio Parcial");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Precio Normal");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel23.setFocusCycleRoot(true);

        javax.swing.GroupLayout PanelPricipal2Layout = new javax.swing.GroupLayout(PanelPricipal2);
        PanelPricipal2.setLayout(PanelPricipal2Layout);
        PanelPricipal2Layout.setHorizontalGroup(
            PanelPricipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelPricipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbOpcion9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcion10, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPricipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPricipal2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal2Layout.createSequentialGroup()
                        .addGroup(PanelPricipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPricipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecioNormal9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioNormal10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPricipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioParcial10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioParcial9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addGap(19, 19, 19))
        );
        PanelPricipal2Layout.setVerticalGroup(
            PanelPricipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal2Layout.createSequentialGroup()
                .addGroup(PanelPricipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPricipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcion9)
                    .addComponent(txtPrecioNormal9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPricipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcion10)
                    .addComponent(txtPrecioNormal10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        PanelPricipal4.setBackground(new java.awt.Color(0, 0, 51));
        PanelPricipal4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRATAMIENTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelPricipal4.setForeground(new java.awt.Color(255, 255, 255));
        PanelPricipal4.setPreferredSize(new java.awt.Dimension(380, 146));

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

        txtTotal1.setEditable(false);
        txtTotal1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtTotal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtTotal1.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial8.setPreferredSize(new java.awt.Dimension(40, 25));

        rbOpcion8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion8.setText("Sellantes");
        rbOpcion8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOpcion8MouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("S/.");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("S/.");

        jlabeltotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabeltotal.setForeground(new java.awt.Color(255, 255, 255));
        jlabeltotal.setText("Total");
        jlabeltotal.setToolTipText("");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Precio Normal");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel17.setFocusCycleRoot(true);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("recementacion ");

        txtPieza1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPieza1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPieza1.setText("0");
        txtPieza1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPieza1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPieza1.setPreferredSize(new java.awt.Dimension(40, 25));
        txtPieza1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPieza1FocusLost(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel19.setText("Piezas");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.setFocusCycleRoot(true);

        jlabeltotal1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabeltotal1.setForeground(new java.awt.Color(255, 255, 255));
        jlabeltotal1.setText("Precio Parcial");
        jlabeltotal1.setToolTipText("");

        javax.swing.GroupLayout PanelPricipal4Layout = new javax.swing.GroupLayout(PanelPricipal4);
        PanelPricipal4.setLayout(PanelPricipal4Layout);
        PanelPricipal4Layout.setHorizontalGroup(
            PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(rbOpcion8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal4Layout.createSequentialGroup()
                        .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPricipal4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(4, 4, 4)
                                .addComponent(txtPrecioNormal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addComponent(jLabel17))
                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabeltotal1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelPricipal4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtPrecioParcial8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal4Layout.createSequentialGroup()
                        .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabeltotal))
                        .addGap(17, 17, 17)))
                .addGap(50, 50, 50))
        );
        PanelPricipal4Layout.setVerticalGroup(
            PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal4Layout.createSequentialGroup()
                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPricipal4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPricipal4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPricipal4Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel7))
                                    .addComponent(txtPrecioNormal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioNormal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal4Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel8))))
                            .addGroup(PanelPricipal4Layout.createSequentialGroup()
                                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelPricipal4Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel18)))
                                .addGap(19, 19, 19)
                                .addComponent(rbOpcion8))))
                    .addGroup(PanelPricipal4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jlabeltotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabeltotal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioParcial8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPricipal, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(PanelPricipal1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelPricipal4, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelPricipal2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(PanelPricipal3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelPricipal4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelPricipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelPricipal, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPricipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelPricipal3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbOpcion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion4MouseClicked
        // TODO add your handling code here:
        //EstaSelecionado2();
    }//GEN-LAST:event_rbOpcion4MouseClicked

    private void rbOpcion11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion11MouseClicked
        // TODO add your handling code here:
        //EstaSelecionado();
    }//GEN-LAST:event_rbOpcion11MouseClicked

    private void rbOpcion5rbOpcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion5rbOpcion2MouseClicked
        // TODO add your handling code here:
        //EstaSelecionado();
    }//GEN-LAST:event_rbOpcion5rbOpcion2MouseClicked

    private void rbOpcion6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion6MouseClicked
        // TODO add your handling code here:
        //EstaSelecionado();
    }//GEN-LAST:event_rbOpcion6MouseClicked

    private void rbOpcion9rbOpcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion9rbOpcion2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcion9rbOpcion2MouseClicked

    private void rbOpcion10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcion10MouseClicked

    private void rbOpcion8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOpcion8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcion8MouseClicked

    private void rbOpcion10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOpcion10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcion10ActionPerformed

    private void rbOpcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOpcion5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcion5ActionPerformed

    private void txtPieza1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPieza1FocusLost
         if (txtPieza1.getText().equals("")) {
            txtPieza1.setText("0");
        }
    }//GEN-LAST:event_txtPieza1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPricipal;
    private javax.swing.JPanel PanelPricipal1;
    private javax.swing.JPanel PanelPricipal2;
    private javax.swing.JPanel PanelPricipal3;
    private javax.swing.JPanel PanelPricipal4;
    private javax.swing.ButtonGroup bgGrupoBotones;
    private javax.swing.ButtonGroup bgGrupoBotones2;
    private javax.swing.ButtonGroup bgGrupoBotones3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabeltotal;
    private javax.swing.JLabel jlabeltotal1;
    public static javax.swing.JRadioButton rbOpcion1;
    public static javax.swing.JRadioButton rbOpcion10;
    public static javax.swing.JRadioButton rbOpcion11;
    public static javax.swing.JRadioButton rbOpcion2;
    public static javax.swing.JRadioButton rbOpcion3;
    public static javax.swing.JRadioButton rbOpcion4;
    public static javax.swing.JRadioButton rbOpcion5;
    public static javax.swing.JRadioButton rbOpcion6;
    public static javax.swing.JRadioButton rbOpcion8;
    public static javax.swing.JRadioButton rbOpcion9;
    public static javax.swing.JTextField txtPieza1;
    public static javax.swing.JTextField txtPrecioNormal1;
    public static javax.swing.JTextField txtPrecioNormal10;
    public static javax.swing.JTextField txtPrecioNormal11;
    public static javax.swing.JTextField txtPrecioNormal2;
    public static javax.swing.JTextField txtPrecioNormal3;
    public static javax.swing.JTextField txtPrecioNormal4;
    public static javax.swing.JTextField txtPrecioNormal5;
    public static javax.swing.JTextField txtPrecioNormal6;
    public static javax.swing.JTextField txtPrecioNormal7;
    public static javax.swing.JTextField txtPrecioNormal8;
    public static javax.swing.JTextField txtPrecioNormal9;
    public static javax.swing.JTextField txtPrecioParcial1;
    public static javax.swing.JTextField txtPrecioParcial10;
    public static javax.swing.JTextField txtPrecioParcial11;
    public static javax.swing.JTextField txtPrecioParcial2;
    public static javax.swing.JTextField txtPrecioParcial3;
    public static javax.swing.JTextField txtPrecioParcial4;
    public static javax.swing.JTextField txtPrecioParcial5;
    public static javax.swing.JTextField txtPrecioParcial6;
    public static javax.swing.JTextField txtPrecioParcial8;
    public static javax.swing.JTextField txtPrecioParcial9;
    public static javax.swing.JTextField txtTotal1;
    // End of variables declaration//GEN-END:variables
}
