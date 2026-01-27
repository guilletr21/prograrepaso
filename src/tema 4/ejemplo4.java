public class ejemplo4 {
     public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 11, 14};
        int contador = 0;

        for (int num : numeros) {
            if (num % 2 == 0) contador++;
        }

        System.out.println("Cantidad de pares: " + contador);
    }
}
//Contar números pares en un array