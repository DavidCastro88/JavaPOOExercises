package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreEmpleado;
        double salarioHora, horas;
        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = scanner.nextLine();
        System.out.println("Ingrese el salario básico por hora: ");
        salarioHora = scanner.nextDouble();
        System.out.println("Ingrese el número de horas trabajadas: ");
        horas = scanner.nextDouble();

        double salarioTotal = salarioHora*horas;

        if (salarioTotal>450000){
            System.out.println("El salario mensual del empleado "+nombreEmpleado+" es de $"+salarioTotal);
        }else {
            System.out.println("Empleado: "+nombreEmpleado);
        }
    }
}
