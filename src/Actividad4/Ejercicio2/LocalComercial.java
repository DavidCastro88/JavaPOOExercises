package Actividad4.Ejercicio2;

public class LocalComercial extends Local{
    protected static double valorArea = 3000000;
    protected String centroComercial;
    LocalComercial(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, String centroComercial) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial=centroComercial;
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}
