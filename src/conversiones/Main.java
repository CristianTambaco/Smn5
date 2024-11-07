package conversiones;
import java.util.Scanner;

//conversiones

public class Main {

    public static void main(String[] args){

        Scanner ingreso =new Scanner(System.in);

        int val1;       //entero val1
        String resultado, con_val1;           //a cadena         //conversion valor 1


        System.out.println("Ingrese un valor a multiplicar: ");
            val1 = ingreso.nextInt();

            con_val1= String.valueOf(val1);      //linea de conversion
            resultado=con_val1;    //calculo

            System.out.println("El resultado es: "+ resultado);


    }
}
