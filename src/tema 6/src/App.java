public class App {
    public static void main(String[] args) throws Exception {
       
        taller t1 = new taller("Talleres Pepe", "B12345678");
        taller t2 = new taller("Talleres Juan", "B87654321");

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("Max Vehiculos: " + taller.getMaxVehiculos());

        System.out.println(Math.PI);


     

    }

    
}
