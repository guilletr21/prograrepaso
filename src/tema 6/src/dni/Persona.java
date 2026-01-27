package dni;

public class Persona {
    private String nombre;
    private String fecha;
    private dni dni;


    public Persona(String nombre, String fecha, dni dni) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public dni getDni() {
        return dni;
    }

    public void setDni(dni dni) {
        this.dni = dni;
    }

@Override
    public String toString() {
        return "persona [nombre=" + nombre + ", fecha=" + fecha + ", dni=" + dni + "]";
    }   
}
