package Actividad2.Parte1;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesoA, pesoB, pesoC, pesoD;
        System.out.println("Ingrese el peso de la esfera A: ");
        pesoA = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        pesoB = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        pesoC = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera D: ");
        pesoD = scanner.nextDouble();

        if((pesoA==pesoB) && (pesoA==pesoC)){
            if(pesoA>pesoD){
                System.out.println("La esfera D es la de diferente peso y tiene menor peso que las otras tres esferas");
            }else{
                System.out.println("La esfera D es la de diferente peso y tiene mayor peso que las otras tres esferas");
            }
        }else if ((pesoA==pesoB) && (pesoA==pesoD)) {
            if(pesoA>pesoC){
                System.out.println("La esfera C es la de diferente peso y tiene menor peso que las otras tres esferas");
            }else{
                System.out.println("La esfera C es la de diferente peso y tiene mayor peso que las otras tres esferas");
            }
        }else if ((pesoA==pesoC) && (pesoA==pesoD)) {
            if(pesoA>pesoB){
                System.out.println("La esfera B es la de diferente peso y tiene menor peso que las otras tres esferas");
            }else{
                System.out.println("La esfera B es la de diferente peso y tiene mayor peso que las otras tres esferas");
            }
        }else{
            if(pesoB>pesoA){
                System.out.println("La esfera A es la de diferente peso y tiene menor peso que las otras tres esferas");
            }else{
                System.out.println("La esfera A es la de diferente peso y tiene mayor peso que las otras tres esferas");
            }
        }
    }
}
