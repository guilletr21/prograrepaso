public class App {
    public static void main(String[] args) throws Exception {
       
        Libro l1 = new Libro("1234-a", "quijote", 2011);
        Libro l2 = new Libro("1234-b", "sancho", 2006);
        Libro l3 = new Libro("1234-z", "hola", 2012);
        Libro l4 = new Libro("1234-d", "adios", 2003);
        Libro l5 = new Libro("1234-h", "chao", 2011);
        
        Biblioteca b1 = new Biblioteca(21, "berlin");

        b1.anyadirLibro(l1);
        b1.anyadirLibro(l2);
        b1.anyadirLibro(l3);
        b1.anyadirLibro(l4);
        b1.anyadirLibro(l5);

        b1.mostrarLibro();
    }
}
