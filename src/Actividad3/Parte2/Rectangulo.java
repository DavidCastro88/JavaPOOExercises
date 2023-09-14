package Actividad3.Parte2;

public class Rectangulo {
    double base; // Atributo que define la base de un rectángulo
    double altura; // Atributo que define la altura de un rectángulo

    /**
     * Constructor de la clase Rectangulo
     *
     * @param base   Parámetro que define la base de un rectángulo
     * @param altura Parámetro que define la altura de un rectángulo
     */
    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devuelve el área de un rectángulo como la
     * multiplicación de la base por la altura
     *
     * @return Área de un rectángulo
     */
    double calcularArea() {
        return base * altura;
    }

    /**
     * Método que calcula y devuelve el perímetro de un rectángulo
     * como (2 * base) + (2 * altura)
     *
     * @return Perímetro de un rectángulo
     */
    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}