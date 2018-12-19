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
public class AlojamientoData {
    
   
    private Connection con;
    
     public AlojamientoData (Conexion conexion) {
      con= conexion.getConexion();
      
    }
      public void guardarAlojamiento(Alojamiento alojamiento){
   
  

        try {
            String sql = "INSERT INTO alojamiento (nombre, direccion, cantidad_cama, permite_fumador, costo_por_noche) VALUES ( ?,?,?,?,? );";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alojamiento.getNombre());
            ps.setString(2, alojamiento.getDireccion());
            ps.setInt(3, alojamiento.getCantidad_cama());
            ps.setBoolean(4, alojamiento.isPermite_fumador());
            ps.setDouble(5, alojamiento.getCosto_por_noche());
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                alojamiento.setId(rs.getInt("id"));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alojamiento");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlojamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   }
   
      
      public void borrarAlojamiento(int id){
    
 
        try {
            String sql = "DELETE FROM alojamiento  WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlojamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   
        }
    
   
   public void actualizarAlojamiento(Alojamiento alojamiento){
       
       try {
            String sql = "UPDATE alojamiento SET nombre=?, direccion=?, cantidad_cama=?, permite_fumador=?, costo_por_noche=? WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alojamiento.getNombre());
            ps.setString(2, alojamiento.getDireccion());
            ps.setInt(3, alojamiento.getCantidad_cama());
            ps.setBoolean(4, alojamiento.isPermite_fumador());
            ps.setDouble(5, alojamiento.getCosto_por_noche());
            ps.setInt(6, alojamiento.getId());
                   
            ps.executeUpdate();
                    
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlojamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   }
   
  
public Alojamiento buscarAlojamiento(int id){
    
    Alojamiento alojamiento = null;
        try {
           
            
            
            
            String sql = "SELECT * FROM alojamiento  WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            
            
            while(resultSet.next()){
                
                alojamiento = new Alojamiento();
                alojamiento.setId(resultSet.getInt("id"));
                alojamiento.setNombre(resultSet.getString("nombre"));
                alojamiento.setDireccion(resultSet.getString("direccion"));
                alojamiento.setCantidad_cama(resultSet.getInt("cantidad_cama"));
                alojamiento.setPermite_fumador(resultSet.getBoolean("permite"));
                
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlojamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alojamiento;
}

public List<Alojamiento> obtenerAlojamientos(){
    
    List<Alojamiento> alojamientos = new ArrayList<Alojamiento>();
        
    try {
            
            
             String sql = "SELECT * FROM alojamiento;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Alojamiento alojamiento;
            
            while(resultSet.next()){
                
                alojamiento= new Alojamiento();
                alojamiento.setId(resultSet.getInt("id"));
                alojamiento.setNombre(resultSet.getString("nombre"));
                alojamiento.setDireccion(resultSet.getString("direccion"));
                alojamiento.setCantidad_cama(resultSet.getInt("cantidad_cama"));
                alojamiento.setPermite_fumador(resultSet.getBoolean("permite"));
                
                
                alojamientos.add(alojamiento);
            }  
            ps.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(AlojamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    return alojamientos;
}    
    
    
    
    
}
