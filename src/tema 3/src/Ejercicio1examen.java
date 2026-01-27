import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1examen {
 public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matriz2 = {
            {7, 8, 9},
            {1, 2, 3}
        };

        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] suma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
         System.out.println("Matriz 1");
        for (int[] fila2 : matriz1) {
            System.out.println(Arrays.toString(fila2));
        }

         System.out.println("Matriz 2");
        for (int[] fila3 : matriz2) {
            System.out.println(Arrays.toString(fila3));
        }


        System.out.println("Matriz 3:");
        for (int[] fila : suma) {
            System.out.println(Arrays.toString(fila));
        }

    

    }

 }
