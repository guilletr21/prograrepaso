import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
       
        
        HashMap<String, String> claves = new HashMap<String, String>();
            
             claves.put("el", "xxxxx");
             claves.put("servidor", "tttttt");
             claves.put("tiene", "00000");
             claves.put("peligro", "eeeeee");
         
         String frase = "el servidor tiene peligro";

        String[] palabras = frase.split(" ");

        FileWriter fw = new FileWriter("src/src2/cifradino.txt");
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);

            if (claves.containsKey(palabras[i])) {
                String valor = claves.get(palabras[i]);
               fw.write(valor); 
                
            } else {
               fw.write("Medac");
            }
            
        }
        fw.close();
    }
}
