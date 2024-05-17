package singleton;
public class Principal {
    public static void main(String[] args) {
        GestorCursos gestorCursos = GestorCursos.obtenerInstancia();

        gestorCursos.agregarCurso("Informatica 101");
        gestorCursos.agregarCurso("Matematicas 101");

        System.out.println("Cursos: " + gestorCursos.obtenerCursos());
    }
}


