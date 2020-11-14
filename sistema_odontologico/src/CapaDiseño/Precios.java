/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDiseño;

import CapaNegocio.CPrecio;
import CapaNegocio.Errores;
import Encapsulamiento.EPrecio;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vladimir
 */
public class Precios extends javax.swing.JPanel {

    /**
     * Creates new form Precios
     */
    public Precios() {
        initComponents();

//        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagen/wallpaper.jpg"));
//        Image imgEscalada = imgIcon.getImage().getScaledInstance(lbImagen.getWidth(),
//                lbImagen.getHeight(), Image.SCALE_SMOOTH);
//        Icon iconoEscalado = new ImageIcon(imgEscalada);
//        lbImagen.setIcon(iconoEscalado);
        Mostrar();
        Precio1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio6.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio7.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio8.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio9.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio10.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio11.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio12.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio13.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio15.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio16.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio17.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio18.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio19.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio20.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio21.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio22.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio23.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio24.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio25.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio26.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio27.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio28.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio29.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio30.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio31.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio32.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

                }
            }
        });
        Precio33.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    if (caracter != '.') {
                        e.consume();  // ignorar el evento de teclado
                    }

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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Precio1 = new javax.swing.JTextField();
        Precio2 = new javax.swing.JTextField();
        Precio3 = new javax.swing.JTextField();
        Precio4 = new javax.swing.JTextField();
        Precio5 = new javax.swing.JTextField();
        Precio6 = new javax.swing.JTextField();
        Precio7 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Precio8 = new javax.swing.JTextField();
        Precio9 = new javax.swing.JTextField();
        Precio10 = new javax.swing.JTextField();
        Precio11 = new javax.swing.JTextField();
        Precio12 = new javax.swing.JTextField();
        Precio13 = new javax.swing.JTextField();
        Precio15 = new javax.swing.JTextField();
        Precio16 = new javax.swing.JTextField();
        Precio17 = new javax.swing.JTextField();
        Precio18 = new javax.swing.JTextField();
        Precio19 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Precio20 = new javax.swing.JTextField();
        Precio21 = new javax.swing.JTextField();
        Precio22 = new javax.swing.JTextField();
        Precio23 = new javax.swing.JTextField();
        Precio24 = new javax.swing.JTextField();
        Precio25 = new javax.swing.JTextField();
        Precio26 = new javax.swing.JTextField();
        Precio27 = new javax.swing.JTextField();
        Precio28 = new javax.swing.JTextField();
        Precio29 = new javax.swing.JTextField();
        Precio30 = new javax.swing.JTextField();
        Precio31 = new javax.swing.JTextField();
        Precio32 = new javax.swing.JTextField();
        Precio33 = new javax.swing.JTextField();
        btnPreEstabecido = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnEstablecer1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1019, 673));
        setMinimumSize(new java.awt.Dimension(1019, 673));

        jPanel1.setLayout(null);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precios del Tratamiento I", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Destartraje:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Cepillado Profilaxis:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Fluorizacion:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Blanqueamiento Dental:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Carie Simple:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Carie Compuesta:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("Carie Recompuesta:");

        Precio1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio1.setText("0");
        Precio1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio2.setText("0");
        Precio2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio3.setText("0");
        Precio3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio4.setText("0");
        Precio4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio5.setText("0");
        Precio5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio6.setText("0");
        Precio6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio7.setText("0");
        Precio7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Precio7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Precio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Precio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Precio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Precio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Precio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Precio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tratamiento I", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precios del Tratamiento II (Endodoncia)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("Endo MultiRadicular:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel9.setText("Endo UniRadicular:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("BioPulpectomia:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel11.setText("NecroPulpectomia:         ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel12.setText("Ortodoncia I:       ");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel13.setText("Ortodoncia II:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel15.setText("Recementacion:");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel16.setText("Sellante:");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel17.setText("Barniz:");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel18.setText("Cariostatico:                   ");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel19.setText("Fibra Vidrio Colado:");

        Precio8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio8.setText("0");
        Precio8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio9.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio9.setText("0");
        Precio9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio10.setText("0");
        Precio10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio11.setText("0");
        Precio11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio12.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio12.setText("0");
        Precio12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio13.setText("0");
        Precio13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio15.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio15.setText("0");
        Precio15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio16.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio16.setText("0");
        Precio16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio17.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio17.setText("0");
        Precio17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio18.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio18.setText("0");
        Precio18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio19.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio19.setText("0");
        Precio19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Precio13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Precio15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Precio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Precio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Precio10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Precio11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Precio12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Precio13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(Precio19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(Precio18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Precio17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(Precio16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(Precio15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tratamiento II", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precios del Tratamiento  III (Exodoncia)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel20.setText("Raiz:                         ");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel21.setText("Posicion Normal:     ");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel22.setText("3° Molar Recta:");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel23.setText("3° Molar Quirurgica:");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel24.setText("Puente Superior:");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel25.setText("Puente Inferior:");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel26.setText("Ivocron:");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel27.setText("Belglas:");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel28.setText("Porcelana:");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel29.setText("Carrilas Ivostar:            ");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel30.setText("Base Metalica:");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel31.setText("Metal:");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel32.setText("Acrlico:");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel33.setText("Protesis Total:");

        Precio20.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio20.setForeground(new java.awt.Color(0, 0, 51));
        Precio20.setText("0");
        Precio20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio21.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio21.setForeground(new java.awt.Color(0, 0, 51));
        Precio21.setText("0");
        Precio21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio22.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio22.setForeground(new java.awt.Color(0, 0, 51));
        Precio22.setText("0");
        Precio22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio23.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio23.setForeground(new java.awt.Color(0, 0, 51));
        Precio23.setText("0");
        Precio23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio24.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio24.setForeground(new java.awt.Color(0, 0, 51));
        Precio24.setText("0");
        Precio24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio25.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio25.setForeground(new java.awt.Color(0, 0, 51));
        Precio25.setText("0");
        Precio25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio26.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio26.setForeground(new java.awt.Color(0, 0, 51));
        Precio26.setText("0");
        Precio26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio27.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio27.setForeground(new java.awt.Color(0, 0, 51));
        Precio27.setText("0");
        Precio27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio28.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio28.setForeground(new java.awt.Color(0, 0, 51));
        Precio28.setText("0");
        Precio28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio29.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio29.setForeground(new java.awt.Color(0, 0, 51));
        Precio29.setText("0");
        Precio29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio30.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio30.setForeground(new java.awt.Color(0, 0, 51));
        Precio30.setText("0");
        Precio30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio31.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio31.setForeground(new java.awt.Color(0, 0, 51));
        Precio31.setText("0");
        Precio31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio32.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio32.setForeground(new java.awt.Color(0, 0, 51));
        Precio32.setText("0");
        Precio32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        Precio33.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Precio33.setForeground(new java.awt.Color(0, 0, 51));
        Precio33.setText("0");
        Precio33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel31))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Precio25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Precio33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(Precio20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(Precio21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(Precio22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(Precio23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(Precio24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(Precio25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(Precio27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(Precio28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(Precio29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(Precio30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(Precio31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(Precio32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel33)
                    .addComponent(Precio33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tratamiento III", jPanel4);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(230, 156, 555, 321);

        btnPreEstabecido.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnPreEstabecido.setText("Precios Preestablecidos");
        btnPreEstabecido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPreEstabecidoMouseClicked(evt);
            }
        });
        jPanel1.add(btnPreEstabecido);
        btnPreEstabecido.setBounds(610, 500, 170, 23);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("NOTA:    PARA PODER USAR CON NORMALIDAD EL SISTEMA ODONTOLÓGICO 2.1, PRIMERO DEBERÁ DE ESTABLECER LOS PRECIOS DE LOS RESPECTIVOS TRATAMIENTOS.");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(58, 26, 890, 14);

        btnEstablecer1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnEstablecer1.setText("Establecer Precio");
        btnEstablecer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstablecer1MouseClicked(evt);
            }
        });
        jPanel1.add(btnEstablecer1);
        btnEstablecer1.setBounds(230, 500, 140, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstablecer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstablecer1MouseClicked
        int seleccion1 = JOptionPane.showOptionDialog(null, "¿seguro decea establecer los precios siguientes? \n "
                + "los siguientes presios se mostraran en los tratamientos"/*componente padre*/, //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");
        if (seleccion1 != -1) {
            if ((seleccion1 + 1) == 1) {
                if (Precio1.getText().equals("")) {
                    EPrecio.setCepillaje(0);
                } else {
                    EPrecio.setCepillaje(Double.parseDouble(Precio1.getText()));
                }

                if (Precio2.getText().equals("")) {
                    EPrecio.setCepilladoProfilaxico(0);
                } else {
                    EPrecio.setCepilladoProfilaxico(Double.parseDouble(Precio2.getText()));
                }
                if (Precio3.getText().equals("")) {
                    EPrecio.setFluorizacion(0);
                } else {
                    EPrecio.setFluorizacion(Double.parseDouble(Precio3.getText()));
                }
                if (Precio4.getText().equals("")) {
                    EPrecio.setBanqueamiento(0);
                } else {
                    EPrecio.setBanqueamiento(Double.parseDouble(Precio4.getText()));
                }
                if (Precio5.getText().equals("")) {
                    EPrecio.setCarieSimple(0);
                } else {
                    EPrecio.setCarieSimple(Double.parseDouble(Precio5.getText()));
                }
                if (Precio6.getText().equals("")) {
                    EPrecio.setCarieCompuesta(0);
                } else {
                    EPrecio.setCarieCompuesta(Double.parseDouble(Precio6.getText()));
                }
                if (Precio7.getText().equals("")) {
                    EPrecio.setCarieRecompuesta(0);
                } else {
                    EPrecio.setCarieRecompuesta(Double.parseDouble(Precio7.getText()));
                }
                if (Precio8.getText().equals("")) {
                    EPrecio.setEndoMultiRadicular(0);
                } else {
                    EPrecio.setEndoMultiRadicular(Double.parseDouble(Precio8.getText()));
                }
                if (Precio9.getText().equals("")) {
                    EPrecio.setEndoUniRadicular(0);
                } else {
                    EPrecio.setEndoUniRadicular(Double.parseDouble(Precio9.getText()));
                }
                if (Precio10.getText().equals("")) {
                    EPrecio.setBioPulpectomia(0);
                } else {
                    EPrecio.setBioPulpectomia(Double.parseDouble(Precio10.getText()));
                }
                if (Precio11.getText().equals("")) {
                    EPrecio.setNecroPulpectomia(0);
                } else {
                    EPrecio.setNecroPulpectomia(Double.parseDouble(Precio11.getText()));
                }
                if (Precio12.getText().equals("")) {
                    EPrecio.setOrtodonciaI(0);
                } else {
                    EPrecio.setOrtodonciaI(Double.parseDouble(Precio12.getText()));
                }
                if (Precio13.getText().equals("")) {
                    EPrecio.setOrtodonciaII(0);
                } else {
                    EPrecio.setOrtodonciaII(Double.parseDouble(Precio13.getText()));
                }
                if (Precio15.getText().equals("")) {
                    EPrecio.setFibraVidrio(0);
                } else {
                    EPrecio.setFibraVidrio(Double.parseDouble(Precio15.getText()));
                }
                if (Precio16.getText().equals("")) {
                    EPrecio.setCariostatico(0);
                } else {
                    EPrecio.setCariostatico(Double.parseDouble(Precio16.getText()));
                }
                if (Precio17.getText().equals("")) {
                    EPrecio.setBarniz(0);
                } else {
                    EPrecio.setBarniz(Double.parseDouble(Precio17.getText()));
                }
                if (Precio18.getText().equals("")) {
                    EPrecio.setSellantes(0);
                } else {
                    EPrecio.setSellantes(Double.parseDouble(Precio18.getText()));
                }
                if (Precio19.getText().equals("")) {
                    EPrecio.setRecementacion(0);
                } else {
                    EPrecio.setRecementacion(Double.parseDouble(Precio19.getText()));
                }
                if (Precio20.getText().equals("")) {
                    EPrecio.setRaiz(0);
                } else {
                    EPrecio.setRaiz(Double.parseDouble(Precio20.getText()));
                }
                if (Precio21.getText().equals("")) {
                    EPrecio.setPosicionNormal(0);
                } else {
                    EPrecio.setPosicionNormal(Double.parseDouble(Precio21.getText()));
                }
                if (Precio22.getText().equals("")) {
                    EPrecio.setMolarRecta(0);
                } else {
                    EPrecio.setMolarRecta(Double.parseDouble(Precio22.getText()));
                }
                if (Precio23.getText().equals("")) {
                    EPrecio.setMolarQuirurgica(0);
                } else {
                    EPrecio.setMolarQuirurgica(Double.parseDouble(Precio23.getText()));
                }
                if (Precio24.getText().equals("")) {
                    EPrecio.setPuente1(0);
                } else {
                    EPrecio.setPuente1(Double.parseDouble(Precio24.getText()));
                }
                if (Precio25.getText().equals("")) {
                    EPrecio.setPuente2(0);
                } else {
                    EPrecio.setPuente2(Double.parseDouble(Precio25.getText()));
                }
                if (Precio26.getText().equals("")) {
                    EPrecio.setMetal(0);
                } else {
                    EPrecio.setMetal(Double.parseDouble(Precio26.getText()));
                }
                if (Precio27.getText().equals("")) {
                    EPrecio.setIvocron(0);
                } else {
                    EPrecio.setIvocron(Double.parseDouble(Precio27.getText()));
                }
                if (Precio28.getText().equals("")) {
                    EPrecio.setBelga(0);
                } else {
                    EPrecio.setBelga(Double.parseDouble(Precio28.getText()));
                }
                if (Precio29.getText().equals("")) {
                    EPrecio.setPorcelana(0);
                } else {
                    EPrecio.setPorcelana(Double.parseDouble(Precio29.getText()));
                }
                if (Precio30.getText().equals("")) {
                    EPrecio.setCarrillas(0);
                } else {
                    EPrecio.setCarrillas(Double.parseDouble(Precio30.getText()));
                }
                if (Precio31.getText().equals("")) {
                    EPrecio.setBaseMetalica(0);
                } else {
                    EPrecio.setBaseMetalica(Double.parseDouble(Precio31.getText()));
                }
                if (Precio32.getText().equals("")) {
                    EPrecio.setAcrilico(0);
                } else {
                    EPrecio.setAcrilico(Double.parseDouble(Precio32.getText()));
                }
                if (Precio33.getText().equals("")) {
                    EPrecio.setProtesisTotal(0);
                } else {
                    EPrecio.setProtesisTotal(Double.parseDouble(Precio33.getText()));
                }
                if (CPrecio.GuardarHistorial()) {
                    Errores.Exito("Se establecio los precios correctamente \n Ya puede crear Historiales Clinicos");
                    Mostrar();
                } else {
                    Errores.Error("No se pudo establecer los precios correctamente");
                }
            }
        }
    }//GEN-LAST:event_btnEstablecer1MouseClicked

    private void btnPreEstabecidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreEstabecidoMouseClicked
        Precio1.setText("30");
        Precio2.setText("30");
        Precio3.setText("20");
        Precio4.setText("250");
        Precio5.setText("35");
        Precio6.setText("40");
        Precio7.setText("45");
        Precio8.setText("250");
        Precio9.setText("150");
        Precio10.setText("80");
        Precio11.setText("100");
        Precio12.setText("300");
        Precio13.setText("300");
        Precio15.setText("70");
        Precio16.setText("15");
        Precio17.setText("15");
        Precio18.setText("20");
        Precio19.setText("15");
        Precio20.setText("20");
        Precio21.setText("25");
        Precio22.setText("35");
        Precio23.setText("120");
        Precio24.setText("200");
        Precio25.setText("200");
        Precio26.setText("80");
        Precio27.setText("120");
        Precio28.setText("200");
        Precio29.setText("250");
        Precio30.setText("300");
        Precio31.setText("550");
        Precio32.setText("400");
        Precio33.setText("700");
    }//GEN-LAST:event_btnPreEstabecidoMouseClicked
    public void Mostrar() {
        try {
            ResultSet rs = CPrecio.Mostrar();
            while (rs.next()) {
                Precio1.setText(rs.getString(1));
                Precio2.setText(rs.getString(2));
                Precio3.setText(rs.getString(3));
                Precio4.setText(rs.getString(4));
                Precio5.setText(rs.getString(5));
                Precio6.setText(rs.getString(6));
                Precio7.setText(rs.getString(7));
                Precio8.setText(rs.getString(8));
                Precio9.setText(rs.getString(9));
                Precio10.setText(rs.getString(10));
                Precio11.setText(rs.getString(11));
                Precio12.setText(rs.getString(12));
                Precio13.setText(rs.getString(13));
                Precio15.setText(rs.getString(18));
                Precio16.setText(rs.getString(17));
                Precio17.setText(rs.getString(16));
                Precio18.setText(rs.getString(15));
                Precio19.setText(rs.getString(14));
                Precio20.setText(rs.getString(19));
                Precio21.setText(rs.getString(20));
                Precio22.setText(rs.getString(21));
                Precio23.setText(rs.getString(22));
                Precio24.setText(rs.getString(23));
                Precio25.setText(rs.getString(24));
                Precio26.setText(rs.getString(25));
                Precio27.setText(rs.getString(26));
                Precio28.setText(rs.getString(27));
                Precio29.setText(rs.getString(28));
                Precio30.setText(rs.getString(29));
                Precio31.setText(rs.getString(30));
                Precio32.setText(rs.getString(31));
                Precio33.setText(rs.getString(32));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Precios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Precio1;
    public static javax.swing.JTextField Precio10;
    public static javax.swing.JTextField Precio11;
    public static javax.swing.JTextField Precio12;
    public static javax.swing.JTextField Precio13;
    public static javax.swing.JTextField Precio15;
    public static javax.swing.JTextField Precio16;
    public static javax.swing.JTextField Precio17;
    public static javax.swing.JTextField Precio18;
    public static javax.swing.JTextField Precio19;
    public static javax.swing.JTextField Precio2;
    public static javax.swing.JTextField Precio20;
    public static javax.swing.JTextField Precio21;
    public static javax.swing.JTextField Precio22;
    public static javax.swing.JTextField Precio23;
    public static javax.swing.JTextField Precio24;
    public static javax.swing.JTextField Precio25;
    public static javax.swing.JTextField Precio26;
    public static javax.swing.JTextField Precio27;
    public static javax.swing.JTextField Precio28;
    public static javax.swing.JTextField Precio29;
    public static javax.swing.JTextField Precio3;
    public static javax.swing.JTextField Precio30;
    public static javax.swing.JTextField Precio31;
    public static javax.swing.JTextField Precio32;
    public static javax.swing.JTextField Precio33;
    public static javax.swing.JTextField Precio4;
    public static javax.swing.JTextField Precio5;
    public static javax.swing.JTextField Precio6;
    public static javax.swing.JTextField Precio7;
    public static javax.swing.JTextField Precio8;
    public static javax.swing.JTextField Precio9;
    public static javax.swing.JButton btnEstablecer1;
    public static javax.swing.JButton btnPreEstabecido;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
