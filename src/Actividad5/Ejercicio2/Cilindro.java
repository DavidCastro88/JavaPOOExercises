package Actividad5.Ejercicio2;

public class Cilindro extends FiguraGeometrica {
    private double radio; // Atributo que establece el radio de un cilindro
    private double altura; // Atributo que establece la altura de un cilindro

 public Cilindro(double radio, double altura) {
    this.radio = radio;
    this.altura = altura;
    this.setVolumen(calcularVolumen());
    this.setSuperficie(calcularSuperficie());
}

    public double calcularVolumen() {
        double volumen = Math.PI * altura * Math.pow(radio, 2.0);
        return volumen;
    }

    public double calcularSuperficie() {
        double areaLadoA = 2.0 * Math.PI * radio * altura;
        double areaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
        return areaLadoA + areaLadoB;
    }
}
