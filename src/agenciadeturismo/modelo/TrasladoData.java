/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeturismo.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class TrasladoData {
    
    private Connection con;

    public TrasladoData (Conexion conexion) {
      con= conexion.getConexion();
      
    }
    
  public void guardarTraslado(Traslado  traslado){
     
  
        try {
            String sql = "INSERT INTO traslado (tipo_vehiculo,cant_max_pasajero,costo_por_km) VALUES ( ?,?,? );";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, traslado.getTipo_vehiculo());
            ps.setInt(2, traslado.getCant_max_pasajero());
            ps.setDouble(3, traslado.getCosto_por_km());
            
            int filas = ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                traslado.setId(rs.getInt("id"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrasladoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  }

  public void borrarTraslado(int id){
     
 
        try {
            String sql = "DELETE FROM traslado  WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TrasladoData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
}
  
  public void actualizarTraslado(Traslado  traslado){
       
       
        
        
        try {
            String sql = "UPDATE traslado SET tipo_vehiculo =?, cant_max_pasajero=?, costo_por_km=? WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, traslado.getTipo_vehiculo());
            ps.setInt(2, traslado.getCant_max_pasajero());
            ps.setDouble(3, traslado.getCosto_por_km());
            
            
            ps.executeUpdate();
                    
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TrasladoData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
   }
  public Traslado buscarTraslado(int id){
    
        
          Traslado  traslado = null;
          
          
           try { 
            
            
            String sql = "SELECT * FROM traslado  WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            
            
            while(resultSet.next()){
                
                traslado = new Traslado();
                traslado.setId(resultSet.getInt("id"));
                traslado.setTipo_vehiculo(resultSet.getString("tipo_vehiculo"));
                traslado.setCant_max_pasajero(resultSet.getInt("cant_max_pasajero"));
                traslado.setCosto_por_km(resultSet.getDouble("costo_por_km"));
            }
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(TrasladoData.class.getName()).log(Level.SEVERE, null, ex);
        } 
           return traslado;
  }

public List<Traslado> obtenerTraslados(){
    
       
            List<Traslado> traslados= new ArrayList<Traslado>();
            
           try {  
            
            
            
            String sql = "SELECT * FROM traslado;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Traslado traslado;
            
            while(resultSet.next()){
                
                traslado = new Traslado();
                traslado.setId(resultSet.getInt("id"));
                traslado.setTipo_vehiculo(resultSet.getString("tipo_vehiculo"));
                traslado.setCant_max_pasajero(resultSet.getInt("cant_max_pasajero"));
                traslado.setCosto_por_km(resultSet.getDouble("costo_por_km"));
                
                traslados.add(traslado);
            }  
            ps.close();
            
            
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(TrasladoData.class.getName()).log(Level.SEVERE, null, ex);
        } 
           return traslados;
}    
    
    
    
    
}
