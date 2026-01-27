package tema10.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Mundial 2022 creado
        Mundial m1 = new Mundial(10001, 2022);

        // España y Argentina añadidos
        m1.anyadirSeleccion(20001, "España");
        m1.anyadirSeleccion(20002, "Argentina");

        // Creo los integrantes
        Futbolista f1 = new Futbolista(30001, "Ferran", "Cutillas Castillo", "23/08/2005", 80, 1.81, 11, "Delantero");
        Entrenador e1 = new Entrenador(40001, "Jesus David", "Cosano Domínguez", "18/05/2007", 60, 1.86, 50001);
        Futbolista f2 = new Futbolista(30002, "Antonio", "Serrano Gómez", "04/09/2007", 90, 1.86, 7, "Defensa");
        Entrenador e2 = new Entrenador(40002, "Rafa", "Córdoba Zafra", "11/07/2007", 60, 1.70, 50002);

        // Añado integrantes a España
        m1.getSeleccion(20001).anyadirPersona(f1);
        m1.getSeleccion(20001).anyadirPersona(e1);

        // Añado integrantes a Argentina
        m1.getSeleccion(20002).anyadirPersona(f2);
        m1.getSeleccion(20002).anyadirPersona(e2);

        // Listado de los integrantes de cada Selección
        System.out.println("LISTADO DE PARTICIPANTES DE LA SELECCIÓN ESPAÑOLA");
        m1.getSeleccion(20001).listarIntegrantes();
        System.out.println();
        System.out.println("LISTADO DE PARTICIPANTES DE LA SELECCIÓN ARGENTINA");
        m1.getSeleccion(20002).listarIntegrantes();
        System.out.println();

        // Listado de los integrantes de Argentina que tienen sobrepeso
        System.out.println("JUGADORES ARGENTINOS CON SOBREPESO"); 
        m1.getSeleccion(20002).listarFutbolistasSobrepeso();
    }
}