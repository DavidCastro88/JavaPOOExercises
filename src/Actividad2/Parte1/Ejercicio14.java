package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double ventasDepto1,ventasDepto2, ventasDepto3,salariobase,salario1,salario2,salario3;
        System.out.println("Ingrese las ventas del departamento 1:");
        ventasDepto1 = scanner.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2:");
        ventasDepto2 = scanner.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3:");
        ventasDepto3 = scanner.nextDouble();
        System.out.println("Ingrese el salario de los vendedores:");
        salariobase = scanner.nextDouble();

        double total_ventas = ventasDepto1 + ventasDepto2 + ventasDepto3;
        double valor_comparativo = 0.33*total_ventas;

        if (ventasDepto1>valor_comparativo){
            salario1 = salariobase * (1.2);
        }else {
            salario1 = salariobase;
        }
        if (ventasDepto2>valor_comparativo){
            salario2 = salariobase * (1.2);
        }else {
            salario2 = salariobase;
        }
        if (ventasDepto3>valor_comparativo){
            salario3 = salariobase * (1.2);
        }else {
            salario3 =salariobase;
        }
        System.out.println("El salario de los de vendedores del departamento 1 es: $"+salario1);
        System.out.println("El salario de los de vendedores del departamento 2 es: $"+salario2);
        System.out.println("El salario de los de vendedores del departamento 3 es: $"+salario3);
    }
}
