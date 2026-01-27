package examen7;
public class Libro implements Comparable<Libro> {
   
    private String isbn;
    private String titulo;
    private int ayopublicacion;
    
   
    public Libro(String isbn, String titulo, int añopublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.ayopublicacion = añopublicacion;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAyopublicacion() {
        return ayopublicacion;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAñopublicacion(int ayopublicacion) {
        this.ayopublicacion = ayopublicacion;
    }
    
    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", añopublicacion=" + ayopublicacion + "]";
    }
    
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
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
        Libro other = (Libro) obj;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }

     @Override
     public int compareTo(Libro y){
       
        if(this.ayopublicacion  >  y.ayopublicacion){
           return 1; 
        }
        else if (this.ayopublicacion < y.ayopublicacion){
            return -1;
        }
        else {
             return 0;
        }
           
        
     }
    
}

