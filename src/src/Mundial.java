package src;

import java.util.ArrayList;

public class Mundial {
    private int id, anyo;
    // Selecciones no se pondra en el contructor ya que la relacion es de 0 a muchos.
    private ArrayList<SeleccionFutbol> selecciones = new ArrayList<>();

    // Constructor por defecto
    public Mundial() {
        this.id = 0;
        this.anyo = 0;
    }

    // Constructor
    public Mundial(int id, int anyo) {
        this.id = id;
        this.anyo = anyo;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getAnyo() {
        return anyo;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    // toString
    @Override
    public String toString() {
        return "Mundial [id=" + id + ", anyo=" + anyo + "]";
    }

    // Añadir Selección
    public boolean anyadirSeleccion(int id, String nombre){
        // Creamos un bucle foreach para recorrer el ArrayList de Selecciones
        for (SeleccionFutbol seleccionFutbol : this.selecciones) {
            // Si el id o nombre introducido coincide con el de alguna selección ya presente devuelve false
            if (id==seleccionFutbol.getId() || nombre.equals(seleccionFutbol.getNombre())) {
                return false;
            }
        }
        // Si no crea una nueva selección con el id y nombre introducidos y la añade al ArrayList, luego devulve un true.
        SeleccionFutbol nuevaSeleccion = new SeleccionFutbol(id, nombre);
        this.selecciones.add(nuevaSeleccion);
        return true;
    }

    // Borrar Selección (mismo código que en SeleccionFUtbol)
    public boolean quitarSeleccion(int id){
        for (SeleccionFutbol seleccionFutbol : this.selecciones) {
            if (id==seleccionFutbol.getId()) {
                this.selecciones.remove(seleccionFutbol);
                return true;
            }
        }
        return false;
    }

    // getSeleccion
    public SeleccionFutbol getSeleccion(int id){
        for (SeleccionFutbol seleccion : this.selecciones) {
            if (id==seleccion.getId()) {
                return seleccion;
            }
        }
        return null;
    }

    // listarSelecciones
    public void listarSelecciones(){
        System.out.println(this.selecciones);
    }
}