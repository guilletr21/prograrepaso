import java.util.Scanner;

public class piedraapapeltijera_2 {

        public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("el jugador 1 saca piedra, papel o tijera");
    int N1  = sc.nextInt();
    
    System.out.println("el jugador 2 saca piedra, papel o tijera");
    int N2  = sc.nextInt();

    if (N1 == 1 && N2 == 3 || N1 == 2 && N2 == 1 || N1 == 3 && N2 == 2) {
        System.out.println("gana el jugador 1");

    } else if (N1 == 1 && N2 == 2 || N1 == 2 && N2 == 3 || N1 == 3 && N2 == 1) {
        System.out.println("gana el jugador 2");

    } else if (N1 == 1 && N2 == 1 || N1 == 2 && N2 == 2 || N1 == 3 && N2 == 3) {
        System.out.println("empate");
        }
    }
}