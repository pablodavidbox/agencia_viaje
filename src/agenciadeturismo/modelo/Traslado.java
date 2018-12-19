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
public class Traslado {


        private int id= -1 ;
    private String tipo_vehiculo;
    private int cant_max_pasajero;
    private double costo_por_km;
    
    

    public Traslado(String tipo_vehiculo, int cant_max_pasajero, double costo_por_km) {
        this.tipo_vehiculo = tipo_vehiculo;
        this.cant_max_pasajero = cant_max_pasajero;
        this.costo_por_km = costo_por_km;
    }
    
    
    public Traslado(int id) {
        
        this.id = id;
    }
    
     public Traslado(){
     }

     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public int getCant_max_pasajero() {
        return cant_max_pasajero;
    }

    public void setCant_max_pasajero(int cant_max_pasajero) {
        this.cant_max_pasajero = cant_max_pasajero;
    }

    public double getCosto_por_km() {
        return costo_por_km;
    }

    public void setCosto_por_km(double costo_por_km) {
        this.costo_por_km = costo_por_km;
    }
    
}
