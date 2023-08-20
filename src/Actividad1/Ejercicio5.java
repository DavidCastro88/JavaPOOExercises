package Actividad1;

public class Ejercicio5 {
    public static void main(String[] args) {
        double suma,x,y;
        x=20;
        y=40;
        suma=0;
        suma = suma +x;
        x = x + Math.pow(y,2);
        suma = suma + x/y;
        System.out.println("El valor de la suma es: " + suma); //Output: 60.5
    }
}
