package Actividad4.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Prueba 1
        CuentaCorriente cuenta1 = new CuentaCorriente(1000, 0.12f);
        cuenta1.consignar(1000);
        cuenta1.retirar(2500);
        cuenta1.retirar(1000); //saldo en 0 sobregiro en 15000
        cuenta1.consignar(1600);
        cuenta1.retirar(2000);
        cuenta1.imprimir();
        System.out.println("--------------");

        //Prueba 2
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial= $");
        float saldoInicialAhorros = input.nextFloat();
        System.out.print("Ingrese tasa de interés= ");
        float tasaAhorros = input.nextFloat();
        CuentaAhorros cuenta2 = new
                CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadDepositar = input.nextFloat();
        cuenta2.consignar(cantidadDepositar);
        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();
        cuenta2.retirar(cantidadRetirar);
        cuenta2.extractoMensual();
        cuenta2.imprimir();
    }
}
