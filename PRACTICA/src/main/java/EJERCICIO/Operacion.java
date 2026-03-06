package EJERCICIO;
import java.util.Scanner;
public class Operacion {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numeroOrden=0;
        int variable1 = 6;
        int variable2 = 3;
        int resultado = 0;

        System.out.println("INGRESA NUMERO ORDEN");
        numeroOrden= in.nextInt();
        if(numeroOrden ==1){
            resultado = variable1 * variable2;
                System.out.println("El Resultado de la multiplicacion es " + resultado);
    } else if (numeroOrden ==2 ) {
            resultado = variable1 + variable2;
            System.out.println("El resultado de la suma es " + resultado);

        } else if (numeroOrden ==3) {
            resultado = variable1 - variable2;
            System.out.println("El resultao de la resta es " + resultado);

        } else{
            System.out.println("");

        }
    }
}
