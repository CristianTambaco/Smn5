package CONVERSION;
public class Main {


    public static void main (String[]args){

        int val2 = 7;
        double resultado2, con_val2;

        con_val2 = (double) (val2);
        resultado2 = con_val2;

        System.out.println("El resultado es:" + resultado2);


        double val1 = 8;
        String resultado, con_val1;

        con_val1 = String.valueOf(val1);
        resultado = con_val1;

        System.out.println("El resultado es:" + resultado);

    }

}

