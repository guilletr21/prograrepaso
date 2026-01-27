package Funciones;

public class EjerciciosFunciones {

    /* ============================
        NIVEL 1 - Funciones básicas
       ============================ */

    // 1 - Mostrar números del 1 al 10
    public static void mostrarDel1Al10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // 2 - Tabla de multiplicar
    public static void tablaMultiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // 3 - Triple de un número
    public static int triple(int n) {
        return n * 3;
    }

    // 4 - Saber si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 5 - Convertir Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double c) {
        return c * 9/5 + 32;
    }


    /* ============================
        NIVEL 2 - Funciones String
       ============================ */

    // 6 - Saludo personalizado
    public static String saludar(String nombre) {
        return "Hola " + nombre + ", bienvenida.";
    }

    // 7 - Contar vocales
    public static int contarVocales(String palabra) {
        int contador = 0;
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if ("aeiou".indexOf(c) != -1) contador++;
        }
        return contador;
    }

    // 8 - Invertir cadena
    public static String invertir(String texto) {
        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }
        return invertido;
    }

    // 9 - Palíndromo
    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replace(" ", "");
        return palabra.equals(invertir(palabra));
    }


    /* ============================
        NIVEL 3 - Arrays
       ============================ */

    // 10 - Sumar array
    public static int sumarArray(int[] arr) {
        int suma = 0;
        for (int n : arr) suma += n;
        return suma;
    }

    // 11 - Mayor de un array
    public static int mayorArray(int[] arr) {
        int mayor = arr[0];
        for (int n : arr) {
            if (n > mayor) mayor = n;
        }
        return mayor;
    }

    // 12 - Contar pares
    public static int contarPares(int[] arr) {
        int cont = 0;
        for (int n : arr) {
            if (n % 2 == 0) cont++;
        }
        return cont;
    }

    // 13 - Invertir array
    public static int[] invertirArray(int[] arr) {
        int[] nuevo = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            nuevo[i] = arr[arr.length - 1 - i];
        return nuevo;
    }


    /* ============================
        NIVEL 4 - Matemáticas
       ============================ */

    // 14 - Factorial recursivo
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // 15 - Potencia
    public static int potencia(int base, int exp) {
        int resultado = 1;
        for (int i = 1; i <= exp; i++) {
            resultado *= base;
        }
        return resultado;
    }

    // 16 - Cuenta atrás recursiva
    public static void cuentaAtras(int n) {
        if (n == 0) return;
        System.out.println(n);
        cuentaAtras(n - 1);
    }


    /* ============================
        NIVEL 5 - Sobrecarga
       ============================ */

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }


    /* ============================
        NIVEL 6 - Clases
       ============================ */

    // Clase Coche
    static class Coche {
        private int velocidad = 0;

        public void arrancar() {
            System.out.println("El coche ha arrancado.");
        }

        public void acelerar(int km) {
            velocidad += km;
            System.out.println("Velocidad actual: " + velocidad);
        }

        public void frenar() {
            velocidad = 0;
            System.out.println("El coche ha frenado.");
        }

        public int getVelocidad() {
            return velocidad;
        }
    }

    // Clase Persona
    static class Persona {
        String nombre;
        int edad;
        String email;

        public Persona(String nombre, int edad, String email) {
            this.nombre = nombre;
            this.edad = edad;
            this.email = email;
        }

        public void presentarse() {
            System.out.println("Hola, soy " + nombre + ".");
        }

        public void cambiarEmail(String nuevo) {
            email = nuevo;
        }

        public boolean esMayorDeEdad() {
            return edad >= 18;
        }
    }

    // Clase CuentaBancaria
    static class CuentaBancaria {
        private double saldo = 0;

        public void depositar(double cantidad) {
            saldo += cantidad;
        }

        public void retirar(double cantidad) {
            if (cantidad <= saldo) saldo -= cantidad;
            else System.out.println("Fondos insuficientes.");
        }

        public double consultarSaldo() {
            return saldo;
        }
    }


    /* ============================
                MAIN
       ============================ */

    public static void main(String[] args) {

        // Pruebas básicas:
        mostrarDel1Al10();
        tablaMultiplicar(5);
        System.out.println("Triple de 4 = " + triple(4));
        System.out.println("¿7 es primo? " + esPrimo(7));
        System.out.println("20°C en Fahrenheit = " + celsiusAFahrenheit(20));

        // Strings
        System.out.println(saludar("Sara"));
        System.out.println("Vocales en 'computadora': " + contarVocales("computadora"));
        System.out.println("Invertir 'Java': " + invertir("Java"));
        System.out.println("¿'oso' es palíndromo? " + esPalindromo("oso"));

        // Arrays
        int[] datos = {1, 5, 9, 2, 4};
        System.out.println("Suma del array: " + sumarArray(datos));
        System.out.println("Mayor del array: " + mayorArray(datos));
        System.out.println("Pares en array: " + contarPares(datos));

        // Matemáticas
        System.out.println("Factorial de 5 = " + factorial(5));
        System.out.println("2^3 = " + potencia(2, 3));
        cuentaAtras(5);

        // Sobrecarga
        System.out.println("Sumar enteros: " + sumar(3, 7));
        System.out.println("Sumar decimales: " + sumar(3.5, 2.5));
        System.out.println("Sumar 3 enteros: " + sumar(1, 2, 3));

        // Objetos
        Coche c = new Coche();
        c.arrancar();
        c.acelerar(50);
        c.frenar();

        Persona p = new Persona("Sara", 20, "sara@example.com");
        p.presentarse();

        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(100);
        cuenta.retirar(40);
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    }
}
