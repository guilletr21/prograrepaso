import java.util.Scanner;

public class piedrapapeltijera {
    public static void main(String[] args) throws Exception {
      
    Scanner sc = new Scanner(System.in);
    System.out.println("piedra, papel o tijera");
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        
        if (n1.equals("piedra") && n2.equals("tijera") ||
         n1.equals("papel") && n2.equals("piedra")  || 
         n1.equals("tijera") && n2.equals("papel")) {
            System.out.println("gana el jugador 1");
       
        } else if (n1.equals(n2)) {
            System.out.println("empate");
        
        } else {
            System.out.println("gana el jugador 2");
        }
}    
}