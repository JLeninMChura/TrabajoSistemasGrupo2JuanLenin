package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

    private int id;
    private String nombre;
    private String sexo;
    private String ap_paterno;
    private String ap_materno;
    private Date fechaNac;
    private String direction;
    private String correo;
    private int dni;

    public void Comer() {
        System.out.println("Comer en Person");
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.fechaNac = sdf.parse(fechaNac);
        }catch (Exception e){
        }

    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}