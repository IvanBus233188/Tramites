
package GUI;

import Entidades.Persona;
import Persistencia.ConexionBD;
import Persistencia.IConexionBD;
import Persistencia.ILicenciaDAO;
import Persistencia.IPlacaDAO;
import Persistencia.ITramiteDAO;
import Persistencia.IVehiculoDAO;
import Persistencia.LicenciaDAO;
import Persistencia.PlacaDAO;
import Persistencia.TramiteDAO;
import Persistencia.VehiculoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author IVAN
 */
public class Menu extends javax.swing.JFrame {

    private Persona persona;
    public Menu(Persona persona) {
        this.persona=persona;
        initComponents();
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

        btnVolver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConsultarPrecios = new javax.swing.JButton();
        btnSolicitarLicencia = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnSolicitarPlacas = new javax.swing.JButton();
        btnAceptar6 = new javax.swing.JButton();
        lblperso = new javax.swing.JLabel();
        btnRenovarLicencia = new javax.swing.JButton();
        btnRegistrarV = new javax.swing.JButton();
        btnRenovarPlacas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        btnVolver.setBackground(new java.awt.Color(0, 102, 204));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu de opciones");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 260, -1));

        btnConsultarPrecios.setBackground(new java.awt.Color(0, 102, 204));
        btnConsultarPrecios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultarPrecios.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarPrecios.setText("Consultar Precios");
        btnConsultarPrecios.setBorder(null);
        btnConsultarPrecios.setContentAreaFilled(false);
        btnConsultarPrecios.setOpaque(true);
        btnConsultarPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPreciosActionPerformed(evt);
            }
        });

        btnSolicitarLicencia.setBackground(new java.awt.Color(0, 102, 204));
        btnSolicitarLicencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSolicitarLicencia.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitarLicencia.setText("Solicitar Licencia");
        btnSolicitarLicencia.setBorder(null);
        btnSolicitarLicencia.setContentAreaFilled(false);
        btnSolicitarLicencia.setOpaque(true);
        btnSolicitarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarLicenciaActionPerformed(evt);
            }
        });

        btnHistorial.setBackground(new java.awt.Color(0, 102, 204));
        btnHistorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Consultar Historial ");
        btnHistorial.setBorder(null);
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.setOpaque(true);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnSolicitarPlacas.setBackground(new java.awt.Color(0, 102, 204));
        btnSolicitarPlacas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSolicitarPlacas.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitarPlacas.setText("Solicitar Placas");
        btnSolicitarPlacas.setBorder(null);
        btnSolicitarPlacas.setContentAreaFilled(false);
        btnSolicitarPlacas.setOpaque(true);
        btnSolicitarPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarPlacasActionPerformed(evt);
            }
        });

        btnAceptar6.setBackground(new java.awt.Color(51, 102, 255));
        btnAceptar6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar6.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar6.setText("Volver");
        btnAceptar6.setBorder(null);
        btnAceptar6.setContentAreaFilled(false);
        btnAceptar6.setOpaque(true);
        btnAceptar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar6ActionPerformed(evt);
            }
        });

        lblperso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblperso.setForeground(new java.awt.Color(0, 102, 204));
        lblperso.setText("a");

        btnRenovarLicencia.setBackground(new java.awt.Color(0, 102, 204));
        btnRenovarLicencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRenovarLicencia.setForeground(new java.awt.Color(255, 255, 255));
        btnRenovarLicencia.setText("Renovar Licencia");
        btnRenovarLicencia.setBorder(null);
        btnRenovarLicencia.setContentAreaFilled(false);
        btnRenovarLicencia.setOpaque(true);
        btnRenovarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarLicenciaActionPerformed(evt);
            }
        });

        btnRegistrarV.setBackground(new java.awt.Color(0, 102, 204));
        btnRegistrarV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarV.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarV.setText("Registrar Vehículo");
        btnRegistrarV.setBorder(null);
        btnRegistrarV.setContentAreaFilled(false);
        btnRegistrarV.setOpaque(true);
        btnRegistrarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVActionPerformed(evt);
            }
        });

        btnRenovarPlacas.setBackground(new java.awt.Color(0, 102, 204));
        btnRenovarPlacas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRenovarPlacas.setForeground(new java.awt.Color(255, 255, 255));
        btnRenovarPlacas.setText("Renovar Placas");
        btnRenovarPlacas.setBorder(null);
        btnRenovarPlacas.setContentAreaFilled(false);
        btnRenovarPlacas.setOpaque(true);
        btnRenovarPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarPlacasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Nombre cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrarV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSolicitarLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRenovarLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRenovarPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(btnSolicitarPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblperso, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(350, 350, 350)
                    .addComponent(jLabel7)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblperso)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitarPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRenovarPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitarLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRenovarLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jLabel7)
                    .addContainerGap(281, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 394));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPreciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarPreciosActionPerformed

    private void btnAceptar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar6ActionPerformed
     Inicial in= new Inicial();
     in.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAceptar6ActionPerformed

    private void btnRenovarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarLicenciaActionPerformed
    RenovarLicencia rl= new RenovarLicencia(persona);
    rl.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnRenovarLicenciaActionPerformed

    private void btnRegistrarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVActionPerformed
    IConexionBD conexionbd= new ConexionBD();
   IVehiculoDAO vehiculodao= new VehiculoDAO(conexionbd);
    RegistrarVehiculo ve= new RegistrarVehiculo(vehiculodao,persona);
     ve.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnRegistrarVActionPerformed

    private void btnRenovarPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarPlacasActionPerformed
       IConexionBD conexionbd= new ConexionBD();
   IVehiculoDAO vehiculodao= new VehiculoDAO(conexionbd);
     RenovarPlacas sp= new RenovarPlacas(persona,vehiculodao);
      
     sp.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnRenovarPlacasActionPerformed

    private void btnSolicitarPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarPlacasActionPerformed
       IConexionBD conexionbd= new ConexionBD();
   IVehiculoDAO vehiculodao= new VehiculoDAO(conexionbd);
   IPlacaDAO placadao= new PlacaDAO(conexionbd);
      
          SolicitarPlacas pl= new SolicitarPlacas(persona,vehiculodao,placadao);
       pl.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnSolicitarPlacasActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
     IConexionBD conexionbd= new ConexionBD();
   ITramiteDAO tramite= new TramiteDAO(conexionbd);
        Historial hs= new Historial(persona,tramite);
      hs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnSolicitarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarLicenciaActionPerformed
      
 
        IConexionBD conexionbd= new ConexionBD();
        ILicenciaDAO licenciadao= new LicenciaDAO(conexionbd);
        ITramiteDAO tramitedao= new TramiteDAO(conexionbd);
        Licencias li= new Licencias(tramitedao,licenciadao,persona);
       li.setVisible(true);
       
         this.dispose();
        
    }//GEN-LAST:event_btnSolicitarLicenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar6;
    private javax.swing.JButton btnConsultarPrecios;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnRegistrarV;
    private javax.swing.JButton btnRenovarLicencia;
    private javax.swing.JButton btnRenovarPlacas;
    private javax.swing.JButton btnSolicitarLicencia;
    private javax.swing.JButton btnSolicitarPlacas;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblperso;
    // End of variables declaration//GEN-END:variables
}
