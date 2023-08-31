package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesoA, pesoB, pesoC;
        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = scanner.nextDouble();

        if((pesoA>pesoB && pesoA>pesoC)){
            System.out.println("La esfera A tiene el mayor peso de las tres esferas");
        } else if (pesoB>pesoA && pesoB>pesoC) {
            System.out.println("La esfera B tiene el mayor peso de las tres esferas");
        }else {
            System.out.println("La esfera C tiene el mayor peso de las tres esferas");
        }
    }
}
