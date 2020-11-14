/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

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
public class CGraficarEgresos extends JPanel {

    static private String m1 = "";
    static private int c = 0;
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

    public static JPanel graficar() {

        String[] Mes = null;
        try {
            ResultSet rs = CEgreso.Grafico();
            if (rs == null) {
                DefaultCategoryDataset dataset = new DefaultCategoryDataset();

                dataset.setValue(c, m1, "1");
                dataset.setValue(c, m1, "2");
                dataset.setValue(c, m1, "3");
                dataset.setValue(c, m1, "4");
                dataset.setValue(c, m1, "5");
                dataset.setValue(c, m1, "6");
                dataset.setValue(c, m1, "7");
                dataset.setValue(c, m1, "8");
                dataset.setValue(c, m1, "9");
                dataset.setValue(c, m1, "10");
                dataset.setValue(c, m1, "11");
                dataset.setValue(c, m1, "12");
                dataset.setValue(c, m1, "13");
                dataset.setValue(c, m1, "14");
                dataset.setValue(c, m1, "15");
                dataset.setValue(c, m1, "16");
                dataset.setValue(c, m1, "17");
                dataset.setValue(c, m1, "18");
                dataset.setValue(c, m1, "19");
                dataset.setValue(c, m1, "20");
                dataset.setValue(c, m1, "21");
                dataset.setValue(c, m1, "22");
                dataset.setValue(c, m1, "23");
                dataset.setValue(c, m1, "24");
                dataset.setValue(c, m1, "25");
                dataset.setValue(c, m1, "26");
                dataset.setValue(c, m1, "27");
                dataset.setValue(c, m1, "28");
                dataset.setValue(c, m1, "29");
                dataset.setValue(c, m1, "30");
                dataset.setValue(c, m1, "31");
                // Creando el Grafico
                JFreeChart chart = ChartFactory.createBarChart3D(" ", "DIAS", "MONTO",
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
            m1 = Mes(Mes[1]);

//        getContentPane().add(panel);
            // Fuente de Datos
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            dataset.setValue(M1, m1, "1");
            dataset.setValue(M2, m1, "2");
            dataset.setValue(M3, m1, "3");
            dataset.setValue(M4, m1, "4");
            dataset.setValue(M5, m1, "5");
            dataset.setValue(M6, m1, "6");
            dataset.setValue(M7, m1, "7");
            dataset.setValue(M8, m1, "8");
            dataset.setValue(M9, m1, "9");
            dataset.setValue(M10, m1, "10");
            dataset.setValue(M11, m1, "11");
            dataset.setValue(M12, m1, "12");
            dataset.setValue(M13, m1, "13");
            dataset.setValue(M14, m1, "14");
            dataset.setValue(M15, m1, "15");
            dataset.setValue(M16, m1, "16");
            dataset.setValue(M17, m1, "17");
            dataset.setValue(M18, m1, "18");
            dataset.setValue(M19, m1, "19");
            dataset.setValue(M20, m1, "20");
            dataset.setValue(M21, m1, "21");
            dataset.setValue(M22, m1, "22");
            dataset.setValue(M23, m1, "23");
            dataset.setValue(M24, m1, "24");
            dataset.setValue(M25, m1, "25");
            dataset.setValue(M26, m1, "26");
            dataset.setValue(M27, m1, "27");
            dataset.setValue(M28, m1, "28");
            dataset.setValue(M29, m1, "29");
            dataset.setValue(M30, m1, "30");
            dataset.setValue(M31, m1, "31");
            // Creando el Grafico
            JFreeChart chart = ChartFactory.createBarChart3D("EGRESO MES DE " + m1, "DIAS", "MONTO",
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
        } catch (Exception ex) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            dataset.setValue(c, m1, "1");
            dataset.setValue(c, m1, "2");
            dataset.setValue(c, m1, "3");
            dataset.setValue(c, m1, "4");
            dataset.setValue(c, m1, "5");
            dataset.setValue(c, m1, "6");
            dataset.setValue(c, m1, "7");
            dataset.setValue(c, m1, "8");
            dataset.setValue(c, m1, "9");
            dataset.setValue(c, m1, "10");
            dataset.setValue(c, m1, "11");
            dataset.setValue(c, m1, "12");
            dataset.setValue(c, m1, "13");
            dataset.setValue(c, m1, "14");
            dataset.setValue(c, m1, "15");
            dataset.setValue(c, m1, "16");
            dataset.setValue(c, m1, "17");
            dataset.setValue(c, m1, "18");
            dataset.setValue(c, m1, "19");
            dataset.setValue(c, m1, "20");
            dataset.setValue(c, m1, "21");
            dataset.setValue(c, m1, "22");
            dataset.setValue(c, m1, "23");
            dataset.setValue(c, m1, "24");
            dataset.setValue(c, m1, "25");
            dataset.setValue(c, m1, "26");
            dataset.setValue(c, m1, "27");
            dataset.setValue(c, m1, "28");
            dataset.setValue(c, m1, "29");
            dataset.setValue(c, m1, "30");
            dataset.setValue(c, m1, "31");
            // Creando el Grafico
            JFreeChart chart = ChartFactory.createBarChart3D("", "DIAS", "MONTO",
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
    }

    public static String Mes(String m) {
        String Mes = null;
        if (m.equals("01")) {
            Mes = "ENERO";
        }
        if (m.equals("02")) {
            Mes = "FEBRERO";
        }
        if (m.equals("03")) {
            Mes = "MARZO";
        }
        if (m.equals("04")) {
            Mes = "ABRIL";
        }
        if (m.equals("05")) {
            Mes = "MAYO";
        }
        if (m.equals("06")) {
            Mes = "JUNIO";
        }
        if (m.equals("07")) {
            Mes = "JULIO";
        }
        if (m.equals("08")) {
            Mes = "AGOSTO";
        }
        if (m.equals("09")) {
            Mes = "SETIEMBRE";
        }
        if (m.equals("10")) {
            Mes = "OCTUBRE";
        }
        if (m.equals("11")) {
            Mes = "NOVIEMBRE";
        }
        if (m.equals("12")) {
            Mes = "DICIEMBRE";
        }
        return Mes;
    }
}
