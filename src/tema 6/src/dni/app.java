package dni;

public class app {
    public static void main(String[] args) throws Exception {
       

    Persona p1 = new Persona("Ana", "01/01/1990", new dni("12345678A", null));
    Persona p2 = new Persona("Luis", "02/02/1985", new dni("87654321B", null));

   Persona[] personas = {p1, p2};

        for(int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].getDni().getLetra().equals("A"));
            System.out.println("DNI: " + personas[i].getNombre());
        }
        
}   
}
