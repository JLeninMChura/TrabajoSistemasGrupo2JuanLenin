package datos;

import entidades.Persona;
import java.util.*;

public class PersonaDatos {
    public List<Persona>  listaPersonas = new ArrayList<Persona>();
    static int id=0;

    public PersonaDatos(){
    }
    
    public void create(Persona d) {
        id = id + 1;
        System.out.println("ID:" + id);
        d.setId(id);
        listaPersonas.add(d);
    }
    
    public void delete(int id) {
        for (Persona d : listaPersonas) {
            if (id == d.getId()) {
                listaPersonas.remove(d);
                System.out.println("Eliminado " + d.getNombre());
            }
        }
    }

   /*private  int edad;

     public void edadP (){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el año de su nacimiento");
        int annoy = teclado.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = teclado.nextInt();
        System.out.println("Ingrese el dia de su nacimiento");
        int dia = teclado.nextInt();

        Calendar FechaN = new GregorianCalendar(annoy, mes , dia);
        Calendar fechaHoy = Calendar.getInstance();

        int anoNac = FechaN.get(Calendar.YEAR);
        int anoHoy = fechaHoy.get(Calendar.YEAR);
        edad = anoHoy - anoNac;

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }*/


}
