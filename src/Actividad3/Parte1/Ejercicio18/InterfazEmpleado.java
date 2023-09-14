package Actividad3.Parte1.Ejercicio18;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazEmpleado extends JFrame {
    private JTextField codigoField, nombresField, horasField, valorHoraField, retencionField;
    private JButton calcularButton,  borrarButton, salirButton;
    private JLabel salarioBrutoLabel, salarioNetoLabel;

    public InterfazEmpleado() {

        setTitle("Información del Empleado");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel codigoLabel = new JLabel("Código del Empleado:");
        JLabel nombresLabel = new JLabel("Nombres:");
        JLabel horasLabel = new JLabel("Horas Trabajadas al Mes:");
        JLabel valorHoraLabel = new JLabel("Valor Hora Trabajada:");
        JLabel retencionLabel = new JLabel("Porcentaje de Retención en la Fuente (%):");

        codigoField = new JTextField(10);
        nombresField = new JTextField(20);
        horasField = new JTextField(5);
        valorHoraField = new JTextField(5);
        retencionField = new JTextField(5);


        calcularButton = new JButton("Calcular");
        borrarButton = new JButton("Borrar");
        salirButton = new JButton("Salir");
        salarioBrutoLabel = new JLabel("Salario Bruto: $0");
        salarioNetoLabel = new JLabel("Salario Neto: $0");

        setLayout(new BorderLayout(10, 10));

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        botonesPanel.add(calcularButton);
        botonesPanel.add(borrarButton);
        botonesPanel.add(salirButton);

        JPanel datosPanel = new JPanel(new GridLayout(6, 2, 5, 5));
        datosPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20));
        datosPanel.add(codigoLabel);
        datosPanel.add(codigoField);
        datosPanel.add(nombresLabel);
        datosPanel.add(nombresField);
        datosPanel.add(horasLabel);
        datosPanel.add(horasField);
        datosPanel.add(valorHoraLabel);
        datosPanel.add(valorHoraField);
        datosPanel.add(retencionLabel);
        datosPanel.add(retencionField);
        datosPanel.add(salarioBrutoLabel);
        datosPanel.add(salarioNetoLabel);

        add(datosPanel, BorderLayout.CENTER);
        add(botonesPanel, BorderLayout.SOUTH);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularSalarios();
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codigoField.setText("");
                nombresField.setText("");
                horasField.setText("");
                valorHoraField.setText("");
                retencionField.setText("");
                salarioBrutoLabel.setText("Salario Bruto: $0");
                salarioNetoLabel.setText("Salario Neto: $0");
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cierra la aplicación
            }
        });
    }
    private void calcularSalarios() {
            double codigo = Double.parseDouble(codigoField.getText());
            String nombres= nombresField.getText();
            double horasTrabajadas = Double.parseDouble(horasField.getText());
            double valorHora = Double.parseDouble(valorHoraField.getText());
            double retencion = Double.parseDouble(retencionField.getText())/100;
            Empleado empleado = new Empleado(codigo,nombres,horasTrabajadas,valorHora,retencion);
            salarioBrutoLabel.setText("Salario Bruto: $" + empleado.getSalarioBruto());
            salarioNetoLabel.setText("Salario Neto: $" + empleado.getSalarioNeto());
    }
}




