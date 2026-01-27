import java.util.Scanner;

public class semana_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca el dia de la semana");
        int dia = sc.nextInt();

        if (dia >= 1 && dia <= 5) {
            System.out.println("es entre semana");

        } else if (dia >= 6 && dia <= 7) {
            System.out.println("es fin de semana");

        } else if (dia < 1 || dia > 7) {
            System.out.println("error");
        }

    }
}