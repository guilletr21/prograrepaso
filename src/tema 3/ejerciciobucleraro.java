import java.util.Scanner;


public class ejerciciobucleraro {
    
public static void main(String[] args) throws Exception {
    
Scanner input = new Scanner (System.in);
    
    System.out.println("ingrese un numero del 1 al 10");
    int numero = input.nextInt();
    
    for(int i = 0;i<10;i++) {
        System.out.println(numero + "*" + i + "=" + numero*i);
    }




}
}