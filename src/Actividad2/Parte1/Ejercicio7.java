package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de A:");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el valor de B:");
        double b= scanner.nextDouble();

        if (a>b){
            System.out.println("A es mayor que B");
        } else if (a<b) {
            System.out.println("B es mayor que A");
        } else{
            System.out.println("A es igual a B");
        }

    }
}
