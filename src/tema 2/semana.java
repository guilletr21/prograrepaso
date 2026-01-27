import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class semana {
public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("¿Que dia de la semana es?");
    int dia = sc.nextInt();
    switch (dia) {
        case 1:
        case 2:
        case 3:    
        case 4:
        case 5:
        System.out.println("dia entre semana");   
        break;
        case 6:
        case 7:
        System.out.println("Dia fin de semana");
        break;
        default:
           System.out.println("eRROr");
    }


}   
}
