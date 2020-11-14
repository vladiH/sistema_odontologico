package CapaNegocio;

import CapaDiseño.Login;
import java.awt.*;
import java.awt.SplashScreen;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author vladimir
 */
public final class PantallaCarga {

    public boolean termina = false;
    SplashScreen splash;
    //texto que se muestra a medida que se va cargando el screensplah
    final String[] texto = {"Iniciando Programa", "Conectando  a Base de Datos", "Estableciendo Conexion Con BD", "Cargando Librerias",
        "Cargando Archivos del Sistema", "Cargando Formularios Visuales", "Cargando Iconos del Sistema", "Configurando",
        "Preparandose Para Iniciar", "Listo",
        "Iniciando..",
        ""};

    public PantallaCarga() {
        splash = SplashScreen.getSplashScreen();

    }

    public void Animar_Carga() {
        if (splash != null) {
            Graphics2D g = splash.createGraphics();
            for (int i = 1; i < texto.length; i++) {
                try {
//se pinta texto del array
                    g.setColor(Color.BLACK);//color de fondo
                    g.fillRect(40, 300, 200, 12);//para tapar texto anterior
                    g.setColor(Color.white);//color de texto 
                    g.drawString("Cargando...", 40, 290);
                    g.drawString(texto[i - 1] + "...", 40, 310);
                    g.setColor(Color.GREEN);//color de barra de progeso
                    g.fillRect(100, 367, (i * 657 / texto.length), 5);//la barra de progreso
                    //se pinta una linea segmentada encima de la barra verde
//                    float dash1[] = {2.0f};
//                    BasicStroke dashed = new BasicStroke(7.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 5.0f, dash1, 0.0f);
//                    g.setStroke(dashed);

                    //g.setColor(Color.blue);//color de barra de progeso
                    //  g.setColor(Color.white);
                    //  g.drawLine(100, 368, 657, 367);
                    //se actualiza todo
                    splash.update();
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PantallaCarga.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            termina = true;
            splash.close();
        }
        //una vez terminada la animación se muestra la aplicación principal
        try {
            if (termina == true) {
                Login l = new Login();
                l.setLocationRelativeTo(null);
                l.setVisible(true);
            } else {
                splash = SplashScreen.getSplashScreen();
                Animar_Carga();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
