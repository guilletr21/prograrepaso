public class ejemplom2 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2},
            {3, 4}
        };

        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }

        System.out.println("Suma total: " + suma);
    }
}
//Sumar todos los elementos de una matriz
