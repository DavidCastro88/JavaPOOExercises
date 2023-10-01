package Actividad4.Ejercicio4;

public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;

    protected Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima =velocidadMaxima;
    }

    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio = " +velocidadMaxima);
    }

    @Override
    String imprimirTipo() {
        return "Es un contrarrelojista";
    }
}
