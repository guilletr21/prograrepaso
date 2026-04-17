package fichero;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ContarPalabras {
    public static void main(String[] args) throws Exception {

        FileReader fr = null;
        int contadorpalabras=0;
        ArrayList<String> listaPalabras = new ArrayList<>();
        
        try {
            fr = new FileReader("C:\\Users\\Davante\\Desktop\\prograrepaso\\src\\fichero\\Fichero1.txt");

            int numCaracter = fr.read();


            while (numCaracter != -1) {
                

                if (numCaracter==32) {
                    contadorpalabras++;
                    
                }
                numCaracter = fr.read();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            try {
                fr.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }
        System.out.println("Número de palabras: " + (contadorpalabras+1));

        System.out.println(listaPalabras);

        listaPalabras.sort(null);

        System.out.println("Lista ordenada: " + listaPalabras);

        FileWriter fw = null;

        try {
            fw = new FileWriter("C:\\Users\\Davante\\Desktop\\prograrepaso\\src\\fichero\\Fichero2.txt");

            for (String palabra : listaPalabras) {
                for(int i=0; i<palabra.length(); i++) {
                    fw.write(palabra.charAt(i));
                }
                fw.write(' ');
            }

        } catch (Exception e) {
            
            System.out.println(e.getMessage());

        } finally {
            try {
                fw.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


    }
    
}
