package RepasoClase;

import java.util.ArrayList;

public abstract class Figura {
    
    protected String color;
    protected double grosorLinea;
    
    public Figura(String color, double grosorLinea) {
        this.color = color;
        this.grosorLinea = grosorLinea;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getGrosorLinea() {
        return grosorLinea;
    }
    public void setGrosorLinea(double grosorLinea) {
        this.grosorLinea = grosorLinea;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        long temp;
        temp = Double.doubleToLongBits(grosorLinea);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Figura other = (Figura) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (Double.doubleToLongBits(grosorLinea) != Double.doubleToLongBits(other.grosorLinea))
            return false;
        return true;
    }

    public abstract double calcularArea();

    public static double calcularAreaTotal(ArrayList<Figura> figuras){
        double resultado = 0;
        for (Figura figura : figuras) {
            resultado += figura.calcularArea();
        }

        return resultado;
    }

    public static double calcularAreaPorTipo(ArrayList<Figura> figuras, String tipo){
        double resultado = 0;
        for (Figura figura : figuras) {
            if ((tipo.equals("Cuadrado") && figura instanceof Cuadrado) || (tipo.equals("Circulo") && figura instanceof Circulo) || (tipo.equals("Rectangulo") && figura instanceof Rectangulo)) {
                resultado += figura.calcularArea();
            }
        }

        return resultado;
    }

    public static void mostrarAtributosFigura(ArrayList<Figura> figuras){
        for (Figura figura : figuras) {
            if (figura instanceof Cuadrado) {
                Cuadrado c = (Cuadrado)figura;
                System.out.println(c.getLado());
            } else if (figura instanceof Rectangulo) {
                Rectangulo r = (Rectangulo)figura;
                System.out.println(r.getAltura());
                System.out.println(r.getBase());
            } else if (figura instanceof Circulo) {
                Circulo cir = (Circulo)figura;
                System.out.println(cir.getRadio());
            }
        }
    }

    @Override
    public String toString() {
        return "Figura [color=" + color + ", grosorLinea=" + grosorLinea + "]";
    }
}
