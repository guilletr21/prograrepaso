import java.util.Scanner;

public class tiempo {
    public static void main(String[] args) throws Exception {
      
    Scanner sc = new Scanner(System.in);
    
    
    double x = 5;
    double y = 6;
    double h = 3;
    double z = 8;
    
    System.out.println("Dame los dias");
     x = sc.nextInt();

    
    System.out.println("dame las horas");
     y = sc.nextInt();
    

    System.out.println("dame los minutos");
    h = sc.nextInt();

    
    System.out.println("dame los segundos");
     z = sc.nextInt();

     System.out.println("estos son los segundos totales");
        System.out.println((((x*24)*60)*60));
}
}
