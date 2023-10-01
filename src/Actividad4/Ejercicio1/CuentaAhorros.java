package Actividad4.Ejercicio1;

public class CuentaAhorros extends Cuenta {
    private boolean activa;
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo>=10000){
            this.activa = true;
        }else{
            this.activa=false;
        }
    }
    public void retirar(float cantidad) {
        if (this.activa) super.retirar(cantidad);
    }
    public  void consignar(float cantidad){
        if (this.activa) super.consignar(cantidad);
    }
    public  void extractoMensual(){
        if(this.numeroRetiros>4){
          this.comisionMensual += (numeroRetiros-4)*1000;
        }
        super.extractoMensual();
        if (saldo<10000){
            activa=false;
        }
    }
    //Sobreescribimos el método imprimir
    @Override
    public void imprimir() {
        System.out.println(
                "Saldo: " + this.saldo +
                "\nNúmero de transacciones: " + (this.numeroConsignaciones + this.numeroRetiros) +
                "\nComisión Mensual: " + this.comisionMensual
        );
    }
}
