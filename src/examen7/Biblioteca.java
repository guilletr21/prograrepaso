package examen7;

import java.util.TreeSet;

public class Biblioteca {
   
    private TreeSet<Libro>mostrarLibros = new TreeSet<Libro>();
    private int id;
    private String nombre;
      
    public Biblioteca(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
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
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Biblioteca other = (Biblioteca) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Biblioteca [id=" + id + ", nombre=" + nombre + "]";
    }
    
   
    public boolean anyadirLibro(Libro a){
      return this.mostrarLibros.add(a);
      
    }

     public void mostrarLibro(){
        for(Libro a : this.mostrarLibros){
            System.out.println(a);

        }
    }
    public boolean eliminarLibro(Libro a){
        if (this.mostrarLibros.contains(a)) {
            this.mostrarLibros.remove(a);
            System.out.println("Libro " + a + " eliminado");

        }else if (this.mostrarLibros.isEmpty()) {
            
        }return false;

    }


}
