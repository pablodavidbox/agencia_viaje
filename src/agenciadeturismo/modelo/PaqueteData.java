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
public class PaqueteData {
    
    private  int id_alojamiento;
    private int id_traslado;
        
    private Connection con;

    public PaqueteData (Conexion conexion) {
      con= conexion.getConexion();
      
    }
    
   public void guardarPaquete(Paquete paquete){
   
        try {
            String sql = "INSERT INTO paquete (nombre _descripcion, id_alojamiento, id_traslado) VALUES ( ? , ? , ? );";
            
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, paquete.getDescripcion());
                ps.setInt(2, paquete.getIdAlojamiento());
                ps.setInt(3, paquete.getIdTraslado());
                
                
                int filas = ps.executeUpdate();
                
                ResultSet rs = ps.getGeneratedKeys();
                
                if (rs.next()) {
                    paquete.setId(rs.getInt("id"));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar un paquete");
                }
            }
                    
                    
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteData.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
     public void borrarPaquete(int id){
    
     
        try {
            
            String sql = "DELETE FROM paquete  WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    
   
   public void actualizarPaquete(Paquete paquete){
       
       
        try {
            String sql = "UPDATE paquete SET nombre _descripcion =?, id_alojamiento=?, id_traslado=? WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paquete.getDescripcion());
            ps.setInt(2, paquete.getIdAlojamiento());
            ps.setLong(3, paquete.getIdTraslado());
            ps.setInt(4, paquete.getId());
                   
            ps.executeUpdate();
                    
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteData.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

public Paquete buscarPaquete(int id){
    
 Paquete paquete = null;
        try {
            
           String sql = "SELECT * FROM paquete  WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            
            
            while(resultSet.next()){
                
                paquete = new Paquete();
                paquete.setId(resultSet.getInt("id"));
                paquete.setDescripcion(resultSet.getString("nombre _descripcion"));
                paquete.setAlojamiento(resultSet.getInt("id_alojamiento"));
                paquete.setTraslado(resultSet.getInt("id_traslado"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return paquete;
}

/*INICIO METODO BUSCAR DAVID ****************************************************************************/
/*************************************************************************************************/

public Paquete buscarPaquetePorNombre(String nombre){
     Paquete paquete = null;
        try {
           
            
            
            
            String sql = "SELECT * FROM paquete  WHERE nombre _descripcion LIKE ? ;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "%" +nombre +"%" );
            ResultSet resultSet = ps.executeQuery();
            
            
            while(resultSet.next()){
                
                paquete = new Paquete();
                paquete.setId(resultSet.getInt("id"));
                paquete.setNombre(resultSet.getString("nombre _descripcion"));
                paquete.setDni(resultSet.getInt("id_alojamiento"));
                paquete.setCelular(resultSet.getInt("id_traslado"));
            }
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteData.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return paquete;
}   
/*FIN METODO BUSCAR DAVID ****************************************************************************/
/*************************************************************************************************/
public List<Paquete> obtenerPaquetes(){
 
    List<Paquete> paquetes = new ArrayList<Paquete>();
            
        try {
           
            String sql = "SELECT * FROM paquete;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Paquete paquete;
            
            while(resultSet.next()){
                
                paquete = new Paquete();
                paquete.setId(resultSet.getInt("id"));
                paquete.setNombre(resultSet.getString("nombre _descripcion"));
                paquete.setDni(resultSet.getInt("id_alojamiento"));
                paquete.setCelular(resultSet.getInt("id_traslado"));
                
                paquetes.add(paquete);
            }  
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteData.class.getName()).log(Level.SEVERE, null, ex);
        }

          return paquetes;
}
    
    
    
    
    
    
    
    
    
    
}
