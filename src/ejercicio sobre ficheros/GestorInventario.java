
//Crea una aplicación de consola para llevar el control del stock de una tienda. Los datos se guardan en inventario.txt
//  con el formato NombreArticulo;Cantidad. El menú debe permitir: ver todo el inventario, registrar un nuevo artículo con su cantidad, 
// buscar un artículo por nombre,
//  mostrar una lista de alertas con los productos que tienen 0 unidades (agotados), vaciar el inventario y salir.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GestorInventario {
    // Fichero donde guardaremos los artículos y su stock
    private static final String ARCHIVO = "inventario.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("=== CONTROL DE ALMACÉN ===");

        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ver todo el inventario");
            System.out.println("2. Añadir un artículo al stock");
            System.out.println("3. Buscar un artículo");
            System.out.println("4. Ver productos AGOTADOS (Alerta de Stock)");
            System.out.println("5. Borrar todo el inventario");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    verInventario();
                    break;
                case "2":
                    System.out.print("Nombre del artículo (Ej. Teclado USB): ");
                    String nombre = scanner.nextLine();
                    
                    System.out.print("Cantidad en stock (Ej. 15): ");
                    String cantidadTexto = scanner.nextLine();
                    
                    try {
                        // Esta vez usamos números enteros, ya que no puedes tener 2.5 teclados
                        int cantidad = Integer.parseInt(cantidadTexto);
                        anadirArticulo(nombre, cantidad);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debes introducir un número entero sin decimales.");
                    }
                    break;
                case "3":
                    System.out.print("Introduce el nombre del artículo a buscar: ");
                    String busqueda = scanner.nextLine();
                    buscarArticulo(busqueda);
                    break;
                case "4":
                    verAgotados();
                    break;
                case "5":
                    borrarInventario();
                    break;
                case "6":
                    salir = true;
                    System.out.println("Cerrando el sistema del almacén. ¡Buen trabajo hoy!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Elige un número del 1 al 6.");
            }
        }
        scanner.close();
    }

    // --- MÉTODOS DE MANEJO DE FICHEROS ---

    // Opción 1: Muestra todo el contenido del fichero
    private static void verInventario() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("El almacén está vacío. No hay registros.");
            return;
        }

        System.out.println("\n--- Stock Actual ---");
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    System.out.println("- " + partes[0] + ": " + partes[1] + " uds.");
                    contador++;
                }
            }
            if (contador == 0) {
                System.out.println("No hay artículos en el inventario.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Opción 2: Guarda el nombre y la cantidad separados por ";"
    private static void anadirArticulo(String nombre, int cantidad) {
        // Validación extra: no permitir stock negativo
        if (cantidad < 0) {
            System.out.println("Error: No puedes añadir una cantidad negativa.");
            return;
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            pw.println(nombre + ";" + cantidad);
            System.out.println("¡Artículo registrado correctamente!");
        } catch (IOException e) {
            System.out.println("Error al guardar el artículo: " + e.getMessage());
        }
    }

    // Opción 3: Búsqueda básica por texto
    private static void buscarArticulo(String busqueda) {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("El almacén está vacío.");
            return;
        }

        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2 && partes[0].toLowerCase().contains(busqueda.toLowerCase())) {
                    System.out.println("Encontrado -> " + partes[0] + " | Stock: " + partes[1] + " uds.");
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró ningún artículo con ese nombre.");
            }
        } catch (IOException e) {
            System.out.println("Error al buscar en el archivo: " + e.getMessage());
        }
    }

    // Opción 4: Lee el archivo y filtra solo los que tienen cantidad == 0
    private static void verAgotados() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("No hay datos para comprobar.");
            return;
        }

        System.out.println("\n--- ALERTAS DE STOCK AGOTADO ---");
        boolean hayAgotados = false;

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    int cantidad = Integer.parseInt(partes[1]);
                    // Filtramos: solo mostramos si la cantidad es cero
                    if (cantidad == 0) {
                        System.out.println("¡ATENCIÓN! Falta reponer: " + partes[0]);
                        hayAgotados = true;
                    }
                }
            }
            
            if (!hayAgotados) {
                System.out.println("¡Todo en orden! No hay ningún producto agotado.");
            }
            
        } catch (IOException | NumberFormatException e) {
            System.out.println("Hubo un error al procesar el stock: " + e.getMessage());
        }
    }

    // Opción 5: Vacía el fichero
    private static void borrarInventario() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, false))) {
            System.out.println("¡Inventario borrado por completo!");
        } catch (IOException e) {
            System.out.println("Error al borrar el inventario: " + e.getMessage());
        }
    }
}

