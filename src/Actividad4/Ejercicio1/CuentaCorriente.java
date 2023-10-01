package Actividad4.Ejercicio1;

public class CuentaCorriente extends  Cuenta{
    private float sobreGiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.sobreGiro=0;
    }
    public void retirar(float cantidad){
        float resultado = cantidad - this.saldo;
        if(cantidad>this.saldo){
            this.saldo=0;
            this.sobreGiro=resultado+this.sobreGiro;
        }else{
            super.retirar(cantidad);
        }
    }
    public void consignar(float cantidad){
        float residuo = this.sobreGiro - cantidad;
        if (this.sobreGiro > 0) {
            if ( residuo > 0) { // Si el esobregiro es mayor que lo que  entra se reduce el sobregiro
                this.sobreGiro = residuo;
                this.saldo=0;
            } else { //Si lo que entra es mayor al sobregiro, entonces el sobre giro va ser 0, y el saldo va ser lo
                    //que queda después de reducir el sobregiro en este caso el residuo pero * -1
                this.sobreGiro = 0;
                saldo = residuo*-1;
            }
        } else {
            super.consignar(cantidad);
        }

    }
    @Override
    public void imprimir() {
        System.out.println(
                "Saldo: " + this.saldo +
                        "\nNúmero de transacciones: " + (this.numeroConsignaciones + this.numeroRetiros) +
                        "\nComisión Mensual: " + this.comisionMensual +
                        "\nValor de Sobregiro: " + this.sobreGiro
        );
    }
}
