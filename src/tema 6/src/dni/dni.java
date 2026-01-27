package dni;

public class dni {
    private String numero;
    private Persona persona;

    public dni(String numero,Persona persona) {
        this.numero = numero;
        this.persona = persona;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "dni [numero=" + numero + "]";
    }
    public String getLetra() {
        return numero.substring(numero.length() - 1);
    }   
}
