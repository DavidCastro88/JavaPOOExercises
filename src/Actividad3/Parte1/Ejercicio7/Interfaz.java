package Actividad3.Parte1.Ejercicio7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private JTextField txtA, txtB;
    private JButton calcularButton,  borrarButton, salirButton;
    private JLabel conclusionLabel;

    public Interfaz() {

        setTitle("Verificar valor mayor");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel ALabel = new JLabel("Valor de A:");
        txtA = new JTextField(10);
        JLabel BLabel = new JLabel("Valor de B:");
        txtB = new JTextField(10);


        calcularButton = new JButton("Calcular");
        borrarButton = new JButton("Borrar");
        salirButton = new JButton("Salir");
        conclusionLabel = new JLabel("Conclusión: ");


        setLayout(new BorderLayout(10, 10));

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        botonesPanel.add(calcularButton);
        botonesPanel.add(borrarButton);
        botonesPanel.add(salirButton);

        JPanel datosPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        datosPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20));
        datosPanel.add(ALabel);
        datosPanel.add(txtA);
        datosPanel.add(BLabel);
        datosPanel.add(txtB);

        JPanel datosPanel2 = new JPanel(new GridLayout(3, 2, 5, 5));
        datosPanel2.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20));
        datosPanel2.add(conclusionLabel);


        add(datosPanel, BorderLayout.NORTH);
        add(datosPanel2,BorderLayout.CENTER);
        add(botonesPanel, BorderLayout.SOUTH);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cierra la aplicación
            }
        });
    }
    private void calcular() {
        double A= Double.parseDouble(txtA.getText());
        double B= Double.parseDouble(txtB.getText());

        if (A>B){
            conclusionLabel.setText("Conclusión: A es mayor que B");
        } else if (A<B) {
            conclusionLabel.setText("Conclusión: B es mayor que A");
        } else{
            conclusionLabel.setText("Conclusión: A es igual a B");
        }
    }
}