/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

import CapaDiseño.Odontograma;
import CapaDiseño.PanelEndodoncia;
import CapaDiseño.PanelExodoncia;
import CapaDiseño.PanelLimpieza;
import CapaDiseño.Tratamientos;
import CapaNegocio.COdontograma;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vladimir
 */
public class EHistorial {

    public static double getCepillaje() {
        return Cepillaje;
    }

    public static void setCepillaje(double Cepillaje) {
        EHistorial.Cepillaje = Cepillaje;
    }

    public static double getCepilladoProfilaxico() {
        return CepilladoProfilaxico;
    }

    public static void setCepilladoProfilaxico(double CepilladoProfilaxico) {
        EHistorial.CepilladoProfilaxico = CepilladoProfilaxico;
    }

    public static double getFluorizacion() {
        return Fluorizacion;
    }

    public static void setFluorizacion(double Fluorizacion) {
        EHistorial.Fluorizacion = Fluorizacion;
    }

    public static double getBanqueamiento() {
        return Banqueamiento;
    }

    public static void setBanqueamiento(double Banqueamiento) {
        EHistorial.Banqueamiento = Banqueamiento;
    }

    public static double getPieza1() {
        return Pieza1;
    }

    public static void setPieza1(double Pieza1) {
        EHistorial.Pieza1 = Pieza1;
    }

    public static double getPieza2() {
        return Pieza2;
    }

    public static void setPieza2(double Pieza2) {
        EHistorial.Pieza2 = Pieza2;
    }

    public static double getPieza3() {
        return Pieza3;
    }

    public static void setPieza3(double Pieza3) {
        EHistorial.Pieza3 = Pieza3;
    }

    public static double getCarieSimple() {
        return CarieSimple;
    }

    public static void setCarieSimple(double CarieSimple) {
        EHistorial.CarieSimple = CarieSimple;
    }

    public static double getCarieCompuesta() {
        return CarieCompuesta;
    }

    public static void setCarieCompuesta(double CarieCompuesta) {
        EHistorial.CarieCompuesta = CarieCompuesta;
    }

    public static double getCarieRecompuesta() {
        return CarieRecompuesta;
    }

    public static void setCarieRecompuesta(double CarieRecompuesta) {
        EHistorial.CarieRecompuesta = CarieRecompuesta;
    }

    public static double getEndoMultiRadicular() {
        return EndoMultiRadicular;
    }

    public static void setEndoMultiRadicular(double EndoMultiRadicular) {
        EHistorial.EndoMultiRadicular = EndoMultiRadicular;
    }

    public static double getEndoUniRadicular() {
        return EndoUniRadicular;
    }

    public static void setEndoUniRadicular(double EndoUniRadicular) {
        EHistorial.EndoUniRadicular = EndoUniRadicular;
    }

    public static double getBioPulpectomia() {
        return BioPulpectomia;
    }

    public static void setBioPulpectomia(double BioPulpectomia) {
        EHistorial.BioPulpectomia = BioPulpectomia;
    }

    public static double getNecroPulpectomia() {
        return NecroPulpectomia;
    }

    public static void setNecroPulpectomia(double NecroPulpectomia) {
        EHistorial.NecroPulpectomia = NecroPulpectomia;
    }

    public static double getOrtodonciaI() {
        return OrtodonciaI;
    }

    public static void setOrtodonciaI(double OrtodonciaI) {
        EHistorial.OrtodonciaI = OrtodonciaI;
    }

    public static double getOrtodonciaII() {
        return OrtodonciaII;
    }

    public static void setOrtodonciaII(double OrtodonciaII) {
        EHistorial.OrtodonciaII = OrtodonciaII;
    }

    public static double getRecementacion() {
        return Recementacion;
    }

    public static void setRecementacion(double Recementacion) {
        EHistorial.Recementacion = Recementacion;
    }

    public static double getSellantes() {
        return Sellantes;
    }

    public static void setSellantes(double Sellantes) {
        EHistorial.Sellantes = Sellantes;
    }

    public static double getBarniz() {
        return Barniz;
    }

    public static void setBarniz(double Barniz) {
        EHistorial.Barniz = Barniz;
    }

    public static double getPieza4() {
        return Pieza4;
    }

    public static void setPieza4(double Pieza4) {
        EHistorial.Pieza4 = Pieza4;
    }

    public static double getCariostatico() {
        return Cariostatico;
    }

    public static void setCariostatico(double Cariostatico) {
        EHistorial.Cariostatico = Cariostatico;
    }

    public static double getFibraVidrio() {
        return FibraVidrio;
    }

    public static void setFibraVidrio(double FibraVidrio) {
        EHistorial.FibraVidrio = FibraVidrio;
    }

    public static double getRaiz() {
        return Raiz;
    }

    public static void setRaiz(double Raiz) {
        EHistorial.Raiz = Raiz;
    }

    public static double getPosicionNormal() {
        return posicionNormal;
    }

    public static void setPosicionNormal(double posicionNormal) {
        EHistorial.posicionNormal = posicionNormal;
    }

    public static double getMolarRecta() {
        return MolarRecta;
    }

    public static void setMolarRecta(double MolarRecta) {
        EHistorial.MolarRecta = MolarRecta;
    }

    public static double getMolarQuirurgica() {
        return MolarQuirurgica;
    }

