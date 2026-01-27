import java.util.Scanner;

public class dados {

     public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
    
     System.out.println("Dime que ha salido en el primer dado");
     int dado1 = sc.nextInt();

     System.out.println("dime que ha salido en el dado dos");
     int dado2 = sc.nextInt();

     System.out.println("dime que ha salido en el dado tres");
     int dado3 = sc.nextInt();

     if(dado1 == 6 && dado2 == 6 && dado3 == 6){
            System.out.println("Excelente");
       
    }else if (dado1 == 6 && dado2 == 6 || dado1 == 6 && dado3 == 6 || dado2 == 6 && dado3 == 6){
        System.out.println("muy bien");
    
    }else if (dado1 == 6 || dado2 == 6 || dado3 == 6){
    System.out.println("regular");
    
    }else if (dado1 <=5 && dado1 >=1 && dado2 <=5 && dado2 <=1 && dado3 <=5 && dado3 <=1){
        System.out.println("pesimo");
    
    }else {
        System.out.println("error");
    }
}
}
