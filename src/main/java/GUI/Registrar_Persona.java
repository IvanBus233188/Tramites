/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Entidades.Persona;
import Persistencia.IPersonaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author IVAN
 */
public class Registrar_Persona extends javax.swing.JFrame {

    IPersonaDAO personaDAO;

    public Registrar_Persona(IPersonaDAO personaDAO) {
        initComponents();
        this.personaDAO = personaDAO;
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
        txtTelefono = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAPaterno = new javax.swing.JTextField();
        txtAMaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        chxDis = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Persona");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("¿Es discapacitado?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 153, 204));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 230, 28));

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setOpaque(true);
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 88, 37));

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
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 88, 37));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 88, 37));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Nombre: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 153, 204));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 230, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Apellido Paterno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Apellido Materno:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtAPaterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAPaterno.setForeground(new java.awt.Color(0, 153, 204));
        txtAPaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtAPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPaternoActionPerformed(evt);
            }
        });
        txtAPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAPaternoKeyTyped(evt);
            }
        });
        jPanel1.add(txtAPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 230, 28));

        txtAMaterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAMaterno.setForeground(new java.awt.Color(0, 153, 204));
        txtAMaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtAMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAMaternoKeyTyped(evt);
            }
        });
        jPanel1.add(txtAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 230, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("RFC:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        txtRFC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRFC.setForeground(new java.awt.Color(0, 153, 204));
        txtRFC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });
        jPanel1.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 230, 28));

        chxDis.setText("Marque la casilla para indicar que si");
        jPanel1.add(chxDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 230, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Teléfono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inicial a = new Inicial();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        guardarPersona();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtAPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAPaternoActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
     char c = evt.getKeyChar();
        
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
     char c = evt.getKeyChar();
        
        if((c<'a' || c>'z') && (c<'A' )| c>'Z')evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtAPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPaternoKeyTyped
     char c = evt.getKeyChar();
        
        if((c<'a' || c>'z') && (c<'A' )| c>'Z')evt.consume();
    }//GEN-LAST:event_txtAPaternoKeyTyped

    private void txtAMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAMaternoKeyTyped
 char c = evt.getKeyChar();
        
        if((c<'a' || c>'z') && (c<'A' )| c>'Z')evt.consume();
    }//GEN-LAST:event_txtAMaternoKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
     char c = evt.getKeyChar();
    if (!Character.isLetterOrDigit(c) || !Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
        evt.consume();
    }
    }//GEN-LAST:event_txtRFCKeyTyped

    public void guardarPersona() {
        try {
            boolean dis = true;

            if (txtAMaterno.getText().isEmpty() || txtAPaterno.getText().isEmpty()
                    || txtRFC.getText().isEmpty() || txtTelefono.getText().isEmpty()
                    || txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos");
                return;
            }

            // Validaciones de campos de texto
            if (!txtNombre.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]*$")) {
                JOptionPane.showMessageDialog(null, "El campo de Nombre no puede contener números o caracteres especiales");
                return;
            }

            if (!txtAPaterno.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]*$")) {
                JOptionPane.showMessageDialog(null, "El campo de Apellido Paterno no puede contener números o caracteres especiales");
                return;
            }

            if (!txtAMaterno.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]*$")) {
                JOptionPane.showMessageDialog(null, "El campo de Apellido Materno no puede contener números o caracteres especiales");
                return;
            }

            if (!txtRFC.getText().matches("^[a-zA-Z0-9]*$")) {
                JOptionPane.showMessageDialog(null, "El campo de RFC no puede contener caracteres especiales");
                return;
            }

            if (!txtTelefono.getText().matches("\\d{10}")) {
                JOptionPane.showMessageDialog(null, "El campo de Teléfono solo puede contener números de 10 digitos");
                return;
            }

            if (chxDis.isSelected()) {
                dis = true;
            } else {
                dis = false;
            }

            // Buscar si ya existe una persona con el mismo RFC
            Persona personaExistente = personaDAO.buscarPorRfc(txtRFC.getText());
            if (personaExistente != null) {
                JOptionPane.showMessageDialog(null, "Ya existe una persona con el mismo RFC");
                return;
            }

            // Buscar si ya existe una persona con el mismo teléfono
            Persona telefonoExistente = personaDAO.buscarTelefono(txtTelefono.getText());
            if (telefonoExistente != null) {
                JOptionPane.showMessageDialog(null, "Ese teléfono ya se encuentra registrado");
                return;
            }

            Persona nuevaPersona = new Persona();
            nuevaPersona.setRfc(txtRFC.getText());
            nuevaPersona.setNombre(txtNombre.getText());
            nuevaPersona.setApellidoPaterno(txtAPaterno.getText());
            nuevaPersona.setApellidoMaterno(txtAMaterno.getText());
            nuevaPersona.setTelefono(txtTelefono.getText());
            long date = this.txtFecha.getDate().getTime();
            java.sql.Date fechaInicioDate = new java.sql.Date(date);
            String fechaNacimiento = fechaInicioDate.toString();
            nuevaPersona.setDiscapacitado(dis);
            nuevaPersona.setFechaNacimiento(fechaInicioDate);

            Persona personaguardar = personaDAO.agregar(nuevaPersona);
            if (personaguardar == null) {
                JOptionPane.showMessageDialog(null, "No se ha podido registrar");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha registrado una persona");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido registrar");
        }
    }

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
            java.util.logging.Logger.getLogger(Registrar_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new Registrar_Persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chxDis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAMaterno;
    private javax.swing.JTextField txtAPaterno;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
