package tema10.Ejercicio1;

public abstract class Persona {
    protected int id;
    protected String nombre, apellidos, fehcaNac;
    protected double peso, altura;

    // Constructor por defecto
    public Persona() {
        this.id = 0;
        this.nombre = "Nombre";
        this.apellidos = "Apellido1 Apellido2";
        this.fehcaNac = "00/00/0000";
        this.peso = 0;
        this.altura = 0;
    }

    // Constructor
    public Persona(int id, String nombre, String apellidos, String fehcaNac, double peso, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fehcaNac = fehcaNac;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFehcaNac() {
        return fehcaNac;
    }
    public void setFehcaNac(String fehcaNac) {
        this.fehcaNac = fehcaNac;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // toString
    @Override
    public String toString() {
        return "Persona [id=" + id 
        + ", nombre=" + nombre 
        + ", apellidos=" + apellidos 
        + ", fehcaNac=" + fehcaNac
        + ", peso=" + peso 
        + ", altura=" + altura + "]";
    }

    public abstract void viajar();
}