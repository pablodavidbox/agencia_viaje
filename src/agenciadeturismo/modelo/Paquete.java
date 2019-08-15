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
// Clase Importante ''
public class Paquete {
    
    
   private int id=-1;
   private String descripcion;
   private Alojamiento alojamiento;
   private Traslado traslado;
   private int idAlojamiento;
   private int idTraslado;
   private int idpaquete;

    public Paquete(String descripcion, Alojamiento alojamiento, Traslado traslado, int idpaquete) {
        this.descripcion = descripcion;
        this.alojamiento = alojamiento;
        this.traslado = traslado;
        this.idpaquete = idpaquete;
    }

    
    public Paquete(){
        
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }
    
    public int getIdAlojamiento() {
        return alojamiento.getId();
    }
    
    public int getIdTraslado() {
        return traslado.getId();
    } 
    
    public void setIdAlojamiento(int id) {
        this.idAlojamiento = id;
    }
    
    public void setIdTraslado(int id) {
        this.idTraslado = id;
    }      

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Traslado getTraslado() {
        return traslado;
    }

    public void setTraslado(Traslado traslado) {
        this.traslado = traslado;
    }

    public int getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(int idpaquete) {
        this.idpaquete = idpaquete;
    }    
    
    
    
    
    
}
