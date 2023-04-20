/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Entidades.Persona;
import Entidades.Placa;
import Entidades.Vehiculo;
import Persistencia.IPlacaDAO;
import Persistencia.IVehiculoDAO;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *Clase para las placas del vehiculo
 * @author IVAN
 */
public class PlacasVehiculo extends javax.swing.JFrame {

    /**
     * Objeto de tipo persona
     */
    private Persona persona;
    /**
     * Objeto de tipo IPlacaDAO
     */
    private IPlacaDAO placa;

    /**
     * Objeto de tipo IVehiculoDAO
     */
    private IVehiculoDAO vehiculo;

    /**
     *
     * Clase para solicitar placas de vehículo.
     *
     * @param persona objeto de la clase Persona que representa al usuario que
     * realiza la solicitud.
     * @param vehiculo objeto de la clase IVehiculoDAO que permite el acceso a
     * la información de vehículos.
     * @param placa objeto de la clase IPlacaDAO que permite el acceso a la
     * información de placas de vehículos.
     */
    public PlacasVehiculo(Persona persona, IVehiculoDAO vehiculo, IPlacaDAO placa) {
        this.persona = persona;
        this.vehiculo = vehiculo;
        this.placa = placa;
        initComponents();
        lblperso.setText(persona.getNombre() + " " + persona.getApellidoPaterno() + " " + persona.getApellidoMaterno());
        llenarCombo();
        llenarTabla();
        cbxVehiculos.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Llama al método llenarTabla() para actualizar la tabla con los datos del nuevo objeto seleccionado
                    llenarTabla();
                }
            }
        });

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
        btnVolver = new javax.swing.JButton();
        lblperso = new javax.swing.JLabel();
        btnAceptar1 = new javax.swing.JButton();
        cbxVehiculos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHistorial = new javax.swing.JTable();
        btnAceptar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Historial placas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 88, 37));

        lblperso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblperso.setForeground(new java.awt.Color(0, 102, 204));
        lblperso.setText("......");
        jPanel1.add(lblperso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 390, -1));

        btnAceptar1.setBackground(new java.awt.Color(0, 102, 204));
        btnAceptar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar1.setText("Limpiar tabla");
        btnAceptar1.setBorder(null);
        btnAceptar1.setContentAreaFilled(false);
        btnAceptar1.setOpaque(true);
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 110, 37));

        jPanel1.add(cbxVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 250, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Nombre cliente:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Vehiculos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Renovar Placas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 220, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Vehiculos:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Nombre cliente:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jtHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado", "Fecha de recepcion", "Numero de placa", "Vehiculo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtHistorial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 630, 280));

        btnAceptar2.setBackground(new java.awt.Color(0, 102, 204));
        btnAceptar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar2.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar2.setText("Llenar tabla");
        btnAceptar2.setBorder(null);
        btnAceptar2.setContentAreaFilled(false);
        btnAceptar2.setOpaque(true);
        btnAceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 110, 37));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     *
     * Método que se ejecuta cuando se presiona el botón "Volver". Crea una
     * instancia de la clase Menu con el objeto de la clase Persona y la muestra
     * en pantalla. Cierra la ventana actual.
     *
     * @param evt objeto de la clase ActionEvent que representa el evento de
     * presionar el botón "Volver".
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Menu m = new Menu(persona);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    /**
     *
     * Método que se ejecuta cuando se presiona el botón "Aceptar1". Limpia la
     * tabla del historial.
     *
     * @param evt objeto de la clase ActionEvent que representa el evento de
     * presionar el botón "Aceptar1".
     */
    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_btnAceptar1ActionPerformed
    /**
     *
     * Método que se ejecuta cuando se presiona el botón "Aceptar2". Llena la
     * tabla del historial con los datos del vehículo seleccionado en el combo
     * de vehículos.
     *
     * @param evt objeto de la clase ActionEvent que representa el evento de
     * presionar el botón "Aceptar2".
     */
    private void btnAceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar2ActionPerformed
        llenarTabla();
    }//GEN-LAST:event_btnAceptar2ActionPerformed
    /**
     *
     * Método que llena el combo de vehículos con los datos de los vehículos del
     * cliente.
     *
     * Elimina todos los elementos del combo previamente.
     *
     * @see IVehiculoDAO#listaAutosCliente(String)
     */
    public void llenarCombo() {
        cbxVehiculos.removeAllItems();
        List<Vehiculo> llenaCb = vehiculo.listaAutosCliente(persona.getRfc());
        System.out.println(llenaCb.size());
        if (llenaCb == null) {

        } else {
            Iterator rp = llenaCb.iterator();
            while (rp.hasNext()) {
                Vehiculo vehi = (Vehiculo) rp.next();
                this.cbxVehiculos.addItem(vehi);
            }
        }
    }

    /**
     *
     * Método que llena la tabla del historial con los datos de las placas del
     * vehículo seleccionado.
     *
     * @see IPlacaDAO#listaPlacasAutoSinEstado(int)
     */
    public void llenarTabla() {
        Vehiculo vehiculo = (Vehiculo) cbxVehiculos.getSelectedItem();
        List<Placa> placas = placa.listaPlacasAutoSinEstado(vehiculo.getId_vehiculo());

        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jtHistorial.getModel();

        // Limpiar la tabla antes de llenarla
        modelo.setRowCount(0);

        // Llenar la tabla con los datos de las placas
        for (Placa placa : placas) {
            String fecha = "";
            String estado = placa.getEstado();

            if (placa.getFecha_inactividad() == null) {
                fecha = placa.getFecha_solicitud().toString();
            } else {
                fecha = placa.getFecha_inactividad().toString();
            }

            String nPlaCA = placa.getNum_placa();
            String ve = placa.getVehiculo().getNum_serie();

            // Agregar una nueva fila con los datos en el modelo de la tabla
            modelo.addRow(new Object[]{estado, fecha, nPlaCA, ve});
        }
    }

    /**
     * Metodo para limpiar la tabla
     */
    public void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jtHistorial.getModel();
        modelo.setRowCount(0);
        jtHistorial.repaint();

    }

    /**
     * Elementos del frame
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnAceptar2;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Vehiculo> cbxVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtHistorial;
    private javax.swing.JLabel lblperso;
    // End of variables declaration//GEN-END:variables
}
