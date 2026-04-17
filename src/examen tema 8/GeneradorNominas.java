import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class GeneradorNominas {

    public static void main(String[] args) {
        String archivoEmpleados = "empleados.txt";
        String archivoHoras = "horas_mes.txt";
        String archivoSalida = "pagos_marzo.txt";

        // 1. Cargar empleados en el Map
        Map<String, Empleado> mapaEmpleados = cargarEmpleados(archivoEmpleados);

        if (mapaEmpleados != null && !mapaEmpleados.isEmpty()) {
            // 2 y 3. Leer horas, buscar en el mapa y calcular el sueldo
            procesarHorasYCalcularSueldo(archivoHoras, mapaEmpleados);

            // 4. Generar el fichero permitiendo elegir el método de ordenación
            // Opciones válidas: "nombre" o "sueldo"
            generarFicheroPagos(mapaEmpleados, archivoSalida, "sueldo"); 
            System.out.println("Proceso finalizado. Fichero " + archivoSalida + " generado correctamente.");
        }
    }
    

    // --- PUNTO 1 (2.5 puntos): Carga el archivo de empleados en un Map ---
    public static Map<String, Empleado> cargarEmpleados(String rutaArchivo) {
        Map<String, Empleado> mapa = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("#");
                if (datos.length == 3) {
                    String id = datos[0];
                    String nombre = datos[1];
                    double valorHora = Double.parseDouble(datos[2]);
                    
                    Empleado emp = new Empleado(id, nombre, valorHora);
                    mapa.put(id, emp); // La clave es el ID_EMPLEADO
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de empleados: " + e.getMessage());
        }
        return mapa;
    }


    // --- PUNTOS 2 y 3 (2.5 + 2.5 puntos): Lee horas, busca en Map y calcula sueldo ---
    public static void procesarHorasYCalcularSueldo(String rutaArchivo, Map<String, Empleado> mapa) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("#");
                if (datos.length == 2) {
                    String id = datos[0];
                    int horas = Integer.parseInt(datos[1]);
                    
                    // Buscar al empleado correspondiente en el mapa a través de la clave
                    Empleado emp = mapa.get(id);
                    
                    if (emp != null) {
                        emp.setHorasTrabajadas(horas);
                        // Calcular el sueldo bruto
                        double sueldo = horas * emp.getValorHora();
                        emp.setSueldo(sueldo);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de horas: " + e.getMessage());
        }
    }

    // --- PUNTO 4 (2.5 puntos): Función generarFicheroPagos con ordenación ---
    public static void generarFicheroPagos(Map<String, Empleado> mapaEmpleados, String archivoSalida, String criterioOrden) {
        // Pasamos los valores del Map a una Lista para poder ordenarlos
        List<Empleado> listaEmpleados = new ArrayList<>(mapaEmpleados.values());

        // Aplicamos la ordenación según el parámetro elegido
        if (criterioOrden.equalsIgnoreCase("nombre")) {
            listaEmpleados.sort(Comparator.comparing(Empleado::getNombre));
        } else if (criterioOrden.equalsIgnoreCase("sueldo")) {
            // Ordenamos por sueldo de mayor a menor (reversed)
            listaEmpleados.sort(Comparator.comparingDouble(Empleado::getSueldo).reversed());
        } else {
            System.out.println("Criterio de ordenación no reconocido. Se guardará sin un orden específico.");
        }

        // Generamos el archivo de salida
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {
            for (Empleado e : listaEmpleados) {
                // Formato exigido: NOMBRE_EMPLEADO: Total a cobrar: [SUELDO] euros.
                // Usamos String.format para que el sueldo quede bien formateado (con 2 decimales si se desea)
                String lineaSalida = String.format("%s: Total a cobrar: %.2f euros.", e.getNombre(), e.getSueldo());
                bw.write(lineaSalida);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo de pagos: " + e.getMessage());
        }
    }
}