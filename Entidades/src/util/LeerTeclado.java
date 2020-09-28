package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerTeclado{

    public LeerTeclado(){
    }

    BufferedReader leerT=new BufferedReader(new InputStreamReader(System.in));

    public int leer(int dato, String mensaje){        
        System.out.println(mensaje);
        try {
            dato=Integer.parseInt(leerT.readLine());
        } catch (IOException e) {
           System.err.println(e.getMessage());
        }
        return dato;
    }

    public String leer(String dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=leerT.readLine();
        } catch (IOException e) {
           System.err.println(e.getMessage());
        }
        return dato;
    }
    
    public double leer(double dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=Double.parseDouble(leerT.readLine());
        } catch (IOException e) {
           System.err.println(e.getMessage());
        }
        return dato;
    }       
    
    public char leer(char dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=leerT.readLine().toUpperCase().charAt(0);
        } catch (IOException e) {
           System.err.println(e.getMessage());
        }
        return dato;
    }

}