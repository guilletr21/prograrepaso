package src;

public class Entrenador extends Persona implements Deportista{
    private int idFederacion;

    // Constructor por defecto
    public Entrenador() {
        super();
        this.idFederacion = 0;
    }

    // Constructor
    public Entrenador(int id, String nombre, String apellidos, String fehcaNac, double peso, double altura, int idFederacion) {
        super(id, nombre, apellidos, fehcaNac, peso, altura);
        this.idFederacion = idFederacion;
    }

    // Getters y Setters
    public int getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    // toString
    @Override
    public String toString() {
        return "Entrenador [id=" + id
        + ", idFederacion=" + idFederacion
        + ", nombre=" + nombre 
        + ", apellidos="+ apellidos 
        + ", fehcaNac=" + fehcaNac 
        + ", peso=" + peso 
        + ", altura=" + altura + "]";
    }

    // Métodos de la interfaz Deportista
    @Override
    public void entrenar(){
        System.out.println(getNombre()+" está entrenando");
    }

    @Override
    public void jugarPartido(){
        System.out.println(getNombre()+" está jugando el partido");
    }

    @Override
    public boolean tieneSobrepeso(){
        double imc = getPeso()/Math.pow(getAltura(), 2);
        if (imc>25) {
            return true;
        }
        return false;
    }

    @Override
    public void viajar(){
        System.out.println("viajar" +this);
    }
}