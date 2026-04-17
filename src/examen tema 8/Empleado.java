// Clase que representa al empleado y almacena sus datos
class Empleado {
    private String id;
    private String nombre;
    private double valorHora;
    private int horasTrabajadas;
    private double sueldo;

    public Empleado(String id, String nombre, double valorHora) {
        this.id = id;
        this.nombre = nombre;
        this.valorHora = valorHora;
    }

    public String getNombre() { return nombre; }
    public double getValorHora() { return valorHora; }
    public void setHorasTrabajadas(int horasTrabajadas) { this.horasTrabajadas = horasTrabajadas; }
    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }
}