

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class bucle_2 {
    public static void main(String[] args) throws Exception{
     Scanner sc = new Scanner(System.in);
    int opcion=0;
     do {
    
System.out.println("Introduce el ejerccio que quieras");
System.out.println("1 - suma");
System.out.println("2 - hipotenusa");
System.out.println("3 - segubndos");
System.out.println("0 - salir");

        switch(opcion) {
            case 1:
                System.out.println("Has elegido suma");
                break;
            case 2:
                System.out.println("Has elegido hipotenusa");
                break;
            case 3:
                System.out.println("Has elegido segundos");
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        System.out.print("Introduce una opción: ");
        opcion = sc.nextInt();
        
     } while(opcion != 0);  
 }

}
