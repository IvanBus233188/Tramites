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
import Persistencia.VehiculoDAO;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase para renovar placas
 *
 * @author IVAN
 */
public class RenovarPlacas extends javax.swing.JFrame {

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
     * Constructor de la clase RenovarPlacas
     *
     * @param persona Objeto de la clase Persona que representa al propietario
     * del vehículo
     * @param vehiculo Objeto de la interfaz IVehiculoDAO que maneja los datos
     * del vehículo
     * @param placa Objeto de la interfaz IPlacaDAO que maneja los datos de las
     * placas del vehículo
     */
    public RenovarPlacas(Persona persona, IVehiculoDAO vehiculo, IPlacaDAO placa) {
        this.persona = persona;
        this.vehiculo = vehiculo;
        this.placa = placa;
        initComponents();
        lblperso.setText(persona.getNombre() + " " + persona.getApellidoPaterno() + " " + persona.getApellidoMaterno());
        llenarCombo();

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
        btnCancelar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblperso = new javax.swing.JLabel();
        btnAceptar1 = new javax.swing.JButton();
        cbxVehiculos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPlacaAnt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFolio2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Renovar Placas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 88, 37));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 88, 37));

        lblperso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblperso.setForeground(new java.awt.Color(0, 102, 204));
        lblperso.setText("......");
        jPanel1.add(lblperso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 390, -1));

        btnAceptar1.setBackground(new java.awt.Color(0, 102, 204));
        btnAceptar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar1.setText("Aceptar");
        btnAceptar1.setBorder(null);
        btnAceptar1.setContentAreaFilled(false);
        btnAceptar1.setOpaque(true);
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 88, 37));

        jPanel1.add(cbxVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 250, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Placas anteriores:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Nombre cliente:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Vehiculos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtPlacaAnt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPlacaAnt.setForeground(new java.awt.Color(0, 153, 204));
        txtPlacaAnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtPlacaAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaAntActionPerformed(evt);
            }
        });
        jPanel1.add(txtPlacaAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 250, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Renovar Placas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 220, -1));

        txtFolio2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFolio2.setForeground(new java.awt.Color(0, 153, 204));
        txtFolio2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        jPanel1.add(txtFolio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 250, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Vehiculos:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Nombre cliente:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("Placas anteriores:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     *
     * Método que se ejecuta cuando se presiona el botón "Cancelar". Este método
     * establece el valor de texto del campo "txtFolio2" a una cadena vacía.
     *
     * @param evt El evento de acción que se generó al presionar el botón
     * "Cancelar"
     */

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtFolio2.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed
    /**
     *
     * Método que se ejecuta cuando se presiona el botón "Aceptar1". Este método
     * llama al método "asere()" para realizar una acción específica.
     *
     * @param evt El evento de acción que se generó al presionar el botón
     * "Aceptar1"
     */

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        asere();
    }//GEN-LAST:event_btnAceptar1ActionPerformed
    /**
     *
     * Método que se ejecuta cuando se presiona el botón "Volver". Este método
     * crea una instancia de la clase "Menu" y hace visible la ventana
     * correspondiente, y después cierra la ventana actual.
     *
     * @param evt El evento de acción que se generó al presionar el botón
     * "Volver"
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Menu m = new Menu(persona);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtPlacaAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaAntActionPerformed
        

  
    }//GEN-LAST:event_txtPlacaAntActionPerformed
    /**
     * Metotodo para generar placas
     *
     * @return placas
     */
    public String generarPlacaAleatoria() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String placa = "";

        // Agregar tres letras aleatorias
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * letras.length());
            placa += letras.charAt(index);
        }

        // Agregar cuatro números aleatorios
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * numeros.length());
            placa += numeros.charAt(index);
        }

        return placa;
    }

    /**
     * Metodo para renovar placas
     */
    public void asere() {

        String placaAnt = txtPlacaAnt.getText();

        if (!placaAnt.matches("[a-zA-Z0-9]+")) {
            JOptionPane.showMessageDialog(null, "El campo numero de placa solo puede contener letras y números");
            return;
        }

        Calendar cal = Calendar.getInstance();

        Date fechaActual = cal.getTime();

        int precio = 0;
        Vehiculo vehiculo = (Vehiculo) cbxVehiculos.getSelectedItem();

        if (placa.verificarPlaca(vehiculo.getId_vehiculo())) {

            Placa placaencon = placa.buscarNumPlacayEstado(txtPlacaAnt.getText());

            if (placaencon == null) {
                JOptionPane.showMessageDialog(null, "No se encontró la placa con ese de numero de placa o ya se encuentra inactiva");
            } else {
                placa.desactivarPlaca(placaencon);

                precio = 1000;

                String numeroPlaca = generarPlacaAleatoria();

                Placa placanueva = new Placa();

                placanueva.setNum_placa(numeroPlaca);
                placanueva.setEstado("Activa");
                placanueva.setVehiculo(vehiculo);
                placanueva.setPersona(persona);
                placanueva.setFecha_solicitud(fechaActual);
                placanueva.setPrecio(precio);

                Placa placaa = placa.agregar(placanueva);
                if (placaa == null) {
                    JOptionPane.showMessageDialog(null, "No se pudo renovar la placa");
                } else {
                    JOptionPane.showMessageDialog(null, "La placa ha sido renovada con exito ");
                    Reporte r = new Reporte(persona, placanueva);
                    r.setVisible(true);
                    this.dispose();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este vehiculo no cuenta con placas registradas");
        }
    }

    /**
     * Metodo para llenar el combobox
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
     * Elmentos del frame
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Vehiculo> cbxVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblperso;
    private javax.swing.JTextField txtFolio2;
    private javax.swing.JTextField txtPlacaAnt;
    // End of variables declaration//GEN-END:variables
}
