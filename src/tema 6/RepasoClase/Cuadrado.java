package RepasoClase;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(String color, double grosorLinea) {
        super(color, grosorLinea);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(String color, double grosorLinea, double lado) {
        super(color, grosorLinea);
        this.lado = lado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(lado);
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
        Cuadrado other = (Cuadrado) obj;
        if (Double.doubleToLongBits(lado) != Double.doubleToLongBits(other.lado))
            return false;
        return true;
    }

    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + "]";
    }
}
