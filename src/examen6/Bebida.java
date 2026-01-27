package examen6;
import java.util.ArrayList;

public class Bebida extends Articulo {
    public double litros;

    public Bebida(String nombre, double precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(litros);
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
        Bebida other = (Bebida) obj;
        if (Double.doubleToLongBits(litros) != Double.doubleToLongBits(other.litros))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Bebida [litros=" + litros + "]";
    }

    



    



}
