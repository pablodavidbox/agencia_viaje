/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeturismo.modelo;

import java.time.LocalDate;
/**
 *
 * @author Asus
 */
public class Compra {
    
   private int id=-1;
   private Cliente cliente;
   private Paquete paquete;
   private LocalDate fecha_ingreso;
   private LocalDate fecha_egreso;
   
   public Compra (int id){

this.id= id;
}

    public Compra(Cliente cliente, Paquete paquete, LocalDate fecha_ingreso) {
        this.cliente = cliente;
        this.paquete = paquete;
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public LocalDate getFecha_egreso() {
        return fecha_egreso;
    }

    public void setFecha_egreso(LocalDate fecha_egreso) {
        this.fecha_egreso = fecha_egreso;
    }    
    
    
    
}
