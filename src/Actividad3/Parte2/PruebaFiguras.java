package Actividad3.Parte2;


import javax.swing.*;

public class PruebaFiguras {
        public static void main(String args[]) {
                SwingUtilities.invokeLater(() -> {
                        InterfazFigurasGeometricas interfaz = new InterfazFigurasGeometricas();
                        interfaz.setVisible(true);
                });
        }
}

