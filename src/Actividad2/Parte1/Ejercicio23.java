package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();

        double discriminante = Math.pow(B,2) - (4 * A * C);

        if (discriminante > 0) {
            double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -B / (2 * A);
            System.out.println("La solución doble es: " + raiz);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}
