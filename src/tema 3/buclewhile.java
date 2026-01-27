import java.util.Scanner;

public class buclewhile {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    
   int i = 87;
   
   while (i != 0) {
     System.out.println("inserta un numero");
     i = sc.nextInt(); 
    }
    System.out.println("Usted ha terminado");
}
}
