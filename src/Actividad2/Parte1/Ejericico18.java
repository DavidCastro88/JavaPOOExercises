package Actividad2.Parte1;

import java.util.Scanner;

public class Ejericico18 {
    public static void main(String[] args) {
        int codigoEmpleado;
        String nombres;
        int horas_trabajadas_mes;
        double valor_hora_trabajada ;
        double porcentaje_retencion_fuente;
        double salario_bruto;
        double salario_neto;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el codigo del Empleado: ");
        codigoEmpleado = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese los nombres del Empleado: ");
        nombres = scanner.nextLine();
        System.out.println("Ingrese las horas trabajadas del Empleado: ");
        horas_trabajadas_mes = scanner.nextInt();
        System.out.println("Ingrese el valor de la hora: ");
        valor_hora_trabajada = scanner.nextDouble();
        System.out.println("Ingrese el porcentaje de retención en la fuente: ");
        porcentaje_retencion_fuente = scanner.nextDouble();

        salario_bruto = horas_trabajadas_mes * valor_hora_trabajada;
        salario_neto = salario_bruto - (salario_bruto * porcentaje_retencion_fuente);

        System.out.println("Código del empleado: " + codigoEmpleado);
        System.out.println("Nombre del empleado: " + nombres);
        System.out.println("Salario Bruto del Empleado: $" + salario_bruto);
        System.out.println("Salario Neto del Empleado: $" + salario_neto);

    }

}
