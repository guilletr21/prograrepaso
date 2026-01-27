public class ejemplo7 {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 2, 5, 2, 6};
        int buscar = 2;
        int contador = 0;

        for (int num : numeros) {
            if (num == buscar) contador++;
        }

        System.out.println("El número " + buscar + " aparece " + contador + " veces.");
    }
}

//Contar las apariciones de un número específico en un array