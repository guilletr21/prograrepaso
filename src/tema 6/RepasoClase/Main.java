package RepasoClase;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        Cuadrado c1 = new Cuadrado("rojo", 5.5, 8.4);
        Rectangulo r1 = new Rectangulo("azul", 3.4, 2, 6);
        Circulo cir1 = new Circulo("verde", 7.6, 8.6);

        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(c1);
        figuras.add(r1);
        figuras.add(cir1);

        /*for (Figura figura : figuras) {
            System.out.println(figura.calcularArea());
        }

        System.out.println(Figura.calcularAreaTotal(figuras));

        double sumaAreaCuadrados = Figura.calcularAreaPorTipo(figuras, "Cuadrado");
        System.out.println(sumaAreaCuadrados);*/

        Figura.mostrarAtributosFigura(figuras);

        //Asociación, agregación, composición, herencia. Nada de Abstract. Todo relaciones
    }
}
