    import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class ejercicio1 {

//Crea un programa con un menú por consola que permita al usuario gestionar una agenda telefónica guardada en un fichero llamado agenda.txt
// . El programa debe ejecutarse en bucle hasta que el usuario elija salir y debe tener opciones para leer el fichero, 
//añadir líneas nuevas, 
// buscar un texto específico y vaciar el fiche
public class AgendaSimple {
    // Definimos el nombre del archivo como una constante para usarla en todo el código
    private static final String ARCHIVO = "agenda.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("=== MI AGENDA DE CONTACTOS ===");

        // Bucle infinito hasta que el usuario decida salir
        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ver todos los contactos");
            System.out.println("2. Añadir un nuevo contacto");
            System.out.println("3. Buscar un contacto por nombre");
            System.out.println("4. Borrar toda la agenda");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            String opcion = scanner.nextLine();

            // Un switch muy sencillo para llamar a cada método
            switch (opcion) {
                case "1":
                    verContactos();
                    break;
                case "2":
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el teléfono: ");
                    String telefono = scanner.nextLine();
                    anadirContacto(nombre, telefono);
                    break;
                case "3":
                    System.out.print("Introduce el nombre a buscar: ");
                    String busqueda = scanner.nextLine();
                    buscarContacto(busqueda);
                    break;
                case "4":
                    borrarAgenda();
                    break;
                case "5":
                    salir = true;
                    System.out.println("Saliendo de la agenda... ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige un número del 1 al 5.");
            }
        }
        scanner.close();
    }

    // --- MÉTODOS DE MANEJO DE FICHEROS ---

    // Opción 1: Lectura básica línea a línea
    private static void verContactos() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("La agenda está vacía (el archivo aún no existe).");
            return;
        }

        System.out.println("\n--- Lista de Contactos ---");
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println("- " + linea);
                contador++;
            }
            if (contador == 0) {
                System.out.println("No hay contactos en la agenda.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer la agenda: " + e.getMessage());
        }
    }

    // Opción 2: Escritura en modo "añadir" (append = true)
    private static void anadirContacto(String nombre, String telefono) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            pw.println(nombre + " - " + telefono);
            System.out.println("¡Contacto guardado con éxito!");
        } catch (IOException e) {
            System.out.println("Error al guardar el contacto: " + e.getMessage());
        }
    }

    // Opción 3: Lectura básica con una condición (if)
    private static void buscarContacto(String busqueda) {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("La agenda está vacía.");
            return;
        }

        System.out.println("\n--- Resultados de búsqueda ---");
        boolean encontrado = false;
        
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Pasamos todo a minúsculas para que la búsqueda sea más fácil
                if (linea.toLowerCase().contains(busqueda.toLowerCase())) {
                    System.out.println("Encontrado: " + linea);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se ha encontrado a nadie con ese nombre.");
            }
        } catch (IOException e) {
            System.out.println("Error al buscar en la agenda: " + e.getMessage());
        }
    }

    // Opción 4: Escritura en modo "sobrescribir" (append = false) para vaciar
    private static void borrarAgenda() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, false))) {
            // Al abrir el fichero sin 'true', se sobrescribe entero. 
            // Como no escribimos nada, se queda en blanco.
            System.out.println("¡La agenda ha sido borrada por completo!");
        } catch (IOException e) {
            System.out.println("Error al borrar la agenda: " + e.getMessage());
        }
    }
}
}
