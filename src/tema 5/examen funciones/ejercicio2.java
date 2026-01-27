import java.util.Scanner ;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String []palabras=new String[10];
        System.out.println("introduce 10 palabras");
        for (int i = 0 ;i <10; i++){
            palabras[i]=sc.nextLine();
        }

        System.out.println("introduce una palabra a buscar");
        String buscar=sc.nextLine();

        int veces= contarpalabra(palabras, buscar);
        System.out.println("la palabra: " + buscar + "aparece" +  veces + "veces");
    }

    public static int contarpalabra(String[]palabras, String buscar){
        int contador= 0;
        for(int i = 0; i< palabras.length; i++ ){
            if (palabras[i].equals(buscar)){
                contador++;
            }
        }
    
        return contador;
    


}
}