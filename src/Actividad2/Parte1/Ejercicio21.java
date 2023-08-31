package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triangulo: ");
        int lado1 = scanner.nextInt();
        System.out.println("Ingrese el segundo lado del triangulo: ");
        int lado2 = scanner.nextInt();
        System.out.println("Ingrese el tercer lado del triangulo: ");
        int lado3 = scanner.nextInt();

        double perimetro = lado1+lado2+lado3;
        double semiperimetro = perimetro / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        System.out.println("El perimetro del triángulo es: "+perimetro);
        System.out.println("El semiperimetro del triángulo es: "+semiperimetro);
        System.out.println("El área del triángulo es: "+area);
    }
}
