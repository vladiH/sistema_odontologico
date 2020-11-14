/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDiseño.EgresosvsIngresos;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author vladimir
 */
public class CGraficarIngresosVsEgresos {

    static private String m1 = "";
    static private String m2 = "";
    static private double M1 = 0;
    static private double M2 = 0;
    static private double M3 = 0;
    static private double M4 = 0;
    static private double M5 = 0;
    static private double M6 = 0;
    static private double M7 = 0;
    static private double M8 = 0;
    static private double M9 = 0;
    static private double M10 = 0;
    static private double M11 = 0;
    static private double M12 = 0;
    static private double M13 = 0;
    static private double M14 = 0;
    static private double M15 = 0;
    static private double M16 = 0;
    static private double M17 = 0;
    static private double M18 = 0;
    static private double M19 = 0;
    static private double M20 = 0;
    static private double M21 = 0;
    static private double M22 = 0;
    static private double M23 = 0;
    static private double M24 = 0;
    static private double M25 = 0;
    static private double M26 = 0;
    static private double M27 = 0;
    static private double M28 = 0;
    static private double M29 = 0;
    static private double M30 = 0;
    static private double M31 = 0;

    static private double M1a = 0;
    static private double M2a = 0;
    static private double M3a = 0;
    static private double M4a = 0;
    static private double M5a = 0;
    static private double M6a = 0;
    static private double M7a = 0;
    static private double M8a = 0;
    static private double M9a = 0;
    static private double M10a = 0;
    static private double M11a = 0;
    static private double M12a = 0;
    static private double M13a = 0;
    static private double M14a = 0;
    static private double M15a = 0;
    static private double M16a = 0;
    static private double M17a = 0;
    static private double M18a = 0;
    static private double M19a = 0;
    static private double M20a = 0;
    static private double M21a = 0;
    static private double M22a = 0;
    static private double M23a = 0;
    static private double M24a = 0;
    static private double M25a = 0;
    static private double M26a = 0;
    static private double M27a = 0;
    static private double M28a = 0;
    static private double M29a = 0;
    static private double M30a = 0;
    static private double M31a = 0;

