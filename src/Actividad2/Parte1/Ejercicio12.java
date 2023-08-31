package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        String nombres = scanner.nextLine();
        System.out.println("Ingrese el número de horas trabajadas por el empleado: ");
        int horas = scanner.nextInt();
        System.out.println("Ingrese el valor de la hora de trabajo: ");
        double valorHora = scanner.nextDouble();

        int horas_extras =0;
        int horas_super_extras =0;
        int horas_normales=0;

        if (horas>40){
            if (horas>48){
                horas_super_extras=horas-48;
                horas_extras = 8;
                horas_normales =40;
            }else{
                horas_extras = horas - 40;
                horas_normales = 40;
            }
        }else {
            horas_normales =horas;
        }
        double salario = (horas_normales*valorHora)+(horas_extras*valorHora*2)+(horas_super_extras*valorHora*3);
        System.out.println("El empleado "+nombres+" devengo un salario de $"+salario);
    }
}