    public static void setMolarQuirurgica(double MolarQuirurgica) {
        EHistorial.MolarQuirurgica = MolarQuirurgica;
    }

    public static double getMetal() {
        return Metal;
    }

    public static void setMetal(double Metal) {
        EHistorial.Metal = Metal;
    }

    public static double getIvocron() {
        return Ivocron;
    }

    public static void setIvocron(double Ivocron) {
        EHistorial.Ivocron = Ivocron;
    }

    public static double getBelga() {
        return Belga;
    }

    public static void setBelga(double Belga) {
        EHistorial.Belga = Belga;
    }

    public static double getPorcelana() {
        return Porcelana;
    }

    public static void setPorcelana(double Porcelana) {
        EHistorial.Porcelana = Porcelana;
    }

    public static double getCarrillas() {
        return Carrillas;
    }

    public static void setCarrillas(double Carrillas) {
        EHistorial.Carrillas = Carrillas;
    }

    public static double getPuente1() {
        return Puente1;
    }

    public static void setPuente1(double Puente1) {
        EHistorial.Puente1 = Puente1;
    }

    public static double getPieza5() {
        return Pieza5;
    }

    public static void setPieza5(double Pieza5) {
        EHistorial.Pieza5 = Pieza5;
    }

    public static double getPuente2() {
        return Puente2;
    }

    public static void setPuente2(double Puente2) {
        EHistorial.Puente2 = Puente2;
    }

    public static double getPieza6() {
        return Pieza6;
    }

    public static void setPieza6(double Pieza6) {
        EHistorial.Pieza6 = Pieza6;
    }

    public static double getBaseMetalica() {
        return BaseMetalica;
    }

    public static void setBaseMetalica(double BaseMetalica) {
        EHistorial.BaseMetalica = BaseMetalica;
    }

    public static double getAcrilico() {
        return Acrilico;
    }

    public static void setAcrilico(double Acrilico) {
        EHistorial.Acrilico = Acrilico;
    }

    public static double getProtesisTotal() {
        return ProtesisTotal;
    }

    public static void setProtesisTotal(double ProtesisTotal) {
        EHistorial.ProtesisTotal = ProtesisTotal;
    }

    public static String getDientes() {
        return Dientes;
    }

    public static void setDientes(String Dientes) {
        EHistorial.Dientes = Dientes;
    }

    public static String getMasInformacion() {
        return MasInformacion;
    }

    public static void setMasInformacion(String MasInformacion) {
        EHistorial.MasInformacion = MasInformacion;
    }

    public static String getFecha() {
        return Fecha;
    }

    public static void setFecha(String Fecha) {
        EHistorial.Fecha = Fecha;
    }

    public static int getNroHistorial() {
        return NroHistorial;
    }

    public static void setNroHistorial(int NroHistorial) {
        EHistorial.NroHistorial = NroHistorial;
    }

    public static String getTratamiento() {
        return Tratamiento;
    }

    public static void setTratamiento(String Tratamiento) {
        EHistorial.Tratamiento = Tratamiento;
    }

    public static double getPrecioPactado() {
        return PrecioPactado;
    }

    public static void setPrecioPactado(double PrecioPactado) {
        EHistorial.PrecioPactado = PrecioPactado;
    }

    public static String getHora() {
        return Hora;
    }

    public static void setHora(String Hora) {
        EHistorial.Hora = Hora;
    }

    public static int getIdCrearHistorial() {
        return IdCrearHistorial;
    }

    public static void setIdCrearHistorial(int IdCrearHistorial) {
        EHistorial.IdCrearHistorial = IdCrearHistorial;
    }
    private static double Cepillaje = 0;
    private static double CepilladoProfilaxico = 0;
    private static double Fluorizacion = 0;
    private static double Banqueamiento = 0;
    private static double Pieza1 = 0;
    private static double Pieza2 = 0;
    private static double Pieza3 = 0;
    private static double CarieSimple = 0;
    private static double CarieCompuesta = 0;
    private static double CarieRecompuesta = 0;

    private static double EndoMultiRadicular = 0;
    private static double EndoUniRadicular = 0;
    private static double BioPulpectomia = 0;
    private static double NecroPulpectomia = 0;
    private static double OrtodonciaI = 0;
    private static double OrtodonciaII = 0;
    private static double Recementacion = 0;
    private static double Sellantes = 0;
    private static double Barniz = 0;
    private static double Pieza4 = 0;
    private static double Cariostatico = 0;
    private static double FibraVidrio = 0;

    private static double Raiz = 0;
    private static double posicionNormal = 0;
    private static double MolarRecta = 0;
    private static double MolarQuirurgica = 0;
    private static double Metal = 0;
    private static double Ivocron = 0;
    private static double Belga = 0;
    private static double Porcelana = 0;
    private static double Carrillas = 0;
    private static double Puente1 = 0;
    private static double Pieza5 = 0;
    private static double Puente2 = 0;
    private static double Pieza6 = 0;
    private static double BaseMetalica = 0;
    private static double Acrilico = 0;
    private static double ProtesisTotal = 0;
    private static String Dientes = "";
    private static String MasInformacion = "";
    private static double PrecioPactado = 0;

    private static String Hora = "";
    private static String Fecha = "";
    private static int NroHistorial = 0;
    private static String Tratamiento = "";

    private static int IdCrearHistorial = 0;

