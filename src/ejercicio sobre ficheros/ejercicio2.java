    import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class ejercicio2 {

///Crea una aplicación de consola interactiva que permita registrar gastos diarios. 
// Cada gasto se guardará en un fichero gastos.txt con el formato Concepto;Cantidad. El programa debe tener un menú para:
//  ver los gastos, añadir uno nuevo, calcular el dinero total gastado leyendo el fichero, vaciar el registro y salir.
public class GestorGastos {
    // Fichero donde guardaremos la información
    private static final String ARCHIVO = "gastos.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("=== MI GESTOR DE GASTOS ===");

        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ver todos mis gastos");
            System.out.println("2. Añadir un nuevo gasto");
            System.out.println("3. Calcular total gastado");
            System.out.println("4. Borrar todo el historial");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    verGastos();
                    break;
                case "2":
                    System.out.print("¿En qué te has gastado el dinero? (Ej. Cine): ");
                    String concepto = scanner.nextLine();
                    
                    System.out.print("¿Cuánto ha costado? (Usa coma para decimales, Ej. 8,50): ");
                    // Leemos como texto y reemplazamos coma por punto para evitar errores en Java
                    String precioTexto = scanner.nextLine().replace(",", "."); 
                    
                    try {
                        double cantidad = Double.parseDouble(precioTexto);
                        anadirGasto(concepto, cantidad);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Por favor, introduce un número válido.");
                    }
                    break;
                case "3":
                    calcularTotal();
                    break;
                case "4":
                    borrarHistorial();
                    break;
                case "5":
                    salir = true;
                    System.out.println("Cerrando el gestor de gastos. ¡Cuida tu economía!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Elige un número del 1 al 5.");
            }
        }
        scanner.close();
    }

    // --- MÉTODOS DE MANEJO DE FICHEROS ---

    // Opción 1: Muestra todo el contenido del fichero
    private static void verGastos() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("Aún no tienes gastos registrados.");
            return;
        }

        System.out.println("\n--- Lista de Gastos ---");
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                // Separamos el concepto del precio para mostrarlo bonito
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    System.out.println("- " + partes[0] + ": " + partes[1] + " €");
                    contador++;
                }
            }
            if (contador == 0) {
                System.out.println("El historial de gastos está vacío.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer los gastos: " + e.getMessage());
        }
    }

    // Opción 2: Guarda el gasto separando concepto y cantidad con un punto y coma ";"
    private static void anadirGasto(String concepto, double cantidad) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            pw.println(concepto + ";" + cantidad);
            System.out.println("¡Gasto registrado con éxito!");
        } catch (IOException e) {
            System.out.println("Error al guardar el gasto: " + e.getMessage());
        }
    }

    // Opción 3: Lee línea a línea, extrae el número y lo suma
    private static void calcularTotal() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("No hay gastos para sumar.");
            return;
        }

        double total = 0.0;
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    // Convertimos el texto del precio a un número decimal y lo sumamos
                    total += Double.parseDouble(partes[1]); 
                }
            }
            System.out.println("\n--- TOTAL GASTADO: " + total + " € ---");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Hubo un error al calcular el total: " + e.getMessage());
        }
    }

    // Opción 4: Vacía el fichero
    private static void borrarHistorial() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, false))) {
            System.out.println("¡Historial borrado! Empezamos de cero.");
        } catch (IOException e) {
            System.out.println("Error al borrar el historial: " + e.getMessage());
        }
    }
}
}
