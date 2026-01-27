
    import java.util.Arrays;
    public class Inversor {


    // Procedimiento que invierte un array
    
    public static void invertir(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio < fin) {
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;

            inicio++;
            fin--;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Array original: " + Arrays.toString(numeros));

        invertir(numeros);

        System.out.println("Array invertido: " + Arrays.toString(numeros));
    }


}
