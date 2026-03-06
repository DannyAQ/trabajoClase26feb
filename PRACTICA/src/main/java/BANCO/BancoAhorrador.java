package BANCO;
import java.util.Scanner;
public class BancoAhorrador {
    public static void main (String args[]){

        Scanner in = new Scanner(System.in);
        int tipoTransaccion=0;
        System.out.println("Hola, Bienvenido a Banco El Ahorrador, si su nueva cuenta tiene saldo, ingreselo, de lo contrario ponga 0");
        double saldoingresado=in.nextDouble();
        Cuenta cuenta1= new Cuenta(saldoingresado);
        while (tipoTransaccion != 4){
            System.out.println("INGRESA NUMERO ORDEN : 1- DEPOSITAR   2- RETIRAR   3-. CONSULTAR AHORROSALDO");
            tipoTransaccion= in.nextInt();
            if(tipoTransaccion ==1){
                System.out.print("Ingrese monto a depositar: ");
                double montodep = in.nextDouble();
                cuenta1.depositar(montodep);

            } else if(tipoTransaccion ==2){
                System.out.print("Ingrese monto a retirar: ");
                double montoret = in.nextDouble();
                cuenta1.retirar(montoret);

            } else if(tipoTransaccion ==3){

                cuenta1.consultar();

            } else if(tipoTransaccion ==4) {

                System.out.println("Gracias por usar nuestro banco, esperamos tenerte de vuelta pronto");

            } else{
                System.out.println("Error, opcion no existe");

            }
        }

    }
}
