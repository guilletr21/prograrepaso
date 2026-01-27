public class ejemplo8 {
    public static void main(String[] args) {
        int[] numeros = {10, 15, 20, 25};
        double suma = 0;

        for (int num : numeros) {
            suma += num;
        }

        double media = suma / numeros.length;
        System.out.println("media: " + media);
    }
}
//Calcular la media de los elementos en un array