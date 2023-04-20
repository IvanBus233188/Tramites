package GUI;

import Entidades.Persona;
import Persistencia.IPersonaDAO;
import Persistencia.PersonaDAO;
import Utilidades.EncriptacionUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase para registrar varios usuarios
 *
 * @author IVAN
 */
public class RegistrarVariosUsuarios extends javax.swing.JFrame {

    /**
     * Objeto de tipo IPersonaDAO
     */
    IPersonaDAO personaDAO;

    /**
     * Constructor de la clase RegistrarVariosUsuarios
     *
     * @param personaDAO objeto de tipo IPersonaDAO
     */
    public RegistrarVariosUsuarios(IPersonaDAO personaDAO) {
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
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        prueba1 = new javax.swing.JLabel();
        prueba2 = new javax.swing.JLabel();
        nClientes = new javax.swing.JComboBox<>();
        prueba3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registar a varias personas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 340, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 70));

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
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 88, 37));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 88, 37));

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido Paterno", "Apellido Materno", "RFC", "Teléfono", "¿Es discapacitado?", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 770, 350));

        prueba1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prueba1.setForeground(new java.awt.Color(0, 102, 204));
        prueba1.setText("yyyy/mm/dd");
        jPanel1.add(prueba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        prueba2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prueba2.setForeground(new java.awt.Color(0, 102, 204));
        prueba2.setText("Ingrese los datos de las personas:");
        jPanel1.add(prueba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        nClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        nClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nClientesActionPerformed(evt);
            }
        });
        jPanel1.add(nClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        prueba3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prueba3.setForeground(new java.awt.Color(0, 102, 204));
        prueba3.setText("si/no");
        jPanel1.add(prueba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para agregar varias personas
     */
    public void agregarVariasPersonas() {
        boolean dis = true;

        for (int i = 0; i < jt.getRowCount(); i++) {
            for (int j = 0; j < jt.getColumnCount(); j++) {
                if (jt.getValueAt(i, j) == null) {
                    JOptionPane.showMessageDialog(null, "Falta una casilla");
                    return;
                }
            }
        }

        int rowCount = jt.getRowCount();
        int colCount = jt.getColumnCount();

        for (int i = 0; i < rowCount; i++) {
            String nombre = (String) jt.getValueAt(i, 0);
            String apellidoPaterno = (String) jt.getValueAt(i, 1);
            String apellidoMaterno = (String) jt.getValueAt(i, 2);
            String rfc = (String) jt.getValueAt(i, 3);
            String telefono = (String) jt.getValueAt(i, 4);
            String fechaNacimiento = (String) jt.getValueAt(i, 6);

            if ("Si".equalsIgnoreCase((String) jt.getValueAt(i, 5))) {
                dis = true;
            } else if ("No".equalsIgnoreCase((String) jt.getValueAt(i, 5))) {
                dis = false;
            }

            // Expresiones regulares
            String regexRfc = "^[a-zA-Z0-9]*$";
            String regexTexto = "[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+";
            String regexTelefono = "\\d{10}";

            // Validar que no se pueda agregar números y caracteres especiales a apellidoMaterno, apellidoPaterno y Nombre
            if (!apellidoMaterno.matches(regexTexto) || !apellidoPaterno.matches(regexTexto) || !nombre.matches(regexTexto)) {
                JOptionPane.showMessageDialog(null, "Apellido materno, apellido paterno y nombre solo pueden contener letras");
                continue; // Salir de la iteración actual y pasar a la siguiente persona
            }

            // Validar que no se pueda agregar texto y caracteres especiales a Telefono
            if (!telefono.matches(regexTelefono)) {
                JOptionPane.showMessageDialog(null, "Teléfono solo puede contener números de 10 dígitos");
                continue; // Salir de la iteración actual y pasar a la siguiente persona
            }

            // Validar que no se pueda agregar caracteres especiales a RFC
            if (!rfc.matches(regexRfc)) {
                JOptionPane.showMessageDialog(null, "RFC solo puede contener 13 numeros y letras");
                continue; // Salir de la iteración actual y pasar a la siguiente persona
            }

            String nombreEncriptado = EncriptacionUtils.encriptarNombre(nombre);
            String apaternoEncriptado = EncriptacionUtils.encriptarApellidoPaterno(apellidoPaterno);
            String amaternoEncriptado = EncriptacionUtils.encriptarApellidoMaterno(apellidoMaterno);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setRfc(rfc);
            nuevaPersona.setNombre(nombreEncriptado);
            nuevaPersona.setApellidoPaterno(apaternoEncriptado);
            nuevaPersona.setApellidoMaterno(amaternoEncriptado);
            nuevaPersona.setTelefono(telefono);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = null;
            try {
                fecha = dateFormat.parse(fechaNacimiento);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta para el usuario: " + nuevaPersona.getNombre());
                return;
            }

           

           
            // Validar que la persona no tenga el mismo rfc
            List<Persona> personasConMismoRfc = personaDAO.buscarVariosRfc(rfc);
            if (!personasConMismoRfc.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La persona con RFC " + rfc + " ya ha sido registrada anteriormente");
                continue; // Salir de la iteración actual y pasar a la siguiente persona
            }
            
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(fecha);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            Calendar now = Calendar.getInstance();
            now.add(Calendar.YEAR, -18);
            if (now.get(Calendar.YEAR) < year || (now.get(Calendar.YEAR) == year && now.get(Calendar.MONTH) < month)
                    || (now.get(Calendar.YEAR) == year && now.get(Calendar.MONTH) == month && now.get(Calendar.DAY_OF_MONTH) < day)) {
                JOptionPane.showMessageDialog(null, "La persona debe ser mayor de 18 años");
                return;
            }

            
            nuevaPersona.setFechaNacimiento(fecha);
            nuevaPersona.setDiscapacitado(dis);
            
            Persona personaGuardada = personaDAO.agregar(nuevaPersona);

            if (personaGuardada == null) {
                JOptionPane.showMessageDialog(null, "Datos vacíos");
            } else {
                JOptionPane.showMessageDialog(null, "Se ha registrado una persona");
            }
        }
    }

    /**
     *
     * Método privado que se ejecuta al hacer clic en el botón "Aceptar" para
     * agregar varias personas. Realiza la acción de agregar varias personas.
     *
     * @param evt Objeto de tipo ActionEvent que representa el evento de clic en
     * el botón.
     */
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        agregarVariasPersonas();

    }//GEN-LAST:event_btnAceptarActionPerformed
    /**
     *
     * Método privado que se ejecuta al hacer clic en el botón "Volver". Crea
     * una nueva instancia de la clase Inicial y la hace visible, luego cierra
     * la ventana actual.
     *
     * @param evt Objeto de tipo ActionEvent que representa el evento de clic en
     * el botón.
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inicial a = new Inicial();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    /**
     *
     * Método que se ejecuta al seleccionar una opción en un combo box llamado
     * "nClientes". Modifica la cantidad de filas de una tabla en función del
     * valor seleccionado en el combo box.
     *
     * @param evt Objeto de tipo ActionEvent que representa el evento de
     * selección en el combo box.
     */
    private void nClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nClientesActionPerformed
        DefaultTableModel h = (DefaultTableModel) jt.getModel();
        int filas = Integer.parseInt((String) nClientes.getSelectedItem());
        h.setRowCount(filas);
    }//GEN-LAST:event_nClientesActionPerformed

    /**
     * Elementos del frame
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JComboBox<String> nClientes;
    private javax.swing.JLabel prueba1;
    private javax.swing.JLabel prueba2;
    private javax.swing.JLabel prueba3;
    // End of variables declaration//GEN-END:variables
}
