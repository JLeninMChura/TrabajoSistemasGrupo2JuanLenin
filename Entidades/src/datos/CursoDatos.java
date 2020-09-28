package datos;

import entidades.Curso;

import java.util.*;

public class CursoDatos {
    public List<Curso>  listaCurso = new ArrayList<Curso>();
    static int id=0;

    public CursoDatos(){
    }

    public void create(Curso c) {
        id = id + 1;
        System.out.println("ID:" + id);
        c.setId(id);
        listaCurso.add(c);
    }
    public void delete(int id) {
        for (Curso c : listaCurso) {
            if (id == c.getId()) {
                listaCurso.remove(c);
                System.out.println("Eliminado " + c.getNombre());
            }
        }
    }

}
