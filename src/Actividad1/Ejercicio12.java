package Actividad1;

public class Ejercicio12 {
    public static void main(String[] args) {
        int horas = 48;
        double salarioHora = 5000;
        double porcentajeRetencion = 0.125;
        double salarioBruto = salarioHora*horas;
        double retencionFuente = salarioBruto*porcentajeRetencion;
        double salarioNeto= salarioBruto -retencionFuente;
        System.out.println("Salario Bruto: $"+salarioBruto);
        System.out.println("Retención en la Fuente: $"+retencionFuente);
        System.out.println("Salario Neto: $"+salarioNeto);
    }
}
