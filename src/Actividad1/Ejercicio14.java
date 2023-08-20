package Actividad1;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double numero = scanner.nextDouble();
        double cuadradoNum = Math.pow(numero,2);
        double cuboNum = Math.pow(numero,3);
        System.out.println("El cuadrado de: "+numero+" es igual a: "+cuadradoNum);
        System.out.println("El cubo de: "+numero+" es igual a: "+cuboNum);
    }
}
