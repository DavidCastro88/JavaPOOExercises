package Actividad3.Parte1.Ejercicio19;

import Actividad3.Parte1.Ejercicio18.InterfazEmpleado;

import javax.swing.*;

public class Ejercicio19 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazTrianguloEquilatero interfaz = new InterfazTrianguloEquilatero();
            interfaz.setVisible(true);
        });
    }
}
