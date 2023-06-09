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
import Utilidades.EncriptacionUtils;
import javax.swing.JOptionPane;

/**
 * Clase para el menu
 *
 * @author IVAN
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Objeto de tipo persona
     */
    private Persona persona;

    
    
    
    /**
     * Constructor de la clase Menu que crea una nueva instancia de la ventana
     * del menú principal.
     *
     * @param persona Objeto de tipo Persona que representa la información de la
     * persona que ha iniciado sesión en la aplicación.
     */
    public Menu(Persona persona) {
        this.persona = persona;
        initComponents();

        lblperso.setText(persona.getNombre() + " " + persona.getApellidoPaterno() + " " + persona.getApellidoMaterno());
       
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
        btnSolicitarLicencia = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnSolicitarPlacas = new javax.swing.JButton();
        btnAceptar6 = new javax.swing.JButton();
        lblperso = new javax.swing.JLabel();
        btnRenovarLicencia = new javax.swing.JButton();
        btnRV = new javax.swing.JButton();
        btnRenovarPlacas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnHP = new javax.swing.JButton();

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

        btnRV.setBackground(new java.awt.Color(0, 102, 204));
        btnRV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRV.setForeground(new java.awt.Color(255, 255, 255));
        btnRV.setText("Registrar Vehiculo");
        btnRV.setBorder(null);
        btnRV.setContentAreaFilled(false);
        btnRV.setOpaque(true);
        btnRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRVActionPerformed(evt);
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

        btnHP.setBackground(new java.awt.Color(0, 102, 204));
        btnHP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHP.setForeground(new java.awt.Color(255, 255, 255));
        btnHP.setText("Historial Placas");
        btnHP.setBorder(null);
        btnHP.setContentAreaFilled(false);
        btnHP.setOpaque(true);
        btnHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(lblperso, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblperso)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitarPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRenovarPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitarLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRenovarLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 394));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     * Acción realizada al hacer clic en el botón Aceptar6. Crea una nueva
     * instancia de la ventana Inicial, la hace visible y cierra la ventana
     * actual (Menu).
     *
     * @param evt Objeto de tipo ActionEvent que representa el evento de clic en
     * el botón Aceptar6.
     */
    private void btnAceptar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar6ActionPerformed
        Inicial in = new Inicial();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptar6ActionPerformed
    /**
     * Acción realizada al hacer clic en el botón RenovarLicencia. Verifica si
     * la persona tiene una licencia registrada en la base de datos, y si es
     * así, crea una nueva instancia de la ventana RenovarLicencia con los
     * objetos de acceso a datos necesarios, la hace visible y cierra la ventana
     * actual (Menu). Si la persona no tiene una licencia registrada, muestra un
     * mensaje de error.
     *
     * @param evt Objeto de tipo ActionEvent que representa el evento de clic en
     * el botón RenovarLicencia.
     */
    private void btnRenovarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarLicenciaActionPerformed
        IConexionBD conexionbd = new ConexionBD();
        ILicenciaDAO licenciadao = new LicenciaDAO(conexionbd);
        ITramiteDAO tramitedao = new TramiteDAO(conexionbd);

        if (licenciadao.verificarLicencia(persona.getId_persona())) {

            int respuesta = JOptionPane.showConfirmDialog(this, "El usuario cuenta con una licencia vigente, si continua esta dispuesto a cancelar la licencia actual");
            if (respuesta == JOptionPane.YES_OPTION) {
                // Si el usuario acepta, se abre la ventana para renovar la licencia
                RenovarLicencia li = new RenovarLicencia(tramitedao, licenciadao, persona);
                li.setVisible(true);
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Esta persona no tiene una licencia registrada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


    }//GEN-LAST:event_btnRenovarLicenciaActionPerformed
    /**
     * Acción realizada al hacer clic en el botón HistorialPlacas. Crea una
     * nueva instancia de la ventana RegistrarVehiculo con los objetos de acceso
     * a datos necesarios, la hace visible y cierra la ventana actual (Menu).
     *
     * @param evt Objeto de tipo ActionEvent que representa el evento de clic en
     * el botón HistorialPlacas.
     */
    private void btnRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRVActionPerformed
        IConexionBD conexionbd = new ConexionBD();
        IVehiculoDAO vehiculodao = new VehiculoDAO(conexionbd);
        RegistrarVehiculo ve = new RegistrarVehiculo(vehiculodao, persona);
        ve.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRVActionPerformed
    /**
     * Acción realizada al hacer clic en el botón RenovarPlacas. Verifica si la
     * persona tiene una licencia registrada en la base de datos, y si es así,
     * crea una nueva instancia de la ventana RenovarPlacas con los objetos de
     * acceso a datos necesarios, la hace visible y cierra la ventana actual
     * (Menu). Si la persona no tiene una licencia registrada, muestra un
     * mensaje de error.
     *
     * @param evt Objeto de tipo ActionEvent que representa el evento de clic en
     * el botón RenovarPlacas.
     */
    private void btnRenovarPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarPlacasActionPerformed
        

        IConexionBD conexionbd = new ConexionBD();
        IVehiculoDAO vehiculodao = new VehiculoDAO(conexionbd);
        ILicenciaDAO licenciadao = new LicenciaDAO(conexionbd);
        IPlacaDAO placadao = new PlacaDAO(conexionbd);
        
        if(vehiculodao.listaAutosCliente(persona.getRfc()).isEmpty()){
             JOptionPane.showMessageDialog(null, "La persona no tiene vehiculos registrados");
        }else{
             
        if (licenciadao.verificarLicencia(persona.getId_persona())) {

            RenovarPlacas sp = new RenovarPlacas(persona, vehiculodao, placadao);
            sp.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Esta persona no tiene una licencia registrada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        }
        
       

    }//GEN-LAST:event_btnRenovarPlacasActionPerformed
    /**
     * Método invocado cuando se hace clic en el botón "Solicitar Placas" en la
     * interfaz de usuario. Crea una nueva instancia de la clase SolicitarPlacas
     * y la muestra en la pantalla. Se asegura de que la persona tenga una
     * licencia registrada antes de permitir la solicitud de placas.
     *
     * @param evt El evento de acción que desencadenó la invocación del método.
     */
    private void btnSolicitarPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarPlacasActionPerformed
       
        
        
        IConexionBD conexionbd = new ConexionBD();
        IVehiculoDAO vehiculodao = new VehiculoDAO(conexionbd);
        IPlacaDAO placadao = new PlacaDAO(conexionbd);
        ILicenciaDAO licenciadao = new LicenciaDAO(conexionbd);

       if(vehiculodao.listaAutosCliente(persona.getRfc()).isEmpty()){
           JOptionPane.showMessageDialog(null, "La persona no tiene vehiculos registrados");
        }else{
            if (licenciadao.verificarLicencia(persona.getId_persona())) {

            SolicitarPlacas pl = new SolicitarPlacas(persona, vehiculodao, placadao);
            pl.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Esta persona no tiene una licencia registrada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       }
        
       


    }//GEN-LAST:event_btnSolicitarPlacasActionPerformed
    /**
     * Método invocado cuando se hace clic en el botón "Historial" en la
     * interfaz de usuario. Crea una nueva instancia de la clase Historial y la
     * muestra en la pantalla, pasando la información de la persona y sus
     * trámites como parámetros.
     *
     * @param evt El evento de acción que desencadenó la invocación del método.
     */
    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        IConexionBD conexionbd = new ConexionBD();
        ITramiteDAO tramite = new TramiteDAO(conexionbd);
        Historial hs = new Historial(persona, tramite);
        hs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistorialActionPerformed
    /**
     * Método invocado cuando se hace clic en el botón "Solicitar Licencia" en
     * la interfaz de usuario. Crea una nueva instancia de la clase Licencias y
     * la muestra en la pantalla, pasando la información de la persona y los
     * DAOs relacionados como parámetros. Verifica si la persona ya tiene una
     * licencia registrada antes de permitir la solicitud de una nueva licencia.
     *
     * @param evt El evento de acción que desencadenó la invocación del método.
     */
    private void btnSolicitarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarLicenciaActionPerformed

        IConexionBD conexionbd = new ConexionBD();
        ILicenciaDAO licenciadao = new LicenciaDAO(conexionbd);
        ITramiteDAO tramitedao = new TramiteDAO(conexionbd);

        // Verificar si la persona ya tiene una licencia
        if (licenciadao.verificarLicencia(persona.getId_persona())) {
            JOptionPane.showMessageDialog(this, "Esta persona ya tiene una licencia registrada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Si no tiene una licencia registrada, continuar con la solicitud de licencia
        Licencias li = new Licencias(tramitedao, licenciadao, persona);
        li.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnSolicitarLicenciaActionPerformed
    /**
     * Método invocado cuando se hace clic en el botón "Registrar Vehículo" en
     * la interfaz de usuario. Crea una nueva instancia de la clase
     * PlacasVehiculo y la muestra en la pantalla, pasando la información de la
     * persona y los DAOs relacionados como parámetros.
     *
     * @param evt El evento de acción que desencadenó la invocación del método.
     */
    private void btnHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHPActionPerformed
        
        
        
        IConexionBD conexionbd = new ConexionBD();
        IVehiculoDAO vehiculodao = new VehiculoDAO(conexionbd);
        IPlacaDAO placadao = new PlacaDAO(conexionbd);

                 
        if(vehiculodao.listaAutosCliente(persona.getRfc()).isEmpty()){
             JOptionPane.showMessageDialog(null, "La persona no tiene vehiculos registrados");
        }else{
            
        PlacasVehiculo pl = new PlacasVehiculo(persona, vehiculodao, placadao);
        pl.setVisible(true);
        this.dispose();
        }
        
        
    }//GEN-LAST:event_btnHPActionPerformed

    /**
     * Elementos del frame
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar6;
    private javax.swing.JButton btnHP;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnRV;
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
