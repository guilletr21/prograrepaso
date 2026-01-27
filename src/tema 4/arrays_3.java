 import java.util.Scanner;
public class arrays_3 {
   


    public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
 
 
  int []numeros1 = {1,3,3,4,3};
  int []numeros2 = new int[numeros1.length];
     int longitud= numeros1.length + numeros2.length;
    int[] numeros3 = new int[longitud];
     int posicion =0;

    int fix=0;
for (int i = numeros1.length-1;i >=0; i--){
 numeros2[posicion]= numeros1[i];
posicion++;
}

for(int j = 0; j < numeros1.length; j++){
  if (j < numeros1.length){
      numeros3[j]= numeros1[j];
  } else {
      numeros3[j]= numeros2[fix];
    fix++;
    }


}
}}
