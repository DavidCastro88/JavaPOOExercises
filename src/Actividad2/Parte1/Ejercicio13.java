package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        double valor_compra = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese el color de la bolita: ");
        String color_bolita = scanner.nextLine().toLowerCase();

        double descuento = 0;

        if (color_bolita.equals("verde")){
            descuento = 0.1;
        } else if (color_bolita.equals("amarilla")) {
            descuento = 0.25;
        } else if (color_bolita.equals("azul")) {
            descuento =0.5;
        } else if (color_bolita.equals("roja")) {
            descuento =1;
        }
        double valor_a_pagar = valor_compra * (1-descuento);
        System.out.println("El cliente debe pagar: $"+valor_a_pagar);

    }
}
