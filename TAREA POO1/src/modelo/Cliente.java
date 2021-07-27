/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Real
 */
public class Cliente extends Persona {
    private String nit;

    public Cliente(){}
    public Cliente(String nit, String nombre, String apellido, String direccion, String telefono, String fecha_nacimiento) {
        super(nombre, apellido, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
    public void agregar(){
    System.out.println("Nit" + getNit());
    System.out.println("Nombre" + getNombre());
    System.out.println("Apellido" + getApellido());
    System.out.println("Direccion" + getDireccion());
    System.out.println("Telefono" + getTelefono());
    System.out.println("Fecha" + getFecha_nacimiento());
    }
    public void modificar (){
        System.out.println("Nit" + getNit());
    System.out.println("Nombre" + getNombre());
    System.out.println("Apellido" + getApellido());
    System.out.println("Direccion" + getDireccion());
    System.out.println("Telefono" + getTelefono());
    System.out.println("Fecha" + getFecha_nacimiento());

    }
    @Override
    public void eliminar (){
    System.out.println("Metodo Eliminar");
    }

    public void getNit(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
