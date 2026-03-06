package BANCO;

public class Cuenta {
    private double saldo;


    public Cuenta(){}

    public Cuenta(Double saldo){
        this.saldo=saldo;
    }
    public void depositar (double montodep){
        saldo+=montodep;

    }
    public void retirar (double montoret){
        if (montoret>saldo){
            System.out.println("Tu ahorracuenta tiene fondos insuficientes, tu actual saldo es" + saldo);
        }else{
            saldo-=montoret;
            System.out.println("Tu saldo se ha retirado, en tu cuenta quedo " + saldo);

        }

    }
    public void consultar (){
        System.out.println("Tu saldo es" + saldo);
    }
}
