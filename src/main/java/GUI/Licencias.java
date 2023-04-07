/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Entidades.Licencia;
import Entidades.Persona;
import Persistencia.ILicenciaDAO;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author IVAN
 */
public class Licencias extends javax.swing.JFrame {

    
    ILicenciaDAO licenciaDAO;
    
      private Persona persona;
      
    public Licencias(ILicenciaDAO licenciaDAO, Persona persona) {
       this.persona=persona;
       
       
        initComponents();

        
        this.licenciaDAO=licenciaDAO;
        

          lblperso.setText(persona.getNombre()+" "+persona.getApellidoPaterno()+" "+persona.getApellidoMaterno());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblperso = new javax.swing.JLabel();
<<<<<<< HEAD
        cmbVigencia = new javax.swing.JComboBox<>();
=======
        jComboBox1 = new javax.swing.JComboBox<>();
>>>>>>> 4b898479c575bff8c0b46afb7ae5e6811647448b
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Solicitar Licencia");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Años de vigencia:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setOpaque(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 88, 37));

        btnAceptar.setBackground(new java.awt.Color(0, 102, 204));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setOpaque(true);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 88, 37));

        btnVolver.setBackground(new java.awt.Color(0, 102, 204));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setOpaque(true);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 88, 37));

        lblperso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblperso.setForeground(new java.awt.Color(0, 102, 204));
        lblperso.setText(".................");
<<<<<<< HEAD
        jPanel1.add(lblperso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 110, -1));
=======
        jPanel1.add(lblperso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 300, -1));
>>>>>>> 4b898479c575bff8c0b46afb7ae5e6811647448b

        cmbVigencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cmbVigencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        cmbVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVigenciaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbVigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 230, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void guardarLicencia(){
        
        try{
        
        Licencia licencia = new Licencia();
        
    Calendar cal = Calendar.getInstance();
    
    
    
    
  
        licencia.setPersona(persona);
        
     
        String opcion = (String) cmbVigencia.getSelectedItem();


        if (opcion.equals("1")) {
    
            cal.add(Calendar.YEAR, 1);
            Date fechaVigencia = cal.getTime();
            licencia.setVigencia(fechaVigencia);
            
        } else if (opcion.equals("2")) {
    
            cal.add(Calendar.YEAR, 2);
            Date fechaVigencia = cal.getTime();
            licencia.setVigencia(fechaVigencia);
            
        } else if (opcion.equals("3")) {
    
            cal.add(Calendar.YEAR, 3);
            Date fechaVigencia = cal.getTime();
            licencia.setVigencia(fechaVigencia);
            
        }
        
        if(persona.isDiscapacitado()==true){
            
            String tipo= "Discapacitado";
            licencia.setTipo(tipo);
        }
        else{
            String tipo= "No Discapacitado";
            licencia.setTipo(tipo);
        }
        
       
        
        
        Licencia licenciaguardar = licenciaDAO.agregar(licencia);
        
        
        if (licenciaguardar == null) {
                JOptionPane.showMessageDialog(null, "No se ha podido registrar");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha registrado una licencia");
            }
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido registrar");
        }
    }
    
    
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVigenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVigenciaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    Menu m= new Menu(persona);
      m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Licencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Licencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Licencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Licencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           //     new Licencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbVigencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblperso;
    // End of variables declaration//GEN-END:variables
}
