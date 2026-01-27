public class ejemplo2 {
   
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8};
        int suma = 0;

        for (int num : numeros) {
            suma += num;
        }

        System.out.println("Suma total: " + suma);
    }
}

//Sumar todos los elementos de un array