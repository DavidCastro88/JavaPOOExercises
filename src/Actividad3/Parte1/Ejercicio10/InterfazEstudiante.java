package Actividad3.Parte1.Ejercicio10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazEstudiante extends JFrame {
    private JTextField txtNumeroInscripcion, txtNombres, txtpatrimonio, txtestrato;
    private JButton calcularButton,  borrarButton, salirButton;
    private JLabel matriculaLabel;

    public InterfazEstudiante() {

        setTitle("Información Matricula del estudiante");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel numeroLabel = new JLabel("Número de inscripción del estudiante:");
        JLabel nombresLabel = new JLabel("Nombres del estudiante:");
        JLabel patrimonioLabel = new JLabel("Patrimonio:");
        JLabel estratoLabel = new JLabel("Estrato sociecónomico:");

        txtNumeroInscripcion = new JTextField(10);
        txtNombres = new JTextField(20);
        txtpatrimonio = new JTextField(5);
        txtestrato = new JTextField(5);



        calcularButton = new JButton("Calcular");
        borrarButton = new JButton("Borrar");
        salirButton = new JButton("Salir");
        matriculaLabel = new JLabel("Valor de la matrícula: $");

        setLayout(new BorderLayout(10, 10));

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        botonesPanel.add(calcularButton);
        botonesPanel.add(borrarButton);
        botonesPanel.add(salirButton);

        JPanel datosPanel = new JPanel(new GridLayout(6, 2, 5, 5));
        datosPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20));
        datosPanel.add(numeroLabel);
        datosPanel.add(txtNumeroInscripcion);
        datosPanel.add(nombresLabel);
        datosPanel.add(txtNombres);
        datosPanel.add(patrimonioLabel);
        datosPanel.add(txtpatrimonio);
        datosPanel.add(estratoLabel);
        datosPanel.add(txtestrato);
        datosPanel.add(matriculaLabel);


        add(datosPanel, BorderLayout.CENTER);
        add(botonesPanel, BorderLayout.SOUTH);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularMatricula();
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumeroInscripcion.setText("");
                txtNombres.setText("");
                txtpatrimonio.setText("");
                txtestrato.setText("");
                matriculaLabel.setText("Valor de la matrícula: $");
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cierra la aplicación
            }
        });
    }
    private void calcularMatricula() {
        double numins = Double.parseDouble(txtNumeroInscripcion.getText());
        String nombres= txtNombres.getText();
        double patrimonio = Double.parseDouble(txtpatrimonio.getText());
        int estrato = Integer.parseInt(txtestrato.getText());
        Estudiante estudiante = new Estudiante(numins,nombres,patrimonio,estrato);
        matriculaLabel.setText("Valor de la matrícula: $" + estudiante.getPagoMatricula());
    }
}