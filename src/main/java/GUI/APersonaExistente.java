/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Entidades.Persona;
import Persistencia.ConexionBD;
import Persistencia.IConexionBD;
import Persistencia.IPersonaDAO;
import Persistencia.PersonaDAO;
import Utilidades.EncriptacionUtils;
import javax.swing.JOptionPane;

/*
 * Clase que sirve para atender a una persona en especifico
 * @author IVAN
 */
public class APersonaExistente extends javax.swing.JFrame {

    /**
     * Constructor de la clase
     */
    public APersonaExistente() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Atender A:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 180, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 70));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 88, 37));

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
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 88, 37));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 88, 37));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Ingrese el apellido materno de la persona:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtApellidoM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtApellidoM.setForeground(new java.awt.Color(0, 153, 204));
        txtApellidoM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 210, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Ingrese el apellido paterno de la persona:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 153, 204));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 210, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Ingrese el nombre de la persona:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Ingrese el RFC de la persona:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txtRfc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRfc.setForeground(new java.awt.Color(0, 153, 204));
        txtRfc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtRfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRfcKeyTyped(evt);
            }
        });
        jPanel1.add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 210, 28));

        txtApellidoP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtApellidoP.setForeground(new java.awt.Color(0, 153, 204));
        txtApellidoP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 210, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este método se ejecuta cuando se activa el botón "btnCancelar". Borra el
     * texto de los campos de texto txtApellidoM, txtApellidoP, txtNombre y
     * txtRfc en la interfaz de usuario.
     *
     * @param evt El evento de acción que activó el botón.
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtApellidoM.setText("");
        txtApellidoP.setText("");
        txtNombre.setText("");
        txtRfc.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Este método se ejecuta cuando se activa el botón "btnVolver". Crea una
     * nueva instancia de la clase "Inicial" y la hace visible en la interfaz de
     * usuario. Luego, cierra la ventana actual.
     *
     * @param evt El evento de acción que activó el botón.
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inicial a = new Inicial();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    /**
     * Este método se ejecuta cuando se activa el botón "btnAceptar". Invoca al
     * método "buscarperso()" para realizar una búsqueda de personas.
     *
     * @param evt El evento de acción que activó el botón.
     */
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        buscarperso();
    }//GEN-LAST:event_btnAceptarActionPerformed
    /**
     * Este método se ejecuta cuando se presiona una tecla en el campo de texto
     * "txtNombre". Verifica si la tecla presionada es una letra o un espacio en
     * blanco. Si no es una letra o un espacio en blanco, consume el evento,
     * evitando que se muestre en el campo de texto.
     *
     * @param evt El evento de teclado que se activó al presionar una tecla.
     */
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped
    /**
     * Este método se ejecuta cuando se presiona una tecla en el campo de texto
     * "txtApellidoM". Verifica si la tecla presionada es una letra o un espacio
     * en blanco. Si no es una letra o un espacio en blanco, consume el evento,
     * evitando que se muestre en el campo de texto.
     *
     * @param evt El evento de teclado que se activó al presionar una tecla.
     */
    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtApellidoMKeyTyped
    /**
     * Este método se ejecuta cuando se presiona una tecla en el campo de texto
     * "txtRfc". Verifica si la tecla presionada es un carácter alfanumérico o
     * un espacio en blanco. Si no es un carácter alfanumérico o un espacio en
     * blanco, consume el evento, evitando que se muestre en el campo de texto.
     *
     * @param evt El evento de teclado que se activó al presionar una tecla.
     */
    private void txtRfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) || !Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtRfcKeyTyped

    /**
     * Este método se ejecuta cuando se presiona una tecla en el campo de texto
     * "txtApellidoP". Verifica si la tecla presionada es una letra o un espacio
     * en blanco. Si no es una letra o un espacio en blanco, consume el evento,
     * evitando que se muestre en el campo de texto.
     *
     * @param evt El evento de teclado que se activó al presionar una tecla.
     */
    private void txtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoPKeyTyped
    /**
     * Este método realiza una búsqueda de una persona en la base de datos
     * encriptando y desencriptando los nombres y apellidos proporcionados en
     * los campos de texto correspondientes. Luego, muestra un mensaje indicando
     * si la persona fue encontrada o no. Si la persona es encontrada, crea una
     * instancia de la clase "Menu" con los datos desencriptados de la persona y
     * la muestra en pantalla, cerrando la ventana actual.
     */
    public void buscarperso() {
        IConexionBD conexionbd = new ConexionBD();
        IPersonaDAO personaDAO = new PersonaDAO(conexionbd);

        String nombreEncriptado = EncriptacionUtils.encriptarNombre(txtNombre.getText());
        String apellidoPEncriptado = EncriptacionUtils.encriptarApellidoPaterno(txtApellidoP.getText());
        String apellidoMEncriptado = EncriptacionUtils.encriptarApellidoMaterno(txtApellidoM.getText());

        Persona personaencon = personaDAO.buscarPorNombresRfc(nombreEncriptado, apellidoPEncriptado, apellidoMEncriptado, txtRfc.getText());
        if (personaencon == null) {
            JOptionPane.showMessageDialog(null, "La persona no ha sido encontrada");

        } else {
            String nombreDesencriptado = EncriptacionUtils.desencriptarNombre(nombreEncriptado);
            String apellidoPDesencriptado = EncriptacionUtils.desencriptarApellidoPaterno(apellidoPEncriptado);
            String apellidoMDesencriptado = EncriptacionUtils.desencriptarApellidoMaterno(apellidoMEncriptado);

            JOptionPane.showMessageDialog(null, "La persona ha sido ingresada con exito");
            personaencon.setNombre(nombreDesencriptado);
            personaencon.setApellidoPaterno(apellidoPDesencriptado);
            personaencon.setApellidoMaterno(apellidoMDesencriptado);
            Menu a = new Menu(personaencon);
            a.setVisible(true);
            this.dispose();
        }

    }

    /**
     * Elementos del frame para la ventana de personas existentes. btnAceptar:
     * Botón para aceptar la operación. btnCancelar: Botón para cancelar la
     * operación. btnVolver: Botón para volver a la pantalla anterior. jLabel1:
     * Etiqueta para mostrar el texto "Nombre". jLabel4: Etiqueta para mostrar
     * el texto "Apellido Paterno". jLabel5: Etiqueta para mostrar el texto
     * "Apellido Materno". jLabel6: Etiqueta para mostrar el texto "RFC".
     * jLabel7: Etiqueta para mostrar el texto "Datos de la persona". jPanel1:
     * Panel para agrupar los campos de datos personales. jPanel2: Panel para
     * agrupar los botones de la ventana. txtApellidoM: Campo de texto para
     * ingresar el apellido materno de la persona. txtApellidoP: Campo de texto
     * para ingresar el apellido paterno de la persona. txtNombre: Campo de
     * texto para ingresar el nombre de la persona. txtRfc: Campo de texto para
     * ingresar el RFC de la persona.
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRfc;
    // End of variables declaration//GEN-END:variables
}
