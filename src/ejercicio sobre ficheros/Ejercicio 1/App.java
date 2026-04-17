import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        

        Alumno a1 = new Alumno( 1, "Juan", "Pérez", "García", "Gómez", "juan.perez@google.com", "123456789");
        Alumno a2 = new Alumno( 2, "María", "López", "Rodríguez", "González", "maria.lopez@outlook.com", "987654321");
        Alumno a3 = new Alumno( 3, "Pedro", "Martínez", "Sánchez", "Torres", "pedro.martinez@yahoo.com", "456789123");

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);

            Nota nota1 = new Nota("5", "6", "7", "8", "9", "10");
            Nota nota2 = new Nota("6", "7", "8", "9", "10", "5");
            Nota nota3 = new Nota("7", "8", "9", "10", "5", "6");

            ArrayList<Nota> notas = new ArrayList<>();

        fileWriter fw = new FileWriter("medias.txt");

        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        for(Alumno alu : alumnos){
            String idalu = alu.getId();
            for(Nota nota : notas){
                String idAlumNota = nota.getId();
                if(idalu.equals(idAlumNota)){
                   Double media = (Double.parseDouble(nota.getN1()) + Double.parseDouble(nota.getN2()) + Double.parseDouble(nota.getN3()) 
                   + Double.parseDouble(nota.getN4()) + Double.parseDouble(nota.getN5()) + Double.parseDouble(nota.getN6()))/6;
                   System.out.println("La media del alumno " + alu.getNombre1() + " " + alu.getApellido1() + " es: " + media);
                     fr.write(idAlumNota + alu.getEmail() + notaMedia);
                        fr.write("\n");
                }
            }
        }

      fw.close(); 
    }
}
