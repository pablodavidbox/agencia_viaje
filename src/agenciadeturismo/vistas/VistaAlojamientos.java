/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeturismo.vistas;


import agenciadeturismo.modelo.Alojamiento;
import agenciadeturismo.modelo.AlojamientoData;
import agenciadeturismo.modelo.Conexion;
import agenciadeturismo.AgenciaDeTurismo;
import agenciadeturismo.modelo.ClienteData;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Schvager Pablo David
 */
public class VistaAlojamientos extends javax.swing.JInternalFrame {

    
private ClienteData AlojamientoData;
private Conexion conexion;  
    /**
     * Creates new form VistaAlojamientos
     */
    public VistaAlojamientos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}