import java.util.Scanner;
public class arrays {
public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
  int []numeros = {1,3,3,4,9,3,3};
int contador= 0;
for (int i = 0; i < numeros.length; i++) {
    
    if (numeros[i] == 3) {
        
        contador++;
    }
}
System.out.println("El numero 3 aparece: " + contador + " veces");



} }
//introduccion al arrayd//