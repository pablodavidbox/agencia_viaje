/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeturismo;

import agenciadeturismo.modelo.Conexion;
import agenciadeturismo.modelo.Cliente;
import agenciadeturismo.modelo.ClienteData;
import agenciadeturismo.vistas.Principal;
import agenciadeturismo.vistas.VistaClientes;
import javax.swing.UIManager;

/**
 *
 * @author Asus
 */
public class AgenciaDeTurismo {

    /**
     * @param args the command line arguments
     */

        
        
            public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            
            javax.swing.UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            /*
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
        
        // TODO code application logic here
        
        // PRINCIPIO MAIN *************************************************************************
        //*****************************************************************************************
        
        
        // Materia math= new Materia("Matematica");
        //  Materia prog= new Materia("Programacion");
         // Materia comp= new Materia("Comprension de Textos");
     // Alumno alumno1 = new Alumno("Juan Lopez", LocalDate.of(2010,Month.DECEMBER, 12), true);
     //  Alumno alumno2 = new Alumno("Miguel Perez", LocalDate.of(2011,Month.APRIL, 18), false);
      //Cliente cliente5 = new Cliente("simon", 98086465,2664172797l);

//Cliente cliente2= new Cliente();
 
 

// cliente2.setId(3);
  //     Conexion con=new Conexion();
       
    //   ClienteData cli= new ClienteData(con);
      // MateriaData md= new MateriaData(con);
      
     //cliente2 = cli.buscarClientePorNombre("Villena");
       
       //   System.out.println("Cliente a Borrar: "+ cliente2.getId());
      // md.guardarMateria(math);
       //md.guardarMateria(prog);
       //md.guardarMateria(comp);
       
       
     // ad.guardarAlumno(alumno1);
      // ad.actualizarCliente(cliente2);
      //cli.guardarCliente(cliente5);
     //cli.borrarCliente(cliente2.getId());
       
       //System.out.println("Nueva materia id: "+ math.getId());
      // System.out.println("Nueva materia id: "+ prog.getId());
       // System.out.println("Nueva materia id: "+ comp.getId());
       
     // System.out.println("Nuevo  alumno id: "+ alumno1.getId());
       // System.out.println("Nuevo  alumno id: "+ alumno2.getId());
      //System.out.println("Nuevo  cliente id: "+ cliente5.getId());
               
/*       for(Cliente it:cli.obtenerClientes()){
      
          System.out.println("ID "+ it.getId());
          System.out.println("Nombre "+ it.getNombre());
       }*/
       
        //ad.borrarCliente(cliente4.getId());     
        
        
        // FIN MAIN *******************************************************************************
        //*****************************************************************************************
    }
    

