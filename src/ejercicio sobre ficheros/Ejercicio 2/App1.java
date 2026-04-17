import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) throws IOException {
       
        
        HashMap<String, String> claves = new HashMap<String, String>();
            
             claves.put(null, null);
             claves.put("servidor", "tttttt");
             claves.put("tiene", "00000");
             claves.put("peligro", "eeeeee");
         
         String frase = "el servidor tiene peligro";

        String[] palabras = frase.split(" ");

    FileReader fr = new FileReader("src/src2/cifradino.txt");
    BufferedReader br = new BufferedReader(fr);
    
    FileWriter fw = new FileWriter("src/src2/cifradino.txt");
    BufferedWriter bw = new BufferedWriter(fw);
        
        String linea = br.readLine();

        String[] palabras2 = linea.split(" ");
        for(int i = 0; i < palabras2.length; i++) {
            if (claves.containsValue(palabras2[i])) {
                for(String key : claves.keySet()) {
                    if(claves.get(key).equals(palabras2[i])) {
                        bw.write(key);
                    }
                }
            
            } 
            
            
        }
            
            
        
    }
}