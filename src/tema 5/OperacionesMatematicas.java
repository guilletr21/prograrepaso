
    public class OperacionesMatematicas {

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        int resultado1 = multiplicar(3, 4);
        double resultado2 = multiplicar(2.5, 4.2);
        int resultado3 = multiplicar(2, 3, 4);

        System.out.println("Multiplicar 3 * 4 = " + resultado1);
        System.out.println("Multiplicar 2.5 * 4.2 = " + resultado2);
        System.out.println("Multiplicar 2 * 3 * 4 = " + resultado3);
    }
}


