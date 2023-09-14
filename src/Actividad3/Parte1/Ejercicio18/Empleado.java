package Actividad3.Parte1.Ejercicio18;

public class Empleado {
    private double codigoEmpleado;
    private String nombres;
    private double horas_trabajadas_mes;
    private double valor_hora_trabajada;
    private double porcentaje_retencion_fuente;
    private double salarioBruto;
    private double salarioNeto;

    public Empleado(double codigoEmpleado, String nombres, double horas_trabajadas_mes, double valor_hora_trabajada, double porcentaje_retencion_fuente) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombres = nombres;
        this.horas_trabajadas_mes = horas_trabajadas_mes;
        this.valor_hora_trabajada = valor_hora_trabajada;
        this.porcentaje_retencion_fuente = porcentaje_retencion_fuente;
        this.salarioBruto = this.horas_trabajadas_mes * this.valor_hora_trabajada;
        this.salarioNeto = this.salarioBruto - (this.salarioBruto * this.porcentaje_retencion_fuente);
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public double getSalarioNeto() {
        return this.salarioNeto;
    }
}
