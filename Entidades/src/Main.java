import datos.CursoDatos;
import entidades.Curso;
import util.LeerTeclado;
import datos.PersonaDatos;
import entidades.Persona;

import java.util.Currency;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LeerTeclado teclado = new LeerTeclado();
        PersonaDatos pData = new PersonaDatos();
        CursoDatos cData = new CursoDatos();

        int opt;
        do {
            opt = teclado.leer(0,"|>------- CRUD PERSONA ------<|\n"+
            "1 Listar Persona\n"+
            "2 Listar Curso\n"+
            "3 Nueva Persona\n"+
            "4 Nuevo Curso\n"+
            "5 Eliminar\n"+
            "0 Salir\n");
            System.out.println("Tu seleccionaste: " + opt);

            switch (opt) {
                case 1:
                    System.out.println("**** 1 Listar Persona ****");
                    List<Persona> lis = pData.listaPersonas;
                    System.out.println("ID \t Nombre \t Sexo \t Ap_paterno \t Ap_materno " +
                            "\t Edad \t dirección \t correo \t DNI");
                    for (Persona d : lis) {
                        int edad = new Date().getYear()-d.getFechaNac().getYear();
                        System.out.println(d.getId() + "\t" + d.getNombre() + "\t" + d.getSexo()+"\t"+d.getAp_paterno()+
                                "\t"+d.getAp_materno()+"\t"+edad+"\t"+d.getDirection()+"\t"+d.getCorreo()+"\t"+d.getDni());
                    }
                    break;
                case 2:
                    System.out.println("**** 2 Listar Curso ****");
                    List<Curso> lisc = cData.listaCurso;
                    System.out.println("ID \t Nombre \t Créditos \t Horas");
                    for (Curso c : lisc) {
                        System.out.println(c.getId()+ "\t" + c.getNombre() + "\t"+ c.getCredits() +"\t"+ c.getHoras());
                    }
                    break;
                case 3:
                    System.out.println("**** 3 Nueva Persona ****");
                    Persona d = new Persona();
                    d.setNombre(teclado.leer("","Ingresa tu nombre"));
                    d.setSexo(teclado.leer("","Ingrese su sexo"));
                    d.setAp_materno(teclado.leer("","Ingrese su apellido materno"));
                    d.setAp_paterno(teclado.leer("","Ingrese su apellido paterno"));
                    d.setFechaNac(teclado.leer("","Ingrese su fecha de nacimiento"));
                    d.setCorreo(teclado.leer("","Ingrese su correo electrónico"));
                    d.setDirection(teclado.leer("","Ingrese su dirección"));
                    d.setDni(teclado.leer(0,"Ingrese su numero de DNI"));
                    pData.create(d);
                    break;
                case 4:
                    System.out.println("**** 4 Nuevo Curso ****");
                    Curso c = new Curso();
                    c.setNombre(teclado.leer("","Ingrese el nombre sel curso"));
                    c.setCredits(teclado.leer(0,"Ingrese el numero de créditos que tiene"));
                    c.setHoras(teclado.leer("","Ingrese el numero horas del curso"));
                    cData.create(c);
                    break;
                case 5:
                    System.out.println("**** 5 Eliminar ****");
                    System.out.print("Ingrese ID a eliminar: ");
                    pData.delete(teclado.leer(0,"Ingrese la ID a eliminar"));
                    break;
                case 0:
                    System.out.println("Salir ");
                    break;
                default:
                    System.out.println("Incorrecto");
                    break;
            }
        } while (opt != 0);

    }
}