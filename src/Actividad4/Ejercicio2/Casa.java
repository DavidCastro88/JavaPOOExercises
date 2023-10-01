package Actividad4.Ejercicio2;

public class Casa extends InmuebleVivienda{
    protected int cantidadPisos;
    Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos,int cantidadPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.cantidadPisos=cantidadPisos;
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de pisos = " + cantidadPisos);
    }
}
