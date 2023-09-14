package Actividad3.Parte1.Ejercicio22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazEmpleado extends JFrame {
    private JTextField txtNombre, txtSalarioHora, txtHoras;
    private JButton calcularButton,  borrarButton, salirButton;
    private JLabel salarioMensualLabel,empleadoLabel;

    public InterfazEmpleado() {

        setTitle("Información del Empleado");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel nombresLabel = new JLabel("Nombres del empleado:");
        JLabel salarioHoraLabel = new JLabel("Horas Trabajadas al Mes:");
        JLabel horaLabel = new JLabel("Valor Hora Trabajada:");

        txtNombre = new JTextField(10);
        txtSalarioHora = new JTextField(20);
        txtHoras = new JTextField(5);

        calcularButton = new JButton("Calcular");
        borrarButton = new JButton("Borrar");
        salirButton = new JButton("Salir");
        salarioMensualLabel = new JLabel("");
        empleadoLabel = new JLabel("");

        setLayout(new BorderLayout(10, 10));

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        botonesPanel.add(calcularButton);
        botonesPanel.add(borrarButton);
        botonesPanel.add(salirButton);

        JPanel datosPanel = new JPanel(new GridLayout(6, 2, 5, 5));
        datosPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20));
        datosPanel.add(nombresLabel);
        datosPanel.add(txtNombre);
        datosPanel.add(salarioHoraLabel);
        datosPanel.add(txtSalarioHora);
        datosPanel.add(horaLabel);
        datosPanel.add(txtHoras);
        datosPanel.add(empleadoLabel);
        datosPanel.add(salarioMensualLabel);


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
                txtNombre.setText("");
                txtSalarioHora.setText("");
                txtHoras.setText("");
                salarioMensualLabel.setText("");
                empleadoLabel.setText("");
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
        String nombres= txtNombre.getText();
        double salariohora = Double.parseDouble(txtSalarioHora.getText());
        double horas = Double.parseDouble(txtHoras.getText());
        Empleado empleado = new Empleado(nombres,salariohora,horas);
        if(empleado.getSalarioMensual()>450000){
            empleadoLabel.setText("Nombre del empleado: "+empleado.getNombreEmpleado());
            salarioMensualLabel.setText("Salario mensual del empleado: $"+empleado.getSalarioMensual());
        }else{
            empleadoLabel.setText("Nombre del empleado: "+empleado.getNombreEmpleado());
            salarioMensualLabel.setText("");
        }
    }
}
