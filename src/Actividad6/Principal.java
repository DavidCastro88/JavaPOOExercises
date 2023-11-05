package Actividad6;
import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ContactManagerGUI interfaz = new ContactManagerGUI();
            interfaz.setVisible(true);
        });

    }
}
