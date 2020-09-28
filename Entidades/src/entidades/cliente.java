package entidades;

public class cliente extends Persona{
    
    private String  impuestoPagar;
    
    public void agregarCliente() {
        System.out.println("Agregar cliente");
    }

    public void recibirPago() {
        System.out.println("Cobrar en Customer");
    }

    public String getImpuestoPagar() {
        return impuestoPagar;
    }

    public void setImpuestoPagar(String impuestoPagar) {
        this.impuestoPagar = impuestoPagar;
    }
}