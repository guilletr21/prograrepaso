//Ejercicio número mayor que otro
//Para hacerlo tienes que usar las puertas lógicas
//Matemáticas vaya con los nombres de mierda (>, <, ==, etc)
public class App {
    public static void main(String[] args) throws Exception {
        comparar(1, 3, 4); //Aquí tiene que haber 3 datos
    }

    //Le puedes poner tantas variables como quieras y no tienes por qué usarlas todas
    //Pero si que se la vas  a tener que pasar a la función
    //Si aquí hay 3 variables
    
    public static void comparar(int numero1, int numero2, int numero3) {
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        }

        else if (numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } 

        else {
            System.out.println(numero2 + " es mayor que " + numero1);
        }
    }
}