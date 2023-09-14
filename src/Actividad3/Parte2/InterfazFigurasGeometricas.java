package Actividad3.Parte2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazFigurasGeometricas extends JFrame {
    private JButton btnCirculo, btnRectangulo, btnCuadrado, btnTriangulo;
    private JLabel lblResultado1,lblResultado2,lblResultado3,dato1Label,dato2Label;
    private JTextField txtDato1, txtDato2;
    private JButton btnCalcular, btnBorrar, btnSalir;

    private boolean esCirculoSeleccionado = false;
    private boolean esRectanguloSeleccionado = false;
    private boolean esCuadradoSeleccionado = false;
    private boolean esTrianguloSeleccionado = false;

    public InterfazFigurasGeometricas() {
        setTitle("Figuras Geométricas");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        dato1Label = new JLabel("");
        dato2Label = new JLabel("");
        lblResultado2 = new JLabel("");
        lblResultado3 = new JLabel("");
        lblResultado1 = new JLabel("");

        btnCalcular = new JButton("Calcular");
        btnBorrar = new JButton("Borrar");
        btnSalir = new JButton("Salir");

        JPanel seleccionPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        btnCirculo = new JButton("Círculo");
        btnRectangulo = new JButton("Rectángulo");
        btnCuadrado = new JButton("Cuadrado");
        btnTriangulo = new JButton("Triángulo");

        seleccionPanel.add(btnCirculo);
        seleccionPanel.add(btnRectangulo);
        seleccionPanel.add(btnCuadrado);
        seleccionPanel.add(btnTriangulo);


        JPanel datosPanel = new JPanel(new GridLayout(6, 2, 5, 5));
        datosPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 5, 20));
        txtDato1 = new JTextField(10);
        txtDato2 = new JTextField(10);

        datosPanel.add(dato1Label);
        datosPanel.add(txtDato1);
        datosPanel.add(dato2Label);
        datosPanel.add(txtDato2);
        datosPanel.add(lblResultado1);
        datosPanel.add(lblResultado2);
        datosPanel.add(lblResultado3);

        JPanel botonesPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        botonesPanel2.add(btnCalcular);
        botonesPanel2.add(btnBorrar);
        botonesPanel2.add(btnSalir);


        setLayout(new BorderLayout(10, 10));
        add(seleccionPanel, BorderLayout.NORTH);
        add(datosPanel, BorderLayout.CENTER);
        add(botonesPanel2, BorderLayout.SOUTH);

        btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                esCirculoSeleccionado = true;
                esRectanguloSeleccionado = false;
                esCuadradoSeleccionado = false;
                esTrianguloSeleccionado = false;
                mostrarCampos1("Radio del círculo:");
            }
        });

        btnRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                esCirculoSeleccionado = false;
                esRectanguloSeleccionado = true;
                esCuadradoSeleccionado = false;
                esTrianguloSeleccionado = false;
                mostrarCampos2("Base del Rectángulo:", "Altura del Rectángulo:");
            }
        });

        btnCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                esCirculoSeleccionado = false;
                esRectanguloSeleccionado = false;
                esCuadradoSeleccionado = true;
                esTrianguloSeleccionado = false;
                mostrarCampos1("Lado del Cuadrado:");
            }
        });

        btnTriangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                esCirculoSeleccionado = false;
                esRectanguloSeleccionado = false;
                esCuadradoSeleccionado = false;
                esTrianguloSeleccionado = true;
                mostrarCampos2("Base del Triángulo:", "Altura del Triángulo:");
            }
        });

        // Acciones de los botones de cálculo, borrado y salida
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularFigura();
            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cierra la aplicación
            }
        });
    }

    private void mostrarCampos1(String label1) {
        dato1Label.setText(label1);
        dato2Label.setText("");
        lblResultado1.setText("");
        lblResultado2.setText("");
        lblResultado3.setText("");
        txtDato1.setText("");
        txtDato2.setVisible(false);
        dato2Label.setVisible(false);
        lblResultado1.setVisible(false);
        lblResultado2.setVisible(false);
        lblResultado3.setVisible(false);
        txtDato1.setVisible(true);
    }

    private void mostrarCampos2(String label1, String label2) {
        dato1Label.setText(label1);
        dato2Label.setText(label2);
        lblResultado1.setText("");
        lblResultado2.setText("");
        lblResultado3.setText("");
        txtDato1.setText("");
        txtDato2.setText("");
        txtDato2.setVisible(true);
        dato2Label.setVisible(true); 
        lblResultado1.setVisible(false);
        lblResultado2.setVisible(false);
        lblResultado3.setVisible(false);
        txtDato1.setVisible(true);
    }

    private void calcularFigura() {
        double area = 0;
        double perimetro = 0;

        if (esCirculoSeleccionado) {
            double radio = Double.parseDouble(txtDato1.getText());
            Circulo circulo = new Circulo(radio);
            area = circulo.calcularArea();
            perimetro = circulo.calcularPerimetro();
            lblResultado1.setVisible(true);
            lblResultado1.setText("Área del circulo de radio "+radio+" es: "+Math.round(area * 1000.0) / 1000.0);
            lblResultado2.setVisible(true);
            lblResultado2.setText("Perímetro del circulo de radio "+radio+" es: "+Math.round(perimetro * 1000.0) / 1000.0);

        } else if (esRectanguloSeleccionado) {
            double base = Double.parseDouble(txtDato1.getText());
            double altura = Double.parseDouble(txtDato2.getText());
            Rectangulo rectangulo = new Rectangulo(base,altura);
            area = rectangulo.calcularArea();
            perimetro = rectangulo.calcularPerimetro();
            lblResultado1.setVisible(true);
            lblResultado1.setText("El Área del rectangulo es: "+Math.round(area * 1000.0) / 1000.0);
            lblResultado2.setVisible(true);
            lblResultado2.setText("El Perímetro del cuadrado es: "+Math.round(perimetro * 1000.0) / 1000.0);
        } else if (esCuadradoSeleccionado) {
            double lado = Double.parseDouble(txtDato1.getText());
            Cuadrado cuadrado = new Cuadrado(lado);
            area = cuadrado.calcularArea();
            perimetro = cuadrado.calcularPerimetro();
            lblResultado1.setVisible(true);
            lblResultado1.setText("Área del cuadrado de radio "+lado+" es: "+Math.round(area * 1000.0) / 1000.0);
            lblResultado2.setVisible(true);
            lblResultado2.setText("Perímetro del cuadrado de radio "+lado+" es: "+Math.round(perimetro * 1000.0) / 1000.0);
        } else if (esTrianguloSeleccionado) {
            double base = Double.parseDouble(txtDato1.getText());
            double altura = Double.parseDouble(txtDato2.getText());
            TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(base,altura);
            area = trianguloRectangulo.calcularArea();
            perimetro = trianguloRectangulo.calcularPerimetro();
            String tipo = trianguloRectangulo.determinarTipoTriangulo();
            lblResultado1.setVisible(true);
            lblResultado1.setText("El Área del triángulo es: "+Math.round(area * 1000.0) / 1000.0);
            lblResultado2.setVisible(true);
            lblResultado2.setText("El Perímetro del triángulo es: "+Math.round(perimetro * 1000.0) / 1000.0);
            lblResultado3.setVisible(true);
            lblResultado3.setText("El triángulo con base "+base+" y altura "+altura+" "+tipo);
        }

    }
    private void limpiarCampos() {
        txtDato1.setText("");
        txtDato2.setText("");
        lblResultado1.setText("");
        lblResultado2.setText("");
        lblResultado3.setText("");
    }
}