    public static JPanel graficar() {

        String[] Mes = null;
        String[] Mes1 = null;
        try {
            ResultSet rs = CIngresos.GraficoVs();
            ResultSet rs1 = CEgreso.GraficoVs();
            if (rs == null || rs1 == null) {
                DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                EgresosvsIngresos.txtMonto.setText("0");
                return panel(dataset);
            }
            Actualizar();
            while (rs.next()) {
                Mes = rs.getString(1).split("-");
                if (Mes[2].equals("01")) {
                    M1 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("02")) {
                    M2 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("03")) {
                    M3 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("04")) {
                    M4 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("05")) {
                    M5 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("06")) {
                    M6 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("07")) {
                    M7 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("08")) {
                    M8 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("09")) {
                    M9 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("10")) {
                    M10 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("11")) {
                    M11 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("12")) {
                    M12 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("13")) {

                    M13 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("14")) {
                    M14 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("15")) {
                    M15 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("16")) {
                    M16 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("17")) {
                    M17 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("18")) {
                    M18 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("19")) {
                    M19 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("20")) {
                    M20 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("21")) {
                    M21 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("22")) {
                    M22 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("23")) {
                    M23 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("24")) {
                    M24 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("25")) {
                    M25 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("26")) {
                    M26 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("27")) {
                    M27 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("28")) {
                    M28 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("29")) {
                    M29 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("30")) {
                    M30 = Double.parseDouble(rs.getString(2));
                }
                if (Mes[2].equals("31")) {
                    M31 = Double.parseDouble(rs.getString(2));
                }
            }

            while (rs1.next()) {
                Mes1 = rs1.getString(1).split("-");
                if (Mes1[2].equals("01")) {
                    M1a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("02")) {
                    M2a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("03")) {
                    M3a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("04")) {
                    M4a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("05")) {
                    M5a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("06")) {
                    M6a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("07")) {
                    M7a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("08")) {
                    M8a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("09")) {
                    M9a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("10")) {
                    M10a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("11")) {
                    M11a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("12")) {
                    M12a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("13")) {

                    M13a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("14")) {
                    M14a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("15")) {
                    M15a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("16")) {
                    M16a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("17")) {
                    M17a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("18")) {
                    M18a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("19")) {
                    M19a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("20")) {
                    M20a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("21")) {
                    M21a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("22")) {
                    M22a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("23")) {
                    M23a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("24")) {
                    M24a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("25")) {
                    M25a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("26")) {
                    M26a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("27")) {
                    M27a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("28")) {
                    M28a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("29")) {
                    M29a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("30")) {
                    M30a = Double.parseDouble(rs1.getString(2));
                }
                if (Mes1[2].equals("31")) {
                    M31a = Double.parseDouble(rs1.getString(2));
                }
            }
            m1 = MesIngresos(Mes[1]);
            m2 = MesEgresos(Mes1[1]);

            // sacar ganacia ingresos - egresos
            double In = M1 + M2 + M3 + M4 + M5 + M6 + M7 + M8 + M9 + M10 + M11 + M12 + M13 + M14 + M15 + M16 + M17 + M18 + M19 + M20 + M21 + M22 + M23 + M24 + M25 + M26 + M27 + M28 + M29 + M30 + M31;
            double Eg = M1a + M2a + M3a + M4a + M5a + M6a + M7a + M8a + M9a + M10a + M11a + M12a + M13a + M14a + M15a + M16a + M17a + M18a + M19a + M20a + M21a + M22a + M23a + M24a + M25a + M26a + M27a + M28a + M29a + M30a + M31a;
            double Total = In - Eg;
            if (Total < 0) {
                EgresosvsIngresos.txtMonto.setForeground(Color.red);
                EgresosvsIngresos.txtMonto.setText(String.valueOf(Total));
            } else {
                EgresosvsIngresos.txtMonto.setForeground(Color.BLACK);
                EgresosvsIngresos.txtMonto.setText(String.valueOf(Total));
            }

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            dataset.setValue(M1, m1, "1");
            dataset.setValue(M1a, m2, "1");
            dataset.setValue(M2, m1, "2");
            dataset.setValue(M2a, m2, "2");
            dataset.setValue(M3, m1, "3");
            dataset.setValue(M3a, m2, "3");
            dataset.setValue(M4, m1, "4");
            dataset.setValue(M4a, m2, "4");
            dataset.setValue(M5, m1, "5");
            dataset.setValue(M5a, m2, "5");
            dataset.setValue(M6, m1, "6");
            dataset.setValue(M6a, m2, "6");
            dataset.setValue(M7, m1, "7");
            dataset.setValue(M7a, m2, "7");
            dataset.setValue(M8, m1, "8");
            dataset.setValue(M8a, m2, "8");
            dataset.setValue(M9, m1, "9");
            dataset.setValue(M9a, m2, "9");
            dataset.setValue(M10, m1, "10");
            dataset.setValue(M10a, m2, "10");
            dataset.setValue(M11, m1, "11");
            dataset.setValue(M11a, m2, "11");
            dataset.setValue(M12, m1, "12");
            dataset.setValue(M12a, m2, "12");
            dataset.setValue(M13, m1, "13");
            dataset.setValue(M13a, m2, "13");
            dataset.setValue(M14, m1, "14");
            dataset.setValue(M14a, m2, "14");
            dataset.setValue(M15, m1, "15");
            dataset.setValue(M15a, m2, "15");
            dataset.setValue(M16, m1, "16");
            dataset.setValue(M16a, m2, "16");
            dataset.setValue(M17, m1, "17");
            dataset.setValue(M17a, m2, "17");
            dataset.setValue(M18, m1, "18");
            dataset.setValue(M18a, m2, "18");
            dataset.setValue(M19, m1, "19");
            dataset.setValue(M19a, m2, "19");
            dataset.setValue(M20, m1, "20");
            dataset.setValue(M20a, m2, "20");
            dataset.setValue(M21, m1, "21");
            dataset.setValue(M21a, m2, "21");
            dataset.setValue(M22, m1, "22");
            dataset.setValue(M22a, m2, "22");
            dataset.setValue(M23, m1, "23");
            dataset.setValue(M23a, m2, "23");
            dataset.setValue(M24, m1, "24");
            dataset.setValue(M24a, m2, "24");
            dataset.setValue(M25, m1, "25");
            dataset.setValue(M25a, m2, "25");
            dataset.setValue(M26, m1, "26");
            dataset.setValue(M26a, m2, "26");
            dataset.setValue(M27, m1, "27");
            dataset.setValue(M27a, m2, "27");
            dataset.setValue(M28, m1, "28");
            dataset.setValue(M28a, m2, "28");
            dataset.setValue(M29, m1, "29");
            dataset.setValue(M29a, m2, "29");
            dataset.setValue(M30, m1, "30");
            dataset.setValue(M30a, m2, "30");
            dataset.setValue(M31, m1, "31");
            dataset.setValue(M31a, m2, "31");
            return panel(dataset);
            // Creando el Grafico

        } catch (Exception ex) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            EgresosvsIngresos.txtMonto.setText("0");
            return panel(dataset);
        }
    }

    public static ChartPanel panel(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart3D(m1 + " vs " + m2, "DIAS", "MONTO",
                dataset, PlotOrientation.VERTICAL, true, true, false);
        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setPaint(Color.BLACK);

//            CategoryPlot p = chart.getCategoryPlot();
//            BarRenderer render = (BarRenderer) p.getRenderer();
//            render.setSeriesPaint(0, Color.BLUE);
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);

        chartPanel.setSize(740, 598);
        return chartPanel;
    }

    public static void Actualizar() {
        M1 = 0;
        M2 = 0;
        M3 = 0;
        M4 = 0;
        M5 = 0;
        M6 = 0;
        M7 = 0;
        M8 = 0;
        M9 = 0;
        M10 = 0;
        M11 = 0;
        M12 = 0;
        M13 = 0;
        M14 = 0;
        M15 = 0;
        M16 = 0;
        M17 = 0;
        M18 = 0;
        M19 = 0;
        M20 = 0;
        M21 = 0;
        M22 = 0;
        M23 = 0;
        M24 = 0;
        M25 = 0;
        M26 = 0;
        M27 = 0;
        M28 = 0;
        M29 = 0;
        M30 = 0;
        M31 = 0;

        M1a = 0;
        M2a = 0;
        M3a = 0;
        M4a = 0;
        M5a = 0;
        M6a = 0;
        M7a = 0;
        M8a = 0;
        M9a = 0;
        M10a = 0;
        M11a = 0;
        M12a = 0;
        M13a = 0;
        M14a = 0;
        M15a = 0;
        M16a = 0;
        M17a = 0;
        M18a = 0;
        M19a = 0;
        M20a = 0;
        M21a = 0;
        M22a = 0;
        M23a = 0;
        M24a = 0;
        M25a = 0;
        M26a = 0;
        M27a = 0;
        M28a = 0;
        M29a = 0;
        M30a = 0;
        M31a = 0;
    }

    public static String MesIngresos(String m) {
        String Mes = null;
        if (m.equals("01")) {
            Mes = "INGRESOS ENERO";
        }
        if (m.equals("02")) {
            Mes = "INGRESOS FEBRERO";
        }
        if (m.equals("03")) {
            Mes = "INGRESOS MARZO";
        }
        if (m.equals("04")) {
            Mes = "INGRESOS ABRIL";
        }
        if (m.equals("05")) {
            Mes = "INGRESOS MAYO";
        }
        if (m.equals("06")) {
            Mes = "INGRESOS JUNIO";
        }
        if (m.equals("07")) {
            Mes = "INGRESOS JULIO";
        }
        if (m.equals("08")) {
            Mes = "INGRESOS AGOSTO";
        }
        if (m.equals("09")) {
            Mes = "INGRESOS SETIEMBRE";
        }
        if (m.equals("10")) {
            Mes = "INGRESOS OCTUBRE";
        }
        if (m.equals("11")) {
            Mes = "INGRESOS NOVIEMBRE";
        }
        if (m.equals("12")) {
            Mes = "INGRESOS DICIEMBRE";
        }
        return Mes;
    }

    public static String MesEgresos(String m) {
        String Mes = null;
        if (m.equals("01")) {
            Mes = "EGRESOS ENERO";
        }
        if (m.equals("02")) {
            Mes = "EGRESOS FEBRERO";
        }
        if (m.equals("03")) {
            Mes = "EGRESOS MARZO";
        }
        if (m.equals("04")) {
            Mes = "EGRESOS ABRIL";
        }
        if (m.equals("05")) {
            Mes = "EGRESOS MAYO";
        }
        if (m.equals("06")) {
            Mes = "EGRESOS JUNIO";
        }
        if (m.equals("07")) {
            Mes = "EGRESOS JULIO";
        }
        if (m.equals("08")) {
            Mes = "EGRESOS AGOSTO";
        }
        if (m.equals("09")) {
            Mes = "EGRESOS SETIEMBRE";
        }
        if (m.equals("10")) {
            Mes = "EGRESOS OCTUBRE";
        }
        if (m.equals("11")) {
            Mes = "EGRESOS NOVIEMBRE";
        }
        if (m.equals("12")) {
            Mes = "EGRESOS DICIEMBRE";
        }
        return Mes;
    }
}
