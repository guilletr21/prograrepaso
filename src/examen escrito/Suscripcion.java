public class Suscripcion {
    private int id;
    private String tipo;
    private String fechaAlta;
    private String fechaFin;
    boolean estado;

    public Suscripcion(int id, String tipo, String fechaAlta, String fechaFin, boolean estado){
        this.id = id;
        this.tipo = tipo;
        this.fechaAlta = fechaAlta;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