    public static void RecuperarPreciosCliente(ResultSet rs) throws SQLException {
        Color cyan = Color.cyan;
        Color orange = Color.orange;
        Color white = Color.white;
        int[] Tratamiento = new int[39];
        while (rs.next()) {
            Tratamiento[0] = rs.getInt(1);
            Tratamiento[1] = rs.getInt(2);
            Tratamiento[2] = rs.getInt(3);
            Tratamiento[3] = rs.getInt(4);
            Tratamiento[4] = rs.getInt(5);
            Tratamiento[5] = rs.getInt(6);
            Tratamiento[6] = rs.getInt(7);
            Tratamiento[7] = rs.getInt(8);
            Tratamiento[8] = rs.getInt(9);
            Tratamiento[9] = rs.getInt(10);

            Tratamiento[10] = rs.getInt(11);
            Tratamiento[11] = rs.getInt(12);
            Tratamiento[12] = rs.getInt(13);
            Tratamiento[13] = rs.getInt(14);
            Tratamiento[14] = rs.getInt(15);
            Tratamiento[15] = rs.getInt(16);
            Tratamiento[16] = rs.getInt(17);
            Tratamiento[17] = rs.getInt(18);
            Tratamiento[18] = rs.getInt(19);
            Tratamiento[19] = rs.getInt(20);
            Tratamiento[20] = rs.getInt(21);
            Tratamiento[21] = rs.getInt(22);

            Tratamiento[22] = rs.getInt(23);
            Tratamiento[23] = rs.getInt(24);
            Tratamiento[24] = rs.getInt(25);
            Tratamiento[25] = rs.getInt(26);
            Tratamiento[26] = rs.getInt(27);
            Tratamiento[27] = rs.getInt(28);
            Tratamiento[28] = rs.getInt(29);
            Tratamiento[29] = rs.getInt(30);
            Tratamiento[30] = rs.getInt(31);
            Tratamiento[31] = rs.getInt(32);
            Tratamiento[32] = rs.getInt(33);
            Tratamiento[33] = rs.getInt(34);
            Tratamiento[34] = rs.getInt(35);
            Tratamiento[35] = rs.getInt(36);
            Tratamiento[36] = rs.getInt(37);
            Tratamiento[37] = rs.getInt(38);
            String diente = rs.getString(39);
            //recupera el diente para luego poder establecer mas dientes sobre este
            Odontograma.Dientes = diente;
            if (!diente.equals("")) {
                String[] d = diente.split(";");
                COdontograma dientes = new COdontograma();
                dientes.FuncionMostrar(d);
            }

            Odontograma.txtMasInformacion.setText(rs.getString(40));
            Tratamiento[38] = rs.getInt(41);
        }
        if (Tratamiento[0] == Integer.parseInt(PanelLimpieza.txtPrecioNormal1.getText())) {
            PanelLimpieza.rbOpcion1.setSelected(true);
            PanelLimpieza.txtPrecioParcial1.setText("0");
            PanelLimpieza.txtPrecioParcial1.setBackground(white);
            PanelLimpieza.txtPrecioNormal1.setBackground(cyan);
        } else {
            if (Tratamiento[0] != 0) {
                PanelLimpieza.txtPrecioParcial1.setText(String.valueOf(Tratamiento[0]));
                PanelLimpieza.txtPrecioNormal1.setBackground(white);
                PanelLimpieza.txtPrecioParcial1.setBackground(orange);
            } else {
                PanelLimpieza.txtPrecioParcial1.setText("0");
                PanelLimpieza.txtPrecioParcial1.setBackground(white);
                PanelLimpieza.txtPrecioNormal1.setBackground(white);
            }
        }
        if (Tratamiento[1] == Integer.parseInt(PanelLimpieza.txtPrecioNormal2.getText())) {
            PanelLimpieza.rbOpcion2.setSelected(true);
            PanelLimpieza.txtPrecioParcial2.setText("0");
            PanelLimpieza.txtPrecioParcial2.setBackground(white);
            PanelLimpieza.txtPrecioNormal2.setBackground(cyan);
        } else {
            if (Tratamiento[1] != 0) {
                PanelLimpieza.txtPrecioParcial2.setText(String.valueOf(Tratamiento[1]));
                PanelLimpieza.txtPrecioNormal2.setBackground(white);
                PanelLimpieza.txtPrecioParcial2.setBackground(orange);
            } else {
                PanelLimpieza.txtPrecioParcial2.setText("0");
                PanelLimpieza.txtPrecioParcial2.setBackground(white);
                PanelLimpieza.txtPrecioNormal2.setBackground(white);
            }
        }
        if (Tratamiento[2] == Integer.parseInt(PanelLimpieza.txtPrecioNormal3.getText())) {
            PanelLimpieza.rbOpcion3.setSelected(true);
            PanelLimpieza.txtPrecioParcial3.setText("0");
            PanelLimpieza.txtPrecioParcial3.setBackground(white);
            PanelLimpieza.txtPrecioNormal3.setBackground(cyan);
        } else {
            if (Tratamiento[2] != 0) {
                PanelLimpieza.txtPrecioParcial3.setText(String.valueOf(Tratamiento[2]));
                PanelLimpieza.txtPrecioNormal3.setBackground(white);
                PanelLimpieza.txtPrecioParcial3.setBackground(orange);
            } else {
                PanelLimpieza.txtPrecioParcial3.setText("0");
                PanelLimpieza.txtPrecioParcial3.setBackground(white);
                PanelLimpieza.txtPrecioNormal3.setBackground(white);
            }
        }
        if (Tratamiento[3] == Integer.parseInt(PanelLimpieza.txtPrecioNormal4.getText())) {
            PanelLimpieza.rbOpcion4.setSelected(true);
            PanelLimpieza.txtPrecioParcial4.setText("0");
            PanelLimpieza.txtPrecioParcial4.setBackground(white);
            PanelLimpieza.txtPrecioNormal4.setBackground(cyan);
        } else {
            if (Tratamiento[3] != 0) {
                PanelLimpieza.txtPrecioParcial4.setText(String.valueOf(Tratamiento[3]));
                PanelLimpieza.txtPrecioNormal4.setBackground(white);
                PanelLimpieza.txtPrecioParcial4.setBackground(orange);
            } else {
                PanelLimpieza.txtPrecioParcial4.setText("0");
                PanelLimpieza.txtPrecioParcial4.setBackground(white);
                PanelLimpieza.txtPrecioNormal4.setBackground(white);
            }
        }
        //********************************carie simple
        if (Tratamiento[5] > 0) {
            PanelLimpieza.txtPrecioNormal5.setText(String.valueOf(Tratamiento[4]));
            PanelLimpieza.txtPieza1.setText(String.valueOf(Tratamiento[5]));
            PanelLimpieza.txtPrecioTotal1.setText(String.valueOf(Tratamiento[5] * Tratamiento[4]));
            if (Double.parseDouble(PanelLimpieza.txtPrecioTotal1.getText()) > 0) {
                PanelLimpieza.txtPrecioTotal1.setBackground(orange);
            } else {
                PanelLimpieza.txtPrecioTotal1.setText("0");
                PanelLimpieza.txtPrecioTotal1.setBackground(white);
            }
        } else {
            PanelLimpieza.txtPrecioTotal1.setText("0");
            PanelLimpieza.txtPrecioTotal1.setBackground(white);
        }
        //*********************************carie compuesta
        if (Tratamiento[7] > 0) {
            PanelLimpieza.txtPrecioNormal6.setText(String.valueOf(Tratamiento[6]));
            PanelLimpieza.txtPieza2.setText(String.valueOf(Tratamiento[7]));
            PanelLimpieza.txtPrecioTotal2.setText(String.valueOf(Tratamiento[6] * Tratamiento[7]));
            if (Double.parseDouble(PanelLimpieza.txtPrecioTotal2.getText()) > 0) {
                PanelLimpieza.txtPrecioTotal2.setBackground(orange);
            } else {
                PanelLimpieza.txtPrecioTotal2.setText("0");
                PanelLimpieza.txtPrecioTotal2.setBackground(white);
            }
        } else {
            PanelLimpieza.txtPrecioTotal2.setText("0");
            PanelLimpieza.txtPrecioTotal2.setBackground(white);
        }
        //************************************carie recompuesta
        if (Tratamiento[9] > 0) {
            PanelLimpieza.txtPrecioNormal7.setText(String.valueOf(Tratamiento[8]));
            PanelLimpieza.txtPieza3.setText(String.valueOf(Tratamiento[9]));
            PanelLimpieza.txtPrecioTotal3.setText(String.valueOf(Tratamiento[8] * Tratamiento[9]));
            if (Double.parseDouble(PanelLimpieza.txtPrecioTotal3.getText()) > 0) {
                PanelLimpieza.txtPrecioTotal3.setBackground(orange);
            } else {
                PanelLimpieza.txtPrecioTotal3.setText("0");
                PanelLimpieza.txtPrecioTotal3.setBackground(white);
            }
        } else {
            PanelLimpieza.txtPrecioTotal3.setText("0");
            PanelLimpieza.txtPrecioTotal3.setBackground(white);
        }

        if (Tratamiento[10] == Integer.parseInt(PanelEndodoncia.txtPrecioNormal1.getText())) {
            PanelEndodoncia.rbOpcion1.setSelected(true);
            PanelEndodoncia.txtPrecioParcial1.setText("0");
            PanelEndodoncia.txtPrecioParcial1.setBackground(white);
            PanelEndodoncia.txtPrecioNormal1.setBackground(cyan);
        } else {
            if (Tratamiento[10] != 0) {
                PanelEndodoncia.txtPrecioParcial1.setText(String.valueOf(Tratamiento[10]));
                PanelEndodoncia.txtPrecioNormal1.setBackground(white);
                PanelEndodoncia.txtPrecioParcial1.setBackground(orange);
            } else {
                PanelEndodoncia.txtPrecioParcial1.setText("0");
                PanelEndodoncia.txtPrecioParcial1.setBackground(white);
                PanelEndodoncia.txtPrecioNormal1.setBackground(white);
            }
        }
        if (Tratamiento[11] == Integer.parseInt(PanelEndodoncia.txtPrecioNormal2.getText())) {
            PanelEndodoncia.rbOpcion2.setSelected(true);
            PanelEndodoncia.txtPrecioParcial2.setText("0");
            PanelEndodoncia.txtPrecioParcial2.setBackground(white);
            PanelEndodoncia.txtPrecioNormal2.setBackground(cyan);
        } else {
            if (Tratamiento[11] != 0) {
                PanelEndodoncia.txtPrecioParcial2.setText(String.valueOf(Tratamiento[1]));
                PanelEndodoncia.txtPrecioNormal2.setBackground(white);
                PanelEndodoncia.txtPrecioParcial2.setBackground(orange);
            } else {
                PanelEndodoncia.txtPrecioParcial2.setText("0");
                PanelEndodoncia.txtPrecioParcial2.setBackground(white);
                PanelEndodoncia.txtPrecioNormal2.setBackground(white);
            }
        }
        if (Tratamiento[12] == Integer.parseInt(PanelEndodoncia.txtPrecioNormal3.getText())) {
            PanelEndodoncia.rbOpcion3.setSelected(true);
            PanelEndodoncia.txtPrecioParcial3.setText("0");
            PanelEndodoncia.txtPrecioParcial3.setBackground(white);
            PanelEndodoncia.txtPrecioNormal3.setBackground(cyan);
        } else {
            if (Tratamiento[12] != 0) {
                PanelEndodoncia.txtPrecioParcial3.setText(String.valueOf(Tratamiento[12]));
                PanelEndodoncia.txtPrecioNormal3.setBackground(white);
                PanelEndodoncia.txtPrecioParcial3.setBackground(orange);
            } else {
                PanelEndodoncia.txtPrecioParcial3.setText("0");
                PanelEndodoncia.txtPrecioParcial3.setBackground(white);
                PanelEndodoncia.txtPrecioNormal3.setBackground(white);
            }
        }
        if (Tratamiento[13] == Integer.parseInt(PanelEndodoncia.txtPrecioNormal4.getText())) {
            PanelEndodoncia.rbOpcion4.setSelected(true);
            PanelEndodoncia.txtPrecioParcial4.setText("0");
            PanelEndodoncia.txtPrecioParcial4.setBackground(white);
            PanelEndodoncia.txtPrecioNormal4.setBackground(cyan);
        } else {
            if (Tratamiento[13] != 0) {
                PanelEndodoncia.txtPrecioParcial4.setText(String.valueOf(Tratamiento[13]));
                PanelEndodoncia.txtPrecioNormal4.setBackground(white);
                PanelEndodoncia.txtPrecioParcial4.setBackground(orange);
            } else {
                PanelEndodoncia.txtPrecioParcial4.setText("0");
                PanelEndodoncia.txtPrecioParcial4.setBackground(white);
                PanelEndodoncia.txtPrecioNormal4.setBackground(white);
            }
        }
        if (Tratamiento[14] == Integer.parseInt(PanelEndodoncia.txtPrecioNormal5.getText())) {
            PanelEndodoncia.rbOpcion5.setSelected(true);
            PanelEndodoncia.txtPrecioParcial5.setText("0");
            PanelEndodoncia.txtPrecioParcial5.setBackground(white);
            PanelEndodoncia.txtPrecioNormal5.setBackground(cyan);
        } else {
            if (Tratamiento[14] != 0) {
                PanelEndodoncia.txtPrecioParcial5.setText(String.valueOf(Tratamiento[14]));
                PanelEndodoncia.txtPrecioNormal5.setBackground(white);
                PanelEndodoncia.txtPrecioParcial5.setBackground(orange);
            } else {
                PanelEndodoncia.txtPrecioParcial5.setText("0");
                PanelEndodoncia.txtPrecioParcial5.setBackground(white);
                PanelEndodoncia.txtPrecioNormal5.setBackground(white);
            }
        }
        if (Tratamiento[15] == Integer.parseInt(PanelEndodoncia.txtPrecioNormal6.getText())) {
            PanelEndodoncia.rbOpcion6.setSelected(true);
            PanelEndodoncia.txtPrecioParcial6.setText("0");
            PanelEndodoncia.txtPrecioParcial6.setBackground(white);
            PanelEndodoncia.txtPrecioNormal6.setBackground(cyan);
        } else {
            if (Tratamiento[15] != 0) {
                PanelEndodoncia.txtPrecioParcial6.setText(String.valueOf(Tratamiento[15]));
                PanelEndodoncia.txtPrecioNormal6.setBackground(white);
                PanelEndodoncia.txtPrecioParcial6.setBackground(orange);
            } else {
                PanelEndodoncia.txtPrecioParcial6.setText("0");
                PanelEndodoncia.txtPrecioParcial6.setBackground(white);
                PanelEndodoncia.txtPrecioNormal6.setBackground(white);
            }
        }
        if (Tratamiento[17] > 0) {
            PanelEndodoncia.txtPrecioNormal7.setText(String.valueOf(Tratamiento[16]));
            PanelEndodoncia.txtPieza1.setText(String.valueOf(Tratamiento[17]));
            PanelEndodoncia.txtTotal1.setText(String.valueOf(Tratamiento[16] * Tratamiento[17]));
            if (Double.parseDouble(PanelEndodoncia.txtTotal1.getText()) > 0) {
                PanelEndodoncia.txtTotal1.setBackground(orange);
            } else {
                PanelEndodoncia.txtTotal1.setText("0");
                PanelEndodoncia.txtTotal1.setBackground(white);
            }
        } else {
            PanelEndodoncia.txtTotal1.setText("0");
            PanelEndodoncia.txtTotal1.setBackground(white);
        }
        if (Tratamiento[18] == Integer.parseInt(PanelEndodoncia.txtPrecioNormal8.getText())) {
            PanelEndodoncia.rbOpcion8.setSelected(true);
            PanelEndodoncia.txtPrecioParcial8.setText("0");
            PanelEndodoncia.txtPrecioParcial8.setBackground(white);
            PanelEndodoncia.txtPrecioNormal8.setBackground(cyan);
        } else {
            if (Tratamiento[18] != 0) {
                PanelEndodoncia.txtPrecioParcial8.setText(String.valueOf(Tratamiento[18]));
                PanelEndodoncia.txtPrecioNormal8.setBackground(white);
                PanelEndodoncia.txtPrecioParcial8.setBackground(orange);
            } else {
                PanelEndodoncia.txtPrecioParcial8.setText("0");
                PanelEndodoncia.txtPrecioParcial8.setBackground(white);
                PanelEndodoncia.txtPrecioNormal8.setBackground(white);
            }
        }
        if (Tratamiento[19] == Integer.parseInt(PanelEndodoncia.txtPrecioNormal9.getText())) {
            PanelEndodoncia.rbOpcion9.setSelected(true);
            PanelEndodoncia.txtPrecioParcial9.setText("0");
            PanelEndodoncia.txtPrecioParcial9.setBackground(white);
            PanelEndodoncia.txtPrecioNormal9.setBackground(cyan);
        } else {
            if (Tratamiento[19] != 0) {
                PanelEndodoncia.txtPrecioParcial9.setText(String.valueOf(Tratamiento[19]));
                PanelEndodoncia.txtPrecioNormal9.setBackground(white);
                PanelEndodoncia.txtPrecioParcial9.setBackground(orange);
            } else {
                PanelEndodoncia.txtPrecioParcial9.setText("0");
                PanelEndodoncia.txtPrecioParcial9.setBackground(white);
                PanelEndodoncia.txtPrecioNormal9.setBackground(white);
            }
        }
        if (Tratamiento[20] == Integer.parseInt(PanelEndodoncia.txtPrecioNormal10.getText())) {
            PanelEndodoncia.rbOpcion10.setSelected(true);
            PanelEndodoncia.txtPrecioParcial10.setText("0");
            PanelEndodoncia.txtPrecioParcial10.setBackground(white);
            PanelEndodoncia.txtPrecioNormal10.setBackground(cyan);
        } else {
            if (Tratamiento[20] != 0) {
                PanelEndodoncia.txtPrecioParcial10.setText(String.valueOf(Tratamiento[20]));
                PanelEndodoncia.txtPrecioNormal10.setBackground(white);
                PanelEndodoncia.txtPrecioParcial10.setBackground(orange);
            } else {
                PanelEndodoncia.txtPrecioParcial10.setText("0");
                PanelEndodoncia.txtPrecioParcial10.setBackground(white);
                PanelEndodoncia.txtPrecioNormal10.setBackground(white);
            }
        }
        if (Tratamiento[21] == Integer.parseInt(PanelEndodoncia.txtPrecioNormal11.getText())) {
            PanelEndodoncia.rbOpcion11.setSelected(true);
            PanelEndodoncia.txtPrecioParcial11.setText("0");
            PanelEndodoncia.txtPrecioParcial11.setBackground(white);
            PanelEndodoncia.txtPrecioNormal11.setBackground(cyan);
        } else {
            if (Tratamiento[21] != 0) {
                PanelEndodoncia.txtPrecioParcial11.setText(String.valueOf(Tratamiento[21]));
                PanelEndodoncia.txtPrecioNormal11.setBackground(white);
                PanelEndodoncia.txtPrecioParcial11.setBackground(orange);
            } else {
                PanelEndodoncia.txtPrecioParcial11.setText("0");
                PanelEndodoncia.txtPrecioParcial11.setBackground(white);
                PanelEndodoncia.txtPrecioNormal11.setBackground(white);
            }
        }

        if (Tratamiento[22] == Integer.parseInt(PanelExodoncia.txtPrecioNormal1.getText())) {
            PanelExodoncia.rbOpcion1.setSelected(true);
            PanelExodoncia.txtPrecioParcial1.setText("0");
            PanelExodoncia.txtPrecioParcial1.setBackground(white);
            PanelExodoncia.txtPrecioNormal1.setBackground(cyan);
        } else {
            if (Tratamiento[22] != 0) {
                PanelExodoncia.txtPrecioParcial1.setText(String.valueOf(Tratamiento[22]));
                PanelExodoncia.txtPrecioNormal1.setBackground(white);
                PanelExodoncia.txtPrecioParcial1.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial1.setText("0");
                PanelExodoncia.txtPrecioParcial1.setBackground(white);
                PanelExodoncia.txtPrecioNormal1.setBackground(white);
            }
        }
        if (Tratamiento[23] == Integer.parseInt(PanelExodoncia.txtPrecioNormal2.getText())) {
            PanelExodoncia.rbOpcion2.setSelected(true);
            PanelExodoncia.txtPrecioParcial2.setText("0");
            PanelExodoncia.txtPrecioParcial2.setBackground(white);
            PanelExodoncia.txtPrecioNormal2.setBackground(cyan);
        } else {
            if (Tratamiento[23] != 0) {
                PanelExodoncia.txtPrecioParcial2.setText(String.valueOf(Tratamiento[23]));
                PanelExodoncia.txtPrecioNormal2.setBackground(white);
                PanelExodoncia.txtPrecioParcial2.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial2.setText("0");
                PanelExodoncia.txtPrecioParcial2.setBackground(white);
                PanelExodoncia.txtPrecioNormal2.setBackground(white);
            }
        }
        if (Tratamiento[24] == Integer.parseInt(PanelExodoncia.txtPrecioNormal3.getText())) {
            PanelExodoncia.rbOpcion3.setSelected(true);
            PanelExodoncia.txtPrecioParcial3.setText("0");
            PanelExodoncia.txtPrecioParcial3.setBackground(white);
            PanelExodoncia.txtPrecioNormal3.setBackground(cyan);
        } else {
            if (Tratamiento[24] != 0) {
                PanelExodoncia.txtPrecioParcial3.setText(String.valueOf(Tratamiento[24]));
                PanelExodoncia.txtPrecioNormal3.setBackground(white);
                PanelExodoncia.txtPrecioParcial3.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial3.setText("0");
                PanelExodoncia.txtPrecioParcial3.setBackground(white);
                PanelExodoncia.txtPrecioNormal3.setBackground(white);
            }
        }
        if (Tratamiento[25] == Integer.parseInt(PanelExodoncia.txtPrecioNormal4.getText())) {
            PanelExodoncia.rbOpcion4.setSelected(true);
            PanelExodoncia.txtPrecioParcial4.setText("0");
            PanelExodoncia.txtPrecioParcial4.setBackground(white);
            PanelExodoncia.txtPrecioNormal4.setBackground(cyan);
        } else {
            if (Tratamiento[25] != 0) {
                PanelExodoncia.txtPrecioParcial4.setText(String.valueOf(Tratamiento[25]));
                PanelExodoncia.txtPrecioNormal4.setBackground(white);
                PanelExodoncia.txtPrecioParcial4.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial4.setText("0");
                PanelExodoncia.txtPrecioParcial4.setBackground(white);
                PanelExodoncia.txtPrecioNormal4.setBackground(white);
            }
        }

        if (Tratamiento[27] > 0) {
            PanelExodoncia.txtPrecioNormal10.setText(String.valueOf(Tratamiento[26]));
            PanelExodoncia.txtPieza1.setText(String.valueOf(Tratamiento[27]));
            PanelExodoncia.txtTotal1.setText(String.valueOf(Tratamiento[26] * Tratamiento[27]));
            if (Double.parseDouble(PanelExodoncia.txtTotal1.getText()) > 0) {
                PanelExodoncia.txtTotal1.setBackground(orange);
            } else {
                PanelExodoncia.txtTotal1.setText("0");
                PanelExodoncia.txtTotal1.setBackground(white);
            }
        } else {
            PanelExodoncia.txtTotal1.setText("0");
            PanelExodoncia.txtTotal1.setBackground(white);
        }

        if (Tratamiento[29] > 0) {
            PanelExodoncia.txtPrecioNormal11.setText(String.valueOf(Tratamiento[29]));
            PanelExodoncia.txtPieza2.setText(String.valueOf(Tratamiento[28]));
            PanelExodoncia.txtTotal2.setText(String.valueOf(Tratamiento[28] * Tratamiento[29]));
            if (Double.parseDouble(PanelExodoncia.txtTotal2.getText()) > 0) {
                PanelExodoncia.txtTotal2.setBackground(orange);
            } else {
                PanelExodoncia.txtTotal2.setText("0");
                PanelExodoncia.txtTotal2.setBackground(white);
            }
        } else {
            PanelExodoncia.txtTotal2.setText("0");
            PanelExodoncia.txtTotal2.setBackground(white);
        }
        if (Tratamiento[30] == Integer.parseInt(PanelExodoncia.txtPrecioNormal5.getText())) {
            PanelExodoncia.rbOpcion5.setSelected(true);
            PanelExodoncia.txtPrecioParcial5.setText("0");
            PanelExodoncia.txtPrecioParcial5.setBackground(white);
            PanelExodoncia.txtPrecioNormal5.setBackground(cyan);
        } else {
            if (Tratamiento[30] != 0) {
                PanelExodoncia.txtPrecioParcial5.setText(String.valueOf(Tratamiento[30]));
                PanelExodoncia.txtPrecioNormal5.setBackground(white);
                PanelExodoncia.txtPrecioParcial5.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial5.setText("0");
                PanelExodoncia.txtPrecioParcial5.setBackground(white);
                PanelExodoncia.txtPrecioNormal5.setBackground(white);
            }
        }
        if (Tratamiento[31] == Integer.parseInt(PanelExodoncia.txtPrecioNormal6.getText())) {
            PanelExodoncia.rbOpcion6.setSelected(true);
            PanelExodoncia.txtPrecioParcial6.setText("0");
            PanelExodoncia.txtPrecioParcial6.setBackground(white);
            PanelExodoncia.txtPrecioNormal6.setBackground(cyan);
        } else {
            if (Tratamiento[31] != 0) {
                PanelExodoncia.txtPrecioParcial6.setText(String.valueOf(Tratamiento[31]));
                PanelExodoncia.txtPrecioNormal6.setBackground(white);
                PanelExodoncia.txtPrecioParcial6.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial6.setText("0");
                PanelExodoncia.txtPrecioParcial6.setBackground(white);
                PanelExodoncia.txtPrecioNormal6.setBackground(white);
            }
        }
        if (Tratamiento[32] == Integer.parseInt(PanelExodoncia.txtPrecioNormal7.getText())) {
            PanelExodoncia.rbOpcion7.setSelected(true);
            PanelExodoncia.txtPrecioParcial7.setText("0");
            PanelExodoncia.txtPrecioParcial7.setBackground(white);
            PanelExodoncia.txtPrecioNormal7.setBackground(cyan);
        } else {
            if (Tratamiento[32] != 0) {
                PanelExodoncia.txtPrecioParcial7.setText(String.valueOf(Tratamiento[32]));
                PanelExodoncia.txtPrecioNormal7.setBackground(white);
                PanelExodoncia.txtPrecioParcial7.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial7.setText("0");
                PanelExodoncia.txtPrecioParcial7.setBackground(white);
                PanelExodoncia.txtPrecioNormal7.setBackground(white);
            }
        }
        if (Tratamiento[33] == Integer.parseInt(PanelExodoncia.txtPrecioNormal8.getText())) {
            PanelExodoncia.rbOpcion8.setSelected(true);
            PanelExodoncia.txtPrecioParcial8.setText("0");
            PanelExodoncia.txtPrecioParcial8.setBackground(white);
            PanelExodoncia.txtPrecioNormal8.setBackground(cyan);
        } else {
            if (Tratamiento[33] != 0) {
                PanelExodoncia.txtPrecioParcial8.setText(String.valueOf(Tratamiento[33]));
                PanelExodoncia.txtPrecioNormal8.setBackground(white);
                PanelExodoncia.txtPrecioParcial8.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial8.setText("0");
                PanelExodoncia.txtPrecioParcial8.setBackground(white);
                PanelExodoncia.txtPrecioNormal8.setBackground(white);
            }
        }
        if (Tratamiento[34] == Integer.parseInt(PanelExodoncia.txtPrecioNormal9.getText())) {
            PanelExodoncia.rbOpcion9.setSelected(true);
            PanelExodoncia.txtPrecioParcial9.setText("0");
            PanelExodoncia.txtPrecioParcial9.setBackground(white);
            PanelExodoncia.txtPrecioNormal9.setBackground(cyan);
        } else {
            if (Tratamiento[34] != 0) {
                PanelExodoncia.txtPrecioParcial9.setText(String.valueOf(Tratamiento[34]));
                PanelExodoncia.txtPrecioNormal9.setBackground(white);
                PanelExodoncia.txtPrecioParcial9.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial9.setText("0");
                PanelExodoncia.txtPrecioParcial9.setBackground(white);
                PanelExodoncia.txtPrecioNormal9.setBackground(white);
            }
        }
        if (Tratamiento[35] == Integer.parseInt(PanelExodoncia.txtPrecioNormal12.getText())) {
            PanelExodoncia.rbOpcion12.setSelected(true);
            PanelExodoncia.txtPrecioParcial12.setText("0");
            PanelExodoncia.txtPrecioParcial12.setBackground(white);
            PanelExodoncia.txtPrecioNormal12.setBackground(cyan);
        } else {
            if (Tratamiento[35] != 0) {
                PanelExodoncia.txtPrecioParcial12.setText(String.valueOf(Tratamiento[35]));
                PanelExodoncia.txtPrecioNormal12.setBackground(white);
                PanelExodoncia.txtPrecioParcial12.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial12.setText("0");
                PanelExodoncia.txtPrecioParcial12.setBackground(white);
                PanelExodoncia.txtPrecioNormal12.setBackground(white);
            }
        }
        if (Tratamiento[36] == Integer.parseInt(PanelExodoncia.txtPrecioNormal13.getText())) {
            PanelExodoncia.rbOpcion13.setSelected(true);
            PanelExodoncia.txtPrecioParcial13.setText("0");
            PanelExodoncia.txtPrecioParcial13.setBackground(white);
            PanelExodoncia.txtPrecioNormal13.setBackground(cyan);
        } else {
            if (Tratamiento[36] != 0) {
                PanelExodoncia.txtPrecioParcial13.setText(String.valueOf(Tratamiento[36]));
                PanelExodoncia.txtPrecioNormal13.setBackground(white);
                PanelExodoncia.txtPrecioParcial13.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial13.setText("0");
                PanelExodoncia.txtPrecioParcial13.setBackground(white);
                PanelExodoncia.txtPrecioNormal13.setBackground(white);
            }
        }
        if (Tratamiento[37] == Integer.parseInt(PanelExodoncia.txtPrecioNormal14.getText())) {
            PanelExodoncia.rbOpcion14.setSelected(true);

            PanelExodoncia.txtPrecioParcial14.setText("0");
            PanelExodoncia.txtPrecioParcial14.setBackground(white);
            PanelExodoncia.txtPrecioNormal14.setBackground(cyan);
        } else {
            if (Tratamiento[37] != 0) {
                PanelExodoncia.txtPrecioParcial14.setText(String.valueOf(Tratamiento[37]));

                PanelExodoncia.txtPrecioNormal14.setBackground(white);
                PanelExodoncia.txtPrecioParcial14.setBackground(orange);
            } else {
                PanelExodoncia.txtPrecioParcial14.setText("0");
                PanelExodoncia.txtPrecioParcial14.setBackground(white);
                PanelExodoncia.txtPrecioNormal14.setBackground(white);
            }
        }
        Tratamientos.txtPrecioPactado.setText(String.valueOf(Tratamiento[38]));
    }
}
