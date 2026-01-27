import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

         System.out.println("introduzca un numero");
        int numero = sc.nextInt();
        
    
        for( int i = numero - 1; i>=1; i--){
         numero = numero * i ;
         System.out.println(numero);
  
  
  
  
    }
}
}