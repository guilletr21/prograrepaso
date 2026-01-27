import java.util.Scanner;

public class RangoSuma {

    // Función que calcula la suma entre dos números (incluyéndolos)
    
    public static long calcularSumaRango(int inicio, int fin) {
        long suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Ingresa el número final: ");
        int fin = sc.nextInt();

        // Si inicio > fin, intercambiar
        if (inicio > fin) {
            int temp = inicio;
            inicio = fin;
            fin = temp;
        }

        long resultado = calcularSumaRango(inicio, fin);

        System.out.println("La suma del rango es: " + resultado);
    }
}
