public class ejemplo3 {
 
    public static void main(String[] args) {
        int[] numeros = {5, 10, 3, 12, 7};
        int max = numeros[0];

        for (int num : numeros) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Máximo: " + max);
    }
}
//Encontrar el valor máximo en un array
