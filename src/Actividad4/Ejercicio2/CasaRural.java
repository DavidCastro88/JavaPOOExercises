package Actividad4.Ejercicio2;

public class CasaRural extends Casa{
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;

    CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones,
              int numeroBanos, int cantidadPisos, int distanciaCabera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, cantidadPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud=altitud;
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Distancia la cabecera municipal = " + numeroHabitaciones + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud +" metros.");
        System.out.println();
    }
}
