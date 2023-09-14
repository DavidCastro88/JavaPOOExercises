package Actividad3.Parte1.Ejercicio19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazTrianguloEquilatero extends JFrame {
    private JTextField txtlado;
    private JButton calcularButton,  borrarButton, salirButton;
    private JLabel areaLabel, perimetroLabel, alturaLabel;

    public InterfazTrianguloEquilatero() {

        setTitle("Triángulo Equilatero");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel ladoLabel = new JLabel("Lado del Triángulo equilátero:");
        txtlado = new JTextField(10);


        calcularButton = new JButton("Calcular");
        borrarButton = new JButton("Borrar");
        salirButton = new JButton("Salir");
        areaLabel = new JLabel("Área del triángulo: ");
        perimetroLabel = new JLabel("Perímetro del triángulo: ");
        alturaLabel =new JLabel("Altura del triángulo: ");

        setLayout(new BorderLayout(10, 10));

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        botonesPanel.add(calcularButton);
        botonesPanel.add(borrarButton);
        botonesPanel.add(salirButton);

        JPanel datosPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        datosPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20));
        datosPanel.add(ladoLabel);
        datosPanel.add(txtlado);

        JPanel datosPanel2 = new JPanel(new GridLayout(3, 2, 5, 5));
        datosPanel2.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20));
        datosPanel2.add(areaLabel);
        datosPanel2.add(perimetroLabel);
        datosPanel2.add(alturaLabel);

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
                txtlado.setText("");
                alturaLabel.setText("Altura del triángulo: ");
                perimetroLabel.setText("Perímetro del triángulo: ");
                areaLabel.setText("Área del triángulo: ");

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
        double lado= Double.parseDouble(txtlado.getText());
        TrianguloEquilatero te = new TrianguloEquilatero(lado);
        areaLabel.setText("Área del triángulo: " + Math.round(te.getArea() * 10000.0) / 10000.0);
        perimetroLabel.setText("Perímetro del triángulo: " + Math.round(te.getPerimetro() * 10000.0) / 10000.0);
        alturaLabel.setText("Altura del triángulo: " + Math.round(te.getAltura() * 10000.0) / 10000.0);
    }
}
