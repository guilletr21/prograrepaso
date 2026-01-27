import java.util.Scanner ;

public class ejercicio1 {
    public static void main(String[] args) {
      
      double [] numeros = {23, 300, 59, 123, 4098, 65, 102};

      double []resultado=mayoresdecien(numeros);
        for(int i = 0; i< resultado.length; i++){
          System.out.println(i);
        }
    }

    public static double[]mayoresdecien(double[]numeros){
      int contable = 0;

      for(int i = 0; i< numeros.length; i++ ){
        if(numeros[i] > 100)
        contable ++;
      }

      double resto[]= new double [contable];
      int j = 0;

      for (int i = 0; i< numeros.length; i++ ){

        if(numeros[i] > 100 )resto[j++] = i ; 
      }

      return resto;
    }
  }
