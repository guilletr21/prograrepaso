package examen6;
import java.util.ArrayList;

public class Cosmetico extends Articulo {
    private double contenido;

     public Cosmetico(String nombre, double precio, double contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }

    public String toString() {
        return "Cosmetico [contenido=" + contenido + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(contenido);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cosmetico other = (Cosmetico) obj;
        if (Double.doubleToLongBits(contenido) != Double.doubleToLongBits(other.contenido))
            return false;
        return true;
    }


    



}