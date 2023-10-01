package Actividad4.Ejercicio1;

public class Cuenta {

    protected float saldo;
    protected int numeroConsignaciones =0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    //Constructor
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    //Método para ingresar dinero a la cuenta
    public void consignar(float cantidad){
        this.saldo = this.saldo+cantidad;
        this.numeroConsignaciones++;
    }
    //Método para retirar dinero de la cuenta
    public void retirar(float cantidad){
        if (cantidad > this.saldo) {
            System.out.println("La cantidad que solicita es mayor a su saldo disponible, por favor ingrese una cantidad valida");
        }else{
            this.saldo-= cantidad;
            this.numeroRetiros++;
        }
    }
    //Método para calcular el interés mensual, a partir de la tasa anual, actualizando el saldo
    public void calcularInteresMensual(){
        float tasaMensual = this.tasaAnual /12;
        float interesMensual = this.saldo*tasaMensual;
        this.saldo+=interesMensual;
    }
    //Método ExtractoMensual
    public void extractoMensual(){
        this.saldo -= this.comisionMensual;
        calcularInteresMensual();
    }
    //Método que me imprime todos los atributos
    public void imprimir(){
        System.out.println(
                "Saldo: "+ this.saldo +
                "\nNúmero de consignaciones: "+this.numeroConsignaciones+
                "\nNúmero de retiros: "+this.numeroRetiros+
                "\nTasa anual: "+this.tasaAnual+
                "\nComisión Mensual: "+this.comisionMensual
                );
    }
    public float getSaldo() {
        return saldo;
    }
    public int getNumeroConsignaciones(){
        return numeroConsignaciones;
    };

    public int getNumeroRetiros(){
        return numeroRetiros;
    };
}
