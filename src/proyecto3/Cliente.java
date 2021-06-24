/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import java.util.List;

/**
 *
 * @author Guillermolp
 */
public class Cliente {
     private int idCliente;
    private String Nombre;
     private String Correo;
      private String Telefono;
    private int Edad ;
    

    public Cliente() {
    }

    public Cliente(int idCliente, String Nombre, String Correo, String Telefono, int Edad) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Edad = Edad;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    void add(List<Cliente> cliente) {      
    }
    
    
}
