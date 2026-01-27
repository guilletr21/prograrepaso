public class taller {
    private String nombre;
    private String cif;
    private final static int MAX_VEHICULOS = 3;
    
    public taller(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCif() {
        return cif;
    }   

    public void setCif(String cif) {
        this.cif = cif;
    }
    
    public static int getMaxVehiculos() {
        return MAX_VEHICULOS;
    }
 

}
