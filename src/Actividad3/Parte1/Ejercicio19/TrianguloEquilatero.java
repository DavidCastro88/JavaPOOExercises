package Actividad3.Parte1.Ejercicio19;
public class TrianguloEquilatero {
    private double lado,perimetro,altura,area;
    public TrianguloEquilatero(double lado){
        this.lado =lado;
        this.perimetro = this.lado*3;
        this.altura = (this.lado* Math.sqrt(3))/2;
        this.area = (Math.pow(this.lado,2)*Math.sqrt(3))/4;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public double getAltura() {
        return altura;
    }
    public double getArea() {
        return area;
    }
}
