import java.util.Arrays;

public class ejemplom4 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] B = {
            {7, 8, 9},
            {1, 2, 3}
        };

        int filas = A.length;
        int columnas = A[0].length;
        int[][] suma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matriz suma:");
        for (int[] fila : suma) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
//Sumar dos matrices