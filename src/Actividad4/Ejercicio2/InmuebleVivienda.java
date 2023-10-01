package Actividad4.Ejercicio2;
public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBanos;
    InmuebleVivienda(int identificadorInmobiliario, int area, String direccion,int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroBanos=numeroBanos;
        this.numeroHabitaciones=numeroHabitaciones;
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones = " + numeroHabitaciones);
        System.out.println("Número de baños = " + numeroBanos);
    }
}
