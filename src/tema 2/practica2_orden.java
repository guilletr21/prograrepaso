import java.util.Scanner;

public class practica2_orden {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         
        System.out.println("introduce el primer numero");
        int n1=sc.nextInt();
        
        System.out.println("introduce el segundo numero");
        int n2=sc.nextInt();
        
        System.out.println("introduce el tercer numero");
        int n3=sc.nextInt();


       
        if (n1 <= n2 && n2 <= n3){
            System.out.println("esta en orden ascendente");
       
     }else if (n1 >= n2 && n2 >= n3 && n3 <= n1) {
        
        System.out.println("No esta en orden");
     }

        
    }
}