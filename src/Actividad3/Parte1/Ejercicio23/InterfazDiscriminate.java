package Actividad3.Parte1.Ejercicio23;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazDiscriminate extends JFrame {
    private JTextField txtA, txtB,txtC;
    private JButton calcularButton,  borrarButton, salirButton;
    private JLabel conclusionLabel;

    public InterfazDiscriminate() {

        setTitle("Soluciones de ecuación cuadrática");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel ALabel = new JLabel("Valor de a:");
        txtA = new JTextField(10);
        JLabel BLabel = new JLabel("Valor de b:");
        txtB = new JTextField(10);
        JLabel CLabel = new JLabel("Valor de c:");
        txtC = new JTextField(10);


        calcularButton = new JButton("Calcular");
        borrarButton = new JButton("Borrar");
        salirButton = new JButton("Salir");
        conclusionLabel = new JLabel("Conclusión: ");


        setLayout(new BorderLayout(10, 10));

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        botonesPanel.add(calcularButton);
        botonesPanel.add(borrarButton);
        botonesPanel.add(salirButton);

        JPanel datosPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        datosPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20));
        datosPanel.add(ALabel);
        datosPanel.add(txtA);
        datosPanel.add(BLabel);
        datosPanel.add(txtB);
        datosPanel.add(CLabel);
        datosPanel.add(txtC);

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
                txtC.setText("");
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
        double C= Double.parseDouble(txtC.getText());
        double discriminante = Math.pow(B,2) - (4 * A * C);
        if (discriminante > 0) {
            double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            conclusionLabel.setText("Las soluciones de la ecuación de segundo grados son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -B / (2 * A);
            conclusionLabel.setText("La solución doble de la ecuación de segundo grado es: " + raiz);
        } else {
            conclusionLabel.setText("La ecuación no tiene soluciones reales.");
        }
    }
}