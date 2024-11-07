package conversiones;
import java.util.Scanner;

//conversiones

public class Main {

    public static void main(String[] args){

        Scanner ingreso =new Scanner(System.in);

        String val1;
        //double val1;
        int resultado, con_val1;                    //conversion valor 1


        System.out.println("Ingrese un valor a multiplicar: ");
            val1 = ingreso.nextLine();
            con_val1= Integer.parseInt(val1);      //linea de conversion
            resultado=con_val1*2;

            System.out.println("El resultado es: "+ resultado);


    }
}
