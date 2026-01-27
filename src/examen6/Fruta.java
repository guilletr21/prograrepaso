package examen6;
import java.util.ArrayList;

public class Fruta extends Articulo  {
    private String unidad;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((unidad == null) ? 0 : unidad.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fruta other = (Fruta) obj;
        if (unidad == null){
            if (other.unidad != null)
                return false;
        } else if (!unidad.equals(other.unidad))
            return false;
        return true;
    }
    public Fruta(String unidad,double precio, String nombre) {
        super(nombre, precio);
        this.unidad = unidad;
    }
     public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }
    public String toString() {
        return "Cosmetico [contenido=" + unidad + "]";
    }
    
}