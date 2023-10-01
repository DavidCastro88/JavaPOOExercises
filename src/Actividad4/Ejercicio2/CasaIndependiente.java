package Actividad4.Ejercicio2;

public class CasaIndependiente extends  CasaUrbana{
    protected static double valorArea = 3000000;
    CasaIndependiente(int identificadorInmobiliario, int area, String direccion,
                      int numeroHabitaciones, int numeroBanos, int cantidadPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, cantidadPisos);
    }
    public void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
