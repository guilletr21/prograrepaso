public class Gimnasio {
    private int id;
    private String nombre;
    private int capacidad;
    private Usuario[] usuarios;
    private int contador;

    public Gimnasio(int id, String nombre, int capacidad){
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        usuarios = new Usuario[capacidad];
        contador = 0;
    }

    public boolean altaUsuario(Usuario u) {
        if (contador < capacidad) {
            usuarios[contador] = u;
            contador++;
            return true;
        }else{
        return false;
        }
    }

    public void consultarUsuarios(){
        if (contador == 0) {
            System.out.println("No hay usuarios registrados en el gimnasio");
        } else {
            for (int i = 0; i < contador; i++){
                Usuario u = usuarios[i];
                if(u.getSuscripcion().isEstado()){
                System.out.println(u.getId() + " - " + u.getNombre() + " - " + u.getSexo + " / Suscripción activa: " + u.getSuscripcion().isEstado());
                }
            }
        }
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
