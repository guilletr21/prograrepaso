import java.util.Scanner;

public class Cuidadito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // --- ZONA DE PRUEBAS ---
        // Descomenta la función que quieras probar para ver su resultado:
        
        // ej01_ParOImpar(5);
        // ej02_MayorDeTres(10, 5, 14);
        // ej03_Factorial(5);
        // ej04_TablaMultiplicar(7);
        // ej05_SerieFibonacci(10);
        // ej06_ContarDigitos(12345);
        // ej07_DibujarCuadrado(5);
        
        int[] miArray = {10, 20, 5, 3, 99, 4};
        // ej08_ImprimirArray(miArray);
        // ej09_SumaPromedioArray(miArray);
        // ej10_BuscarMayor(miArray);
        // ej11_InvertirArray(miArray);
        // ej12_BuscarElemento(miArray, 99);
        // ej13_OrdenarBurbuja(miArray);
        
        int[][] miMatriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // ej14_ImprimirMatriz(miMatriz);
        // ej15_SumaTotalMatriz(miMatriz);
        // ej16_SumaDiagonalPrincipal(miMatriz);
        // ej17_Transpuesta(miMatriz);
        
        System.out.println("Fin de la ejecución. Descomenta las funciones en el main para probarlas.");
    }

    // ==========================================
    // BLOQUE 1: LÓGICA BÁSICA (IF, ELSE, FOR)
    // ==========================================

    /**
     * Ejercicio 1: Determina si un número es par o impar.
     * Uso de: if, else, operador módulo (%).
     */
    public static void ej01_ParOImpar(int n) {
        System.out.println("--- Ejercicio 1: Par o Impar ---");
        if (n % 2 == 0) {
            System.out.println("El número " + n + " es PAR.");
        } else {
            System.out.println("El número " + n + " es IMPAR.");
        }
    }

    /**
     * Ejercicio 2: Encuentra el mayor de tres números dados.
     * Uso de: if, else if anidados.
     */
    public static void ej02_MayorDeTres(int a, int b, int c) {
        System.out.println("--- Ejercicio 2: Mayor de 3 números ---");
        int mayor;
        if (a > b && a > c) {
            mayor = a;
        } else if (b > a && b > c) {
            mayor = b;
        } else {
            mayor = c;
        }
        System.out.println("El mayor entre " + a + ", " + b + " y " + c + " es: " + mayor);
    }

    /**
     * Ejercicio 3: Calcula el factorial de un número (ej: 5! = 5*4*3*2*1).
     * Uso de: for loop, acumulador.
     */
    public static void ej03_Factorial(int n) {
        System.out.println("--- Ejercicio 3: Factorial ---");
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    /**
     * Ejercicio 4: Imprime la tabla de multiplicar de un número.
     * Uso de: for loop.
     */
    public static void ej04_TablaMultiplicar(int n) {
        System.out.println("--- Ejercicio 4: Tabla del " + n + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    /**
     * Ejercicio 5: Imprime los primeros N números de la serie Fibonacci.
     * Uso de: for, variables temporales.
     */
    public static void ej05_SerieFibonacci(int n) {
        System.out.println("--- Ejercicio 5: Fibonacci (" + n + " elementos) ---");
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " "); // Imprimir los dos primeros
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    /**
     * Ejercicio 6: Cuenta cuántos dígitos tiene un número.
     * Uso de: while (simulado con for o while estándar), división entera.
     */
    public static void ej06_ContarDigitos(int n) {
        System.out.println("--- Ejercicio 6: Contar Dígitos ---");
        int original = n;
        int contador = 0;
        if (n == 0) contador = 1;
        else {
            for (; n > 0; n /= 10) {
                contador++;
            }
        }
        System.out.println("El número " + original + " tiene " + contador + " dígitos.");
    }

    /**
     * Ejercicio 7: Dibuja un cuadrado de asteriscos de tamaño N.
     * Uso de: for anidados (bucle dentro de bucle).
     */
    public static void ej07_DibujarCuadrado(int n) {
        System.out.println("--- Ejercicio 7: Dibujar Cuadrado ---");
        for (int i = 0; i < n; i++) {       // Filas
            for (int j = 0; j < n; j++) {   // Columnas
                System.out.print("* ");
            }
            System.out.println(); // Salto de línea al terminar la fila
        }
    }

    // ==========================================
    // BLOQUE 2: ARRAYS (UNIDIMENSIONALES)
    // ==========================================

    /**
     * Ejercicio 8: Recorre e imprime un array.
     * Uso de: for, array.length.
     */
    public static void ej08_ImprimirArray(int[] array) {
        System.out.println("--- Ejercicio 8: Imprimir Array ---");
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    /**
     * Ejercicio 9: Calcula la suma y el promedio de los elementos de un array.
     * Uso de: for, acumulador, casting a double.
     */
    public static void ej09_SumaPromedioArray(int[] array) {
        System.out.println("--- Ejercicio 9: Suma y Promedio ---");
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double promedio = (double) suma / array.length;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }

    /**
     * Ejercicio 10: Encuentra el número mayor y menor en un array.
     * Uso de: for, if, variables auxiliares min/max.
     */
    public static void ej10_BuscarMayor(int[] array) {
        System.out.println("--- Ejercicio 10: Mayor y Menor ---");
        int mayor = array[0];
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) mayor = array[i];
            if (array[i] < menor) menor = array[i];
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }

    /**
     * Ejercicio 11: Invierte el contenido de un array (sin array auxiliar).
     * Uso de: for hasta la mitad, variable temporal (swap).
     */
    public static void ej11_InvertirArray(int[] array) {
        System.out.println("--- Ejercicio 11: Invertir Array ---");
        // Imprimimos antes
        ej08_ImprimirArray(array);
        
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        
        // Imprimimos después
        System.out.print("Invertido: ");
        ej08_ImprimirArray(array);
    }

    /**
     * Ejercicio 12: Búsqueda Lineal. Busca si un número existe en el array.
     * Uso de: for, if, break, boolean flag.
     */
    public static void ej12_BuscarElemento(int[] array, int buscar) {
        System.out.println("--- Ejercicio 12: Búsqueda Lineal ---");
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscar) {
                encontrado = true;
                posicion = i;
                break; // Dejamos de buscar
            }
        }
        if (encontrado) {
            System.out.println("El número " + buscar + " está en la posición " + posicion);
        } else {
            System.out.println("El número " + buscar + " NO existe en el array.");
        }
    }

    /**
     * Ejercicio 13: Ordenamiento Burbuja (Bubble Sort).
     * Uso de: for anidados, if, swap. Algoritmo clásico.
     */
    public static void ej13_OrdenarBurbuja(int[] array) {
        System.out.println("--- Ejercicio 13: Ordenamiento Burbuja ---");
        // Clonamos array para no modificar el original de las pruebas
        int[] copia = array.clone(); 
        
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j] > copia[j + 1]) {
                    // Intercambio
                    int temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }
        System.out.print("Ordenado: ");
        ej08_ImprimirArray(copia);
    }

    // ==========================================
    // BLOQUE 3: MATRICES (ARRAYS 2D)
    // ==========================================

    /**
     * Ejercicio 14: Recorre e imprime una matriz en formato cuadrado.
     * Uso de: for anidados (filas y columnas).
     */
    public static void ej14_ImprimirMatriz(int[][] matriz) {
        System.out.println("--- Ejercicio 14: Imprimir Matriz ---");
        for (int i = 0; i < matriz.length; i++) {           // Recorre filas
            for (int j = 0; j < matriz[i].length; j++) {    // Recorre columnas
                System.out.print(matriz[i][j] + "\t");      // \t es tabulador
            }
            System.out.println();
        }
    }

    /**
     * Ejercicio 15: Suma todos los elementos de la matriz.
     * Uso de: for anidados, acumulador.
     */
    public static void ej15_SumaTotalMatriz(int[][] matriz) {
        System.out.println("--- Ejercicio 15: Suma Total Matriz ---");
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma total es: " + suma);
    }

    /**
     * Ejercicio 16: Suma la diagonal principal de una matriz cuadrada.
     * Uso de: for simple (optimizando) o for anidado con if (i == j).
     */
    public static void ej16_SumaDiagonalPrincipal(int[][] matriz) {
        System.out.println("--- Ejercicio 16: Diagonal Principal ---");
        int suma = 0;
        // Asumimos matriz cuadrada
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i]; // Elementos donde fila == columna
        }
        System.out.println("Suma diagonal principal: " + suma);
    }

    /**
     * Ejercicio 17: Crea la matriz transpuesta (intercambia filas por columnas).
     * Uso de: for anidados, nueva matriz auxiliar.
     */
    public static void ej17_Transpuesta(int[][] matriz) {
        System.out.println("--- Ejercicio 17: Matriz Transpuesta ---");
        int filas = matriz.length;
        int cols = matriz[0].length;
        int[][] transpuesta = new int[cols][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Original:");
        ej14_ImprimirMatriz(matriz);
        System.out.println("Matriz Transpuesta:");
        ej14_ImprimirMatriz(transpuesta);
    }
    
    /**
     * Ejercicio 18: Suma cada fila individualmente.
     * Uso de: for anidados, resetear acumulador en bucle externo.
     */
    public static void ej18_SumaFilas(int[][] matriz) {
        System.out.println("--- Ejercicio 18: Suma por Filas ---");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + " suma: " + sumaFila);
        }
    }

    /**
     * Ejercicio 19: Crea una matriz identidad de tamaño N.
     * Uso de: for anidados, if/else para poner 1 o 0.
     */
    public static void ej19_MatrizIdentidad(int n) {
        System.out.println("--- Ejercicio 19: Matriz Identidad ---");
        int[][] identidad = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == j) identidad[i][j] = 1;
                else identidad[i][j] = 0;
            }
        }
        ej14_ImprimirMatriz(identidad);
    }

    /**
     * Ejercicio 20: Cuenta cuántos números pares hay en la matriz.
     * Uso de: for anidados, if (módulo), contador.
     */
    public static void ej20_ContarParesMatriz(int[][] matriz) {
        System.out.println("--- Ejercicio 20: Pares en Matriz ---");
        int contador = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0) contador++;
            }
        }
        System.out.println("Hay " + contador + " números pares en la matriz.");
    }
}