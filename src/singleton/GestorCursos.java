package singleton;
import java.util.ArrayList;
import java.util.List;

public class GestorCursos {
    private static GestorCursos instancia;
    private List<String> cursos;

    private GestorCursos() {
        cursos = new ArrayList<>();
    }

    public static synchronized GestorCursos obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorCursos();
        }
        return instancia;
    }

    public void agregarCurso(String curso) {
        cursos.add(curso);
    }

    public List<String> obtenerCursos() {
        return cursos;
    }
}




