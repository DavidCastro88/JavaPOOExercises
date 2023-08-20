package Actividad1;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio,2);
        double longitudCircunferencia = 2*Math.PI * radio;
        System.out.println("El area del circulo de radio: "+radio+" es igual a: "+area);
        System.out.println("La longitud de la circunferencia de radio: "+radio+" es igual a: "+longitudCircunferencia);
    }
}
