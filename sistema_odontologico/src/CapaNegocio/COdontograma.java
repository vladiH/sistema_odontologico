/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import CapaDiseño.Odontograma;

/**
 *
 * @author l nagato
 */
public class COdontograma {

    String Extraido = "/Imagen/Extraido.png";
    String Extraer = "/Imagen/Extraer.png";
    boolean v = true;
    boolean f = false;

    public void Funcion(String Op, String Diente) throws SQLException {
        Dientes(Diente, Op);
    }

    public void FuncionMostrar(String[] arreglo_Dientes) throws SQLException {
        for (int i = 0; i < arreglo_Dientes.length; i++) {
            String[] Tramiento = arreglo_Dientes[i].split("/");
            Dientes(Tramiento[0], Tramiento[1]);
        }

    }
    /* ************ inicio de seleccion de dientes**/

    public void Dientes(String Diente, String Op) {

        if (Diente.equals(Odontograma.txtB.getName())
                || Diente.equals(Odontograma.txtC.getName())
                || Diente.equals(Odontograma.txtT.getName())
                || Diente.equals(Odontograma.txtR.getName())
                || Diente.equals(Odontograma.txtL.getName())
                || Diente.equals(Odontograma.lb18.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB.getName().equals(Diente)) {
                    Odontograma.txtB.setBackground(Color.red);
                }
                if (Odontograma.txtC.getName().equals(Diente)) {
                    Odontograma.txtC.setBackground(Color.red);
                }
                if (Odontograma.txtT.getName().equals(Diente)) {
                    Odontograma.txtT.setBackground(Color.red);
                }
                if (Odontograma.txtL.getName().equals(Diente)) {
                    Odontograma.txtL.setBackground(Color.red);
                }
                if (Odontograma.txtR.getName().equals(Diente)) {
                    Odontograma.txtR.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB.getName().equals(Diente)) {
                    Odontograma.txtB.setBackground(Color.blue);
                }
                if (Odontograma.txtC.getName().equals(Diente)) {
                    Odontograma.txtC.setBackground(Color.blue);
                }
                if (Odontograma.txtT.getName().equals(Diente)) {
                    Odontograma.txtT.setBackground(Color.blue);
                }
                if (Odontograma.txtL.getName().equals(Diente)) {
                    Odontograma.txtL.setBackground(Color.blue);
                }
                if (Odontograma.txtR.getName().equals(Diente)) {
                    Odontograma.txtR.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB.getName().equals(Diente)) {
                    Odontograma.txtB.setBackground(Color.white);
                }
                if (Odontograma.txtC.getName().equals(Diente)) {
                    Odontograma.txtC.setBackground(Color.white);
                }
                if (Odontograma.txtT.getName().equals(Diente)) {
                    Odontograma.txtT.setBackground(Color.white);
                }
                if (Odontograma.txtL.getName().equals(Diente)) {
                    Odontograma.txtL.setBackground(Color.white);
                }
                if (Odontograma.txtR.getName().equals(Diente)) {
                    Odontograma.txtR.setBackground(Color.white);
                }
                if (Odontograma.lb18.getName().equals(Diente)) {
                    Odontograma.txtB.setVisible(v);
                    Odontograma.txtC.setVisible(v);
                    Odontograma.txtT.setVisible(v);
                    Odontograma.txtR.setVisible(v);
                    Odontograma.txtL.setVisible(v);
                    Odontograma.lb18.setIcon(new ImageIcon(getClass().getResource("")));
                }

            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB.setVisible(false);
                Odontograma.txtC.setVisible(false);
                Odontograma.txtT.setVisible(false);
                Odontograma.txtR.setVisible(false);
                Odontograma.txtL.setVisible(false);
                Odontograma.lb18.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB.setVisible(false);
                Odontograma.txtC.setVisible(false);
                Odontograma.txtT.setVisible(false);
                Odontograma.txtR.setVisible(false);
                Odontograma.txtL.setVisible(false);
                Odontograma.lb18.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }
        if (Diente.equals(Odontograma.txtB1.getName())
                || Diente.equals(Odontograma.txtC1.getName())
                || Diente.equals(Odontograma.txtT1.getName())
                || Diente.equals(Odontograma.txtR1.getName())
                || Diente.equals(Odontograma.txtL1.getName())
                || Diente.equals(Odontograma.lb17.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB1.getName().equals(Diente)) {
                    Odontograma.txtB1.setBackground(Color.red);
                }
                if (Odontograma.txtC1.getName().equals(Diente)) {
                    Odontograma.txtC1.setBackground(Color.red);
                }
                if (Odontograma.txtT1.getName().equals(Diente)) {
                    Odontograma.txtT1.setBackground(Color.red);
                }
                if (Odontograma.txtL1.getName().equals(Diente)) {
                    Odontograma.txtL1.setBackground(Color.red);
                }
                if (Odontograma.txtR1.getName().equals(Diente)) {
                    Odontograma.txtR1.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB1.getName().equals(Diente)) {
                    Odontograma.txtB1.setBackground(Color.blue);
                }
                if (Odontograma.txtC1.getName().equals(Diente)) {
                    Odontograma.txtC1.setBackground(Color.blue);
                }
                if (Odontograma.txtT1.getName().equals(Diente)) {
                    Odontograma.txtT1.setBackground(Color.blue);
                }
                if (Odontograma.txtL1.getName().equals(Diente)) {
                    Odontograma.txtL1.setBackground(Color.blue);
                }
                if (Odontograma.txtR1.getName().equals(Diente)) {
                    Odontograma.txtR1.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB1.getName().equals(Diente)) {
                    Odontograma.txtB1.setBackground(Color.white);
                }
                if (Odontograma.txtC1.getName().equals(Diente)) {
                    Odontograma.txtC1.setBackground(Color.white);
                }
                if (Odontograma.txtT1.getName().equals(Diente)) {
                    Odontograma.txtT1.setBackground(Color.white);
                }
                if (Odontograma.txtL1.getName().equals(Diente)) {
                    Odontograma.txtL1.setBackground(Color.white);
                }
                if (Odontograma.txtR1.getName().equals(Diente)) {
                    Odontograma.txtR1.setBackground(Color.white);
                }
                if (Odontograma.lb17.getName().equals(Diente)) {
                    Odontograma.txtB1.setVisible(v);
                    Odontograma.txtC1.setVisible(v);
                    Odontograma.txtT1.setVisible(v);
                    Odontograma.txtR1.setVisible(v);
                    Odontograma.txtL1.setVisible(v);
                    Odontograma.lb17.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB1.setVisible(false);
                Odontograma.txtC1.setVisible(false);
                Odontograma.txtT1.setVisible(false);
                Odontograma.txtR1.setVisible(false);
                Odontograma.txtL1.setVisible(false);
                Odontograma.lb17.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB1.setVisible(false);
                Odontograma.txtC1.setVisible(false);
                Odontograma.txtT1.setVisible(false);
                Odontograma.txtR1.setVisible(false);
                Odontograma.txtL1.setVisible(false);
                Odontograma.lb17.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB2.getName())
                || Diente.equals(Odontograma.txtC2.getName())
                || Diente.equals(Odontograma.txtT2.getName())
                || Diente.equals(Odontograma.txtR2.getName())
                || Diente.equals(Odontograma.txtL2.getName())
                || Diente.equals(Odontograma.lb16.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB2.getName().equals(Diente)) {
                    Odontograma.txtB2.setBackground(Color.red);
                }
                if (Odontograma.txtC2.getName().equals(Diente)) {
                    Odontograma.txtC2.setBackground(Color.red);
                }
                if (Odontograma.txtT2.getName().equals(Diente)) {
                    Odontograma.txtT2.setBackground(Color.red);
                }
                if (Odontograma.txtL2.getName().equals(Diente)) {
                    Odontograma.txtL2.setBackground(Color.red);
                }
                if (Odontograma.txtR2.getName().equals(Diente)) {
                    Odontograma.txtR2.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB2.getName().equals(Diente)) {
                    Odontograma.txtB2.setBackground(Color.blue);
                }
                if (Odontograma.txtC2.getName().equals(Diente)) {
                    Odontograma.txtC2.setBackground(Color.blue);
                }
                if (Odontograma.txtT2.getName().equals(Diente)) {
                    Odontograma.txtT2.setBackground(Color.blue);
                }
                if (Odontograma.txtL2.getName().equals(Diente)) {
                    Odontograma.txtL2.setBackground(Color.blue);
                }
                if (Odontograma.txtR2.getName().equals(Diente)) {
                    Odontograma.txtR2.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB2.getName().equals(Diente)) {
                    Odontograma.txtB2.setBackground(Color.white);
                }
                if (Odontograma.txtC2.getName().equals(Diente)) {
                    Odontograma.txtC2.setBackground(Color.white);
                }
                if (Odontograma.txtT2.getName().equals(Diente)) {
                    Odontograma.txtT2.setBackground(Color.white);
                }
                if (Odontograma.txtL2.getName().equals(Diente)) {
                    Odontograma.txtL2.setBackground(Color.white);
                }
                if (Odontograma.txtR2.getName().equals(Diente)) {
                    Odontograma.txtR2.setBackground(Color.white);
                }
                if (Odontograma.lb16.getName().equals(Diente)) {
                    Odontograma.txtB2.setVisible(v);
                    Odontograma.txtC2.setVisible(v);
                    Odontograma.txtT2.setVisible(v);
                    Odontograma.txtR2.setVisible(v);
                    Odontograma.txtL2.setVisible(v);
                    Odontograma.lb16.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB2.setVisible(false);
                Odontograma.txtC2.setVisible(false);
                Odontograma.txtT2.setVisible(false);
                Odontograma.txtR2.setVisible(false);
                Odontograma.txtL2.setVisible(false);
                Odontograma.lb16.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB2.setVisible(false);
                Odontograma.txtC2.setVisible(false);
                Odontograma.txtT2.setVisible(false);
                Odontograma.txtR2.setVisible(false);
                Odontograma.txtL2.setVisible(false);
                Odontograma.lb16.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB3.getName())
                || Diente.equals(Odontograma.txtC3.getName())
                || Diente.equals(Odontograma.txtT3.getName())
                || Diente.equals(Odontograma.txtR3.getName())
                || Diente.equals(Odontograma.txtL3.getName())
                || Diente.equals(Odontograma.lb15.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB3.getName().equals(Diente)) {
                    Odontograma.txtB3.setBackground(Color.red);
                }
                if (Odontograma.txtC3.getName().equals(Diente)) {
                    Odontograma.txtC3.setBackground(Color.red);
                }
                if (Odontograma.txtT3.getName().equals(Diente)) {
                    Odontograma.txtT3.setBackground(Color.red);
                }
                if (Odontograma.txtL3.getName().equals(Diente)) {
                    Odontograma.txtL3.setBackground(Color.red);
                }
                if (Odontograma.txtR3.getName().equals(Diente)) {
                    Odontograma.txtR3.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB3.getName().equals(Diente)) {
                    Odontograma.txtB3.setBackground(Color.blue);
                }
                if (Odontograma.txtC3.getName().equals(Diente)) {
                    Odontograma.txtC3.setBackground(Color.blue);
                }
                if (Odontograma.txtT3.getName().equals(Diente)) {
                    Odontograma.txtT3.setBackground(Color.blue);
                }
                if (Odontograma.txtL3.getName().equals(Diente)) {
                    Odontograma.txtL3.setBackground(Color.blue);
                }
                if (Odontograma.txtR3.getName().equals(Diente)) {
                    Odontograma.txtR3.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB3.getName().equals(Diente)) {
                    Odontograma.txtB3.setBackground(Color.white);
                }
                if (Odontograma.txtC3.getName().equals(Diente)) {
                    Odontograma.txtC3.setBackground(Color.white);
                }
                if (Odontograma.txtT3.getName().equals(Diente)) {
                    Odontograma.txtT3.setBackground(Color.white);
                }
                if (Odontograma.txtL3.getName().equals(Diente)) {
                    Odontograma.txtL3.setBackground(Color.white);
                }
                if (Odontograma.txtR3.getName().equals(Diente)) {
                    Odontograma.txtR3.setBackground(Color.white);
                }
                if (Odontograma.lb15.getName().equals(Diente)) {
                    Odontograma.txtB3.setVisible(v);
                    Odontograma.txtC3.setVisible(v);
                    Odontograma.txtT3.setVisible(v);
                    Odontograma.txtR3.setVisible(v);
                    Odontograma.txtL3.setVisible(v);
                    Odontograma.lb15.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB3.setVisible(false);
                Odontograma.txtC3.setVisible(false);
                Odontograma.txtT3.setVisible(false);
                Odontograma.txtR3.setVisible(false);
                Odontograma.txtL3.setVisible(false);
                Odontograma.lb15.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB3.setVisible(false);
                Odontograma.txtC3.setVisible(false);
                Odontograma.txtT3.setVisible(false);
                Odontograma.txtR3.setVisible(false);
                Odontograma.txtL3.setVisible(false);
                Odontograma.lb15.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB4.getName())
                || Diente.equals(Odontograma.txtC4.getName())
                || Diente.equals(Odontograma.txtT4.getName())
                || Diente.equals(Odontograma.txtR4.getName())
                || Diente.equals(Odontograma.txtL4.getName())
                || Diente.equals(Odontograma.lb14.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB4.getName().equals(Diente)) {
                    Odontograma.txtB4.setBackground(Color.red);
                }
                if (Odontograma.txtC4.getName().equals(Diente)) {
                    Odontograma.txtC4.setBackground(Color.red);
                }
                if (Odontograma.txtT4.getName().equals(Diente)) {
                    Odontograma.txtT4.setBackground(Color.red);
                }
                if (Odontograma.txtL4.getName().equals(Diente)) {
                    Odontograma.txtL4.setBackground(Color.red);
                }
                if (Odontograma.txtR4.getName().equals(Diente)) {
                    Odontograma.txtR4.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB4.getName().equals(Diente)) {
                    Odontograma.txtB4.setBackground(Color.blue);
                }
                if (Odontograma.txtC4.getName().equals(Diente)) {
                    Odontograma.txtC4.setBackground(Color.blue);
                }
                if (Odontograma.txtT4.getName().equals(Diente)) {
                    Odontograma.txtT4.setBackground(Color.blue);
                }
                if (Odontograma.txtL4.getName().equals(Diente)) {
                    Odontograma.txtL4.setBackground(Color.blue);
                }
                if (Odontograma.txtR4.getName().equals(Diente)) {
                    Odontograma.txtR4.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB4.getName().equals(Diente)) {
                    Odontograma.txtB4.setBackground(Color.white);
                }
                if (Odontograma.txtC4.getName().equals(Diente)) {
                    Odontograma.txtC4.setBackground(Color.white);
                }
                if (Odontograma.txtT4.getName().equals(Diente)) {
                    Odontograma.txtT4.setBackground(Color.white);
                }
                if (Odontograma.txtL4.getName().equals(Diente)) {
                    Odontograma.txtL4.setBackground(Color.white);
                }
                if (Odontograma.txtR4.getName().equals(Diente)) {
                    Odontograma.txtR4.setBackground(Color.white);
                }
                if (Odontograma.lb14.getName().equals(Diente)) {
                    Odontograma.txtB4.setVisible(v);
                    Odontograma.txtC4.setVisible(v);
                    Odontograma.txtT4.setVisible(v);
                    Odontograma.txtR4.setVisible(v);
                    Odontograma.txtL4.setVisible(v);
                    Odontograma.lb14.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB4.setVisible(false);
                Odontograma.txtC4.setVisible(false);
                Odontograma.txtT4.setVisible(false);
                Odontograma.txtR4.setVisible(false);
                Odontograma.txtL4.setVisible(false);
                Odontograma.lb14.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB4.setVisible(false);
                Odontograma.txtC4.setVisible(false);
                Odontograma.txtT4.setVisible(false);
                Odontograma.txtR4.setVisible(false);
                Odontograma.txtL4.setVisible(false);
                Odontograma.lb14.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB5.getName())
                || Diente.equals(Odontograma.txtC5.getName())
                || Diente.equals(Odontograma.txtT5.getName())
                || Diente.equals(Odontograma.txtR5.getName())
                || Diente.equals(Odontograma.txtL5.getName())
                || Diente.equals(Odontograma.lb13.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB5.getName().equals(Diente)) {
                    Odontograma.txtB5.setBackground(Color.red);
                }
                if (Odontograma.txtC5.getName().equals(Diente)) {
                    Odontograma.txtC5.setBackground(Color.red);
                }
                if (Odontograma.txtT5.getName().equals(Diente)) {
                    Odontograma.txtT5.setBackground(Color.red);
                }
                if (Odontograma.txtL5.getName().equals(Diente)) {
                    Odontograma.txtL5.setBackground(Color.red);
                }
                if (Odontograma.txtR5.getName().equals(Diente)) {
                    Odontograma.txtR5.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB5.getName().equals(Diente)) {
                    Odontograma.txtB5.setBackground(Color.blue);
                }
                if (Odontograma.txtC5.getName().equals(Diente)) {
                    Odontograma.txtC5.setBackground(Color.blue);
                }
                if (Odontograma.txtT5.getName().equals(Diente)) {
                    Odontograma.txtT5.setBackground(Color.blue);
                }
                if (Odontograma.txtL5.getName().equals(Diente)) {
                    Odontograma.txtL5.setBackground(Color.blue);
                }
                if (Odontograma.txtR5.getName().equals(Diente)) {
                    Odontograma.txtR5.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB5.getName().equals(Diente)) {
                    Odontograma.txtB5.setBackground(Color.white);
                }
                if (Odontograma.txtC5.getName().equals(Diente)) {
                    Odontograma.txtC5.setBackground(Color.white);
                }
                if (Odontograma.txtT5.getName().equals(Diente)) {
                    Odontograma.txtT5.setBackground(Color.white);
                }
                if (Odontograma.txtL5.getName().equals(Diente)) {
                    Odontograma.txtL5.setBackground(Color.white);
                }
                if (Odontograma.txtR5.getName().equals(Diente)) {
                    Odontograma.txtR5.setBackground(Color.white);
                }
                if (Odontograma.lb13.getName().equals(Diente)) {
                    Odontograma.txtB5.setVisible(v);
                    Odontograma.txtC5.setVisible(v);
                    Odontograma.txtT5.setVisible(v);
                    Odontograma.txtR5.setVisible(v);
                    Odontograma.txtL5.setVisible(v);
                    Odontograma.lb13.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB5.setVisible(false);
                Odontograma.txtC5.setVisible(false);
                Odontograma.txtT5.setVisible(false);
                Odontograma.txtR5.setVisible(false);
                Odontograma.txtL5.setVisible(false);
                Odontograma.lb13.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB5.setVisible(false);
                Odontograma.txtC5.setVisible(false);
                Odontograma.txtT5.setVisible(false);
                Odontograma.txtR5.setVisible(false);
                Odontograma.txtL5.setVisible(false);
                Odontograma.lb13.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB6.getName())
                || Diente.equals(Odontograma.txtC6.getName())
                || Diente.equals(Odontograma.txtT6.getName())
                || Diente.equals(Odontograma.txtR6.getName())
                || Diente.equals(Odontograma.txtL6.getName())
                || Diente.equals(Odontograma.lb12.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB6.getName().equals(Diente)) {
                    Odontograma.txtB6.setBackground(Color.red);
                }
                if (Odontograma.txtC6.getName().equals(Diente)) {
                    Odontograma.txtC6.setBackground(Color.red);
                }
                if (Odontograma.txtT6.getName().equals(Diente)) {
                    Odontograma.txtT6.setBackground(Color.red);
                }
                if (Odontograma.txtL6.getName().equals(Diente)) {
                    Odontograma.txtL6.setBackground(Color.red);
                }
                if (Odontograma.txtR6.getName().equals(Diente)) {
                    Odontograma.txtR6.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB6.getName().equals(Diente)) {
                    Odontograma.txtB6.setBackground(Color.blue);
                }
                if (Odontograma.txtC6.getName().equals(Diente)) {
                    Odontograma.txtC6.setBackground(Color.blue);
                }
                if (Odontograma.txtT6.getName().equals(Diente)) {
                    Odontograma.txtT6.setBackground(Color.blue);
                }
                if (Odontograma.txtL6.getName().equals(Diente)) {
                    Odontograma.txtL6.setBackground(Color.blue);
                }
                if (Odontograma.txtR6.getName().equals(Diente)) {
                    Odontograma.txtR6.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB6.getName().equals(Diente)) {
                    Odontograma.txtB6.setBackground(Color.white);
                }
                if (Odontograma.txtC6.getName().equals(Diente)) {
                    Odontograma.txtC6.setBackground(Color.white);
                }
                if (Odontograma.txtT6.getName().equals(Diente)) {
                    Odontograma.txtT6.setBackground(Color.white);
                }
                if (Odontograma.txtL6.getName().equals(Diente)) {
                    Odontograma.txtL6.setBackground(Color.white);
                }
                if (Odontograma.txtR6.getName().equals(Diente)) {
                    Odontograma.txtR6.setBackground(Color.white);
                }
                if (Odontograma.lb12.getName().equals(Diente)) {
                    Odontograma.txtB6.setVisible(v);
                    Odontograma.txtC6.setVisible(v);
                    Odontograma.txtT6.setVisible(v);
                    Odontograma.txtR6.setVisible(v);
                    Odontograma.txtL6.setVisible(v);
                    Odontograma.lb12.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB6.setVisible(false);
                Odontograma.txtC6.setVisible(false);
                Odontograma.txtT6.setVisible(false);
                Odontograma.txtR6.setVisible(false);
                Odontograma.txtL6.setVisible(false);
                Odontograma.lb12.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB6.setVisible(false);
                Odontograma.txtC6.setVisible(false);
                Odontograma.txtT6.setVisible(false);
                Odontograma.txtR6.setVisible(false);
                Odontograma.txtL6.setVisible(false);
                Odontograma.lb12.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB7.getName())
                || Diente.equals(Odontograma.txtC7.getName())
                || Diente.equals(Odontograma.txtT7.getName())
                || Diente.equals(Odontograma.txtR7.getName())
                || Diente.equals(Odontograma.txtL7.getName())
                || Diente.equals(Odontograma.lb11.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB7.getName().equals(Diente)) {
                    Odontograma.txtB7.setBackground(Color.red);
                }
                if (Odontograma.txtC7.getName().equals(Diente)) {
                    Odontograma.txtC7.setBackground(Color.red);
                }
                if (Odontograma.txtT7.getName().equals(Diente)) {
                    Odontograma.txtT7.setBackground(Color.red);
                }
                if (Odontograma.txtL7.getName().equals(Diente)) {
                    Odontograma.txtL7.setBackground(Color.red);
                }
                if (Odontograma.txtR7.getName().equals(Diente)) {
                    Odontograma.txtR7.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB7.getName().equals(Diente)) {
                    Odontograma.txtB7.setBackground(Color.blue);
                }
                if (Odontograma.txtC7.getName().equals(Diente)) {
                    Odontograma.txtC7.setBackground(Color.blue);
                }
                if (Odontograma.txtT7.getName().equals(Diente)) {
                    Odontograma.txtT7.setBackground(Color.blue);
                }
                if (Odontograma.txtL7.getName().equals(Diente)) {
                    Odontograma.txtL7.setBackground(Color.blue);
                }
                if (Odontograma.txtR7.getName().equals(Diente)) {
                    Odontograma.txtR7.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB7.getName().equals(Diente)) {
                    Odontograma.txtB7.setBackground(Color.white);
                }
                if (Odontograma.txtC7.getName().equals(Diente)) {
                    Odontograma.txtC7.setBackground(Color.white);
                }
                if (Odontograma.txtT7.getName().equals(Diente)) {
                    Odontograma.txtT7.setBackground(Color.white);
                }
                if (Odontograma.txtL7.getName().equals(Diente)) {
                    Odontograma.txtL7.setBackground(Color.white);
                }
                if (Odontograma.txtR7.getName().equals(Diente)) {
                    Odontograma.txtR7.setBackground(Color.white);
                }
                if (Odontograma.lb11.getName().equals(Diente)) {
                    Odontograma.txtB7.setVisible(v);
                    Odontograma.txtC7.setVisible(v);
                    Odontograma.txtT7.setVisible(v);
                    Odontograma.txtR7.setVisible(v);
                    Odontograma.txtL7.setVisible(v);
                    Odontograma.lb11.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB7.setVisible(false);
                Odontograma.txtC7.setVisible(false);
                Odontograma.txtT7.setVisible(false);
                Odontograma.txtR7.setVisible(false);
                Odontograma.txtL7.setVisible(false);
                Odontograma.lb11.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB7.setVisible(false);
                Odontograma.txtC7.setVisible(false);
                Odontograma.txtT7.setVisible(false);
                Odontograma.txtR7.setVisible(false);
                Odontograma.txtL7.setVisible(false);
                Odontograma.lb11.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB8.getName())
                || Diente.equals(Odontograma.txtC8.getName())
                || Diente.equals(Odontograma.txtT8.getName())
                || Diente.equals(Odontograma.txtR8.getName())
                || Diente.equals(Odontograma.txtL8.getName())
                || Diente.equals(Odontograma.lb21.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB8.getName().equals(Diente)) {
                    Odontograma.txtB8.setBackground(Color.red);
                }
                if (Odontograma.txtC8.getName().equals(Diente)) {
                    Odontograma.txtC8.setBackground(Color.red);
                }
                if (Odontograma.txtT8.getName().equals(Diente)) {
                    Odontograma.txtT8.setBackground(Color.red);
                }
                if (Odontograma.txtL8.getName().equals(Diente)) {
                    Odontograma.txtL8.setBackground(Color.red);
                }
                if (Odontograma.txtR8.getName().equals(Diente)) {
                    Odontograma.txtR8.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB8.getName().equals(Diente)) {
                    Odontograma.txtB8.setBackground(Color.blue);
                }
                if (Odontograma.txtC8.getName().equals(Diente)) {
                    Odontograma.txtC8.setBackground(Color.blue);
                }
                if (Odontograma.txtT8.getName().equals(Diente)) {
                    Odontograma.txtT8.setBackground(Color.blue);
                }
                if (Odontograma.txtL8.getName().equals(Diente)) {
                    Odontograma.txtL8.setBackground(Color.blue);
                }
                if (Odontograma.txtR8.getName().equals(Diente)) {
                    Odontograma.txtR8.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB8.getName().equals(Diente)) {
                    Odontograma.txtB8.setBackground(Color.white);
                }
                if (Odontograma.txtC8.getName().equals(Diente)) {
                    Odontograma.txtC8.setBackground(Color.white);
                }
                if (Odontograma.txtT8.getName().equals(Diente)) {
                    Odontograma.txtT8.setBackground(Color.white);
                }
                if (Odontograma.txtL8.getName().equals(Diente)) {
                    Odontograma.txtL8.setBackground(Color.white);
                }
                if (Odontograma.txtR8.getName().equals(Diente)) {
                    Odontograma.txtR8.setBackground(Color.white);
                }
                if (Odontograma.lb21.getName().equals(Diente)) {
                    Odontograma.txtB8.setVisible(v);
                    Odontograma.txtC8.setVisible(v);
                    Odontograma.txtT8.setVisible(v);
                    Odontograma.txtR8.setVisible(v);
                    Odontograma.txtL8.setVisible(v);
                    Odontograma.lb21.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB8.setVisible(false);
                Odontograma.txtC8.setVisible(false);
                Odontograma.txtT8.setVisible(false);
                Odontograma.txtR8.setVisible(false);
                Odontograma.txtL8.setVisible(false);
                Odontograma.lb21.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB8.setVisible(false);
                Odontograma.txtC8.setVisible(false);
                Odontograma.txtT8.setVisible(false);
                Odontograma.txtR8.setVisible(false);
                Odontograma.txtL8.setVisible(false);
                Odontograma.lb21.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB9.getName())
                || Diente.equals(Odontograma.txtC9.getName())
                || Diente.equals(Odontograma.txtT9.getName())
                || Diente.equals(Odontograma.txtR9.getName())
                || Diente.equals(Odontograma.txtL9.getName())
                || Diente.equals(Odontograma.lb22.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB9.getName().equals(Diente)) {
                    Odontograma.txtB9.setBackground(Color.red);
                }
                if (Odontograma.txtC9.getName().equals(Diente)) {
                    Odontograma.txtC9.setBackground(Color.red);
                }
                if (Odontograma.txtT9.getName().equals(Diente)) {
                    Odontograma.txtT9.setBackground(Color.red);
                }
                if (Odontograma.txtL9.getName().equals(Diente)) {
                    Odontograma.txtL9.setBackground(Color.red);
                }
                if (Odontograma.txtR9.getName().equals(Diente)) {
                    Odontograma.txtR9.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB9.getName().equals(Diente)) {
                    Odontograma.txtB9.setBackground(Color.blue);
                }
                if (Odontograma.txtC9.getName().equals(Diente)) {
                    Odontograma.txtC9.setBackground(Color.blue);
                }
                if (Odontograma.txtT9.getName().equals(Diente)) {
                    Odontograma.txtT9.setBackground(Color.blue);
                }
                if (Odontograma.txtL9.getName().equals(Diente)) {
                    Odontograma.txtL9.setBackground(Color.blue);
                }
                if (Odontograma.txtR9.getName().equals(Diente)) {
                    Odontograma.txtR9.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB9.getName().equals(Diente)) {
                    Odontograma.txtB9.setBackground(Color.white);
                }
                if (Odontograma.txtC9.getName().equals(Diente)) {
                    Odontograma.txtC9.setBackground(Color.white);
                }
                if (Odontograma.txtT9.getName().equals(Diente)) {
                    Odontograma.txtT9.setBackground(Color.white);
                }
                if (Odontograma.txtL9.getName().equals(Diente)) {
                    Odontograma.txtL9.setBackground(Color.white);
                }
                if (Odontograma.txtR9.getName().equals(Diente)) {
                    Odontograma.txtR9.setBackground(Color.white);
                }
                if (Odontograma.lb22.getName().equals(Diente)) {
                    Odontograma.txtB9.setVisible(v);
                    Odontograma.txtC9.setVisible(v);
                    Odontograma.txtT9.setVisible(v);
                    Odontograma.txtR9.setVisible(v);
                    Odontograma.txtL9.setVisible(v);
                    Odontograma.lb22.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB9.setVisible(false);
                Odontograma.txtC9.setVisible(false);
                Odontograma.txtT9.setVisible(false);
                Odontograma.txtR9.setVisible(false);
                Odontograma.txtL9.setVisible(false);
                Odontograma.lb22.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB9.setVisible(false);
                Odontograma.txtC9.setVisible(false);
                Odontograma.txtT9.setVisible(false);
                Odontograma.txtR9.setVisible(false);
                Odontograma.txtL9.setVisible(false);
                Odontograma.lb22.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB10.getName())
                || Diente.equals(Odontograma.txtC10.getName())
                || Diente.equals(Odontograma.txtT10.getName())
                || Diente.equals(Odontograma.txtR10.getName())
                || Diente.equals(Odontograma.txtL10.getName())
                || Diente.equals(Odontograma.lb23.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB10.getName().equals(Diente)) {
                    Odontograma.txtB10.setBackground(Color.red);
                }
                if (Odontograma.txtC10.getName().equals(Diente)) {
                    Odontograma.txtC10.setBackground(Color.red);
                }
                if (Odontograma.txtT10.getName().equals(Diente)) {
                    Odontograma.txtT10.setBackground(Color.red);
                }
                if (Odontograma.txtL10.getName().equals(Diente)) {
                    Odontograma.txtL10.setBackground(Color.red);
                }
                if (Odontograma.txtR10.getName().equals(Diente)) {
                    Odontograma.txtR10.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB10.getName().equals(Diente)) {
                    Odontograma.txtB10.setBackground(Color.blue);
                }
                if (Odontograma.txtC10.getName().equals(Diente)) {
                    Odontograma.txtC10.setBackground(Color.blue);
                }
                if (Odontograma.txtT10.getName().equals(Diente)) {
                    Odontograma.txtT10.setBackground(Color.blue);
                }
                if (Odontograma.txtL10.getName().equals(Diente)) {
                    Odontograma.txtL10.setBackground(Color.blue);
                }
                if (Odontograma.txtR10.getName().equals(Diente)) {
                    Odontograma.txtR10.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB10.getName().equals(Diente)) {
                    Odontograma.txtB10.setBackground(Color.white);
                }
                if (Odontograma.txtC10.getName().equals(Diente)) {
                    Odontograma.txtC10.setBackground(Color.white);
                }
                if (Odontograma.txtT10.getName().equals(Diente)) {
                    Odontograma.txtT10.setBackground(Color.white);
                }
                if (Odontograma.txtL10.getName().equals(Diente)) {
                    Odontograma.txtL10.setBackground(Color.white);
                }
                if (Odontograma.txtR10.getName().equals(Diente)) {
                    Odontograma.txtR10.setBackground(Color.white);
                }
                if (Odontograma.lb23.getName().equals(Diente)) {
                    Odontograma.txtB10.setVisible(v);
                    Odontograma.txtC10.setVisible(v);
                    Odontograma.txtT10.setVisible(v);
                    Odontograma.txtR10.setVisible(v);
                    Odontograma.txtL10.setVisible(v);
                    Odontograma.lb23.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB10.setVisible(false);
                Odontograma.txtC10.setVisible(false);
                Odontograma.txtT10.setVisible(false);
                Odontograma.txtR10.setVisible(false);
                Odontograma.txtL10.setVisible(false);
                Odontograma.lb23.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB10.setVisible(false);
                Odontograma.txtC10.setVisible(false);
                Odontograma.txtT10.setVisible(false);
                Odontograma.txtR10.setVisible(false);
                Odontograma.txtL10.setVisible(false);
                Odontograma.lb23.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB11.getName())
                || Diente.equals(Odontograma.txtC11.getName())
                || Diente.equals(Odontograma.txtT11.getName())
                || Diente.equals(Odontograma.txtR11.getName())
                || Diente.equals(Odontograma.txtL11.getName())
                || Diente.equals(Odontograma.lb24.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB11.getName().equals(Diente)) {
                    Odontograma.txtB11.setBackground(Color.red);
                }
                if (Odontograma.txtC11.getName().equals(Diente)) {
                    Odontograma.txtC11.setBackground(Color.red);
                }
                if (Odontograma.txtT11.getName().equals(Diente)) {
                    Odontograma.txtT11.setBackground(Color.red);
                }
                if (Odontograma.txtL11.getName().equals(Diente)) {
                    Odontograma.txtL11.setBackground(Color.red);
                }
                if (Odontograma.txtR11.getName().equals(Diente)) {
                    Odontograma.txtR11.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB11.getName().equals(Diente)) {
                    Odontograma.txtB11.setBackground(Color.blue);
                }
                if (Odontograma.txtC11.getName().equals(Diente)) {
                    Odontograma.txtC11.setBackground(Color.blue);
                }
                if (Odontograma.txtT11.getName().equals(Diente)) {
                    Odontograma.txtT11.setBackground(Color.blue);
                }
                if (Odontograma.txtL11.getName().equals(Diente)) {
                    Odontograma.txtL11.setBackground(Color.blue);
                }
                if (Odontograma.txtR11.getName().equals(Diente)) {
                    Odontograma.txtR11.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB11.getName().equals(Diente)) {
                    Odontograma.txtB11.setBackground(Color.white);
                }
                if (Odontograma.txtC11.getName().equals(Diente)) {
                    Odontograma.txtC11.setBackground(Color.white);
                }
                if (Odontograma.txtT11.getName().equals(Diente)) {
                    Odontograma.txtT11.setBackground(Color.white);
                }
                if (Odontograma.txtL11.getName().equals(Diente)) {
                    Odontograma.txtL11.setBackground(Color.white);
                }
                if (Odontograma.txtR11.getName().equals(Diente)) {
                    Odontograma.txtR11.setBackground(Color.white);
                }
                if (Odontograma.lb24.getName().equals(Diente)) {
                    Odontograma.txtB11.setVisible(v);
                    Odontograma.txtC11.setVisible(v);
                    Odontograma.txtT11.setVisible(v);
                    Odontograma.txtR11.setVisible(v);
                    Odontograma.txtL11.setVisible(v);
                    Odontograma.lb24.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB11.setVisible(false);
                Odontograma.txtC11.setVisible(false);
                Odontograma.txtT11.setVisible(false);
                Odontograma.txtR11.setVisible(false);
                Odontograma.txtL11.setVisible(false);
                Odontograma.lb24.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB11.setVisible(false);
                Odontograma.txtC11.setVisible(false);
                Odontograma.txtT11.setVisible(false);
                Odontograma.txtR11.setVisible(false);
                Odontograma.txtL11.setVisible(false);
                Odontograma.lb24.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB12.getName())
                || Diente.equals(Odontograma.txtC12.getName())
                || Diente.equals(Odontograma.txtT12.getName())
                || Diente.equals(Odontograma.txtR12.getName())
                || Diente.equals(Odontograma.txtL12.getName())
                || Diente.equals(Odontograma.lb25.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB12.getName().equals(Diente)) {
                    Odontograma.txtB12.setBackground(Color.red);
                }
                if (Odontograma.txtC12.getName().equals(Diente)) {
                    Odontograma.txtC12.setBackground(Color.red);
                }
                if (Odontograma.txtT12.getName().equals(Diente)) {
                    Odontograma.txtT12.setBackground(Color.red);
                }
                if (Odontograma.txtL12.getName().equals(Diente)) {
                    Odontograma.txtL12.setBackground(Color.red);
                }
                if (Odontograma.txtR12.getName().equals(Diente)) {
                    Odontograma.txtR12.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB12.getName().equals(Diente)) {
                    Odontograma.txtB12.setBackground(Color.blue);
                }
                if (Odontograma.txtC12.getName().equals(Diente)) {
                    Odontograma.txtC12.setBackground(Color.blue);
                }
                if (Odontograma.txtT12.getName().equals(Diente)) {
                    Odontograma.txtT12.setBackground(Color.blue);
                }
                if (Odontograma.txtL12.getName().equals(Diente)) {
                    Odontograma.txtL12.setBackground(Color.blue);
                }
                if (Odontograma.txtR12.getName().equals(Diente)) {
                    Odontograma.txtR12.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB12.getName().equals(Diente)) {
                    Odontograma.txtB12.setBackground(Color.white);
                }
                if (Odontograma.txtC12.getName().equals(Diente)) {
                    Odontograma.txtC12.setBackground(Color.white);
                }
                if (Odontograma.txtT12.getName().equals(Diente)) {
                    Odontograma.txtT12.setBackground(Color.white);
                }
                if (Odontograma.txtL12.getName().equals(Diente)) {
                    Odontograma.txtL12.setBackground(Color.white);
                }
                if (Odontograma.txtR12.getName().equals(Diente)) {
                    Odontograma.txtR12.setBackground(Color.white);
                }
                if (Odontograma.lb25.getName().equals(Diente)) {
                    Odontograma.txtB12.setVisible(v);
                    Odontograma.txtC12.setVisible(v);
                    Odontograma.txtT12.setVisible(v);
                    Odontograma.txtR12.setVisible(v);
                    Odontograma.txtL12.setVisible(v);
                    Odontograma.lb25.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB12.setVisible(false);
                Odontograma.txtC12.setVisible(false);
                Odontograma.txtT12.setVisible(false);
                Odontograma.txtR12.setVisible(false);
                Odontograma.txtL12.setVisible(false);
                Odontograma.lb25.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB12.setVisible(false);
                Odontograma.txtC12.setVisible(false);
                Odontograma.txtT12.setVisible(false);
                Odontograma.txtR12.setVisible(false);
                Odontograma.txtL12.setVisible(false);
                Odontograma.lb25.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB13.getName())
                || Diente.equals(Odontograma.txtC13.getName())
                || Diente.equals(Odontograma.txtT13.getName())
                || Diente.equals(Odontograma.txtR13.getName())
                || Diente.equals(Odontograma.txtL13.getName())
                || Diente.equals(Odontograma.lb26.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB13.getName().equals(Diente)) {
                    Odontograma.txtB13.setBackground(Color.red);
                }
                if (Odontograma.txtC13.getName().equals(Diente)) {
                    Odontograma.txtC13.setBackground(Color.red);
                }
                if (Odontograma.txtT13.getName().equals(Diente)) {
                    Odontograma.txtT13.setBackground(Color.red);
                }
                if (Odontograma.txtL13.getName().equals(Diente)) {
                    Odontograma.txtL13.setBackground(Color.red);
                }
                if (Odontograma.txtR13.getName().equals(Diente)) {
                    Odontograma.txtR13.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB13.getName().equals(Diente)) {
                    Odontograma.txtB13.setBackground(Color.blue);
                }
                if (Odontograma.txtC13.getName().equals(Diente)) {
                    Odontograma.txtC13.setBackground(Color.blue);
                }
                if (Odontograma.txtT13.getName().equals(Diente)) {
                    Odontograma.txtT13.setBackground(Color.blue);
                }
                if (Odontograma.txtL13.getName().equals(Diente)) {
                    Odontograma.txtL13.setBackground(Color.blue);
                }
                if (Odontograma.txtR13.getName().equals(Diente)) {
                    Odontograma.txtR13.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB13.getName().equals(Diente)) {
                    Odontograma.txtB13.setBackground(Color.white);
                }
                if (Odontograma.txtC13.getName().equals(Diente)) {
                    Odontograma.txtC13.setBackground(Color.white);
                }
                if (Odontograma.txtT13.getName().equals(Diente)) {
                    Odontograma.txtT13.setBackground(Color.white);
                }
                if (Odontograma.txtL13.getName().equals(Diente)) {
                    Odontograma.txtL13.setBackground(Color.white);
                }
                if (Odontograma.txtR13.getName().equals(Diente)) {
                    Odontograma.txtR13.setBackground(Color.white);
                }
                if (Odontograma.lb26.getName().equals(Diente)) {
                    Odontograma.txtB13.setVisible(v);
                    Odontograma.txtC13.setVisible(v);
                    Odontograma.txtT13.setVisible(v);
                    Odontograma.txtR13.setVisible(v);
                    Odontograma.txtL13.setVisible(v);
                    Odontograma.lb26.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB13.setVisible(false);
                Odontograma.txtC13.setVisible(false);
                Odontograma.txtT13.setVisible(false);
                Odontograma.txtR13.setVisible(false);
                Odontograma.txtL13.setVisible(false);
                Odontograma.lb26.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB13.setVisible(false);
                Odontograma.txtC13.setVisible(false);
                Odontograma.txtT13.setVisible(false);
                Odontograma.txtR13.setVisible(false);
                Odontograma.txtL13.setVisible(false);
                Odontograma.lb26.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB14.getName())
                || Diente.equals(Odontograma.txtC14.getName())
                || Diente.equals(Odontograma.txtT14.getName())
                || Diente.equals(Odontograma.txtR14.getName())
                || Diente.equals(Odontograma.txtL14.getName())
                || Diente.equals(Odontograma.lb27.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB14.getName().equals(Diente)) {
                    Odontograma.txtB14.setBackground(Color.red);
                }
                if (Odontograma.txtC14.getName().equals(Diente)) {
                    Odontograma.txtC14.setBackground(Color.red);
                }
                if (Odontograma.txtT14.getName().equals(Diente)) {
                    Odontograma.txtT14.setBackground(Color.red);
                }
                if (Odontograma.txtL14.getName().equals(Diente)) {
                    Odontograma.txtL14.setBackground(Color.red);
                }
                if (Odontograma.txtR14.getName().equals(Diente)) {
                    Odontograma.txtR14.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB14.getName().equals(Diente)) {
                    Odontograma.txtB14.setBackground(Color.blue);
                }
                if (Odontograma.txtC14.getName().equals(Diente)) {
                    Odontograma.txtC14.setBackground(Color.blue);
                }
                if (Odontograma.txtT14.getName().equals(Diente)) {
                    Odontograma.txtT14.setBackground(Color.blue);
                }
                if (Odontograma.txtL14.getName().equals(Diente)) {
                    Odontograma.txtL14.setBackground(Color.blue);
                }
                if (Odontograma.txtR14.getName().equals(Diente)) {
                    Odontograma.txtR14.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB14.getName().equals(Diente)) {
                    Odontograma.txtB14.setBackground(Color.white);
                }
                if (Odontograma.txtC14.getName().equals(Diente)) {
                    Odontograma.txtC14.setBackground(Color.white);
                }
                if (Odontograma.txtT14.getName().equals(Diente)) {
                    Odontograma.txtT14.setBackground(Color.white);
                }
                if (Odontograma.txtL14.getName().equals(Diente)) {
                    Odontograma.txtL14.setBackground(Color.white);
                }
                if (Odontograma.txtR14.getName().equals(Diente)) {
                    Odontograma.txtR14.setBackground(Color.white);
                }
                if (Odontograma.lb27.getName().equals(Diente)) {
                    Odontograma.txtB14.setVisible(v);
                    Odontograma.txtC14.setVisible(v);
                    Odontograma.txtT14.setVisible(v);
                    Odontograma.txtR14.setVisible(v);
                    Odontograma.txtL14.setVisible(v);
                    Odontograma.lb27.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }

            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB14.setVisible(false);
                Odontograma.txtC14.setVisible(false);
                Odontograma.txtT14.setVisible(false);
                Odontograma.txtR14.setVisible(false);
                Odontograma.txtL14.setVisible(false);
                Odontograma.lb27.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB14.setVisible(false);
                Odontograma.txtC14.setVisible(false);
                Odontograma.txtT14.setVisible(false);
                Odontograma.txtR14.setVisible(false);
                Odontograma.txtL14.setVisible(false);
                Odontograma.lb27.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB15.getName())
                || Diente.equals(Odontograma.txtC15.getName())
                || Diente.equals(Odontograma.txtT15.getName())
                || Diente.equals(Odontograma.txtR15.getName())
                || Diente.equals(Odontograma.txtL15.getName())
                || Diente.equals(Odontograma.lb28.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB15.getName().equals(Diente)) {
                    Odontograma.txtB15.setBackground(Color.red);
                }
                if (Odontograma.txtC15.getName().equals(Diente)) {
                    Odontograma.txtC15.setBackground(Color.red);
                }
                if (Odontograma.txtT15.getName().equals(Diente)) {
                    Odontograma.txtT15.setBackground(Color.red);
                }
                if (Odontograma.txtL15.getName().equals(Diente)) {
                    Odontograma.txtL15.setBackground(Color.red);
                }
                if (Odontograma.txtR15.getName().equals(Diente)) {
                    Odontograma.txtR15.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB15.getName().equals(Diente)) {
                    Odontograma.txtB15.setBackground(Color.blue);
                }
                if (Odontograma.txtC15.getName().equals(Diente)) {
                    Odontograma.txtC15.setBackground(Color.blue);
                }
                if (Odontograma.txtT15.getName().equals(Diente)) {
                    Odontograma.txtT15.setBackground(Color.blue);
                }
                if (Odontograma.txtL15.getName().equals(Diente)) {
                    Odontograma.txtL15.setBackground(Color.blue);
                }
                if (Odontograma.txtR15.getName().equals(Diente)) {
                    Odontograma.txtR15.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB15.getName().equals(Diente)) {
                    Odontograma.txtB15.setBackground(Color.white);
                }
                if (Odontograma.txtC15.getName().equals(Diente)) {
                    Odontograma.txtC15.setBackground(Color.white);
                }
                if (Odontograma.txtT15.getName().equals(Diente)) {
                    Odontograma.txtT15.setBackground(Color.white);
                }
                if (Odontograma.txtL15.getName().equals(Diente)) {
                    Odontograma.txtL15.setBackground(Color.white);
                }
                if (Odontograma.txtR15.getName().equals(Diente)) {
                    Odontograma.txtR15.setBackground(Color.white);
                }
                if (Odontograma.lb28.getName().equals(Diente)) {
                    Odontograma.txtB15.setVisible(v);
                    Odontograma.txtC15.setVisible(v);
                    Odontograma.txtT15.setVisible(v);
                    Odontograma.txtR15.setVisible(v);
                    Odontograma.txtL15.setVisible(v);
                    Odontograma.lb28.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB15.setVisible(false);
                Odontograma.txtC15.setVisible(false);
                Odontograma.txtT15.setVisible(false);
                Odontograma.txtR15.setVisible(false);
                Odontograma.txtL15.setVisible(false);
                Odontograma.lb28.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB15.setVisible(false);
                Odontograma.txtC15.setVisible(false);
                Odontograma.txtT15.setVisible(false);
                Odontograma.txtR15.setVisible(false);
                Odontograma.txtL15.setVisible(false);
                Odontograma.lb28.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB16.getName())
                || Diente.equals(Odontograma.txtC16.getName())
                || Diente.equals(Odontograma.txtT16.getName())
                || Diente.equals(Odontograma.txtR16.getName())
                || Diente.equals(Odontograma.txtL16.getName())
                || Diente.equals(Odontograma.lb48.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB16.getName().equals(Diente)) {
                    Odontograma.txtB16.setBackground(Color.red);
                }
                if (Odontograma.txtC16.getName().equals(Diente)) {
                    Odontograma.txtC16.setBackground(Color.red);
                }
                if (Odontograma.txtT16.getName().equals(Diente)) {
                    Odontograma.txtT16.setBackground(Color.red);
                }
                if (Odontograma.txtL16.getName().equals(Diente)) {
                    Odontograma.txtL16.setBackground(Color.red);
                }
                if (Odontograma.txtR16.getName().equals(Diente)) {
                    Odontograma.txtR16.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB16.getName().equals(Diente)) {
                    Odontograma.txtB16.setBackground(Color.blue);
                }
                if (Odontograma.txtC16.getName().equals(Diente)) {
                    Odontograma.txtC16.setBackground(Color.blue);
                }
                if (Odontograma.txtT16.getName().equals(Diente)) {
                    Odontograma.txtT16.setBackground(Color.blue);
                }
                if (Odontograma.txtL16.getName().equals(Diente)) {
                    Odontograma.txtL16.setBackground(Color.blue);
                }
                if (Odontograma.txtR16.getName().equals(Diente)) {
                    Odontograma.txtR16.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB16.getName().equals(Diente)) {
                    Odontograma.txtB16.setBackground(Color.white);
                }
                if (Odontograma.txtC16.getName().equals(Diente)) {
                    Odontograma.txtC16.setBackground(Color.white);
                }
                if (Odontograma.txtT16.getName().equals(Diente)) {
                    Odontograma.txtT16.setBackground(Color.white);
                }
                if (Odontograma.txtL16.getName().equals(Diente)) {
                    Odontograma.txtL16.setBackground(Color.white);
                }
                if (Odontograma.txtR16.getName().equals(Diente)) {
                    Odontograma.txtR16.setBackground(Color.white);
                }
                if (Odontograma.lb48.getName().equals(Diente)) {
                    Odontograma.txtB16.setVisible(v);
                    Odontograma.txtC16.setVisible(v);
                    Odontograma.txtT16.setVisible(v);
                    Odontograma.txtR16.setVisible(v);
                    Odontograma.txtL16.setVisible(v);
                    Odontograma.lb48.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB16.setVisible(false);
                Odontograma.txtC16.setVisible(false);
                Odontograma.txtT16.setVisible(false);
                Odontograma.txtR16.setVisible(false);
                Odontograma.txtL16.setVisible(false);
                Odontograma.lb48.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB16.setVisible(false);
                Odontograma.txtC16.setVisible(false);
                Odontograma.txtT16.setVisible(false);
                Odontograma.txtR16.setVisible(false);
                Odontograma.txtL16.setVisible(false);
                Odontograma.lb48.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB17.getName())
                || Diente.equals(Odontograma.txtC17.getName())
                || Diente.equals(Odontograma.txtT17.getName())
                || Diente.equals(Odontograma.txtR17.getName())
                || Diente.equals(Odontograma.txtL17.getName())
                || Diente.equals(Odontograma.lb47.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB17.getName().equals(Diente)) {
                    Odontograma.txtB17.setBackground(Color.red);
                }
                if (Odontograma.txtC17.getName().equals(Diente)) {
                    Odontograma.txtC17.setBackground(Color.red);
                }
                if (Odontograma.txtT17.getName().equals(Diente)) {
                    Odontograma.txtT17.setBackground(Color.red);
                }
                if (Odontograma.txtL17.getName().equals(Diente)) {
                    Odontograma.txtL17.setBackground(Color.red);
                }
                if (Odontograma.txtR17.getName().equals(Diente)) {
                    Odontograma.txtR17.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB17.getName().equals(Diente)) {
                    Odontograma.txtB17.setBackground(Color.blue);
                }
                if (Odontograma.txtC17.getName().equals(Diente)) {
                    Odontograma.txtC17.setBackground(Color.blue);
                }
                if (Odontograma.txtT17.getName().equals(Diente)) {
                    Odontograma.txtT17.setBackground(Color.blue);
                }
                if (Odontograma.txtL17.getName().equals(Diente)) {
                    Odontograma.txtL17.setBackground(Color.blue);
                }
                if (Odontograma.txtR17.getName().equals(Diente)) {
                    Odontograma.txtR17.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB17.getName().equals(Diente)) {
                    Odontograma.txtB17.setBackground(Color.white);
                }
                if (Odontograma.txtC17.getName().equals(Diente)) {
                    Odontograma.txtC17.setBackground(Color.white);
                }
                if (Odontograma.txtT17.getName().equals(Diente)) {
                    Odontograma.txtT17.setBackground(Color.white);
                }
                if (Odontograma.txtL17.getName().equals(Diente)) {
                    Odontograma.txtL17.setBackground(Color.white);
                }
                if (Odontograma.txtR17.getName().equals(Diente)) {
                    Odontograma.txtR17.setBackground(Color.white);
                }
                if (Odontograma.lb47.getName().equals(Diente)) {
                    Odontograma.txtB17.setVisible(v);
                    Odontograma.txtC17.setVisible(v);
                    Odontograma.txtT17.setVisible(v);
                    Odontograma.txtR17.setVisible(v);
                    Odontograma.txtL17.setVisible(v);
                    Odontograma.lb47.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB17.setVisible(false);
                Odontograma.txtC17.setVisible(false);
                Odontograma.txtT17.setVisible(false);
                Odontograma.txtR17.setVisible(false);
                Odontograma.txtL17.setVisible(false);
                Odontograma.lb47.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB17.setVisible(false);
                Odontograma.txtC17.setVisible(false);
                Odontograma.txtT17.setVisible(false);
                Odontograma.txtR17.setVisible(false);
                Odontograma.txtL17.setVisible(false);
                Odontograma.lb47.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB18.getName())
                || Diente.equals(Odontograma.txtC18.getName())
                || Diente.equals(Odontograma.txtT18.getName())
                || Diente.equals(Odontograma.txtR18.getName())
                || Diente.equals(Odontograma.txtL18.getName())
                || Diente.equals(Odontograma.lb46.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB18.getName().equals(Diente)) {
                    Odontograma.txtB18.setBackground(Color.red);
                }
                if (Odontograma.txtC18.getName().equals(Diente)) {
                    Odontograma.txtC18.setBackground(Color.red);
                }
                if (Odontograma.txtT18.getName().equals(Diente)) {
                    Odontograma.txtT18.setBackground(Color.red);
                }
                if (Odontograma.txtL18.getName().equals(Diente)) {
                    Odontograma.txtL18.setBackground(Color.red);
                }
                if (Odontograma.txtR18.getName().equals(Diente)) {
                    Odontograma.txtR18.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB18.getName().equals(Diente)) {
                    Odontograma.txtB18.setBackground(Color.blue);
                }
                if (Odontograma.txtC18.getName().equals(Diente)) {
                    Odontograma.txtC18.setBackground(Color.blue);
                }
                if (Odontograma.txtT18.getName().equals(Diente)) {
                    Odontograma.txtT18.setBackground(Color.blue);
                }
                if (Odontograma.txtL18.getName().equals(Diente)) {
                    Odontograma.txtL18.setBackground(Color.blue);
                }
                if (Odontograma.txtR18.getName().equals(Diente)) {
                    Odontograma.txtR18.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB18.getName().equals(Diente)) {
                    Odontograma.txtB18.setBackground(Color.white);
                }
                if (Odontograma.txtC18.getName().equals(Diente)) {
                    Odontograma.txtC18.setBackground(Color.white);
                }
                if (Odontograma.txtT18.getName().equals(Diente)) {
                    Odontograma.txtT18.setBackground(Color.white);
                }
                if (Odontograma.txtL18.getName().equals(Diente)) {
                    Odontograma.txtL18.setBackground(Color.white);
                }
                if (Odontograma.txtR18.getName().equals(Diente)) {
                    Odontograma.txtR18.setBackground(Color.white);
                }
                if (Odontograma.lb46.getName().equals(Diente)) {
                    Odontograma.txtB18.setVisible(v);
                    Odontograma.txtC18.setVisible(v);
                    Odontograma.txtT18.setVisible(v);
                    Odontograma.txtR18.setVisible(v);
                    Odontograma.txtL18.setVisible(v);
                    Odontograma.lb46.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB18.setVisible(false);
                Odontograma.txtC18.setVisible(false);
                Odontograma.txtT18.setVisible(false);
                Odontograma.txtR18.setVisible(false);
                Odontograma.txtL18.setVisible(false);
                Odontograma.lb46.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB18.setVisible(false);
                Odontograma.txtC18.setVisible(false);
                Odontograma.txtT18.setVisible(false);
                Odontograma.txtR18.setVisible(false);
                Odontograma.txtL18.setVisible(false);
                Odontograma.lb46.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB19.getName())
                || Diente.equals(Odontograma.txtC19.getName())
                || Diente.equals(Odontograma.txtT19.getName())
                || Diente.equals(Odontograma.txtR19.getName())
                || Diente.equals(Odontograma.txtL19.getName())
                || Diente.equals(Odontograma.lb45.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB19.getName().equals(Diente)) {
                    Odontograma.txtB19.setBackground(Color.red);
                }
                if (Odontograma.txtC19.getName().equals(Diente)) {
                    Odontograma.txtC19.setBackground(Color.red);
                }
                if (Odontograma.txtT19.getName().equals(Diente)) {
                    Odontograma.txtT19.setBackground(Color.red);
                }
                if (Odontograma.txtL19.getName().equals(Diente)) {
                    Odontograma.txtL19.setBackground(Color.red);
                }
                if (Odontograma.txtR19.getName().equals(Diente)) {
                    Odontograma.txtR19.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB19.getName().equals(Diente)) {
                    Odontograma.txtB19.setBackground(Color.blue);
                }
                if (Odontograma.txtC19.getName().equals(Diente)) {
                    Odontograma.txtC19.setBackground(Color.blue);
                }
                if (Odontograma.txtT19.getName().equals(Diente)) {
                    Odontograma.txtT19.setBackground(Color.blue);
                }
                if (Odontograma.txtL19.getName().equals(Diente)) {
                    Odontograma.txtL19.setBackground(Color.blue);
                }
                if (Odontograma.txtR19.getName().equals(Diente)) {
                    Odontograma.txtR19.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB19.getName().equals(Diente)) {
                    Odontograma.txtB19.setBackground(Color.white);
                }
                if (Odontograma.txtC19.getName().equals(Diente)) {
                    Odontograma.txtC19.setBackground(Color.white);
                }
                if (Odontograma.txtT19.getName().equals(Diente)) {
                    Odontograma.txtT19.setBackground(Color.white);
                }
                if (Odontograma.txtL19.getName().equals(Diente)) {
                    Odontograma.txtL19.setBackground(Color.white);
                }
                if (Odontograma.txtR19.getName().equals(Diente)) {
                    Odontograma.txtR19.setBackground(Color.white);
                }
                if (Odontograma.lb45.getName().equals(Diente)) {
                    Odontograma.txtB19.setVisible(v);
                    Odontograma.txtC19.setVisible(v);
                    Odontograma.txtT19.setVisible(v);
                    Odontograma.txtR19.setVisible(v);
                    Odontograma.txtL19.setVisible(v);
                    Odontograma.lb45.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB19.setVisible(false);
                Odontograma.txtC19.setVisible(false);
                Odontograma.txtT19.setVisible(false);
                Odontograma.txtR19.setVisible(false);
                Odontograma.txtL19.setVisible(false);
                Odontograma.lb45.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB19.setVisible(false);
                Odontograma.txtC19.setVisible(false);
                Odontograma.txtT19.setVisible(false);
                Odontograma.txtR19.setVisible(false);
                Odontograma.txtL19.setVisible(false);
                Odontograma.lb45.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB20.getName())
                || Diente.equals(Odontograma.txtC20.getName())
                || Diente.equals(Odontograma.txtT20.getName())
                || Diente.equals(Odontograma.txtR20.getName())
                || Diente.equals(Odontograma.txtL20.getName())
                || Diente.equals(Odontograma.lb44.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB20.getName().equals(Diente)) {
                    Odontograma.txtB20.setBackground(Color.red);
                }
                if (Odontograma.txtC20.getName().equals(Diente)) {
                    Odontograma.txtC20.setBackground(Color.red);
                }
                if (Odontograma.txtT20.getName().equals(Diente)) {
                    Odontograma.txtT20.setBackground(Color.red);
                }
                if (Odontograma.txtL20.getName().equals(Diente)) {
                    Odontograma.txtL20.setBackground(Color.red);
                }
                if (Odontograma.txtR20.getName().equals(Diente)) {
                    Odontograma.txtR20.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB20.getName().equals(Diente)) {
                    Odontograma.txtB20.setBackground(Color.blue);
                }
                if (Odontograma.txtC20.getName().equals(Diente)) {
                    Odontograma.txtC20.setBackground(Color.blue);
                }
                if (Odontograma.txtT20.getName().equals(Diente)) {
                    Odontograma.txtT20.setBackground(Color.blue);
                }
                if (Odontograma.txtL20.getName().equals(Diente)) {
                    Odontograma.txtL20.setBackground(Color.blue);
                }
                if (Odontograma.txtR20.getName().equals(Diente)) {
                    Odontograma.txtR20.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB20.getName().equals(Diente)) {
                    Odontograma.txtB20.setBackground(Color.white);
                }
                if (Odontograma.txtC20.getName().equals(Diente)) {
                    Odontograma.txtC20.setBackground(Color.white);
                }
                if (Odontograma.txtT20.getName().equals(Diente)) {
                    Odontograma.txtT20.setBackground(Color.white);
                }
                if (Odontograma.txtL20.getName().equals(Diente)) {
                    Odontograma.txtL20.setBackground(Color.white);
                }
                if (Odontograma.txtR20.getName().equals(Diente)) {
                    Odontograma.txtR20.setBackground(Color.white);
                }
                if (Odontograma.lb44.getName().equals(Diente)) {
                    Odontograma.txtB20.setVisible(v);
                    Odontograma.txtC20.setVisible(v);
                    Odontograma.txtT20.setVisible(v);
                    Odontograma.txtR20.setVisible(v);
                    Odontograma.txtL20.setVisible(v);
                    Odontograma.lb44.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB20.setVisible(false);
                Odontograma.txtC20.setVisible(false);
                Odontograma.txtT20.setVisible(false);
                Odontograma.txtR20.setVisible(false);
                Odontograma.txtL20.setVisible(false);
                Odontograma.lb44.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB20.setVisible(false);
                Odontograma.txtC20.setVisible(false);
                Odontograma.txtT20.setVisible(false);
                Odontograma.txtR20.setVisible(false);
                Odontograma.txtL20.setVisible(false);
                Odontograma.lb44.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB21.getName())
                || Diente.equals(Odontograma.txtC21.getName())
                || Diente.equals(Odontograma.txtT21.getName())
                || Diente.equals(Odontograma.txtR21.getName())
                || Diente.equals(Odontograma.txtL21.getName())
                || Diente.equals(Odontograma.lb43.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB21.getName().equals(Diente)) {
                    Odontograma.txtB21.setBackground(Color.red);
                }
                if (Odontograma.txtC21.getName().equals(Diente)) {
                    Odontograma.txtC21.setBackground(Color.red);
                }
                if (Odontograma.txtT21.getName().equals(Diente)) {
                    Odontograma.txtT21.setBackground(Color.red);
                }
                if (Odontograma.txtL21.getName().equals(Diente)) {
                    Odontograma.txtL21.setBackground(Color.red);
                }
                if (Odontograma.txtR21.getName().equals(Diente)) {
                    Odontograma.txtR21.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB21.getName().equals(Diente)) {
                    Odontograma.txtB21.setBackground(Color.blue);
                }
                if (Odontograma.txtC21.getName().equals(Diente)) {
                    Odontograma.txtC21.setBackground(Color.blue);
                }
                if (Odontograma.txtT21.getName().equals(Diente)) {
                    Odontograma.txtT21.setBackground(Color.blue);
                }
                if (Odontograma.txtL21.getName().equals(Diente)) {
                    Odontograma.txtL21.setBackground(Color.blue);
                }
                if (Odontograma.txtR21.getName().equals(Diente)) {
                    Odontograma.txtR21.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB21.getName().equals(Diente)) {
                    Odontograma.txtB21.setBackground(Color.white);
                }
                if (Odontograma.txtC21.getName().equals(Diente)) {
                    Odontograma.txtC21.setBackground(Color.white);
                }
                if (Odontograma.txtT21.getName().equals(Diente)) {
                    Odontograma.txtT21.setBackground(Color.white);
                }
                if (Odontograma.txtL21.getName().equals(Diente)) {
                    Odontograma.txtL21.setBackground(Color.white);
                }
                if (Odontograma.txtR21.getName().equals(Diente)) {
                    Odontograma.txtR21.setBackground(Color.white);
                }
                if (Odontograma.lb43.getName().equals(Diente)) {
                    Odontograma.txtB21.setVisible(v);
                    Odontograma.txtC21.setVisible(v);
                    Odontograma.txtT21.setVisible(v);
                    Odontograma.txtR21.setVisible(v);
                    Odontograma.txtL21.setVisible(v);
                    Odontograma.lb43.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB21.setVisible(false);
                Odontograma.txtC21.setVisible(false);
                Odontograma.txtT21.setVisible(false);
                Odontograma.txtR21.setVisible(false);
                Odontograma.txtL21.setVisible(false);
                Odontograma.lb43.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB21.setVisible(false);
                Odontograma.txtC21.setVisible(false);
                Odontograma.txtT21.setVisible(false);
                Odontograma.txtR21.setVisible(false);
                Odontograma.txtL21.setVisible(false);
                Odontograma.lb43.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB22.getName())
                || Diente.equals(Odontograma.txtC22.getName())
                || Diente.equals(Odontograma.txtT22.getName())
                || Diente.equals(Odontograma.txtR22.getName())
                || Diente.equals(Odontograma.txtL22.getName())
                || Diente.equals(Odontograma.lb42.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB22.getName().equals(Diente)) {
                    Odontograma.txtB22.setBackground(Color.red);
                }
                if (Odontograma.txtC22.getName().equals(Diente)) {
                    Odontograma.txtC22.setBackground(Color.red);
                }
                if (Odontograma.txtT22.getName().equals(Diente)) {
                    Odontograma.txtT22.setBackground(Color.red);
                }
                if (Odontograma.txtL22.getName().equals(Diente)) {
                    Odontograma.txtL22.setBackground(Color.red);
                }
                if (Odontograma.txtR22.getName().equals(Diente)) {
                    Odontograma.txtR22.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB22.getName().equals(Diente)) {
                    Odontograma.txtB22.setBackground(Color.blue);
                }
                if (Odontograma.txtC22.getName().equals(Diente)) {
                    Odontograma.txtC22.setBackground(Color.blue);
                }
                if (Odontograma.txtT22.getName().equals(Diente)) {
                    Odontograma.txtT22.setBackground(Color.blue);
                }
                if (Odontograma.txtL22.getName().equals(Diente)) {
                    Odontograma.txtL22.setBackground(Color.blue);
                }
                if (Odontograma.txtR22.getName().equals(Diente)) {
                    Odontograma.txtR22.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB22.getName().equals(Diente)) {
                    Odontograma.txtB22.setBackground(Color.white);
                }
                if (Odontograma.txtC22.getName().equals(Diente)) {
                    Odontograma.txtC22.setBackground(Color.white);
                }
                if (Odontograma.txtT22.getName().equals(Diente)) {
                    Odontograma.txtT22.setBackground(Color.white);
                }
                if (Odontograma.txtL22.getName().equals(Diente)) {
                    Odontograma.txtL22.setBackground(Color.white);
                }
                if (Odontograma.txtR22.getName().equals(Diente)) {
                    Odontograma.txtR22.setBackground(Color.white);
                }
                if (Odontograma.lb42.getName().equals(Diente)) {
                    Odontograma.txtB22.setVisible(v);
                    Odontograma.txtC22.setVisible(v);
                    Odontograma.txtT22.setVisible(v);
                    Odontograma.txtR22.setVisible(v);
                    Odontograma.txtL22.setVisible(v);
                    Odontograma.lb42.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB22.setVisible(false);
                Odontograma.txtC22.setVisible(false);
                Odontograma.txtT22.setVisible(false);
                Odontograma.txtR22.setVisible(false);
                Odontograma.txtL22.setVisible(false);
                Odontograma.lb42.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB22.setVisible(false);
                Odontograma.txtC22.setVisible(false);
                Odontograma.txtT22.setVisible(false);
                Odontograma.txtR22.setVisible(false);
                Odontograma.txtL22.setVisible(false);
                Odontograma.lb42.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB23.getName())
                || Diente.equals(Odontograma.txtC23.getName())
                || Diente.equals(Odontograma.txtT23.getName())
                || Diente.equals(Odontograma.txtR23.getName())
                || Diente.equals(Odontograma.txtL23.getName())
                || Diente.equals(Odontograma.lb41.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB23.getName().equals(Diente)) {
                    Odontograma.txtB23.setBackground(Color.red);
                }
                if (Odontograma.txtC23.getName().equals(Diente)) {
                    Odontograma.txtC23.setBackground(Color.red);
                }
                if (Odontograma.txtT23.getName().equals(Diente)) {
                    Odontograma.txtT23.setBackground(Color.red);
                }
                if (Odontograma.txtL23.getName().equals(Diente)) {
                    Odontograma.txtL23.setBackground(Color.red);
                }
                if (Odontograma.txtR23.getName().equals(Diente)) {
                    Odontograma.txtR23.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB23.getName().equals(Diente)) {
                    Odontograma.txtB23.setBackground(Color.blue);
                }
                if (Odontograma.txtC23.getName().equals(Diente)) {
                    Odontograma.txtC23.setBackground(Color.blue);
                }
                if (Odontograma.txtT23.getName().equals(Diente)) {
                    Odontograma.txtT23.setBackground(Color.blue);
                }
                if (Odontograma.txtL23.getName().equals(Diente)) {
                    Odontograma.txtL23.setBackground(Color.blue);
                }
                if (Odontograma.txtR23.getName().equals(Diente)) {
                    Odontograma.txtR23.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB23.getName().equals(Diente)) {
                    Odontograma.txtB23.setBackground(Color.white);
                }
                if (Odontograma.txtC23.getName().equals(Diente)) {
                    Odontograma.txtC23.setBackground(Color.white);
                }
                if (Odontograma.txtT23.getName().equals(Diente)) {
                    Odontograma.txtT23.setBackground(Color.white);
                }
                if (Odontograma.txtL23.getName().equals(Diente)) {
                    Odontograma.txtL23.setBackground(Color.white);
                }
                if (Odontograma.txtR23.getName().equals(Diente)) {
                    Odontograma.txtR23.setBackground(Color.white);
                }
                if (Odontograma.lb41.getName().equals(Diente)) {
                    Odontograma.txtB23.setVisible(v);
                    Odontograma.txtC23.setVisible(v);
                    Odontograma.txtT23.setVisible(v);
                    Odontograma.txtR23.setVisible(v);
                    Odontograma.txtL23.setVisible(v);
                    Odontograma.lb41.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB23.setVisible(false);
                Odontograma.txtC23.setVisible(false);
                Odontograma.txtT23.setVisible(false);
                Odontograma.txtR23.setVisible(false);
                Odontograma.txtL23.setVisible(false);
                Odontograma.lb41.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB23.setVisible(false);
                Odontograma.txtC23.setVisible(false);
                Odontograma.txtT23.setVisible(false);
                Odontograma.txtR23.setVisible(false);
                Odontograma.txtL23.setVisible(false);
                Odontograma.lb41.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB24.getName())
                || Diente.equals(Odontograma.txtC24.getName())
                || Diente.equals(Odontograma.txtT24.getName())
                || Diente.equals(Odontograma.txtR24.getName())
                || Diente.equals(Odontograma.txtL24.getName())
                || Diente.equals(Odontograma.lb31.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB24.getName().equals(Diente)) {
                    Odontograma.txtB24.setBackground(Color.red);
                }
                if (Odontograma.txtC24.getName().equals(Diente)) {
                    Odontograma.txtC24.setBackground(Color.red);
                }
                if (Odontograma.txtT24.getName().equals(Diente)) {
                    Odontograma.txtT24.setBackground(Color.red);
                }
                if (Odontograma.txtL24.getName().equals(Diente)) {
                    Odontograma.txtL24.setBackground(Color.red);
                }
                if (Odontograma.txtR24.getName().equals(Diente)) {
                    Odontograma.txtR24.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB24.getName().equals(Diente)) {
                    Odontograma.txtB24.setBackground(Color.blue);
                }
                if (Odontograma.txtC24.getName().equals(Diente)) {
                    Odontograma.txtC24.setBackground(Color.blue);
                }
                if (Odontograma.txtT24.getName().equals(Diente)) {
                    Odontograma.txtT24.setBackground(Color.blue);
                }
                if (Odontograma.txtL24.getName().equals(Diente)) {
                    Odontograma.txtL24.setBackground(Color.blue);
                }
                if (Odontograma.txtR24.getName().equals(Diente)) {
                    Odontograma.txtR24.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB24.getName().equals(Diente)) {
                    Odontograma.txtB24.setBackground(Color.white);
                }
                if (Odontograma.txtC24.getName().equals(Diente)) {
                    Odontograma.txtC24.setBackground(Color.white);
                }
                if (Odontograma.txtT24.getName().equals(Diente)) {
                    Odontograma.txtT24.setBackground(Color.white);
                }
                if (Odontograma.txtL24.getName().equals(Diente)) {
                    Odontograma.txtL24.setBackground(Color.white);
                }
                if (Odontograma.txtR24.getName().equals(Diente)) {
                    Odontograma.txtR24.setBackground(Color.white);
                }
                if (Odontograma.lb31.getName().equals(Diente)) {
                    Odontograma.txtB24.setVisible(v);
                    Odontograma.txtC24.setVisible(v);
                    Odontograma.txtT24.setVisible(v);
                    Odontograma.txtR24.setVisible(v);
                    Odontograma.txtL24.setVisible(v);
                    Odontograma.lb31.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB24.setVisible(false);
                Odontograma.txtC24.setVisible(false);
                Odontograma.txtT24.setVisible(false);
                Odontograma.txtR24.setVisible(false);
                Odontograma.txtL24.setVisible(false);
                Odontograma.lb31.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB24.setVisible(false);
                Odontograma.txtC24.setVisible(false);
                Odontograma.txtT24.setVisible(false);
                Odontograma.txtR24.setVisible(false);
                Odontograma.txtL24.setVisible(false);
                Odontograma.lb31.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB25.getName())
                || Diente.equals(Odontograma.txtC25.getName())
                || Diente.equals(Odontograma.txtT25.getName())
                || Diente.equals(Odontograma.txtR25.getName())
                || Diente.equals(Odontograma.txtL25.getName())
                || Diente.equals(Odontograma.lb32.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB25.getName().equals(Diente)) {
                    Odontograma.txtB25.setBackground(Color.red);
                }
                if (Odontograma.txtC25.getName().equals(Diente)) {
                    Odontograma.txtC25.setBackground(Color.red);
                }
                if (Odontograma.txtT25.getName().equals(Diente)) {
                    Odontograma.txtT25.setBackground(Color.red);
                }
                if (Odontograma.txtL25.getName().equals(Diente)) {
                    Odontograma.txtL25.setBackground(Color.red);
                }
                if (Odontograma.txtR25.getName().equals(Diente)) {
                    Odontograma.txtR25.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB25.getName().equals(Diente)) {
                    Odontograma.txtB25.setBackground(Color.blue);
                }
                if (Odontograma.txtC25.getName().equals(Diente)) {
                    Odontograma.txtC25.setBackground(Color.blue);
                }
                if (Odontograma.txtT25.getName().equals(Diente)) {
                    Odontograma.txtT25.setBackground(Color.blue);
                }
                if (Odontograma.txtL25.getName().equals(Diente)) {
                    Odontograma.txtL25.setBackground(Color.blue);
                }
                if (Odontograma.txtR25.getName().equals(Diente)) {
                    Odontograma.txtR25.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB25.getName().equals(Diente)) {
                    Odontograma.txtB25.setBackground(Color.white);
                }
                if (Odontograma.txtC25.getName().equals(Diente)) {
                    Odontograma.txtC25.setBackground(Color.white);
                }
                if (Odontograma.txtT25.getName().equals(Diente)) {
                    Odontograma.txtT25.setBackground(Color.white);
                }
                if (Odontograma.txtL25.getName().equals(Diente)) {
                    Odontograma.txtL25.setBackground(Color.white);
                }
                if (Odontograma.txtR25.getName().equals(Diente)) {
                    Odontograma.txtR25.setBackground(Color.white);
                }
                if (Odontograma.lb32.getName().equals(Diente)) {
                    Odontograma.txtB25.setVisible(v);
                    Odontograma.txtC25.setVisible(v);
                    Odontograma.txtT25.setVisible(v);
                    Odontograma.txtR25.setVisible(v);
                    Odontograma.txtL25.setVisible(v);
                    Odontograma.lb32.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB25.setVisible(false);
                Odontograma.txtC25.setVisible(false);
                Odontograma.txtT25.setVisible(false);
                Odontograma.txtR25.setVisible(false);
                Odontograma.txtL25.setVisible(false);
                Odontograma.lb32.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB25.setVisible(false);
                Odontograma.txtC25.setVisible(false);
                Odontograma.txtT25.setVisible(false);
                Odontograma.txtR25.setVisible(false);
                Odontograma.txtL25.setVisible(false);
                Odontograma.lb32.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB26.getName())
                || Diente.equals(Odontograma.txtC26.getName())
                || Diente.equals(Odontograma.txtT26.getName())
                || Diente.equals(Odontograma.txtR26.getName())
                || Diente.equals(Odontograma.txtL26.getName())
                || Diente.equals(Odontograma.lb33.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB26.getName().equals(Diente)) {
                    Odontograma.txtB26.setBackground(Color.red);
                }
                if (Odontograma.txtC26.getName().equals(Diente)) {
                    Odontograma.txtC26.setBackground(Color.red);
                }
                if (Odontograma.txtT26.getName().equals(Diente)) {
                    Odontograma.txtT26.setBackground(Color.red);
                }
                if (Odontograma.txtL26.getName().equals(Diente)) {
                    Odontograma.txtL26.setBackground(Color.red);
                }
                if (Odontograma.txtR26.getName().equals(Diente)) {
                    Odontograma.txtR26.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB26.getName().equals(Diente)) {
                    Odontograma.txtB26.setBackground(Color.blue);
                }
                if (Odontograma.txtC26.getName().equals(Diente)) {
                    Odontograma.txtC26.setBackground(Color.blue);
                }
                if (Odontograma.txtT26.getName().equals(Diente)) {
                    Odontograma.txtT26.setBackground(Color.blue);
                }
                if (Odontograma.txtL26.getName().equals(Diente)) {
                    Odontograma.txtL26.setBackground(Color.blue);
                }
                if (Odontograma.txtR26.getName().equals(Diente)) {
                    Odontograma.txtR26.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB26.getName().equals(Diente)) {
                    Odontograma.txtB26.setBackground(Color.white);
                }
                if (Odontograma.txtC26.getName().equals(Diente)) {
                    Odontograma.txtC26.setBackground(Color.white);
                }
                if (Odontograma.txtT26.getName().equals(Diente)) {
                    Odontograma.txtT26.setBackground(Color.white);
                }
                if (Odontograma.txtL26.getName().equals(Diente)) {
                    Odontograma.txtL26.setBackground(Color.white);
                }
                if (Odontograma.txtR26.getName().equals(Diente)) {
                    Odontograma.txtR26.setBackground(Color.white);
                }
                if (Odontograma.lb33.getName().equals(Diente)) {
                    Odontograma.txtB26.setVisible(v);
                    Odontograma.txtC26.setVisible(v);
                    Odontograma.txtT26.setVisible(v);
                    Odontograma.txtR26.setVisible(v);
                    Odontograma.txtL26.setVisible(v);
                    Odontograma.lb33.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB26.setVisible(false);
                Odontograma.txtC26.setVisible(false);
                Odontograma.txtT26.setVisible(false);
                Odontograma.txtR26.setVisible(false);
                Odontograma.txtL26.setVisible(false);
                Odontograma.lb33.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB26.setVisible(false);
                Odontograma.txtC26.setVisible(false);
                Odontograma.txtT26.setVisible(false);
                Odontograma.txtR26.setVisible(false);
                Odontograma.txtL26.setVisible(false);
                Odontograma.lb33.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB27.getName())
                || Diente.equals(Odontograma.txtC27.getName())
                || Diente.equals(Odontograma.txtT27.getName())
                || Diente.equals(Odontograma.txtR27.getName())
                || Diente.equals(Odontograma.txtL27.getName())
                || Diente.equals(Odontograma.lb34.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB27.getName().equals(Diente)) {
                    Odontograma.txtB27.setBackground(Color.red);
                }
                if (Odontograma.txtC27.getName().equals(Diente)) {
                    Odontograma.txtC27.setBackground(Color.red);
                }
                if (Odontograma.txtT27.getName().equals(Diente)) {
                    Odontograma.txtT27.setBackground(Color.red);
                }
                if (Odontograma.txtL27.getName().equals(Diente)) {
                    Odontograma.txtL27.setBackground(Color.red);
                }
                if (Odontograma.txtR27.getName().equals(Diente)) {
                    Odontograma.txtR27.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB27.getName().equals(Diente)) {
                    Odontograma.txtB27.setBackground(Color.blue);
                }
                if (Odontograma.txtC27.getName().equals(Diente)) {
                    Odontograma.txtC27.setBackground(Color.blue);
                }
                if (Odontograma.txtT27.getName().equals(Diente)) {
                    Odontograma.txtT27.setBackground(Color.blue);
                }
                if (Odontograma.txtL27.getName().equals(Diente)) {
                    Odontograma.txtL27.setBackground(Color.blue);
                }
                if (Odontograma.txtR27.getName().equals(Diente)) {
                    Odontograma.txtR27.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB27.getName().equals(Diente)) {
                    Odontograma.txtB27.setBackground(Color.white);
                }
                if (Odontograma.txtC27.getName().equals(Diente)) {
                    Odontograma.txtC27.setBackground(Color.white);
                }
                if (Odontograma.txtT27.getName().equals(Diente)) {
                    Odontograma.txtT27.setBackground(Color.white);
                }
                if (Odontograma.txtL27.getName().equals(Diente)) {
                    Odontograma.txtL27.setBackground(Color.white);
                }
                if (Odontograma.txtR27.getName().equals(Diente)) {
                    Odontograma.txtR27.setBackground(Color.white);
                }
                if (Odontograma.lb34.getName().equals(Diente)) {
                    Odontograma.txtB27.setVisible(v);
                    Odontograma.txtC27.setVisible(v);
                    Odontograma.txtT27.setVisible(v);
                    Odontograma.txtR27.setVisible(v);
                    Odontograma.txtL27.setVisible(v);
                    Odontograma.lb34.setIcon(new ImageIcon(getClass().getResource("")));
                }

            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB27.setVisible(false);
                Odontograma.txtC27.setVisible(false);
                Odontograma.txtT27.setVisible(false);
                Odontograma.txtR27.setVisible(false);
                Odontograma.txtL27.setVisible(false);
                Odontograma.lb34.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB27.setVisible(false);
                Odontograma.txtC27.setVisible(false);
                Odontograma.txtT27.setVisible(false);
                Odontograma.txtR27.setVisible(false);
                Odontograma.txtL27.setVisible(false);
                Odontograma.lb34.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB28.getName())
                || Diente.equals(Odontograma.txtC28.getName())
                || Diente.equals(Odontograma.txtT28.getName())
                || Diente.equals(Odontograma.txtR28.getName())
                || Diente.equals(Odontograma.txtL28.getName())
                || Diente.equals(Odontograma.lb35.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB28.getName().equals(Diente)) {
                    Odontograma.txtB28.setBackground(Color.red);
                }
                if (Odontograma.txtC28.getName().equals(Diente)) {
                    Odontograma.txtC28.setBackground(Color.red);
                }
                if (Odontograma.txtT28.getName().equals(Diente)) {
                    Odontograma.txtT28.setBackground(Color.red);
                }
                if (Odontograma.txtL28.getName().equals(Diente)) {
                    Odontograma.txtL28.setBackground(Color.red);
                }
                if (Odontograma.txtR28.getName().equals(Diente)) {
                    Odontograma.txtR28.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB28.getName().equals(Diente)) {
                    Odontograma.txtB28.setBackground(Color.blue);
                }
                if (Odontograma.txtC28.getName().equals(Diente)) {
                    Odontograma.txtC28.setBackground(Color.blue);
                }
                if (Odontograma.txtT28.getName().equals(Diente)) {
                    Odontograma.txtT28.setBackground(Color.blue);
                }
                if (Odontograma.txtL28.getName().equals(Diente)) {
                    Odontograma.txtL28.setBackground(Color.blue);
                }
                if (Odontograma.txtR28.getName().equals(Diente)) {
                    Odontograma.txtR28.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB28.getName().equals(Diente)) {
                    Odontograma.txtB28.setBackground(Color.white);
                }
                if (Odontograma.txtC28.getName().equals(Diente)) {
                    Odontograma.txtC28.setBackground(Color.white);
                }
                if (Odontograma.txtT28.getName().equals(Diente)) {
                    Odontograma.txtT28.setBackground(Color.white);
                }
                if (Odontograma.txtL28.getName().equals(Diente)) {
                    Odontograma.txtL28.setBackground(Color.white);
                }
                if (Odontograma.txtR28.getName().equals(Diente)) {
                    Odontograma.txtR28.setBackground(Color.white);
                }
                if (Odontograma.lb35.getName().equals(Diente)) {
                    Odontograma.txtB28.setVisible(v);
                    Odontograma.txtC28.setVisible(v);
                    Odontograma.txtT28.setVisible(v);
                    Odontograma.txtR28.setVisible(v);
                    Odontograma.txtL28.setVisible(v);
                    Odontograma.lb35.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB28.setVisible(false);
                Odontograma.txtC28.setVisible(false);
                Odontograma.txtT28.setVisible(false);
                Odontograma.txtR28.setVisible(false);
                Odontograma.txtL28.setVisible(false);
                Odontograma.lb35.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB28.setVisible(false);
                Odontograma.txtC28.setVisible(false);
                Odontograma.txtT28.setVisible(false);
                Odontograma.txtR28.setVisible(false);
                Odontograma.txtL28.setVisible(false);
                Odontograma.lb35.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB29.getName())
                || Diente.equals(Odontograma.txtC29.getName())
                || Diente.equals(Odontograma.txtT29.getName())
                || Diente.equals(Odontograma.txtR29.getName())
                || Diente.equals(Odontograma.txtL29.getName())
                || Diente.equals(Odontograma.lb36.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB29.getName().equals(Diente)) {
                    Odontograma.txtB29.setBackground(Color.red);
                }
                if (Odontograma.txtC29.getName().equals(Diente)) {
                    Odontograma.txtC29.setBackground(Color.red);
                }
                if (Odontograma.txtT29.getName().equals(Diente)) {
                    Odontograma.txtT29.setBackground(Color.red);
                }
                if (Odontograma.txtL29.getName().equals(Diente)) {
                    Odontograma.txtL29.setBackground(Color.red);
                }
                if (Odontograma.txtR29.getName().equals(Diente)) {
                    Odontograma.txtR29.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB29.getName().equals(Diente)) {
                    Odontograma.txtB29.setBackground(Color.blue);
                }
                if (Odontograma.txtC29.getName().equals(Diente)) {
                    Odontograma.txtC29.setBackground(Color.blue);
                }
                if (Odontograma.txtT29.getName().equals(Diente)) {
                    Odontograma.txtT29.setBackground(Color.blue);
                }
                if (Odontograma.txtL29.getName().equals(Diente)) {
                    Odontograma.txtL29.setBackground(Color.blue);
                }
                if (Odontograma.txtR29.getName().equals(Diente)) {
                    Odontograma.txtR29.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB29.getName().equals(Diente)) {
                    Odontograma.txtB29.setBackground(Color.white);
                }
                if (Odontograma.txtC29.getName().equals(Diente)) {
                    Odontograma.txtC29.setBackground(Color.white);
                }
                if (Odontograma.txtT29.getName().equals(Diente)) {
                    Odontograma.txtT29.setBackground(Color.white);
                }
                if (Odontograma.txtL29.getName().equals(Diente)) {
                    Odontograma.txtL29.setBackground(Color.white);
                }
                if (Odontograma.txtR29.getName().equals(Diente)) {
                    Odontograma.txtR29.setBackground(Color.white);
                }
                if (Odontograma.lb36.getName().equals(Diente)) {
                    Odontograma.txtB29.setVisible(v);
                    Odontograma.txtC29.setVisible(v);
                    Odontograma.txtT29.setVisible(v);
                    Odontograma.txtR29.setVisible(v);
                    Odontograma.txtL29.setVisible(v);
                    Odontograma.lb36.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB29.setVisible(false);
                Odontograma.txtC29.setVisible(false);
                Odontograma.txtT29.setVisible(false);
                Odontograma.txtR29.setVisible(false);
                Odontograma.txtL29.setVisible(false);
                Odontograma.lb36.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB29.setVisible(false);
                Odontograma.txtC29.setVisible(false);
                Odontograma.txtT29.setVisible(false);
                Odontograma.txtR29.setVisible(false);
                Odontograma.txtL29.setVisible(false);
                Odontograma.lb36.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB30.getName())
                || Diente.equals(Odontograma.txtC30.getName())
                || Diente.equals(Odontograma.txtT30.getName())
                || Diente.equals(Odontograma.txtR30.getName())
                || Diente.equals(Odontograma.txtL30.getName())
                || Diente.equals(Odontograma.lb37.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB30.getName().equals(Diente)) {
                    Odontograma.txtB30.setBackground(Color.red);
                }
                if (Odontograma.txtC30.getName().equals(Diente)) {
                    Odontograma.txtC30.setBackground(Color.red);
                }
                if (Odontograma.txtT30.getName().equals(Diente)) {
                    Odontograma.txtT30.setBackground(Color.red);
                }
                if (Odontograma.txtL30.getName().equals(Diente)) {
                    Odontograma.txtL30.setBackground(Color.red);
                }
                if (Odontograma.txtR30.getName().equals(Diente)) {
                    Odontograma.txtR30.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB30.getName().equals(Diente)) {
                    Odontograma.txtB30.setBackground(Color.blue);
                }
                if (Odontograma.txtC30.getName().equals(Diente)) {
                    Odontograma.txtC30.setBackground(Color.blue);
                }
                if (Odontograma.txtT30.getName().equals(Diente)) {
                    Odontograma.txtT30.setBackground(Color.blue);
                }
                if (Odontograma.txtL30.getName().equals(Diente)) {
                    Odontograma.txtL30.setBackground(Color.blue);
                }
                if (Odontograma.txtR30.getName().equals(Diente)) {
                    Odontograma.txtR30.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB30.getName().equals(Diente)) {
                    Odontograma.txtB30.setBackground(Color.white);
                }
                if (Odontograma.txtC30.getName().equals(Diente)) {
                    Odontograma.txtC30.setBackground(Color.white);
                }
                if (Odontograma.txtT30.getName().equals(Diente)) {
                    Odontograma.txtT30.setBackground(Color.white);
                }
                if (Odontograma.txtL30.getName().equals(Diente)) {
                    Odontograma.txtL30.setBackground(Color.white);
                }
                if (Odontograma.txtR30.getName().equals(Diente)) {
                    Odontograma.txtR30.setBackground(Color.white);
                }
                if (Odontograma.lb37.getName().equals(Diente)) {
                    Odontograma.txtB30.setVisible(v);
                    Odontograma.txtC30.setVisible(v);
                    Odontograma.txtT30.setVisible(v);
                    Odontograma.txtR30.setVisible(v);
                    Odontograma.txtL30.setVisible(v);
                    Odontograma.lb37.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB30.setVisible(false);
                Odontograma.txtC30.setVisible(false);
                Odontograma.txtT30.setVisible(false);
                Odontograma.txtR30.setVisible(false);
                Odontograma.txtL30.setVisible(false);
                Odontograma.lb37.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB30.setVisible(false);
                Odontograma.txtC30.setVisible(false);
                Odontograma.txtT30.setVisible(false);
                Odontograma.txtR30.setVisible(false);
                Odontograma.txtL30.setVisible(false);
                Odontograma.lb37.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB31.getName())
                || Diente.equals(Odontograma.txtC31.getName())
                || Diente.equals(Odontograma.txtT31.getName())
                || Diente.equals(Odontograma.txtR31.getName())
                || Diente.equals(Odontograma.txtL31.getName())
                || Diente.equals(Odontograma.lb38.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB31.getName().equals(Diente)) {
                    Odontograma.txtB31.setBackground(Color.red);
                }
                if (Odontograma.txtC31.getName().equals(Diente)) {
                    Odontograma.txtC31.setBackground(Color.red);
                }
                if (Odontograma.txtT31.getName().equals(Diente)) {
                    Odontograma.txtT31.setBackground(Color.red);
                }
                if (Odontograma.txtL31.getName().equals(Diente)) {
                    Odontograma.txtL31.setBackground(Color.red);
                }
                if (Odontograma.txtR31.getName().equals(Diente)) {
                    Odontograma.txtR31.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB31.getName().equals(Diente)) {
                    Odontograma.txtB31.setBackground(Color.blue);
                }
                if (Odontograma.txtC31.getName().equals(Diente)) {
                    Odontograma.txtC31.setBackground(Color.blue);
                }
                if (Odontograma.txtT31.getName().equals(Diente)) {
                    Odontograma.txtT31.setBackground(Color.blue);
                }
                if (Odontograma.txtL31.getName().equals(Diente)) {
                    Odontograma.txtL31.setBackground(Color.blue);
                }
                if (Odontograma.txtR31.getName().equals(Diente)) {
                    Odontograma.txtR31.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB31.getName().equals(Diente)) {
                    Odontograma.txtB31.setBackground(Color.white);
                }
                if (Odontograma.txtC31.getName().equals(Diente)) {
                    Odontograma.txtC31.setBackground(Color.white);
                }
                if (Odontograma.txtT31.getName().equals(Diente)) {
                    Odontograma.txtT31.setBackground(Color.white);
                }
                if (Odontograma.txtL31.getName().equals(Diente)) {
                    Odontograma.txtL31.setBackground(Color.white);
                }
                if (Odontograma.txtR31.getName().equals(Diente)) {
                    Odontograma.txtR31.setBackground(Color.white);
                }
                if (Odontograma.lb38.getName().equals(Diente)) {
                    Odontograma.txtB31.setVisible(v);
                    Odontograma.txtC31.setVisible(v);
                    Odontograma.txtT31.setVisible(v);
                    Odontograma.txtR31.setVisible(v);
                    Odontograma.txtL31.setVisible(v);
                    Odontograma.lb38.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB31.setVisible(false);
                Odontograma.txtC31.setVisible(false);
                Odontograma.txtT31.setVisible(false);
                Odontograma.txtR31.setVisible(false);
                Odontograma.txtL31.setVisible(false);
                Odontograma.lb38.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB31.setVisible(false);
                Odontograma.txtC31.setVisible(false);
                Odontograma.txtT31.setVisible(false);
                Odontograma.txtR31.setVisible(false);
                Odontograma.txtL31.setVisible(false);
                Odontograma.lb38.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB32.getName())
                || Diente.equals(Odontograma.txtC32.getName())
                || Diente.equals(Odontograma.txtT32.getName())
                || Diente.equals(Odontograma.txtR32.getName())
                || Diente.equals(Odontograma.txtL32.getName())
                || Diente.equals(Odontograma.lb55.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB32.getName().equals(Diente)) {
                    Odontograma.txtB32.setBackground(Color.red);
                }
                if (Odontograma.txtC32.getName().equals(Diente)) {
                    Odontograma.txtC32.setBackground(Color.red);
                }
                if (Odontograma.txtT32.getName().equals(Diente)) {
                    Odontograma.txtT32.setBackground(Color.red);
                }
                if (Odontograma.txtL32.getName().equals(Diente)) {
                    Odontograma.txtL32.setBackground(Color.red);
                }
                if (Odontograma.txtR32.getName().equals(Diente)) {
                    Odontograma.txtR32.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB32.getName().equals(Diente)) {
                    Odontograma.txtB32.setBackground(Color.blue);
                }
                if (Odontograma.txtC32.getName().equals(Diente)) {
                    Odontograma.txtC32.setBackground(Color.blue);
                }
                if (Odontograma.txtT32.getName().equals(Diente)) {
                    Odontograma.txtT32.setBackground(Color.blue);
                }
                if (Odontograma.txtL32.getName().equals(Diente)) {
                    Odontograma.txtL32.setBackground(Color.blue);
                }
                if (Odontograma.txtR32.getName().equals(Diente)) {
                    Odontograma.txtR32.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB32.getName().equals(Diente)) {
                    Odontograma.txtB32.setBackground(Color.white);
                }
                if (Odontograma.txtC32.getName().equals(Diente)) {
                    Odontograma.txtC32.setBackground(Color.white);
                }
                if (Odontograma.txtT32.getName().equals(Diente)) {
                    Odontograma.txtT32.setBackground(Color.white);
                }
                if (Odontograma.txtL32.getName().equals(Diente)) {
                    Odontograma.txtL32.setBackground(Color.white);
                }
                if (Odontograma.txtR32.getName().equals(Diente)) {
                    Odontograma.txtR32.setBackground(Color.white);
                }
                if (Odontograma.lb55.getName().equals(Diente)) {
                    Odontograma.txtB32.setVisible(v);
                    Odontograma.txtC32.setVisible(v);
                    Odontograma.txtT32.setVisible(v);
                    Odontograma.txtR32.setVisible(v);
                    Odontograma.txtL32.setVisible(v);
                    Odontograma.lb55.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB32.setVisible(false);
                Odontograma.txtC32.setVisible(false);
                Odontograma.txtT32.setVisible(false);
                Odontograma.txtR32.setVisible(false);
                Odontograma.txtL32.setVisible(false);
                Odontograma.lb55.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB32.setVisible(false);
                Odontograma.txtC32.setVisible(false);
                Odontograma.txtT32.setVisible(false);
                Odontograma.txtR32.setVisible(false);
                Odontograma.txtL32.setVisible(false);
                Odontograma.lb55.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB33.getName())
                || Diente.equals(Odontograma.txtC33.getName())
                || Diente.equals(Odontograma.txtT33.getName())
                || Diente.equals(Odontograma.txtR33.getName())
                || Diente.equals(Odontograma.txtL33.getName())
                || Diente.equals(Odontograma.lb54.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB33.getName().equals(Diente)) {
                    Odontograma.txtB33.setBackground(Color.red);
                }
                if (Odontograma.txtC33.getName().equals(Diente)) {
                    Odontograma.txtC33.setBackground(Color.red);
                }
                if (Odontograma.txtT33.getName().equals(Diente)) {
                    Odontograma.txtT33.setBackground(Color.red);
                }
                if (Odontograma.txtL33.getName().equals(Diente)) {
                    Odontograma.txtL33.setBackground(Color.red);
                }
                if (Odontograma.txtR33.getName().equals(Diente)) {
                    Odontograma.txtR33.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB33.getName().equals(Diente)) {
                    Odontograma.txtB33.setBackground(Color.blue);
                }
                if (Odontograma.txtC33.getName().equals(Diente)) {
                    Odontograma.txtC33.setBackground(Color.blue);
                }
                if (Odontograma.txtT33.getName().equals(Diente)) {
                    Odontograma.txtT33.setBackground(Color.blue);
                }
                if (Odontograma.txtL33.getName().equals(Diente)) {
                    Odontograma.txtL33.setBackground(Color.blue);
                }
                if (Odontograma.txtR33.getName().equals(Diente)) {
                    Odontograma.txtR33.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB33.getName().equals(Diente)) {
                    Odontograma.txtB33.setBackground(Color.white);
                }
                if (Odontograma.txtC33.getName().equals(Diente)) {
                    Odontograma.txtC33.setBackground(Color.white);
                }
                if (Odontograma.txtT33.getName().equals(Diente)) {
                    Odontograma.txtT33.setBackground(Color.white);
                }
                if (Odontograma.txtL33.getName().equals(Diente)) {
                    Odontograma.txtL33.setBackground(Color.white);
                }
                if (Odontograma.txtR33.getName().equals(Diente)) {
                    Odontograma.txtR33.setBackground(Color.white);
                }
                if (Odontograma.lb54.getName().equals(Diente)) {
                    Odontograma.txtB33.setVisible(v);
                    Odontograma.txtC33.setVisible(v);
                    Odontograma.txtT33.setVisible(v);
                    Odontograma.txtR33.setVisible(v);
                    Odontograma.txtL33.setVisible(v);
                    Odontograma.lb54.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB33.setVisible(false);
                Odontograma.txtC33.setVisible(false);
                Odontograma.txtT33.setVisible(false);
                Odontograma.txtR33.setVisible(false);
                Odontograma.txtL33.setVisible(false);
                Odontograma.lb54.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB33.setVisible(false);
                Odontograma.txtC33.setVisible(false);
                Odontograma.txtT33.setVisible(false);
                Odontograma.txtR33.setVisible(false);
                Odontograma.txtL33.setVisible(false);
                Odontograma.lb54.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB34.getName())
                || Diente.equals(Odontograma.txtC34.getName())
                || Diente.equals(Odontograma.txtT34.getName())
                || Diente.equals(Odontograma.txtR34.getName())
                || Diente.equals(Odontograma.txtL34.getName())
                || Diente.equals(Odontograma.lb53.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB34.getName().equals(Diente)) {
                    Odontograma.txtB34.setBackground(Color.red);
                }
                if (Odontograma.txtC34.getName().equals(Diente)) {
                    Odontograma.txtC34.setBackground(Color.red);
                }
                if (Odontograma.txtT34.getName().equals(Diente)) {
                    Odontograma.txtT34.setBackground(Color.red);
                }
                if (Odontograma.txtL34.getName().equals(Diente)) {
                    Odontograma.txtL34.setBackground(Color.red);
                }
                if (Odontograma.txtR34.getName().equals(Diente)) {
                    Odontograma.txtR34.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB34.getName().equals(Diente)) {
                    Odontograma.txtB34.setBackground(Color.blue);
                }
                if (Odontograma.txtC34.getName().equals(Diente)) {
                    Odontograma.txtC34.setBackground(Color.blue);
                }
                if (Odontograma.txtT34.getName().equals(Diente)) {
                    Odontograma.txtT34.setBackground(Color.blue);
                }
                if (Odontograma.txtL34.getName().equals(Diente)) {
                    Odontograma.txtL34.setBackground(Color.blue);
                }
                if (Odontograma.txtR34.getName().equals(Diente)) {
                    Odontograma.txtR34.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB34.getName().equals(Diente)) {
                    Odontograma.txtB34.setBackground(Color.white);
                }
                if (Odontograma.txtC34.getName().equals(Diente)) {
                    Odontograma.txtC34.setBackground(Color.white);
                }
                if (Odontograma.txtT34.getName().equals(Diente)) {
                    Odontograma.txtT34.setBackground(Color.white);
                }
                if (Odontograma.txtL34.getName().equals(Diente)) {
                    Odontograma.txtL34.setBackground(Color.white);
                }
                if (Odontograma.txtR34.getName().equals(Diente)) {
                    Odontograma.txtR34.setBackground(Color.white);
                }
                if (Odontograma.lb53.getName().equals(Diente)) {
                    Odontograma.txtB34.setVisible(v);
                    Odontograma.txtC34.setVisible(v);
                    Odontograma.txtT34.setVisible(v);
                    Odontograma.txtR34.setVisible(v);
                    Odontograma.txtL34.setVisible(v);
                    Odontograma.lb53.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB34.setVisible(false);
                Odontograma.txtC34.setVisible(false);
                Odontograma.txtT34.setVisible(false);
                Odontograma.txtR34.setVisible(false);
                Odontograma.txtL34.setVisible(false);
                Odontograma.lb53.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB34.setVisible(false);
                Odontograma.txtC34.setVisible(false);
                Odontograma.txtT34.setVisible(false);
                Odontograma.txtR34.setVisible(false);
                Odontograma.txtL34.setVisible(false);
                Odontograma.lb53.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB35.getName())
                || Diente.equals(Odontograma.txtC35.getName())
                || Diente.equals(Odontograma.txtT35.getName())
                || Diente.equals(Odontograma.txtR35.getName())
                || Diente.equals(Odontograma.txtL35.getName())
                || Diente.equals(Odontograma.lb52.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB35.getName().equals(Diente)) {
                    Odontograma.txtB35.setBackground(Color.red);
                }
                if (Odontograma.txtC35.getName().equals(Diente)) {
                    Odontograma.txtC35.setBackground(Color.red);
                }
                if (Odontograma.txtT35.getName().equals(Diente)) {
                    Odontograma.txtT35.setBackground(Color.red);
                }
                if (Odontograma.txtL35.getName().equals(Diente)) {
                    Odontograma.txtL35.setBackground(Color.red);
                }
                if (Odontograma.txtR35.getName().equals(Diente)) {
                    Odontograma.txtR35.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB35.getName().equals(Diente)) {
                    Odontograma.txtB35.setBackground(Color.blue);
                }
                if (Odontograma.txtC35.getName().equals(Diente)) {
                    Odontograma.txtC35.setBackground(Color.blue);
                }
                if (Odontograma.txtT35.getName().equals(Diente)) {
                    Odontograma.txtT35.setBackground(Color.blue);
                }
                if (Odontograma.txtL35.getName().equals(Diente)) {
                    Odontograma.txtL35.setBackground(Color.blue);
                }
                if (Odontograma.txtR35.getName().equals(Diente)) {
                    Odontograma.txtR35.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB35.getName().equals(Diente)) {
                    Odontograma.txtB35.setBackground(Color.white);
                }
                if (Odontograma.txtC35.getName().equals(Diente)) {
                    Odontograma.txtC35.setBackground(Color.white);
                }
                if (Odontograma.txtT35.getName().equals(Diente)) {
                    Odontograma.txtT35.setBackground(Color.white);
                }
                if (Odontograma.txtL35.getName().equals(Diente)) {
                    Odontograma.txtL35.setBackground(Color.white);
                }
                if (Odontograma.txtR35.getName().equals(Diente)) {
                    Odontograma.txtR35.setBackground(Color.white);
                }
                if (Odontograma.lb52.getName().equals(Diente)) {
                    Odontograma.txtB35.setVisible(v);
                    Odontograma.txtC35.setVisible(v);
                    Odontograma.txtT35.setVisible(v);
                    Odontograma.txtR35.setVisible(v);
                    Odontograma.txtL35.setVisible(v);
                    Odontograma.lb52.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB35.setVisible(false);
                Odontograma.txtC35.setVisible(false);
                Odontograma.txtT35.setVisible(false);
                Odontograma.txtR35.setVisible(false);
                Odontograma.txtL35.setVisible(false);
                Odontograma.lb52.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB35.setVisible(false);
                Odontograma.txtC35.setVisible(false);
                Odontograma.txtT35.setVisible(false);
                Odontograma.txtR35.setVisible(false);
                Odontograma.txtL35.setVisible(false);
                Odontograma.lb52.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB36.getName())
                || Diente.equals(Odontograma.txtC36.getName())
                || Diente.equals(Odontograma.txtT36.getName())
                || Diente.equals(Odontograma.txtR36.getName())
                || Diente.equals(Odontograma.txtL36.getName())
                || Diente.equals(Odontograma.lb51.getName())) {

            if (Op.equals("CARIE")) {
                if (Odontograma.txtB36.getName().equals(Diente)) {
                    Odontograma.txtB36.setBackground(Color.red);
                }
                if (Odontograma.txtC36.getName().equals(Diente)) {
                    Odontograma.txtC36.setBackground(Color.red);
                }
                if (Odontograma.txtT36.getName().equals(Diente)) {
                    Odontograma.txtT36.setBackground(Color.red);
                }
                if (Odontograma.txtL36.getName().equals(Diente)) {
                    Odontograma.txtL36.setBackground(Color.red);
                }
                if (Odontograma.txtR36.getName().equals(Diente)) {
                    Odontograma.txtR36.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB36.getName().equals(Diente)) {
                    Odontograma.txtB36.setBackground(Color.blue);
                }
                if (Odontograma.txtC36.getName().equals(Diente)) {
                    Odontograma.txtC36.setBackground(Color.blue);
                }
                if (Odontograma.txtT36.getName().equals(Diente)) {
                    Odontograma.txtT36.setBackground(Color.blue);
                }
                if (Odontograma.txtL36.getName().equals(Diente)) {
                    Odontograma.txtL36.setBackground(Color.blue);
                }
                if (Odontograma.txtR36.getName().equals(Diente)) {
                    Odontograma.txtR36.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB36.getName().equals(Diente)) {
                    Odontograma.txtB36.setBackground(Color.white);
                }
                if (Odontograma.txtC36.getName().equals(Diente)) {
                    Odontograma.txtC36.setBackground(Color.white);
                }
                if (Odontograma.txtT36.getName().equals(Diente)) {
                    Odontograma.txtT36.setBackground(Color.white);
                }
                if (Odontograma.txtL36.getName().equals(Diente)) {
                    Odontograma.txtL36.setBackground(Color.white);
                }
                if (Odontograma.txtR36.getName().equals(Diente)) {
                    Odontograma.txtR36.setBackground(Color.white);
                }
                if (Odontograma.lb51.getName().equals(Diente)) {
                    Odontograma.txtB36.setVisible(v);
                    Odontograma.txtC36.setVisible(v);
                    Odontograma.txtT36.setVisible(v);
                    Odontograma.txtR36.setVisible(v);
                    Odontograma.txtL36.setVisible(v);
                    Odontograma.lb51.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB36.setVisible(false);
                Odontograma.txtC36.setVisible(false);
                Odontograma.txtT36.setVisible(false);
                Odontograma.txtR36.setVisible(false);
                Odontograma.txtL36.setVisible(false);
                Odontograma.lb51.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB36.setVisible(false);
                Odontograma.txtC36.setVisible(false);
                Odontograma.txtT36.setVisible(false);
                Odontograma.txtR36.setVisible(false);
                Odontograma.txtL36.setVisible(false);
                Odontograma.lb51.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB37.getName())
                || Diente.equals(Odontograma.txtC37.getName())
                || Diente.equals(Odontograma.txtT37.getName())
                || Diente.equals(Odontograma.txtR37.getName())
                || Diente.equals(Odontograma.txtL37.getName())
                || Diente.equals(Odontograma.lb61.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB37.getName().equals(Diente)) {
                    Odontograma.txtB37.setBackground(Color.red);
                }
                if (Odontograma.txtC37.getName().equals(Diente)) {
                    Odontograma.txtC37.setBackground(Color.red);
                }
                if (Odontograma.txtT37.getName().equals(Diente)) {
                    Odontograma.txtT37.setBackground(Color.red);
                }
                if (Odontograma.txtL37.getName().equals(Diente)) {
                    Odontograma.txtL37.setBackground(Color.red);
                }
                if (Odontograma.txtR37.getName().equals(Diente)) {
                    Odontograma.txtR37.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB37.getName().equals(Diente)) {
                    Odontograma.txtB37.setBackground(Color.blue);
                }
                if (Odontograma.txtC37.getName().equals(Diente)) {
                    Odontograma.txtC37.setBackground(Color.blue);
                }
                if (Odontograma.txtT37.getName().equals(Diente)) {
                    Odontograma.txtT37.setBackground(Color.blue);
                }
                if (Odontograma.txtL37.getName().equals(Diente)) {
                    Odontograma.txtL37.setBackground(Color.blue);
                }
                if (Odontograma.txtR37.getName().equals(Diente)) {
                    Odontograma.txtR37.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB37.getName().equals(Diente)) {
                    Odontograma.txtB37.setBackground(Color.white);
                }
                if (Odontograma.txtC37.getName().equals(Diente)) {
                    Odontograma.txtC37.setBackground(Color.white);
                }
                if (Odontograma.txtT37.getName().equals(Diente)) {
                    Odontograma.txtT37.setBackground(Color.white);
                }
                if (Odontograma.txtL37.getName().equals(Diente)) {
                    Odontograma.txtL37.setBackground(Color.white);
                }
                if (Odontograma.txtR37.getName().equals(Diente)) {
                    Odontograma.txtR37.setBackground(Color.white);
                }
                if (Odontograma.lb61.getName().equals(Diente)) {
                    Odontograma.txtB37.setVisible(v);
                    Odontograma.txtC37.setVisible(v);
                    Odontograma.txtT37.setVisible(v);
                    Odontograma.txtR37.setVisible(v);
                    Odontograma.txtL37.setVisible(v);
                    Odontograma.lb61.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB37.setVisible(false);
                Odontograma.txtC37.setVisible(false);
                Odontograma.txtT37.setVisible(false);
                Odontograma.txtR37.setVisible(false);
                Odontograma.txtL37.setVisible(false);
                Odontograma.lb61.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB37.setVisible(false);
                Odontograma.txtC37.setVisible(false);
                Odontograma.txtT37.setVisible(false);
                Odontograma.txtR37.setVisible(false);
                Odontograma.txtL37.setVisible(false);
                Odontograma.lb61.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB38.getName())
                || Diente.equals(Odontograma.txtC38.getName())
                || Diente.equals(Odontograma.txtT38.getName())
                || Diente.equals(Odontograma.txtR38.getName())
                || Diente.equals(Odontograma.txtL38.getName())
                || Diente.equals(Odontograma.lb62.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB38.getName().equals(Diente)) {
                    Odontograma.txtB38.setBackground(Color.red);
                }
                if (Odontograma.txtC38.getName().equals(Diente)) {
                    Odontograma.txtC38.setBackground(Color.red);
                }
                if (Odontograma.txtT38.getName().equals(Diente)) {
                    Odontograma.txtT38.setBackground(Color.red);
                }
                if (Odontograma.txtL38.getName().equals(Diente)) {
                    Odontograma.txtL38.setBackground(Color.red);
                }
                if (Odontograma.txtR38.getName().equals(Diente)) {
                    Odontograma.txtR38.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB38.getName().equals(Diente)) {
                    Odontograma.txtB38.setBackground(Color.blue);
                }
                if (Odontograma.txtC38.getName().equals(Diente)) {
                    Odontograma.txtC38.setBackground(Color.blue);
                }
                if (Odontograma.txtT38.getName().equals(Diente)) {
                    Odontograma.txtT38.setBackground(Color.blue);
                }
                if (Odontograma.txtL38.getName().equals(Diente)) {
                    Odontograma.txtL38.setBackground(Color.blue);
                }
                if (Odontograma.txtR38.getName().equals(Diente)) {
                    Odontograma.txtR38.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB38.getName().equals(Diente)) {
                    Odontograma.txtB38.setBackground(Color.white);
                }
                if (Odontograma.txtC38.getName().equals(Diente)) {
                    Odontograma.txtC38.setBackground(Color.white);
                }
                if (Odontograma.txtT38.getName().equals(Diente)) {
                    Odontograma.txtT38.setBackground(Color.white);
                }
                if (Odontograma.txtL38.getName().equals(Diente)) {
                    Odontograma.txtL38.setBackground(Color.white);
                }
                if (Odontograma.txtR38.getName().equals(Diente)) {
                    Odontograma.txtR38.setBackground(Color.white);
                }
                if (Odontograma.lb62.getName().equals(Diente)) {
                    Odontograma.txtB38.setVisible(v);
                    Odontograma.txtC38.setVisible(v);
                    Odontograma.txtT38.setVisible(v);
                    Odontograma.txtR38.setVisible(v);
                    Odontograma.txtL38.setVisible(v);
                    Odontograma.lb62.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB38.setVisible(false);
                Odontograma.txtC38.setVisible(false);
                Odontograma.txtT38.setVisible(false);
                Odontograma.txtR38.setVisible(false);
                Odontograma.txtL38.setVisible(false);
                Odontograma.lb62.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB38.setVisible(false);
                Odontograma.txtC38.setVisible(false);
                Odontograma.txtT38.setVisible(false);
                Odontograma.txtR38.setVisible(false);
                Odontograma.txtL38.setVisible(false);
                Odontograma.lb62.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB39.getName())
                || Diente.equals(Odontograma.txtC39.getName())
                || Diente.equals(Odontograma.txtT39.getName())
                || Diente.equals(Odontograma.txtR39.getName())
                || Diente.equals(Odontograma.txtL39.getName())
                || Diente.equals(Odontograma.lb63.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB39.getName().equals(Diente)) {
                    Odontograma.txtB39.setBackground(Color.red);
                }
                if (Odontograma.txtC39.getName().equals(Diente)) {
                    Odontograma.txtC39.setBackground(Color.red);
                }
                if (Odontograma.txtT39.getName().equals(Diente)) {
                    Odontograma.txtT39.setBackground(Color.red);
                }
                if (Odontograma.txtL39.getName().equals(Diente)) {
                    Odontograma.txtL39.setBackground(Color.red);
                }
                if (Odontograma.txtR39.getName().equals(Diente)) {
                    Odontograma.txtR39.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB39.getName().equals(Diente)) {
                    Odontograma.txtB39.setBackground(Color.blue);
                }
                if (Odontograma.txtC39.getName().equals(Diente)) {
                    Odontograma.txtC39.setBackground(Color.blue);
                }
                if (Odontograma.txtT39.getName().equals(Diente)) {
                    Odontograma.txtT39.setBackground(Color.blue);
                }
                if (Odontograma.txtL39.getName().equals(Diente)) {
                    Odontograma.txtL39.setBackground(Color.blue);
                }
                if (Odontograma.txtR39.getName().equals(Diente)) {
                    Odontograma.txtR39.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB39.getName().equals(Diente)) {
                    Odontograma.txtB39.setBackground(Color.white);
                }
                if (Odontograma.txtC39.getName().equals(Diente)) {
                    Odontograma.txtC39.setBackground(Color.white);
                }
                if (Odontograma.txtT39.getName().equals(Diente)) {
                    Odontograma.txtT39.setBackground(Color.white);
                }
                if (Odontograma.txtL39.getName().equals(Diente)) {
                    Odontograma.txtL39.setBackground(Color.white);
                }
                if (Odontograma.txtR39.getName().equals(Diente)) {
                    Odontograma.txtR39.setBackground(Color.white);
                }
                if (Odontograma.lb63.getName().equals(Diente)) {
                    Odontograma.txtB39.setVisible(v);
                    Odontograma.txtC39.setVisible(v);
                    Odontograma.txtT39.setVisible(v);
                    Odontograma.txtR39.setVisible(v);
                    Odontograma.txtL39.setVisible(v);
                    Odontograma.lb63.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB39.setVisible(false);
                Odontograma.txtC39.setVisible(false);
                Odontograma.txtT39.setVisible(false);
                Odontograma.txtR39.setVisible(false);
                Odontograma.txtL39.setVisible(false);
                Odontograma.lb63.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB39.setVisible(false);
                Odontograma.txtC39.setVisible(false);
                Odontograma.txtT39.setVisible(false);
                Odontograma.txtR39.setVisible(false);
                Odontograma.txtL39.setVisible(false);
                Odontograma.lb63.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB40.getName())
                || Diente.equals(Odontograma.txtC40.getName())
                || Diente.equals(Odontograma.txtT40.getName())
                || Diente.equals(Odontograma.txtR40.getName())
                || Diente.equals(Odontograma.txtL40.getName())
                || Diente.equals(Odontograma.lb64.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB40.getName().equals(Diente)) {
                    Odontograma.txtB40.setBackground(Color.red);
                }
                if (Odontograma.txtC40.getName().equals(Diente)) {
                    Odontograma.txtC40.setBackground(Color.red);
                }
                if (Odontograma.txtT40.getName().equals(Diente)) {
                    Odontograma.txtT40.setBackground(Color.red);
                }
                if (Odontograma.txtL40.getName().equals(Diente)) {
                    Odontograma.txtL40.setBackground(Color.red);
                }
                if (Odontograma.txtR40.getName().equals(Diente)) {
                    Odontograma.txtR40.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB40.getName().equals(Diente)) {
                    Odontograma.txtB40.setBackground(Color.blue);
                }
                if (Odontograma.txtC40.getName().equals(Diente)) {
                    Odontograma.txtC40.setBackground(Color.blue);
                }
                if (Odontograma.txtT40.getName().equals(Diente)) {
                    Odontograma.txtT40.setBackground(Color.blue);
                }
                if (Odontograma.txtL40.getName().equals(Diente)) {
                    Odontograma.txtL40.setBackground(Color.blue);
                }
                if (Odontograma.txtR40.getName().equals(Diente)) {
                    Odontograma.txtR40.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB40.getName().equals(Diente)) {
                    Odontograma.txtB40.setBackground(Color.white);
                }
                if (Odontograma.txtC40.getName().equals(Diente)) {
                    Odontograma.txtC40.setBackground(Color.white);
                }
                if (Odontograma.txtT40.getName().equals(Diente)) {
                    Odontograma.txtT40.setBackground(Color.white);
                }
                if (Odontograma.txtL40.getName().equals(Diente)) {
                    Odontograma.txtL40.setBackground(Color.white);
                }
                if (Odontograma.txtR40.getName().equals(Diente)) {
                    Odontograma.txtR40.setBackground(Color.white);
                }
                if (Odontograma.lb64.getName().equals(Diente)) {
                    Odontograma.txtB40.setVisible(v);
                    Odontograma.txtC40.setVisible(v);
                    Odontograma.txtT40.setVisible(v);
                    Odontograma.txtR40.setVisible(v);
                    Odontograma.txtL40.setVisible(v);
                    Odontograma.lb64.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB40.setVisible(false);
                Odontograma.txtC40.setVisible(false);
                Odontograma.txtT40.setVisible(false);
                Odontograma.txtR40.setVisible(false);
                Odontograma.txtL40.setVisible(false);
                Odontograma.lb64.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB40.setVisible(false);
                Odontograma.txtC40.setVisible(false);
                Odontograma.txtT40.setVisible(false);
                Odontograma.txtR40.setVisible(false);
                Odontograma.txtL40.setVisible(false);
                Odontograma.lb64.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB41.getName())
                || Diente.equals(Odontograma.txtC41.getName())
                || Diente.equals(Odontograma.txtT41.getName())
                || Diente.equals(Odontograma.txtR41.getName())
                || Diente.equals(Odontograma.txtL41.getName())
                || Diente.equals(Odontograma.lb65.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB41.getName().equals(Diente)) {
                    Odontograma.txtB41.setBackground(Color.red);
                }
                if (Odontograma.txtC41.getName().equals(Diente)) {
                    Odontograma.txtC41.setBackground(Color.red);
                }
                if (Odontograma.txtT41.getName().equals(Diente)) {
                    Odontograma.txtT41.setBackground(Color.red);
                }
                if (Odontograma.txtL41.getName().equals(Diente)) {
                    Odontograma.txtL41.setBackground(Color.red);
                }
                if (Odontograma.txtR41.getName().equals(Diente)) {
                    Odontograma.txtR41.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB41.getName().equals(Diente)) {
                    Odontograma.txtB41.setBackground(Color.blue);
                }
                if (Odontograma.txtC41.getName().equals(Diente)) {
                    Odontograma.txtC41.setBackground(Color.blue);
                }
                if (Odontograma.txtT41.getName().equals(Diente)) {
                    Odontograma.txtT41.setBackground(Color.blue);
                }
                if (Odontograma.txtL41.getName().equals(Diente)) {
                    Odontograma.txtL41.setBackground(Color.blue);
                }
                if (Odontograma.txtR41.getName().equals(Diente)) {
                    Odontograma.txtR41.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB41.getName().equals(Diente)) {
                    Odontograma.txtB41.setBackground(Color.white);
                }
                if (Odontograma.txtC41.getName().equals(Diente)) {
                    Odontograma.txtC41.setBackground(Color.white);
                }
                if (Odontograma.txtT41.getName().equals(Diente)) {
                    Odontograma.txtT41.setBackground(Color.white);
                }
                if (Odontograma.txtL41.getName().equals(Diente)) {
                    Odontograma.txtL41.setBackground(Color.white);
                }
                if (Odontograma.txtR41.getName().equals(Diente)) {
                    Odontograma.txtR41.setBackground(Color.white);
                }
                if (Odontograma.lb65.getName().equals(Diente)) {
                    Odontograma.txtB41.setVisible(v);
                    Odontograma.txtC41.setVisible(v);
                    Odontograma.txtT41.setVisible(v);
                    Odontograma.txtR41.setVisible(v);
                    Odontograma.txtL41.setVisible(v);
                    Odontograma.lb65.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB41.setVisible(false);
                Odontograma.txtC41.setVisible(false);
                Odontograma.txtT41.setVisible(false);
                Odontograma.txtR41.setVisible(false);
                Odontograma.txtL41.setVisible(false);
                Odontograma.lb65.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB41.setVisible(false);
                Odontograma.txtC41.setVisible(false);
                Odontograma.txtT41.setVisible(false);
                Odontograma.txtR41.setVisible(false);
                Odontograma.txtL41.setVisible(false);
                Odontograma.lb65.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB42.getName())
                || Diente.equals(Odontograma.txtC42.getName())
                || Diente.equals(Odontograma.txtT42.getName())
                || Diente.equals(Odontograma.txtR42.getName())
                || Diente.equals(Odontograma.txtL42.getName())
                || Diente.equals(Odontograma.lb85.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB42.getName().equals(Diente)) {
                    Odontograma.txtB42.setBackground(Color.red);
                }
                if (Odontograma.txtC42.getName().equals(Diente)) {
                    Odontograma.txtC42.setBackground(Color.red);
                }
                if (Odontograma.txtT42.getName().equals(Diente)) {
                    Odontograma.txtT42.setBackground(Color.red);
                }
                if (Odontograma.txtL42.getName().equals(Diente)) {
                    Odontograma.txtL42.setBackground(Color.red);
                }
                if (Odontograma.txtR42.getName().equals(Diente)) {
                    Odontograma.txtR42.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB42.getName().equals(Diente)) {
                    Odontograma.txtB42.setBackground(Color.blue);
                }
                if (Odontograma.txtC42.getName().equals(Diente)) {
                    Odontograma.txtC42.setBackground(Color.blue);
                }
                if (Odontograma.txtT42.getName().equals(Diente)) {
                    Odontograma.txtT42.setBackground(Color.blue);
                }
                if (Odontograma.txtL42.getName().equals(Diente)) {
                    Odontograma.txtL42.setBackground(Color.blue);
                }
                if (Odontograma.txtR42.getName().equals(Diente)) {
                    Odontograma.txtR42.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB42.getName().equals(Diente)) {
                    Odontograma.txtB42.setBackground(Color.white);
                }
                if (Odontograma.txtC42.getName().equals(Diente)) {
                    Odontograma.txtC42.setBackground(Color.white);
                }
                if (Odontograma.txtT42.getName().equals(Diente)) {
                    Odontograma.txtT42.setBackground(Color.white);
                }
                if (Odontograma.txtL42.getName().equals(Diente)) {
                    Odontograma.txtL42.setBackground(Color.white);
                }
                if (Odontograma.txtR42.getName().equals(Diente)) {
                    Odontograma.txtR42.setBackground(Color.white);
                }
                if (Odontograma.lb85.getName().equals(Diente)) {
                    Odontograma.txtB42.setVisible(v);
                    Odontograma.txtC42.setVisible(v);
                    Odontograma.txtT42.setVisible(v);
                    Odontograma.txtR42.setVisible(v);
                    Odontograma.txtL42.setVisible(v);
                    Odontograma.lb85.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB42.setVisible(false);
                Odontograma.txtC42.setVisible(false);
                Odontograma.txtT42.setVisible(false);
                Odontograma.txtR42.setVisible(false);
                Odontograma.txtL42.setVisible(false);
                Odontograma.lb85.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB42.setVisible(false);
                Odontograma.txtC42.setVisible(false);
                Odontograma.txtT42.setVisible(false);
                Odontograma.txtR42.setVisible(false);
                Odontograma.txtL42.setVisible(false);
                Odontograma.lb85.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB43.getName())
                || Diente.equals(Odontograma.txtC43.getName())
                || Diente.equals(Odontograma.txtT43.getName())
                || Diente.equals(Odontograma.txtR43.getName())
                || Diente.equals(Odontograma.txtL43.getName())
                || Diente.equals(Odontograma.lb84.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB43.getName().equals(Diente)) {
                    Odontograma.txtB43.setBackground(Color.red);
                }
                if (Odontograma.txtC43.getName().equals(Diente)) {
                    Odontograma.txtC43.setBackground(Color.red);
                }
                if (Odontograma.txtT43.getName().equals(Diente)) {
                    Odontograma.txtT43.setBackground(Color.red);
                }
                if (Odontograma.txtL43.getName().equals(Diente)) {
                    Odontograma.txtL43.setBackground(Color.red);
                }
                if (Odontograma.txtR43.getName().equals(Diente)) {
                    Odontograma.txtR43.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB43.getName().equals(Diente)) {
                    Odontograma.txtB43.setBackground(Color.blue);
                }
                if (Odontograma.txtC43.getName().equals(Diente)) {
                    Odontograma.txtC43.setBackground(Color.blue);
                }
                if (Odontograma.txtT43.getName().equals(Diente)) {
                    Odontograma.txtT43.setBackground(Color.blue);
                }
                if (Odontograma.txtL43.getName().equals(Diente)) {
                    Odontograma.txtL43.setBackground(Color.blue);
                }
                if (Odontograma.txtR43.getName().equals(Diente)) {
                    Odontograma.txtR43.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB43.getName().equals(Diente)) {
                    Odontograma.txtB43.setBackground(Color.white);
                }
                if (Odontograma.txtC43.getName().equals(Diente)) {
                    Odontograma.txtC43.setBackground(Color.white);
                }
                if (Odontograma.txtT43.getName().equals(Diente)) {
                    Odontograma.txtT43.setBackground(Color.white);
                }
                if (Odontograma.txtL43.getName().equals(Diente)) {
                    Odontograma.txtL43.setBackground(Color.white);
                }
                if (Odontograma.txtR43.getName().equals(Diente)) {
                    Odontograma.txtR43.setBackground(Color.white);
                }
                if (Odontograma.lb84.getName().equals(Diente)) {
                    Odontograma.txtB43.setVisible(v);
                    Odontograma.txtC43.setVisible(v);
                    Odontograma.txtT43.setVisible(v);
                    Odontograma.txtR43.setVisible(v);
                    Odontograma.txtL43.setVisible(v);
                    Odontograma.lb84.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB44.setVisible(false);
                Odontograma.txtC44.setVisible(false);
                Odontograma.txtT44.setVisible(false);
                Odontograma.txtR44.setVisible(false);
                Odontograma.txtL44.setVisible(false);
                Odontograma.lb84.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB44.setVisible(false);
                Odontograma.txtC44.setVisible(false);
                Odontograma.txtT44.setVisible(false);
                Odontograma.txtR44.setVisible(false);
                Odontograma.txtL44.setVisible(false);
                Odontograma.lb84.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB44.getName())
                || Diente.equals(Odontograma.txtC44.getName())
                || Diente.equals(Odontograma.txtT44.getName())
                || Diente.equals(Odontograma.txtR44.getName())
                || Diente.equals(Odontograma.txtL44.getName())
                || Diente.equals(Odontograma.lb83.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB44.getName().equals(Diente)) {
                    Odontograma.txtB44.setBackground(Color.red);
                }
                if (Odontograma.txtC44.getName().equals(Diente)) {
                    Odontograma.txtC44.setBackground(Color.red);
                }
                if (Odontograma.txtT44.getName().equals(Diente)) {
                    Odontograma.txtT44.setBackground(Color.red);
                }
                if (Odontograma.txtL44.getName().equals(Diente)) {
                    Odontograma.txtL44.setBackground(Color.red);
                }
                if (Odontograma.txtR44.getName().equals(Diente)) {
                    Odontograma.txtR44.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB44.getName().equals(Diente)) {
                    Odontograma.txtB44.setBackground(Color.blue);
                }
                if (Odontograma.txtC44.getName().equals(Diente)) {
                    Odontograma.txtC44.setBackground(Color.blue);
                }
                if (Odontograma.txtT44.getName().equals(Diente)) {
                    Odontograma.txtT44.setBackground(Color.blue);
                }
                if (Odontograma.txtL44.getName().equals(Diente)) {
                    Odontograma.txtL44.setBackground(Color.blue);
                }
                if (Odontograma.txtR44.getName().equals(Diente)) {
                    Odontograma.txtR44.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB44.getName().equals(Diente)) {
                    Odontograma.txtB44.setBackground(Color.white);
                }
                if (Odontograma.txtC44.getName().equals(Diente)) {
                    Odontograma.txtC44.setBackground(Color.white);
                }
                if (Odontograma.txtT44.getName().equals(Diente)) {
                    Odontograma.txtT44.setBackground(Color.white);
                }
                if (Odontograma.txtL44.getName().equals(Diente)) {
                    Odontograma.txtL44.setBackground(Color.white);
                }
                if (Odontograma.txtR44.getName().equals(Diente)) {
                    Odontograma.txtR44.setBackground(Color.white);
                }
                if (Odontograma.lb83.getName().equals(Diente)) {
                    Odontograma.txtB44.setVisible(v);
                    Odontograma.txtC44.setVisible(v);
                    Odontograma.txtT44.setVisible(v);
                    Odontograma.txtR44.setVisible(v);
                    Odontograma.txtL44.setVisible(v);
                    Odontograma.lb83.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB44.setVisible(false);
                Odontograma.txtC44.setVisible(false);
                Odontograma.txtT44.setVisible(false);
                Odontograma.txtR44.setVisible(false);
                Odontograma.txtL44.setVisible(false);
                Odontograma.lb83.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB44.setVisible(false);
                Odontograma.txtC44.setVisible(false);
                Odontograma.txtT44.setVisible(false);
                Odontograma.txtR44.setVisible(false);
                Odontograma.txtL44.setVisible(false);
                Odontograma.lb83.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB45.getName())
                || Diente.equals(Odontograma.txtC45.getName())
                || Diente.equals(Odontograma.txtT45.getName())
                || Diente.equals(Odontograma.txtR45.getName())
                || Diente.equals(Odontograma.txtL45.getName())
                || Diente.equals(Odontograma.lb82.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB45.getName().equals(Diente)) {
                    Odontograma.txtB45.setBackground(Color.red);
                }
                if (Odontograma.txtC45.getName().equals(Diente)) {
                    Odontograma.txtC45.setBackground(Color.red);
                }
                if (Odontograma.txtT45.getName().equals(Diente)) {
                    Odontograma.txtT45.setBackground(Color.red);
                }
                if (Odontograma.txtL45.getName().equals(Diente)) {
                    Odontograma.txtL45.setBackground(Color.red);
                }
                if (Odontograma.txtR45.getName().equals(Diente)) {
                    Odontograma.txtR45.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB45.getName().equals(Diente)) {
                    Odontograma.txtB45.setBackground(Color.blue);
                }
                if (Odontograma.txtC45.getName().equals(Diente)) {
                    Odontograma.txtC45.setBackground(Color.blue);
                }
                if (Odontograma.txtT45.getName().equals(Diente)) {
                    Odontograma.txtT45.setBackground(Color.blue);
                }
                if (Odontograma.txtL45.getName().equals(Diente)) {
                    Odontograma.txtL45.setBackground(Color.blue);
                }
                if (Odontograma.txtR45.getName().equals(Diente)) {
                    Odontograma.txtR45.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB45.getName().equals(Diente)) {
                    Odontograma.txtB45.setBackground(Color.white);
                }
                if (Odontograma.txtC45.getName().equals(Diente)) {
                    Odontograma.txtC45.setBackground(Color.white);
                }
                if (Odontograma.txtT45.getName().equals(Diente)) {
                    Odontograma.txtT45.setBackground(Color.white);
                }
                if (Odontograma.txtL45.getName().equals(Diente)) {
                    Odontograma.txtL45.setBackground(Color.white);
                }
                if (Odontograma.txtR45.getName().equals(Diente)) {
                    Odontograma.txtR45.setBackground(Color.white);
                }
                if (Odontograma.lb82.getName().equals(Diente)) {
                    Odontograma.txtB45.setVisible(v);
                    Odontograma.txtC45.setVisible(v);
                    Odontograma.txtT45.setVisible(v);
                    Odontograma.txtR45.setVisible(v);
                    Odontograma.txtL45.setVisible(v);
                    Odontograma.lb82.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB45.setVisible(false);
                Odontograma.txtC45.setVisible(false);
                Odontograma.txtT45.setVisible(false);
                Odontograma.txtR45.setVisible(false);
                Odontograma.txtL45.setVisible(false);
                Odontograma.lb82.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB45.setVisible(false);
                Odontograma.txtC45.setVisible(false);
                Odontograma.txtT45.setVisible(false);
                Odontograma.txtR45.setVisible(false);
                Odontograma.txtL45.setVisible(false);
                Odontograma.lb82.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB46.getName())
                || Diente.equals(Odontograma.txtC46.getName())
                || Diente.equals(Odontograma.txtT46.getName())
                || Diente.equals(Odontograma.txtR46.getName())
                || Diente.equals(Odontograma.txtL46.getName())
                || Diente.equals(Odontograma.lb81.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB46.getName().equals(Diente)) {
                    Odontograma.txtB46.setBackground(Color.red);
                }
                if (Odontograma.txtC46.getName().equals(Diente)) {
                    Odontograma.txtC46.setBackground(Color.red);
                }
                if (Odontograma.txtT46.getName().equals(Diente)) {
                    Odontograma.txtT46.setBackground(Color.red);
                }
                if (Odontograma.txtL46.getName().equals(Diente)) {
                    Odontograma.txtL46.setBackground(Color.red);
                }
                if (Odontograma.txtR46.getName().equals(Diente)) {
                    Odontograma.txtR46.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB46.getName().equals(Diente)) {
                    Odontograma.txtB46.setBackground(Color.blue);
                }
                if (Odontograma.txtC46.getName().equals(Diente)) {
                    Odontograma.txtC46.setBackground(Color.blue);
                }
                if (Odontograma.txtT46.getName().equals(Diente)) {
                    Odontograma.txtT46.setBackground(Color.blue);
                }
                if (Odontograma.txtL46.getName().equals(Diente)) {
                    Odontograma.txtL46.setBackground(Color.blue);
                }
                if (Odontograma.txtR46.getName().equals(Diente)) {
                    Odontograma.txtR46.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB46.getName().equals(Diente)) {
                    Odontograma.txtB46.setBackground(Color.white);
                }
                if (Odontograma.txtC46.getName().equals(Diente)) {
                    Odontograma.txtC46.setBackground(Color.white);
                }
                if (Odontograma.txtT46.getName().equals(Diente)) {
                    Odontograma.txtT46.setBackground(Color.white);
                }
                if (Odontograma.txtL46.getName().equals(Diente)) {
                    Odontograma.txtL46.setBackground(Color.white);
                }
                if (Odontograma.txtR46.getName().equals(Diente)) {
                    Odontograma.txtR46.setBackground(Color.white);
                }
                if (Odontograma.lb81.getName().equals(Diente)) {
                    Odontograma.txtB46.setVisible(v);
                    Odontograma.txtC46.setVisible(v);
                    Odontograma.txtT46.setVisible(v);
                    Odontograma.txtR46.setVisible(v);
                    Odontograma.txtL46.setVisible(v);
                    Odontograma.lb81.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB46.setVisible(false);
                Odontograma.txtC46.setVisible(false);
                Odontograma.txtT46.setVisible(false);
                Odontograma.txtR46.setVisible(false);
                Odontograma.txtL46.setVisible(false);
                Odontograma.lb81.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB46.setVisible(false);
                Odontograma.txtC46.setVisible(false);
                Odontograma.txtT46.setVisible(false);
                Odontograma.txtR46.setVisible(false);
                Odontograma.txtL46.setVisible(false);
                Odontograma.lb81.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB47.getName())
                || Diente.equals(Odontograma.txtC47.getName())
                || Diente.equals(Odontograma.txtT47.getName())
                || Diente.equals(Odontograma.txtR47.getName())
                || Diente.equals(Odontograma.txtL47.getName())
                || Diente.equals(Odontograma.lb71.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB47.getName().equals(Diente)) {
                    Odontograma.txtB47.setBackground(Color.red);
                }
                if (Odontograma.txtC47.getName().equals(Diente)) {
                    Odontograma.txtC47.setBackground(Color.red);
                }
                if (Odontograma.txtT47.getName().equals(Diente)) {
                    Odontograma.txtT47.setBackground(Color.red);
                }
                if (Odontograma.txtL47.getName().equals(Diente)) {
                    Odontograma.txtL47.setBackground(Color.red);
                }
                if (Odontograma.txtR47.getName().equals(Diente)) {
                    Odontograma.txtR47.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB47.getName().equals(Diente)) {
                    Odontograma.txtB47.setBackground(Color.blue);
                }
                if (Odontograma.txtC47.getName().equals(Diente)) {
                    Odontograma.txtC47.setBackground(Color.blue);
                }
                if (Odontograma.txtT47.getName().equals(Diente)) {
                    Odontograma.txtT47.setBackground(Color.blue);
                }
                if (Odontograma.txtL47.getName().equals(Diente)) {
                    Odontograma.txtL47.setBackground(Color.blue);
                }
                if (Odontograma.txtR47.getName().equals(Diente)) {
                    Odontograma.txtR47.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB47.getName().equals(Diente)) {
                    Odontograma.txtB47.setBackground(Color.white);
                }
                if (Odontograma.txtC47.getName().equals(Diente)) {
                    Odontograma.txtC47.setBackground(Color.white);
                }
                if (Odontograma.txtT47.getName().equals(Diente)) {
                    Odontograma.txtT47.setBackground(Color.white);
                }
                if (Odontograma.txtL47.getName().equals(Diente)) {
                    Odontograma.txtL47.setBackground(Color.white);
                }
                if (Odontograma.txtR47.getName().equals(Diente)) {
                    Odontograma.txtR47.setBackground(Color.white);
                }
                if (Odontograma.lb71.getName().equals(Diente)) {
                    Odontograma.txtB47.setVisible(v);
                    Odontograma.txtC47.setVisible(v);
                    Odontograma.txtT47.setVisible(v);
                    Odontograma.txtR47.setVisible(v);
                    Odontograma.txtL47.setVisible(v);
                    Odontograma.lb71.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB47.setVisible(false);
                Odontograma.txtC47.setVisible(false);
                Odontograma.txtT47.setVisible(false);
                Odontograma.txtR47.setVisible(false);
                Odontograma.txtL47.setVisible(false);
                Odontograma.lb71.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB47.setVisible(false);
                Odontograma.txtC47.setVisible(false);
                Odontograma.txtT47.setVisible(false);
                Odontograma.txtR47.setVisible(false);
                Odontograma.txtL47.setVisible(false);
                Odontograma.lb71.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB48.getName())
                || Diente.equals(Odontograma.txtC48.getName())
                || Diente.equals(Odontograma.txtT48.getName())
                || Diente.equals(Odontograma.txtR48.getName())
                || Diente.equals(Odontograma.txtL48.getName())
                || Diente.equals(Odontograma.lb72.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB48.getName().equals(Diente)) {
                    Odontograma.txtB48.setBackground(Color.red);
                }
                if (Odontograma.txtC48.getName().equals(Diente)) {
                    Odontograma.txtC48.setBackground(Color.red);
                }
                if (Odontograma.txtT48.getName().equals(Diente)) {
                    Odontograma.txtT48.setBackground(Color.red);
                }
                if (Odontograma.txtL48.getName().equals(Diente)) {
                    Odontograma.txtL48.setBackground(Color.red);
                }
                if (Odontograma.txtR48.getName().equals(Diente)) {
                    Odontograma.txtR48.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB48.getName().equals(Diente)) {
                    Odontograma.txtB48.setBackground(Color.blue);
                }
                if (Odontograma.txtC48.getName().equals(Diente)) {
                    Odontograma.txtC48.setBackground(Color.blue);
                }
                if (Odontograma.txtT48.getName().equals(Diente)) {
                    Odontograma.txtT48.setBackground(Color.blue);
                }
                if (Odontograma.txtL48.getName().equals(Diente)) {
                    Odontograma.txtL48.setBackground(Color.blue);
                }
                if (Odontograma.txtR48.getName().equals(Diente)) {
                    Odontograma.txtR48.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB48.getName().equals(Diente)) {
                    Odontograma.txtB48.setBackground(Color.white);
                }
                if (Odontograma.txtC48.getName().equals(Diente)) {
                    Odontograma.txtC48.setBackground(Color.white);
                }
                if (Odontograma.txtT48.getName().equals(Diente)) {
                    Odontograma.txtT48.setBackground(Color.white);
                }
                if (Odontograma.txtL48.getName().equals(Diente)) {
                    Odontograma.txtL48.setBackground(Color.white);
                }
                if (Odontograma.txtR48.getName().equals(Diente)) {
                    Odontograma.txtR48.setBackground(Color.white);
                }
                if (Odontograma.lb72.getName().equals(Diente)) {
                    Odontograma.txtB48.setVisible(v);
                    Odontograma.txtC48.setVisible(v);
                    Odontograma.txtT48.setVisible(v);
                    Odontograma.txtR48.setVisible(v);
                    Odontograma.txtL48.setVisible(v);
                    Odontograma.lb72.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB48.setVisible(false);
                Odontograma.txtC48.setVisible(false);
                Odontograma.txtT48.setVisible(false);
                Odontograma.txtR48.setVisible(false);
                Odontograma.txtL48.setVisible(false);
                Odontograma.lb72.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB48.setVisible(false);
                Odontograma.txtC48.setVisible(false);
                Odontograma.txtT48.setVisible(false);
                Odontograma.txtR48.setVisible(false);
                Odontograma.txtL48.setVisible(false);
                Odontograma.lb72.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB49.getName())
                || Diente.equals(Odontograma.txtC49.getName())
                || Diente.equals(Odontograma.txtT49.getName())
                || Diente.equals(Odontograma.txtR49.getName())
                || Diente.equals(Odontograma.txtL49.getName())
                || Diente.equals(Odontograma.lb73.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB49.getName().equals(Diente)) {
                    Odontograma.txtB49.setBackground(Color.red);
                }
                if (Odontograma.txtC49.getName().equals(Diente)) {
                    Odontograma.txtC49.setBackground(Color.red);
                }
                if (Odontograma.txtT49.getName().equals(Diente)) {
                    Odontograma.txtT49.setBackground(Color.red);
                }
                if (Odontograma.txtL49.getName().equals(Diente)) {
                    Odontograma.txtL49.setBackground(Color.red);
                }
                if (Odontograma.txtR49.getName().equals(Diente)) {
                    Odontograma.txtR49.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB49.getName().equals(Diente)) {
                    Odontograma.txtB49.setBackground(Color.blue);
                }
                if (Odontograma.txtC49.getName().equals(Diente)) {
                    Odontograma.txtC49.setBackground(Color.blue);
                }
                if (Odontograma.txtT49.getName().equals(Diente)) {
                    Odontograma.txtT49.setBackground(Color.blue);
                }
                if (Odontograma.txtL49.getName().equals(Diente)) {
                    Odontograma.txtL49.setBackground(Color.blue);
                }
                if (Odontograma.txtR49.getName().equals(Diente)) {
                    Odontograma.txtR49.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB49.getName().equals(Diente)) {
                    Odontograma.txtB49.setBackground(Color.white);
                }
                if (Odontograma.txtC49.getName().equals(Diente)) {
                    Odontograma.txtC49.setBackground(Color.white);
                }
                if (Odontograma.txtT49.getName().equals(Diente)) {
                    Odontograma.txtT49.setBackground(Color.white);
                }
                if (Odontograma.txtL49.getName().equals(Diente)) {
                    Odontograma.txtL49.setBackground(Color.white);
                }
                if (Odontograma.txtR49.getName().equals(Diente)) {
                    Odontograma.txtR49.setBackground(Color.white);
                }
                if (Odontograma.lb73.getName().equals(Diente)) {
                    Odontograma.txtB49.setVisible(v);
                    Odontograma.txtC49.setVisible(v);
                    Odontograma.txtT49.setVisible(v);
                    Odontograma.txtR49.setVisible(v);
                    Odontograma.txtL49.setVisible(v);
                    Odontograma.lb73.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB49.setVisible(false);
                Odontograma.txtC49.setVisible(false);
                Odontograma.txtT49.setVisible(false);
                Odontograma.txtR49.setVisible(false);
                Odontograma.txtL49.setVisible(false);
                Odontograma.lb73.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB49.setVisible(false);
                Odontograma.txtC49.setVisible(false);
                Odontograma.txtT49.setVisible(false);
                Odontograma.txtR49.setVisible(false);
                Odontograma.txtL49.setVisible(false);
                Odontograma.lb73.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB50.getName())
                || Diente.equals(Odontograma.txtC50.getName())
                || Diente.equals(Odontograma.txtT50.getName())
                || Diente.equals(Odontograma.txtR50.getName())
                || Diente.equals(Odontograma.txtL50.getName())
                || Diente.equals(Odontograma.lb74.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB50.getName().equals(Diente)) {
                    Odontograma.txtB50.setBackground(Color.red);
                }
                if (Odontograma.txtC50.getName().equals(Diente)) {
                    Odontograma.txtC50.setBackground(Color.red);
                }
                if (Odontograma.txtT50.getName().equals(Diente)) {
                    Odontograma.txtT50.setBackground(Color.red);
                }
                if (Odontograma.txtL50.getName().equals(Diente)) {
                    Odontograma.txtL50.setBackground(Color.red);
                }
                if (Odontograma.txtR50.getName().equals(Diente)) {
                    Odontograma.txtR50.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB50.getName().equals(Diente)) {
                    Odontograma.txtB50.setBackground(Color.blue);
                }
                if (Odontograma.txtC50.getName().equals(Diente)) {
                    Odontograma.txtC50.setBackground(Color.blue);
                }
                if (Odontograma.txtT50.getName().equals(Diente)) {
                    Odontograma.txtT50.setBackground(Color.blue);
                }
                if (Odontograma.txtL50.getName().equals(Diente)) {
                    Odontograma.txtL50.setBackground(Color.blue);
                }
                if (Odontograma.txtR50.getName().equals(Diente)) {
                    Odontograma.txtR50.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB50.getName().equals(Diente)) {
                    Odontograma.txtB50.setBackground(Color.white);
                }
                if (Odontograma.txtC50.getName().equals(Diente)) {
                    Odontograma.txtC50.setBackground(Color.white);
                }
                if (Odontograma.txtT50.getName().equals(Diente)) {
                    Odontograma.txtT50.setBackground(Color.white);
                }
                if (Odontograma.txtL50.getName().equals(Diente)) {
                    Odontograma.txtL50.setBackground(Color.white);
                }
                if (Odontograma.txtR50.getName().equals(Diente)) {
                    Odontograma.txtR50.setBackground(Color.white);
                }
                if (Odontograma.lb74.getName().equals(Diente)) {
                    Odontograma.txtB50.setVisible(v);
                    Odontograma.txtC50.setVisible(v);
                    Odontograma.txtT50.setVisible(v);
                    Odontograma.txtR50.setVisible(v);
                    Odontograma.txtL50.setVisible(v);
                    Odontograma.lb74.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB50.setVisible(false);
                Odontograma.txtC50.setVisible(false);
                Odontograma.txtT50.setVisible(false);
                Odontograma.txtR50.setVisible(false);
                Odontograma.txtL50.setVisible(false);
                Odontograma.lb74.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB50.setVisible(false);
                Odontograma.txtC50.setVisible(false);
                Odontograma.txtT50.setVisible(false);
                Odontograma.txtR50.setVisible(false);
                Odontograma.txtL50.setVisible(false);
                Odontograma.lb74.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

        if (Diente.equals(Odontograma.txtB51.getName())
                || Diente.equals(Odontograma.txtC51.getName())
                || Diente.equals(Odontograma.txtT51.getName())
                || Diente.equals(Odontograma.txtR51.getName())
                || Diente.equals(Odontograma.txtL51.getName())
                || Diente.equals(Odontograma.lb75.getName())) {
            if (Op.equals("CARIE")) {
                if (Odontograma.txtB5.getName().equals(Diente)) {
                    Odontograma.txtB51.setBackground(Color.red);
                }
                if (Odontograma.txtC51.getName().equals(Diente)) {
                    Odontograma.txtC51.setBackground(Color.red);
                }
                if (Odontograma.txtT51.getName().equals(Diente)) {
                    Odontograma.txtT51.setBackground(Color.red);
                }
                if (Odontograma.txtL51.getName().equals(Diente)) {
                    Odontograma.txtL51.setBackground(Color.red);
                }
                if (Odontograma.txtR51.getName().equals(Diente)) {
                    Odontograma.txtR51.setBackground(Color.red);
                }

            }
            if (Op.equals("CURADO")) {
                if (Odontograma.txtB51.getName().equals(Diente)) {
                    Odontograma.txtB51.setBackground(Color.blue);
                }
                if (Odontograma.txtC51.getName().equals(Diente)) {
                    Odontograma.txtC51.setBackground(Color.blue);
                }
                if (Odontograma.txtT51.getName().equals(Diente)) {
                    Odontograma.txtT51.setBackground(Color.blue);
                }
                if (Odontograma.txtL51.getName().equals(Diente)) {
                    Odontograma.txtL51.setBackground(Color.blue);
                }
                if (Odontograma.txtR51.getName().equals(Diente)) {
                    Odontograma.txtR51.setBackground(Color.blue);
                }
            }
            if (Op.equals("NORMAL")) {
                if (Odontograma.txtB51.getName().equals(Diente)) {
                    Odontograma.txtB51.setBackground(Color.white);
                }
                if (Odontograma.txtC51.getName().equals(Diente)) {
                    Odontograma.txtC51.setBackground(Color.white);
                }
                if (Odontograma.txtT51.getName().equals(Diente)) {
                    Odontograma.txtT51.setBackground(Color.white);
                }
                if (Odontograma.txtL51.getName().equals(Diente)) {
                    Odontograma.txtL51.setBackground(Color.white);
                }
                if (Odontograma.txtR51.getName().equals(Diente)) {
                    Odontograma.txtR51.setBackground(Color.white);
                }
                if (Odontograma.lb75.getName().equals(Diente)) {
                    Odontograma.txtB51.setVisible(v);
                    Odontograma.txtC51.setVisible(v);
                    Odontograma.txtT51.setVisible(v);
                    Odontograma.txtR51.setVisible(v);
                    Odontograma.txtL51.setVisible(v);
                    Odontograma.lb75.setIcon(new ImageIcon(getClass().getResource("")));
                }
            }
            if (Op.equals("EXTRAIDO")) {
                Odontograma.txtB51.setVisible(false);
                Odontograma.txtC51.setVisible(false);
                Odontograma.txtT51.setVisible(false);
                Odontograma.txtR51.setVisible(false);
                Odontograma.txtL51.setVisible(false);
                Odontograma.lb75.setIcon(new ImageIcon(getClass().getResource(Extraido)));
            }
            if (Op.equals("EXTRAER")) {
                Odontograma.txtB51.setVisible(false);
                Odontograma.txtC51.setVisible(false);
                Odontograma.txtT51.setVisible(false);
                Odontograma.txtR51.setVisible(false);
                Odontograma.txtL51.setVisible(false);
                Odontograma.lb75.setIcon(new ImageIcon(getClass().getResource(Extraer)));

            }
        }

    }
}
