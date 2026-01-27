package examen6;
import java.util.ArrayList;

public class Carrito {
    private ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
    

    public boolean anyadirArticulo(Articulo a){
      return this.listaArticulos.add(a);
    }

    public void mostrarArticulos(){
        for(Articulo a : this.listaArticulos){
            System.out.println(a);
        }
    }
    public boolean eliminarArticulo(Articulo a){
        if (this.listaArticulos.contains(a)) {
            this.listaArticulos.remove(a);
            System.out.println("Articulo " + a + " eliminado");

        }else if (this.listaArticulos.isEmpty()) {
            
        }return false;

    }

    //public static int SumarPrecios(ArrayList<Carrito> listaArticulos) {
      //  int suma = 0;
        //for (Carrito articulo : listaArticulos) {
          //  suma +=
        //}
        //return suma;
    //}   

    public static int CantidadArticulosPorTipo(ArrayList<Carrito> listaArticulos, Class tipo) {
        int suma = 0;
        for (Carrito articulo : listaArticulos) {
            if ((tipo.isInstance(articulo))) {
                suma++; 
            }
        }
        return suma;
    }

    public double SumarLitros() {
        double suma = 0;
        for (Articulo bebida : listaArticulos) {
            if (bebida instanceof Bebida) {
                Bebida b = (Bebida) bebida;
                suma += ((Bebida)bebida).getLitros();
                
                
        }
    }
        return suma;

    


    
    
    
    
}
}
