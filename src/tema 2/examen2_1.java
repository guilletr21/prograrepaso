import java.util.Scanner;

public class examen2_1 {
  
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce la base imponible");
        double basemponible =sc.nextDouble();
        System.out.println("introduce el tipo de iva: general, reducido o superreducido");
        String ivaString = sc.next();
        int iva = 0;
       
       
        if (ivaString.equals("general")) {
            iva = 21;
        }
        else if (ivaString.equals("reducido")) {
            iva = 10;
        } 
        else if (ivaString.equals("superreducido")) {
            iva = 4;
        } 


        double calculoIva = basemponible + (basemponible * iva / 100);
        double precioConIva= basemponible + calculoIva;

        String descuento = "nopro";
        double total = 0;

        if (descuento.equals("mitad")) {
            total = precioConIva / 2;
   
        }
        if (descuento.equals("nopro")){
            total= precioConIva*5/100;

        }
        if(descuento.equals("menos5")){
            total = precioConIva - 5;
        }   


System.out.println("el total es: " + total);

    }
}