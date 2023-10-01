package Actividad4.Ejercicio2;

public class ApartaEstudio extends Apartamento{
    protected static double valorArea = 1500000;
    ApartaEstudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones,
                  int numeroBanos) {
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    public void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
