package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroInscripcion;
        String nombres;
        double patrimonio;
        int estratoSocial;
        double pagoMatricula = 50000;
        System.out.println("Ingrese el número de inscripción: ");
        numeroInscripcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese los nombres del estudiante: ");
        nombres = scanner.nextLine();
        System.out.println("Ingrese el valor del patrimonio del estudiante: ");
        patrimonio = scanner.nextDouble();
        System.out.println("Ingrese el estrato social del estudiante: ");
        estratoSocial = scanner.nextInt();

        if (patrimonio>2000000 && estratoSocial>3){
            pagoMatricula = pagoMatricula + (patrimonio*0.03);
        }
        System.out.println("El estudiante "+nombres+" con número de inscripción "+numeroInscripcion+" debe pagar $"+pagoMatricula);
    }
}
