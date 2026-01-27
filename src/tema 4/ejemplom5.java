public class ejemplom5 {
    public static void main(String[] args) {
        int[][] matriz = {
            {2, 7, 4},
            {5, 8, 9},
            {10, 12, 3}
        };

        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 == 0) contador++;
            }
        }

        System.out.println("Cantidad de números pares: " + contador);
    }
}
//Contar números pares en una matriz