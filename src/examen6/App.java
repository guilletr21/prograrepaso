package examen6;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Cosmetico c1 = new Cosmetico("Maquillaje", 10, 100);
        Cosmetico c2 = new Cosmetico("Colorete", 12, 3);
        Cosmetico c3 = new Cosmetico("Esponja", 6, 12);

        Fruta f1 = new Fruta("Pera", 12, "Unidad");
        Fruta f2 = new Fruta("Manzana", 12, "Unidad");

        Bebida b1 = new Bebida("Red Bull", 5, 2);
        Bebida b2 = new Bebida("Monster", 2, 1);
        Bebida b3 = new Bebida("Cocacola", 3, 2);

        Carrito carrito = new Carrito();

        carrito.anyadirArticulo(c1);
        carrito.anyadirArticulo(c2);
        carrito.anyadirArticulo(c3);
        carrito.anyadirArticulo(f1);
        carrito.anyadirArticulo(f2);
        carrito.anyadirArticulo(b1);
        carrito.anyadirArticulo(b1);
        carrito.anyadirArticulo(b2);
        carrito.anyadirArticulo(b3);



        System.out.println("Suma de litros: " + carrito.SumarLitros());



       

        //int CantidadCosmeticos = Articulo.CantidadArticulosPorTipo(articulos, Cosmetico.class);
        //System.out.println("Hay " + CantidadCosmeticos + " cosmeticos");
        //int CantidadFrutas = Articulo.CantidadArticulosPorTipo(articulos, Fruta.class);
        //System.out.println("Hay " + CantidadFrutas + " frutas");
        //int CantidadBebidas = Articulo.CantidadArticulosPorTipo(articulos, Bebida.class);
        //System.out.println("Hay " + CantidadBebidas + " bebidas");

    }
}
