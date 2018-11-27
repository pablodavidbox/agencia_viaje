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
public class Alojamiento {
    

    
     private int id= -1 ;
    private String nombre;
    private String direccion;
    private int cantidad_cama;
    private boolean permite_fumador;
    private double costo_por_noche;

    public Alojamiento (String nombre, String direccion, int cantidad_cama, boolean permite_fumador, double costo_por_noche) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidad_cama = cantidad_cama;
        this.permite_fumador = permite_fumador;
        this.costo_por_noche = costo_por_noche;
    }
    
    
    public Alojamiento(int id) {
        
        this.id = id;
    }
    
     public Alojamiento(){
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidad_cama() {
        return cantidad_cama;
    }

    public void setCantidad_cama(int cantidad_cama) {
        this.cantidad_cama = cantidad_cama;
    }

    public boolean isPermite_fumador() {
        return permite_fumador;
    }

    public void setPermite_fumador(boolean permite_fumador) {
        this.permite_fumador = permite_fumador;
    }

    public double getCosto_por_noche() {
        return costo_por_noche;
    }

    public void setCosto_por_noche(double costo_por_noche) {
        this.costo_por_noche = costo_por_noche;
    }
    
    
}
