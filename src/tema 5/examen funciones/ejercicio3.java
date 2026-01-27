import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        double[] notasEstudiantes= {2.0, 5.8, 6.4, 9.7};
        Scanner sc = new Scanner(System.in);
           int opcion = 0;

        do{
            System.out.println("introduce una opcion: ");
            System.out.println("1. Promedio");
            System.out.println("2. Nota minima");
            System.out.println("3. Nota maxima");
            System.out.println("4. Mostrar notas ");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(calcularPromedio(notasEstudiantes));
                    break;
                case 2:
                    System.out.println("introduce la nota minima para aprobar: ");
                    int notaMinima = sc.nextInt();
                    System.out.println(notaminima(notasEstudiantes, notaMinima));
                    break;
                case 3:
                    double notamaxima = notamaxima(notasEstudiantes);
                    System.out.println("la nota maxima es: " + notamaxima);
                    break;
                 case 4:
                    System.out.println("Mostrar Notas");
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                
                default:
                System.out.println("opcion incorrecta");
                    break;
            }



        }while (opcion!=0);

    }
    public static double calcularPromedio(double[] notas){
        double acumulador=0;

        for (int i = 0; i < notas.length; i++) {
            acumulador+= notas[i];
        }

        return acumulador / notas.length;
    }

    public static double notaminima(double[] notas, int notaMinimaparaAprobar){
        int aprobados=0;
        
        for (int i = 0; i < notas.length; i++) {
            if(notas[i]>=notaMinimaparaAprobar ){
                aprobados++;
            }
        }

        return aprobados;
    }

    public static double notamaxima(double[] array ){
        double maxima = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i]>maxima){
                maxima = array[i];
            }
        }

         return maxima;
    }

   public static void mostrarDatos(double[]array) {
    for(int i = 0 ; i < array.length; i++){
        System.out.println(array[i]);
    }
   }

}
