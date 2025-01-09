package vista;

import controlador.Ctrl_Retiro;
import controlador.Ctrl_Turno;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Retiro;
import modelo.Turno;

/**
 *
 * @author caill
 */
public class InterTurno extends javax.swing.JInternalFrame {

    public InterTurno() {
        initComponents();
        this.setSize(new Dimension(406, 300));
        this.setTitle("Nuevo Turno");
        // this.cargarComboCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        txt_numero_ficha = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jComboBox_turno = new javax.swing.JComboBox<>();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton_registrar = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nro Ficha:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Turno:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Monto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, -1));
        getContentPane().add(txt_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 170, -1));
        getContentPane().add(txt_numero_ficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 170, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 170, -1));

        jComboBox_turno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione turno:", "Dia", "Noche", "Intermedio" }));
        getContentPane().add(jComboBox_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, -1));
        getContentPane().add(jDateChooser_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Turno");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jButton_registrar.setBackground(new java.awt.Color(0, 153, 153));
        jButton_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_registrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_registrar.setText("Registrar");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, 30));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper11.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed

        // Crear las instancias necesarias
        Turno turno = new Turno();
        Ctrl_Turno controlTurno = new Ctrl_Turno();

        // Obtener los datos del cliente
        String ficha = txt_numero_ficha.getText().trim();
        String nombre = txt_nombre.getText().trim();
        String turnoSeleccionado = jComboBox_turno.getSelectedItem().toString();
        Date fechaDate = jDateChooser_fecha.getDate();
        String monto = txt_monto.getText().trim();

        // Validar campos vacíos
        if (ficha.isEmpty() || nombre.isEmpty() || turnoSeleccionado.isEmpty() || fechaDate == null || monto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            return; // Salir si falta algún campo
        }

        // Verificar si el turno ya existe
        if (controlTurno.existeTurno(nombre, fechaDate)) { // Cambiar aquí para usar Date directamente
            JOptionPane.showMessageDialog(null, "El turno ya está registrado para el nombre y la fecha proporcionados.");
            return; // Salir si el turno ya existe
        }

        // Asignar los datos al objeto Turno
        try {
            turno.setNumeroFicha(Integer.parseInt(ficha)); // Validar y convertir ficha a entero
            turno.setNombre(nombre);
            turno.setTurno(turnoSeleccionado);
            turno.setFecha(fechaDate); // Usar Date directamente
            turno.setMontoCaja(Double.parseDouble(monto)); // Validar y convertir monto a doble

            // Imprimir los valores antes de guardar
            System.out.println("Insertando turno: " + turno);

            // Guardar el turno
            if (controlTurno.guardar(turno)) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                limpiarCampos(); // Limpiar los campos después de guardar
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el turno");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos.");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            System.out.println("Error al guardar turno: " + e);
        }
    }

// Método para limpiar campos
    private void limpiarCampos() {
        txt_numero_ficha.setText("");
        txt_nombre.setText("");
        jComboBox_turno.setSelectedIndex(0); // Restablecer selección
        jDateChooser_fecha.setDate(null); // Limpiar la fecha
        txt_monto.setText("");


    }//GEN-LAST:event_jButton_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JComboBox<String> jComboBox_turno;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numero_ficha;
    // End of variables declaration//GEN-END:variables

    // Método para limpiar los campos
    private void limpiar() {
        txt_numero_ficha.setText("");
        txt_nombre.setText("");
        jComboBox_turno.setSelectedIndex(0);
        jDateChooser_fecha.setDate(null);
    }

}
