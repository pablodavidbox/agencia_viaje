/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeturismo.modelo;

/**
 *
 * @author Asus
 */
public class Cliente {
    

  
    private int id ;
    private String nombre;
    private int dni;
    private long celular;

    public Cliente(String nombre, int dni, long celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
    }
   
   public Cliente(int id) {
   
        this.id = id;
   } 
   
   public Cliente(){

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }    
    
    
    
}
