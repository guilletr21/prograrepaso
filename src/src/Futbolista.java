package src;

public class Futbolista extends Persona implements Deportista {
    private int dorsal;
    private String demarcacion;

    // Constructor por defecto
    public Futbolista() {
        super();
        this.dorsal = 0;
        this.demarcacion = "Demarcación";
    }

    //Constructor
    public Futbolista(int id, String nombre, String apellidos, String fehcaNac, double peso, double altura, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, fehcaNac, peso, altura);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // Getters y Setters
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    // toString
    @Override
    public String toString() {
        return "Futbolista [id=" + id 
        + ", dorsal=" + dorsal
        + ", demarcacion=" + demarcacion 
        + ", nombre=" + nombre 
        + ", apellidos=" + apellidos
        + ", fehcaNac=" + fehcaNac 
        + ", peso=" + peso 
        + ", altura=" + altura +"]";
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
        if (imc>22) {
            return true;
        }
        return false;
    }

    @Override
    public void viajar(){
        System.out.println("viajar" +this);
    }
}