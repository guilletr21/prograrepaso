public class Main {
    public static void main(String[] args) {

        Gimnasio g1 = new Gimnasio(1, "Gimnasio 1", 5);

        Usuario u1 = new Usuario(1, "Ana", "F");
        Usuario u2 = new Usuario(2, "Luis", "M");

        Suscripcion s1 = new Suscripcion(1, "Mensual", "01/01", "01/02", true);
        Suscripcion s2 = new Suscripcion(1, "Anual", "01/01", "01/12", true);

        u1.setSuscripcion(s1);
        u2.setSuscripcion(s2);

        g1.altaUsuario(u1);
        g1.altaUsuario(u2);

        g1.consultarUsuarios();
    }
}
