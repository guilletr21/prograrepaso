import java.util.Scanner;
public class app {
    
public static void main(String[] args) throws Exception {
    
    
        String frase = "hola me llamo guille";

        for(int i = 0;i<frase.length();i++){
            char letra = frase.charAt(i);
            int numeroLetra = (int)letra-32;
            System.out.println((char)numeroLetra);

        }



}

}
