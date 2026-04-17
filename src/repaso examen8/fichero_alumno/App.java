package fichero_alumno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;;

public class App{

    public static void main(String[] args) {
        
        ArrayList<Alumno>Alumnos = new ArrayList<>();

        Alumno alu1 = new Alumno("1", "juan", 56834834);
        Alumno alu2 = new Alumno("2", "paco", 123456789);
        

        Alumnos.add(alu1);
        Alumnos.add(alu2);

        FileReader fr = null;
        BufferedReader br = null;
        String linea;
        
        int telefono = 0;

        try {
            fr = new FileReader(new File("alumnos.txt"));
            br = new BufferedReader(fr);
            
            while ((linea = br.readLine())!=null){
                
 
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            
            try{
              
            br.close();
            fr.close();
            
        } catch (Exception e){
                
            System.out.println(e.getMessage());
           
        }
        
        }

        String id = "101";
        String nombre = "";


        for(Alumno alumno : alumnos){
            if(alumno.getId().equals(id)){
                System.out.println(alumno.getNombre());
            }
        }
        
        FileWriter fw = null;
        
        try{
            fw = new FileWriter(new File("salidas.txt"));
            fr = 

        }
    }
    public static String obtenerDato (int inicio,int fin, String linea) {
        String dato = "";

        for(int i=inicio;i<fin;i++){
            dato+=linea.charAt(i);
        }
        return dato;
    }
}
