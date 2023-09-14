package Actividad3.Parte1.Ejercicio10;

public class Estudiante {
    private double numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estratoSocial;
    private double pagoMatricula = 50000;

    public Estudiante(double numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
        if (this.patrimonio>2000000 && this.estratoSocial>3){
            this.pagoMatricula = this.pagoMatricula + (this.patrimonio*0.03);
        }
    }

    public double getPagoMatricula() {
        return pagoMatricula;
    }
}
