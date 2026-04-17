import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
///registro de notas
public class ejercicio3 {
    public class RegistroNotas {
    // Fichero donde guardaremos a los alumnos y sus notas
    private static final String ARCHIVO = "notas.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("=== CUADERNO DEL PROFESOR ===");

        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ver lista de alumnos y notas");
            System.out.println("2. Añadir la nota de un alumno");
            System.out.println("3. Buscar a un alumno");
            System.out.println("4. Calcular la nota media de la clase");
            System.out.println("5. Borrar todo el registro (Fin de curso)");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    verNotas();
                    break;
                case "2":
                    System.out.print("Nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    
                    System.out.print("Nota obtenida (ej. 7.5): ");
                    // Cambiamos coma por punto por si el usuario se equivoca al teclear
                    String notaTexto = scanner.nextLine().replace(",", "."); 
                    
                    try {
                        double nota = Double.parseDouble(notaTexto);
                        anadirNota(nombre, nota);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debes introducir un número válido para la nota.");
                    }
                    break;
                case "3":
                    System.out.print("Introduce el nombre del alumno a buscar: ");
                    String busqueda = scanner.nextLine();
                    buscarAlumno(busqueda);
                    break;
                case "4":
                    calcularMedia();
                    break;
                case "5":
                    borrarRegistro();
                    break;
                case "6":
                    salir = true;
                    System.out.println("Cerrando el cuaderno del profesor. ¡Hasta mañana!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Elige un número del 1 al 6.");
            }
        }
        scanner.close();
    }

    // --- MÉTODOS DE MANEJO DE FICHEROS ---

    // Opción 1: Muestra todo el contenido
    private static void verNotas() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("El cuaderno está vacío. Aún no hay notas.");
            return;
        }

        System.out.println("\n--- Calificaciones ---");
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    System.out.println("- Alumno: " + partes[0] + " | Nota: " + partes[1]);
                    contador++;
                }
            }
            if (contador == 0) {
                System.out.println("No hay alumnos registrados.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Opción 2: Guarda el nombre y la nota separados por ";"
    private static void anadirNota(String nombre, double nota) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            pw.println(nombre + ";" + nota);
            System.out.println("¡Nota registrada correctamente!");
        } catch (IOException e) {
            System.out.println("Error al guardar la nota: " + e.getMessage());
        }
    }

    // Opción 3: Busca un texto específico y extrae la información
    private static void buscarAlumno(String busqueda) {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("El cuaderno está vacío.");
            return;
        }

        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2 && partes[0].toLowerCase().contains(busqueda.toLowerCase())) {
                    System.out.println("Encontrado -> " + partes[0] + " tiene una nota de: " + partes[1]);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró a ningún alumno con ese nombre.");
            }
        } catch (IOException e) {
            System.out.println("Error al buscar en el archivo: " + e.getMessage());
        }
    }

    // Opción 4: Lee las notas, las suma, cuenta a los alumnos y hace la división
    private static void calcularMedia() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("No hay notas para calcular la media.");
            return;
        }

        double sumaTotal = 0.0;
        int numeroAlumnos = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    sumaTotal += Double.parseDouble(partes[1]);
                    numeroAlumnos++;
                }
            }
            
            if (numeroAlumnos > 0) {
                double media = sumaTotal / numeroAlumnos;
                // Usamos printf para mostrar la media solo con 2 decimales
                System.out.printf("\n--- NOTA MEDIA DE LA CLASE: %.2f ---\n", media);
            } else {
                System.out.println("No hay notas válidas registradas.");
            }
            
        } catch (IOException | NumberFormatException e) {
            System.out.println("Hubo un error al calcular la media: " + e.getMessage());
        }
    }

    // Opción 5: Vacía el fichero
    private static void borrarRegistro() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, false))) {
            System.out.println("¡Registro borrado! Listo para el nuevo curso escolar.");
        } catch (IOException e) {
            System.out.println("Error al borrar el cuaderno: " + e.getMessage());
        }
    }
}
}
