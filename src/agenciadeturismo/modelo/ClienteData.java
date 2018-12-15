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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Asus
 */
public class ClienteData {
    
    
    
        
    private Connection con;

    public ClienteData (Conexion conexion) {
      con= conexion.getConexion();
      
    }
    
   public void guardarCliente(Cliente cliente){
   
        try {
            String sql = "INSERT INTO cliente (nombre_apellido, dni, numero_celular) VALUES ( ? , ? , ? );";
            
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, cliente.getNombre());
                ps.setInt(2, cliente.getDni());
                ps.setLong(3, cliente.getCelular());
                
                
                int filas = ps.executeUpdate();
                
                ResultSet rs = ps.getGeneratedKeys();
                
                if (rs.next()) {
                    cliente.setId(rs.getInt("id"));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar un cliente");
                }
            }
                    
                    
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
     public void borrarCliente(int id){
    
     
        try {
            
            String sql = "DELETE FROM cliente  WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    
   
   public void actualizarCliente(Cliente cliente){
       
       
        try {
            String sql = "UPDATE cliente SET nombre_apellido =?, dni=?, numero_celular=? WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNombre());
            ps.setInt(2, cliente.getDni());
            ps.setLong(3, cliente.getCelular());
            ps.setInt(4, cliente.getId());
                   
            ps.executeUpdate();
                    
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

public Cliente buscarCliente(int id){
    
 Cliente cliente = null;
        try {
            
           String sql = "SELECT * FROM cliente  WHERE id=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            
            
            while(resultSet.next()){
                
                cliente = new Cliente();
                cliente.setId(resultSet.getInt("id"));
                cliente.setNombre(resultSet.getString("nombre_apellido"));
                cliente.setDni(resultSet.getInt("dni"));
                cliente.setCelular(resultSet.getLong("numero_celular"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cliente;
}

/*INICIO METODO BUSCAR DAVID ****************************************************************************/
/*************************************************************************************************/

public Cliente buscarClientePorNombre(String nombre, String dni){
     Cliente cliente = null;
        try {
           
            
            
            
            String sql = "SELECT * FROM cliente  WHERE nombre_apellido LIKE ? AND dni = ?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "%" +nombre +"%" );
            ps.setString(2, dni  );
            ResultSet resultSet = ps.executeQuery();
            
            
            while(resultSet.next()){
                
                cliente = new Cliente();
                cliente.setId(resultSet.getInt("id"));
                cliente.setNombre(resultSet.getString("nombre_apellido"));
                cliente.setDni(resultSet.getInt("dni"));
                cliente.setCelular(resultSet.getLong("numero_celular"));
            }
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return cliente;
}   
/*FIN METODO BUSCAR DAVID ****************************************************************************/
/*************************************************************************************************/
public List<Cliente> obtenerClientes(){
 
    List<Cliente> clientes = new ArrayList<Cliente>();
            
        try {
           
            String sql = "SELECT * FROM cliente;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Cliente cliente;
            
            while(resultSet.next()){
                
                cliente = new Cliente();
                cliente.setId(resultSet.getInt("id"));
                cliente.setNombre(resultSet.getString("nombre_apellido"));
                cliente.setDni(resultSet.getInt("dni"));
                cliente.setCelular(resultSet.getLong("numero_celular"));
                
                clientes.add(cliente);
            }  
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

          return clientes;
}
    
 
    
    
}
