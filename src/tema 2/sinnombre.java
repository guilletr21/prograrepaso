import java.util.Scanner;
public class sinnombre {
    public static void main(String[] args) {
        
       Scanner input  = new Scanner (System.in);

        double decimal = 100.98;
       
        long num1 =(long)decimal;
        float num2 = (float)decimal;
        int num3 = (int)decimal;

        System.out.println("double="+ decimal);
        System.out.println("long="+ num1);
        System.out.println("float=" + num2);
        System.out.println("int=" + num3);


    }
}