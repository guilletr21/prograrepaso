package src;

import java.util.ArrayList;

public class SeleccionFutbol {
    private int id;
    private String nombre;
    // Integrantes no se pondra en el constructor ya que la relacion es de 0 a muchos
    private ArrayList<Persona> integrantes = new ArrayList<>();

    // Constructor por defecto
    public SeleccionFutbol() {
        this.id = 0;
        this.nombre = "Nombre";
    }

    // Constructor
    public SeleccionFutbol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters
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

    // toString
    @Override
    public String toString() {
        return "SeleccionFutbol [id=" + id 
        + ", nombre=" + nombre 
        + ", integrantes=" + integrantes + "]";
    }

    // Añadir Persona
    public boolean anyadirPersona(Persona p){
        /* Mediante un bucle for recorremos el ArrayList de integrantes,
        cuando el id de cualquier persona coincida con el id de la persona que queremos añadir
        devolverá un false, si se acaba el bucle sin devolver el false añade p a integrantes c
        devuelve un true */
        for (Persona persona : this.integrantes) {
            if (p.getId()==persona.getId()) {
                return false;
            }
        }
        this.integrantes.add(p);
        return true;
    }

    // Borrar Persona
    public boolean borrarPersona(int id){
        /* Mediante un bucle for recorremos el ArrayList de integrantes,
        cuando el id de cualquier persona coincida con el id de la persona que queremos añadir
        devolverá un true y eliminara a la persona, si se acaba el bucle sin devolver el true,
        devuelve un false */
        for (Persona persona : this.integrantes) {
            if (id==persona.getId()) {
                this.integrantes.remove(persona);
                return true;
            }
        }
        return false;
    }

    // Mostrar el ArrayList personas
    public void listarIntegrantes(){
        System.out.println(this.integrantes);
    }

    // Mostrar Futbolistas con sobrepeso del ArrayList personas
    public void listarFutbolistasSobrepeso(){
        // Con un foreach recorremos el Arraylist de integrantes
        for (Persona persona : this.integrantes) {
            // Creamos la variable imc y la definimos
            double imc = persona.getPeso()/Math.pow(persona.getAltura(), 2);
            //Si persona es futbolista y tiene el imc>22 tiene sobrepeso
            if (persona instanceof Futbolista && imc>22) {
                System.out.println("Tiene sobrepeso: " +persona);
            }
        }
    }
}
