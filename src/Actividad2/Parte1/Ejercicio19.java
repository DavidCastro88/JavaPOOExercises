package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        double lado_triangulo_equilatero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado del triangulo equilatero: ");
        lado_triangulo_equilatero = scanner.nextDouble();

        double perimetro = lado_triangulo_equilatero*3;
        double altura = (lado_triangulo_equilatero * Math.sqrt(3))/2;
        double area = (Math.pow(lado_triangulo_equilatero,2)*Math.sqrt(3))/4;

        System.out.println("El perimetro del triangulo equilatero de lado: "+lado_triangulo_equilatero+" es: "+perimetro);
        System.out.println("La altura del triangulo equilatero de lado: "+lado_triangulo_equilatero+" es: "+altura);
        System.out.println("El area del triangulo equilatero de lado: "+lado_triangulo_equilatero+" es: "+area);

    }
}
