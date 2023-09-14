package Actividad3.Parte1.Ejercicio22;

public class Empleado {
    private String nombreEmpleado;
    private double salarioHora, horas,salarioMensual;

    public Empleado(String nombreEmpleado, double salarioHora, double horas) {
        this.nombreEmpleado = nombreEmpleado;
        this.salarioHora = salarioHora;
        this.horas = horas;
        this.salarioMensual = this.salarioHora * this.horas;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
}

