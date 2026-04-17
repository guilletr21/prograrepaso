import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

//Enunciado: Crea un programa que genere un archivo usuarios.csv. En lugar de escribir cadenas estáticas,
//  debe generar dinámicamente 50 registros de usuarios simulados con el formato ID,Nombre,Edad,Departamento.
public class ejercicio4 {
    
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Carlos", "Beatriz", "David", "Elena", "Fernando"};
        String[] departamentos = {"IT", "RRHH", "Ventas", "Marketing", "Finanzas"};
        Random rnd = new Random();

        try (PrintWriter pw = new PrintWriter(new FileWriter("usuarios.csv"))) {
            // Escribir cabecera
            pw.println("ID,Nombre,Edad,Departamento");
            
            // Generar 50 registros dinámicos
            for (int i = 1; i <= 50; i++) {
                String nombre = nombres[rnd.nextInt(nombres.length)];
                int edad = 20 + rnd.nextInt(41); // Edad entre 20 y 60
                String depto = departamentos[rnd.nextInt(departamentos.length)];
                pw.printf("%03d,%s,%d,%s%n", i, nombre, edad, depto);
            }
            System.out.println("Archivo CSV generado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    
}
}
