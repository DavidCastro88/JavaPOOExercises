package Actividad1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        int edadJuan,edadAna,edadAlberto,edadMama = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hola Juan,ingresa tu edad: ");
        //Problemas cuando no se trabaja con edades que no son mútiplos de 3
        edadJuan = scanner.nextInt();
        edadAna = 4*(edadJuan/3);
        edadAlberto = 2*(edadJuan/3);
        edadMama = edadJuan + edadAna + edadAlberto;
        System.out.println("Edad de Juan: "+edadJuan);
        System.out.println("Edad de Alberto: "+edadAlberto);
        System.out.println("Edad de Ana: "+edadAna);
        System.out.println("Edad de Mamá: "+edadMama);

    }
}
