
import java.util.Scanner;
public class Temperatura {

    // Función que convierte Celsius a Fahrenheit
    
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsiusAFahrenheit(celsius);

        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
    }
}