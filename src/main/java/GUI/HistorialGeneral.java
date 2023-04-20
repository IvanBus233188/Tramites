/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Entidades.Licencia;
import Entidades.Persona;
import Entidades.Placa;
import Entidades.Tramite;
import Persistencia.IPersonaDAO;
import Persistencia.ITramiteDAO;
import Utilidades.EncriptacionUtils;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Clase para un historial de todos los tramites
 *
 * @author IVAN
 */
public class HistorialGeneral extends javax.swing.JFrame {

    /**
     * Lista de tipo tramites
     */
    private List<Tramite> listaTabla;
    /**
     * Lista de tipo persona
     */
    private List<Persona> personas;

    /**
     * objeto de tipo personaDAO
     */
    IPersonaDAO personaDAO;
    /**
     * atributo que representa el tipo del tramite
     */
    private String tipot = "";
    /**
     * objeto de tipo tramitedao
     */
    private ITramiteDAO tramite;
    /**
     * objeto de tipo tramite
     */
    private Tramite tramitevisas;

    /**
     * Constructor de la clase HistorialGeneral
     *
     * @param personaDAO objeto de tipo persona dao
     * @param tramite objeto de tipo tramite
     */
    public HistorialGeneral(IPersonaDAO personaDAO, ITramiteDAO tramite) {

        this.tramite = tramite;
        initComponents();
        this.listaTabla = new ArrayList<Tramite>();
        llenarTabla();

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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHistorial = new javax.swing.JTable();
        btnVolver1 = new javax.swing.JButton();
        btnLicencia = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        txtFechaFin = new com.toedter.calendar.JDateChooser();
        btnllenar = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        btnFecha = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnPlacas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Historial tramites");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 330, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("A:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        jtHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo tramite", "Precio", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 990, 280));

        btnVolver1.setBackground(new java.awt.Color(0, 102, 204));
        btnVolver1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver1.setText("Volver");
        btnVolver1.setBorder(null);
        btnVolver1.setContentAreaFilled(false);
        btnVolver1.setOpaque(true);
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 580, 88, 37));

        btnLicencia.setBackground(new java.awt.Color(0, 102, 204));
        btnLicencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLicencia.setForeground(new java.awt.Color(255, 255, 255));
        btnLicencia.setText("Licencia");
        btnLicencia.setBorder(null);
        btnLicencia.setContentAreaFilled(false);
        btnLicencia.setOpaque(true);
        btnLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Filtrar por nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Filtrar por fecha:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("De:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        txtFechaInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanel1.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 240, -1));

        txtFechaFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanel1.add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 280, -1));

        btnllenar.setBackground(new java.awt.Color(0, 102, 204));
        btnllenar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnllenar.setForeground(new java.awt.Color(255, 255, 255));
        btnllenar.setText("llenar");
        btnllenar.setBorder(null);
        btnllenar.setContentAreaFilled(false);
        btnllenar.setOpaque(true);
        btnllenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnllenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnllenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 88, 37));

        btnPDF.setBackground(new java.awt.Color(204, 0, 51));
        btnPDF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF.setText("Generar PDF");
        btnPDF.setBorder(null);
        btnPDF.setContentAreaFilled(false);
        btnPDF.setOpaque(true);
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        jPanel1.add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, 120, 40));

        btnFecha.setBackground(new java.awt.Color(0, 102, 204));
        btnFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFecha.setForeground(new java.awt.Color(255, 255, 255));
        btnFecha.setText("Filtrar por fechas");
        btnFecha.setBorder(null);
        btnFecha.setContentAreaFilled(false);
        btnFecha.setOpaque(true);
        btnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 180, 37));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("Filtrar por tipo de tramite:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 153, 204));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 250, 28));

        btnPlacas1.setBackground(new java.awt.Color(0, 102, 204));
        btnPlacas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlacas1.setForeground(new java.awt.Color(255, 255, 255));
        btnPlacas1.setText("Placas");
        btnPlacas1.setBorder(null);
        btnPlacas1.setContentAreaFilled(false);
        btnPlacas1.setOpaque(true);
        btnPlacas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacas1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlacas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 88, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     * boton para regresar a la pantalla principal
     *
     * @param evt incia al momento de darle click
     */
    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        Inicial m = new Inicial();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolver1ActionPerformed

    /**
     * boton para filtrar por el tipo de tramite licencia
     *
     * @param evt incia al momento de darle click
     */
    private void btnLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicenciaActionPerformed
        limpiarTabla();
        tipot = "Licencia";

        llenarTablaTipo();
    }//GEN-LAST:event_btnLicenciaActionPerformed

    /**
     * boton para llenar la tabla
     *
     * @param evt incia al momento de darle click
     */
    private void btnllenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnllenarActionPerformed
        limpiarTabla();
        llenarTabla();
    }//GEN-LAST:event_btnllenarActionPerformed
    /**
     * boton para generar un pdf en base a lo que este filtrado en la tabla
     *
     * @param evt
     */
    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de ejecutar este comando?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            List<Reportepdf> listaReporte = new ArrayList<Reportepdf>();

            if (listaTabla.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La tabla esta vacia");
                return;
            }
            for (Tramite tramite : listaTabla) {
                Reportepdf repor = new Reportepdf();
                repor.setCosto(String.valueOf((tramite.getPrecio())));

                if (tramite instanceof Placa) {
                    tipot = "Placa";
                } else if (tramite instanceof Licencia) {
                    tipot = "Licencia";
                } else {
                    tipot = "baja"; // Agrega un valor por defecto si no es Placa ni Licencia
                }

                repor.setTipo(tipot);
                Persona personaa = tramite.getPersona();

                
                String nombreEncriptado = personaa.getNombre();
                String nombreDesencriptado = EncriptacionUtils.desencriptarNombre(nombreEncriptado);

                String apellidoPEncriptado = personaa.getApellidoPaterno();
                String apellidoPDesencriptado = EncriptacionUtils.desencriptarApellidoPaterno(apellidoPEncriptado);

                String apellidoMEncriptado = personaa.getApellidoMaterno();
                String apellidoMDesencriptado = EncriptacionUtils.desencriptarApellidoMaterno(apellidoMEncriptado);

                String nombreC = nombreDesencriptado + " " + apellidoPDesencriptado + " " + apellidoMDesencriptado;
                

                repor.setNombre(nombreC);

                repor.setFecha(tramite.getFecha_solicitud().toString());
                listaReporte.add(repor);
            }
            try {
                LocalDateTime fechaHoraActual = LocalDateTime.now();
                DateTimeFormatter formatEscrito = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy, hh:mm a");
                String fechaHoraEscrita = fechaHoraActual.format(formatEscrito);

                Map parametro = new HashMap();
                parametro.put("fechaReporte", fechaHoraEscrita);
                JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(listaReporte);

                // Cargar el archivo JRXML del reporte
                InputStream reportFile = getClass().getResourceAsStream("/Reportes_1_1.jrxml");
                JasperReport jasperReport = JasperCompileManager.compileReport(reportFile);

                // Llenar el reporte con los datos
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametro, beanColDataSource);
                
              
                // Visualizar el reporte
                JasperExportManager.exportReportToPdfFile(jasperPrint, "./ReporteTramites.pdf");

            } catch (Exception e) {
                System.out.println("e");
            }
        }
    }//GEN-LAST:event_btnPDFActionPerformed

    /**
     * boton para filtar por las dos fechas
     *
     * @param evt incia al momento de darle click
     */
    private void btnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaActionPerformed

        if (txtFechaInicio.getDate() != null && txtFechaFin.getDate() != null) {
            limpiarTabla();
            llenarTablaFechas();
        } else {
            JOptionPane.showMessageDialog(null, "Favor de llenar las fechas");
        }


    }//GEN-LAST:event_btnFechaActionPerformed

    /**
     * propieda que llena la tabla en base el nombre que se vaya escribiendo
     *
     * @param evt inicia de manera automatica
     */
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        llenarTablaNombre();
    }//GEN-LAST:event_txtNombreKeyReleased
    /**
     * propiedad para validad los caracteres en el txt
     *
     * @param evt inicia al momento de escribir
     */
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped
    /**
     * Boton que filta en base al tipo de tramite placas
     *
     * @param evt inicia al momento de darle click
     */
    private void btnPlacas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacas1ActionPerformed
        limpiarTabla();
        tipot = "Placa";

        llenarTablaTipo();
    }//GEN-LAST:event_btnPlacas1ActionPerformed
    /**
     * Metodo para llenar la tabla en base al tipo de tramite
     */
    public void llenarTablaTipo() {
        DefaultTableModel modelo = (DefaultTableModel) jtHistorial.getModel();
        listaTabla = tramite.tramitesPersonaTipo(tipot);

        for (Tramite tramite : listaTabla) {
            String nombreEncriptado = tramite.getPersona().getNombre();
            String nombre = EncriptacionUtils.desencriptarNombre(nombreEncriptado);

            String tipoTramite = tipot;
            int precio = tramite.getPrecio();
            String fecha = tramite.getFecha_solicitud().toString();

            modelo.addRow(new Object[]{nombre, tipoTramite, precio, fecha});
        }
    }

    /**
     * Limpia el contenido actual de la tabla, eliminando todas las filas.
     *
     */
    public void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jtHistorial.getModel();
        modelo.setRowCount(0);
        jtHistorial.repaint();

    }

    /**
     * Llena la tabla con todos los registros de tramites obtenidos mediante el
     * método obtenerTodosTramites() de la clase Tramite. Se utiliza la
     * instancia de la clase Tramite para determinar el tipo de trámite.
     *
     */
    public void llenarTabla() {
        listaTabla = tramite.obtenerTodosTramites();
        DefaultTableModel modelo = (DefaultTableModel) jtHistorial.getModel();

        for (Tramite tramite : listaTabla) {
            String nombreEncriptado = tramite.getPersona().getNombre();
            String nombre = EncriptacionUtils.desencriptarNombre(nombreEncriptado); // Desencriptar nombre de la persona asociada al tramite

            int precio = tramite.getPrecio();
            String fecha = tramite.getFecha_solicitud().toString();

            if (tramite instanceof Placa) {
                tipot = "Placa";
            } else if (tramite instanceof Licencia) {
                tipot = "Licencia";
            } else {
                tipot = "baja"; // Agrega un valor por defecto si no es Placa ni Licencia
            }

            modelo.addRow(new Object[]{nombre, tipot, precio, fecha});
        }
    }

    /**
     * Llena la tabla con los registros de tramites filtrados por el rango de
     * fechas seleccionado. Los registros se obtienen mediante el método
     * tramitesPersonaEnRangoFechasGeneral() de la clase Tramite. Se utiliza la
     * fecha de inicio y fecha de fin seleccionadas en campos de texto para la
     * búsqueda.
     */
    public void llenarTablaFechas() {
        long date = this.txtFechaInicio.getDate().getTime();
        java.sql.Date fechaInicioDate = new java.sql.Date(date);

        long date2 = this.txtFechaFin.getDate().getTime();
        java.sql.Date fechaFin = new java.sql.Date(date2);

        listaTabla = tramite.tramitesPersonaEnRangoFechasGeneral(fechaInicioDate, fechaFin); // Cambio de método
        DefaultTableModel modelo = (DefaultTableModel) jtHistorial.getModel();
        System.out.println(listaTabla.size());

        for (Tramite tramite : listaTabla) {
            String nombreEncriptado = tramite.getPersona().getNombre(); // Obtener nombre de la persona asociada al trámite
            String nombre = EncriptacionUtils.desencriptarNombre(nombreEncriptado);

            String tipoTramite = null;
            int precio = tramite.getPrecio();
            String fecha = tramite.getFecha_solicitud().toString();

            if (tramite instanceof Placa) {
                tipoTramite = "Placa";
            } else if (tramite instanceof Licencia) {
                tipoTramite = "Licencia";
            }

            modelo.addRow(new Object[]{nombre, tipoTramite, precio, fecha});
        }
    }

    /**
     * Llena la tabla con los registros de tramites filtrados por el nombre
     * ingresado en el campo de texto. Los registros se obtienen mediante el
     * método obtenerTodosTramites() de la clase Tramite. Se utiliza el nombre
     * de la persona asociada al trámite para la búsqueda, desencriptándolo
     * previamente.
     */
    public void llenarTablaNombre() {
        listaTabla = tramite.obtenerTodosTramites();
        List<Tramite> aux = new ArrayList<>();
        if (!txtNombre.getText().equalsIgnoreCase("")) {
            for (Tramite tramite : listaTabla) {
                Persona persona = tramite.getPersona();
                String nombre = EncriptacionUtils.desencriptarNombre(persona.getNombre()) + " "
                        + EncriptacionUtils.desencriptarApellidoPaterno(persona.getApellidoPaterno()) + " "
                        + EncriptacionUtils.desencriptarApellidoMaterno(persona.getApellidoMaterno());
                if (nombre.toLowerCase().contains(txtNombre.getText().toLowerCase())) {
                    aux.add(tramite);
                }
            }
            listaTabla = aux;
        }

        DefaultTableModel modelo = (DefaultTableModel) jtHistorial.getModel();
        modelo.setRowCount(0); // Limpiar el contenido actual de la tabla

        for (Tramite tramite : listaTabla) {
            Persona persona = tramite.getPersona();
            String nombre = EncriptacionUtils.desencriptarNombre(persona.getNombre()) + " "
                    + EncriptacionUtils.desencriptarApellidoPaterno(persona.getApellidoPaterno()) + " "
                    + EncriptacionUtils.desencriptarApellidoMaterno(persona.getApellidoMaterno());
            String tipoTramite = "";
            if (tramite instanceof Placa) {
                tipoTramite = "Placa";
            } else if (tramite instanceof Licencia) {
                tipoTramite = "Licencia";
            }
            modelo.addRow(new Object[]{nombre, tipoTramite, tramite.getPrecio(), tramite.getFecha_solicitud()});
        }

        // Actualizar la vista de la tabla
        jtHistorial.setModel(modelo);

    }

    /**
     * Elemento del frame
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecha;
    private javax.swing.JButton btnLicencia;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnPlacas1;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnllenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtHistorial;
    private com.toedter.calendar.JDateChooser txtFechaFin;
    private com.toedter.calendar.JDateChooser txtFechaInicio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
