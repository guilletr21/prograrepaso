import java.util.Scanner;

public class ejercicio1 {
        public static void main(String[] args) throws Exception {
      
    Scanner input = new Scanner(System.in);

    System.out.println("Introduzca su edad");
    int age = input.nextInt();

    if (age >=18) {
    System.out.println("uested es mayor de edad");

    }else if(age >=65){
    System.out.println("usted esta jubilado");

    }else {
    System.out.println("usted es menor de edad");
    }

}
}