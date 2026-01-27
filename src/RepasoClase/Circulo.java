package RepasoClase;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double grosorLinea, double radio) {
        super(color, grosorLinea);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radio);
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
        Circulo other = (Circulo) obj;
        if (Double.doubleToLongBits(radio) != Double.doubleToLongBits(other.radio))
            return false;
        return true;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }
}
