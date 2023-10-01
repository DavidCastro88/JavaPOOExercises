package Actividad4.Ejercicio2;

public class ApartamentoFamiliar extends Apartamento{
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones,
                        int numeroBanos,int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorAdministracion=valorAdministracion;
    }
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" +valorAdministracion);
        System.out.println();
    }
}
