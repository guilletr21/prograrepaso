import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2examen {
    public static void main(String[] args) {

        int [][] matriz = new int[6][10];
        int max = 0;
        int min = 1001;
        int posicionfilmax = 0;
        int posicionfilmin = 0;
        int posicioncolmax = 0;
        int posicioncolmin = 0;
        


        for ( int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz.length; j++){
            matriz [i][j] = (int)(Math.random()*1000+1);
               
                if (matriz [i][j] > max ){
                max = matriz[i][j];
                posicioncolmax = i ;
                posicionfilmax = j ;
                }
   
                if (matriz [i][j] < min){
                min = matriz[i][j];
                posicioncolmin = i ;
                posicionfilmin = j ;
                }
            } 
        }
           
                
                
                System.out.println("matriz final");
                for ( int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz.length; j++){
               System.out.printf("%d", matriz[i][j]);
             }
            
            
             System.out.println();
 
}
            System.out.printf("(menor valor: %d)", min);
            System.out.printf("(Min fila: %d columna: %d)", posicioncolmin, posicionfilmin);
            System.out.printf("(maximo valor: %d)", max);
            System.out.printf("(Max fila: %d columna: %d)", posicioncolmax, posicioncolmin);
    }
}
