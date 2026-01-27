import java.util.Scanner;

public class ejerciciobucleraro2 {
    public static void main(String[] args) throws Exception {
    
Scanner input = new Scanner (System.in);

int numero=0;
int negativos=0;
int positivos=0;
int ceros=0;

for(int i=1; i>6;i++) {
    System.out.println("ingrese un numero");
    numero = input.nextInt();
     if(numero>=1) {
    System.out.println("el numero es positivo");
    positivos++;

    } else if (numero<=-1) {
    System.out.println("el numero es negativo");
    negativos++;

    } else {
    System.out.println("el numero es cero");    
    ceros++;

    }
    System.out.println("tienes"+ "" + positivos+ " " + "positivos");
     System.out.println("tienes"+ "" + negativos+ " " + "negativos");
    System.out.println("tienes"+ "" + ceros+ " " + "ceros");

}
}}