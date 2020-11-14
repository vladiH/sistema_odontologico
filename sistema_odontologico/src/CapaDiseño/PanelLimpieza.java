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
public class PanelLimpieza extends javax.swing.JPanel {

    /**
     * Creates new form PanelLimpieza
     */
    public PanelLimpieza() {
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

        //************************************
        txtPrecioNormal5.addKeyListener(new KeyAdapter() {
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
        txtPrecioNormal6.addKeyListener(new KeyAdapter() {
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
        //************************************
        txtPieza3.addKeyListener(new KeyAdapter() {
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
        PanelPricipal = new javax.swing.JPanel();
        rbOpcion3 = new javax.swing.JRadioButton();
        txtPrecioNormal1 = new javax.swing.JTextField();
        txtPrecioNormal2 = new javax.swing.JTextField();
        txtPrecioNormal3 = new javax.swing.JTextField();
        txtPrecioParcial1 = new javax.swing.JTextField();
        txtPrecioParcial2 = new javax.swing.JTextField();
        txtPrecioParcial3 = new javax.swing.JTextField();
        rbOpcion1 = new javax.swing.JRadioButton();
        rbOpcion2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PanelPricipal1 = new javax.swing.JPanel();
        PanelPricipal3 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtPrecioNormal7 = new javax.swing.JTextField();
        txtPrecioTotal3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPieza3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        PanelPricipal5 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtPrecioNormal6 = new javax.swing.JTextField();
        txtPrecioTotal2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPieza2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        PanelPricipal9 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtPrecioNormal5 = new javax.swing.JTextField();
        txtPrecioTotal1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPieza1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelPricipal4 = new javax.swing.JPanel();
        txtPrecioNormal4 = new javax.swing.JTextField();
        txtPrecioParcial4 = new javax.swing.JTextField();
        rbOpcion4 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.textHighlightText);
        setForeground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);
        setMinimumSize(new java.awt.Dimension(800, 530));
        setName("Panel"); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(990, 510));

        PanelPricipal.setBackground(new java.awt.Color(0, 0, 51));
        PanelPricipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESTARTRAJE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelPricipal.setPreferredSize(new java.awt.Dimension(360, 201));

        rbOpcion3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion3.setText("Fluorizacion");
        rbOpcion3.setName("rbOpcion3"); // NOI18N

        txtPrecioNormal1.setEditable(false);
        txtPrecioNormal1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal1.setName("pParcial1"); // NOI18N
        txtPrecioNormal1.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioNormal2.setEditable(false);
        txtPrecioNormal2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal2.setName("pParcial2"); // NOI18N
        txtPrecioNormal2.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioNormal3.setEditable(false);
        txtPrecioNormal3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal3.setName("pParcial3"); // NOI18N
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
        rbOpcion1.setText("Destartraje");
        rbOpcion1.setName("rbOpcion1"); // NOI18N

        rbOpcion2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion2.setText("Cepillado Profilaxis");
        rbOpcion2.setName("rbOpcion2"); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("S/.");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("S/.");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("S/.");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Precio Parcial");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Precio Normal");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setFocusCycleRoot(true);

        javax.swing.GroupLayout PanelPricipalLayout = new javax.swing.GroupLayout(PanelPricipal);
        PanelPricipal.setLayout(PanelPricipalLayout);
        PanelPricipalLayout.setHorizontalGroup(
            PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rbOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbOpcion3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelPricipalLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(30, 30, 30))
                    .addGroup(PanelPricipalLayout.createSequentialGroup()
                        .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipalLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipalLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipalLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioNormal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecioParcial2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioParcial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioParcial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        PanelPricipalLayout.setVerticalGroup(
            PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcion1)
                    .addComponent(txtPrecioNormal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecioNormal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOpcion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(PanelPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecioNormal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbOpcion3))
                .addGap(30, 30, 30))
        );

        PanelPricipal1.setBackground(new java.awt.Color(0, 0, 51));
        PanelPricipal1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPERATORIA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelPricipal1.setPreferredSize(new java.awt.Dimension(435, 340));

        PanelPricipal3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelPricipal3.setPreferredSize(new java.awt.Dimension(340, 90));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(316, 45));

        txtPrecioNormal7.setEditable(false);
        txtPrecioNormal7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal7.setName("pParcial7"); // NOI18N
        txtPrecioNormal7.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioTotal3.setEditable(false);
        txtPrecioTotal3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioTotal3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioTotal3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioTotal3.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Caries Recompuesta");

        txtPieza3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPieza3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPieza3.setText("0");
        txtPieza3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPieza3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("S/.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(txtPieza3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioNormal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPrecioTotal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioNormal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioTotal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPieza3)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Total");
        jLabel20.setAutoscrolls(true);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel21.setText("Precio Normal");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel21.setFocusCycleRoot(true);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("Piezas");

        javax.swing.GroupLayout PanelPricipal3Layout = new javax.swing.GroupLayout(PanelPricipal3);
        PanelPricipal3.setLayout(PanelPricipal3Layout);
        PanelPricipal3Layout.setHorizontalGroup(
            PanelPricipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPricipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addGroup(PanelPricipal3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        PanelPricipal3Layout.setVerticalGroup(
            PanelPricipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPricipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        PanelPricipal5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelPricipal5.setPreferredSize(new java.awt.Dimension(340, 90));

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setPreferredSize(new java.awt.Dimension(316, 45));

        txtPrecioNormal6.setEditable(false);
        txtPrecioNormal6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal6.setName("pParcial6"); // NOI18N
        txtPrecioNormal6.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioTotal2.setEditable(false);
        txtPrecioTotal2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioTotal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioTotal2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioTotal2.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("S/.");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Caries Compuesta");

        txtPieza2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPieza2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPieza2.setText("0");
        txtPieza2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPieza2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(txtPieza2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioNormal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txtPrecioTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioNormal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(txtPieza2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Total");
        jLabel18.setAutoscrolls(true);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel19.setText("Precio Normal");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.setFocusCycleRoot(true);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("Piezas");

        javax.swing.GroupLayout PanelPricipal5Layout = new javax.swing.GroupLayout(PanelPricipal5);
        PanelPricipal5.setLayout(PanelPricipal5Layout);
        PanelPricipal5Layout.setHorizontalGroup(
            PanelPricipal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPricipal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPricipal5Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(PanelPricipal5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel19)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel18)
                        .addGap(31, 31, 31))))
        );
        PanelPricipal5Layout.setVerticalGroup(
            PanelPricipal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPricipal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        PanelPricipal9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelPricipal9.setPreferredSize(new java.awt.Dimension(340, 90));

        jPanel9.setBackground(new java.awt.Color(0, 0, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setPreferredSize(new java.awt.Dimension(316, 45));

        txtPrecioNormal5.setEditable(false);
        txtPrecioNormal5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal5.setName("pParcial5"); // NOI18N
        txtPrecioNormal5.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioTotal1.setEditable(false);
        txtPrecioTotal1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioTotal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioTotal1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioTotal1.setPreferredSize(new java.awt.Dimension(40, 25));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("S/.");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Caries Simple");

        txtPieza1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPieza1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPieza1.setText("0");
        txtPieza1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPieza1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioNormal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtPrecioTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioNormal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecioTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtPieza1))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Total");
        jLabel16.setAutoscrolls(true);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Precio Normal");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel17.setFocusCycleRoot(true);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Piezas");

        javax.swing.GroupLayout PanelPricipal9Layout = new javax.swing.GroupLayout(PanelPricipal9);
        PanelPricipal9.setLayout(PanelPricipal9Layout);
        PanelPricipal9Layout.setHorizontalGroup(
            PanelPricipal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPricipal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addGroup(PanelPricipal9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel17)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        PanelPricipal9Layout.setVerticalGroup(
            PanelPricipal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPricipal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelPricipal1Layout = new javax.swing.GroupLayout(PanelPricipal1);
        PanelPricipal1.setLayout(PanelPricipal1Layout);
        PanelPricipal1Layout.setHorizontalGroup(
            PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelPricipal9, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(PanelPricipal5, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(PanelPricipal3, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        PanelPricipal1Layout.setVerticalGroup(
            PanelPricipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPricipal9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(PanelPricipal5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(PanelPricipal3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelPricipal4.setBackground(new java.awt.Color(0, 0, 51));
        PanelPricipal4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRATAMIENTO ESTETICO 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Copperplate Gothic Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelPricipal4.setPreferredSize(new java.awt.Dimension(360, 100));

        txtPrecioNormal4.setEditable(false);
        txtPrecioNormal4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioNormal4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioNormal4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioNormal4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioNormal4.setName("pParcial4"); // NOI18N
        txtPrecioNormal4.setPreferredSize(new java.awt.Dimension(40, 25));

        txtPrecioParcial4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecioParcial4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioParcial4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        txtPrecioParcial4.setPreferredSize(new java.awt.Dimension(40, 25));

        rbOpcion4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbOpcion4.setText("Blanqueamiento Dental");
        rbOpcion4.setName("rbOpcion4"); // NOI18N

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("S/.");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Precio Parcial");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Precio Normal");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel15.setFocusCycleRoot(true);

        javax.swing.GroupLayout PanelPricipal4Layout = new javax.swing.GroupLayout(PanelPricipal4);
        PanelPricipal4.setLayout(PanelPricipal4Layout);
        PanelPricipal4Layout.setHorizontalGroup(
            PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPricipal4Layout.createSequentialGroup()
                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelPricipal4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15))
                    .addGroup(PanelPricipal4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbOpcion4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioNormal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGap(18, 18, 18)
                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(PanelPricipal4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtPrecioParcial4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        PanelPricipal4Layout.setVerticalGroup(
            PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPricipal4Layout.createSequentialGroup()
                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPricipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcion4)
                    .addComponent(txtPrecioNormal4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioParcial4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelPricipal, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                    .addComponent(PanelPricipal4, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(PanelPricipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPricipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelPricipal, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(PanelPricipal4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FocusLost
        if (txtPieza1.getText().equals("")) {
            txtPieza1.setText("0");
        }
        if (txtPieza2.getText().equals("")) {
            txtPieza2.setText("0");
        }
        if (txtPieza3.getText().equals("")) {
            txtPieza3.setText("0");
        }
    }//GEN-LAST:event_FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PanelPricipal;
    public static javax.swing.JPanel PanelPricipal1;
    public static javax.swing.JPanel PanelPricipal3;
    public static javax.swing.JPanel PanelPricipal4;
    public static javax.swing.JPanel PanelPricipal5;
    public static javax.swing.JPanel PanelPricipal9;
    public static javax.swing.ButtonGroup bgGrupoBotones;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanel9;
    public static javax.swing.JRadioButton rbOpcion1;
    public static javax.swing.JRadioButton rbOpcion2;
    public static javax.swing.JRadioButton rbOpcion3;
    public static javax.swing.JRadioButton rbOpcion4;
    public static javax.swing.JTextField txtPieza1;
    public static javax.swing.JTextField txtPieza2;
    public static javax.swing.JTextField txtPieza3;
    public static javax.swing.JTextField txtPrecioNormal1;
    public static javax.swing.JTextField txtPrecioNormal2;
    public static javax.swing.JTextField txtPrecioNormal3;
    public static javax.swing.JTextField txtPrecioNormal4;
    public static javax.swing.JTextField txtPrecioNormal5;
    public static javax.swing.JTextField txtPrecioNormal6;
    public static javax.swing.JTextField txtPrecioNormal7;
    public static javax.swing.JTextField txtPrecioParcial1;
    public static javax.swing.JTextField txtPrecioParcial2;
    public static javax.swing.JTextField txtPrecioParcial3;
    public static javax.swing.JTextField txtPrecioParcial4;
    public static javax.swing.JTextField txtPrecioTotal1;
    public static javax.swing.JTextField txtPrecioTotal2;
    public static javax.swing.JTextField txtPrecioTotal3;
    // End of variables declaration//GEN-END:variables
}
