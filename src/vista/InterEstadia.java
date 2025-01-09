package vista;

import controlador.Ctrl_Estancia;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import modelo.Estancia;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author caill
 */
public class InterEstadia extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterEstadia
     */
    public InterEstadia() {
        initComponents();
        initComponents();
        this.setSize(new Dimension(400, 438));
        this.setTitle("Nuevo Estadia");
        //  this.cargarComboCategoria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_observacion = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_patente_o_rut = new javax.swing.JTextField();
        txt_suite = new javax.swing.JTextField();
        txt_horas = new javax.swing.JTextField();
        txt_valor_consumo = new javax.swing.JTextField();
        txt_valor_estadia = new javax.swing.JTextField();
        txt_desayuno_incluido = new javax.swing.JTextField();
        jButton_registrar = new javax.swing.JButton();
        jDateChooser_hora_llegada = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txt_consumo_extra = new javax.swing.JTextField();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Estadia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Patente o Rut:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Suite:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Hora llegada:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Horas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Valor Consumo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Observación:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Valor Estadia:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Desayuno incluido:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, -1));
        getContentPane().add(txt_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 180, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, -1));
        getContentPane().add(txt_patente_o_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 180, -1));
        getContentPane().add(txt_suite, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 180, -1));
        getContentPane().add(txt_horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 180, -1));

        txt_valor_consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valor_consumoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_valor_consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 180, -1));
        getContentPane().add(txt_valor_estadia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 180, -1));
        getContentPane().add(txt_desayuno_incluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 180, -1));

        jButton_registrar.setBackground(new java.awt.Color(0, 153, 153));
        jButton_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_registrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_registrar.setText("REGISTRAR");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));
        getContentPane().add(jDateChooser_hora_llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 180, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("consumo Extra:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));
        getContentPane().add(txt_consumo_extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 180, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper13.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 390, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        // Obtener los datos del formulario
        String nombreCliente = txt_nombre.getText().trim();
        String numeroSuiteText = txt_suite.getText().trim();
        String horasText = txt_horas.getText().trim();
        String consumoExtra = txt_consumo_extra.getText().trim();
        String valorConsumoExtraText = txt_valor_consumo.getText().trim();

// Obtener la fecha y hora de llegada desde jDateChooser_hora_llegada
        Date fechaSeleccionada = jDateChooser_hora_llegada.getDate();

// Validar que se haya seleccionado una fecha
        if (fechaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fecha de llegada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

// Formatear la fecha seleccionada con el formato adecuado (YYYY-MM-DD HH:mm:ss)
        String horaLlegadaText = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(fechaSeleccionada); // Formato: YYYY-MM-DD HH:mm:ss

        try {
            // Validar valores numéricos
            int numeroSuite = Integer.parseInt(numeroSuiteText);
            int horas = Integer.parseInt(horasText);
            double valorConsumoExtra = Double.parseDouble(valorConsumoExtraText); // Este es el consumo extra que se calculará

            // Crear el objeto Estancia con los datos del formulario
            Estancia estancia = new Estancia();
            estancia.setNombreCliente(nombreCliente);
            estancia.setPatenteOIdentificacion(txt_patente_o_rut.getText().trim());
            estancia.setNumeroSuite(numeroSuite);
            estancia.setHoraLlegada(horaLlegadaText); // Hora de llegada con formato completo (fecha + hora)
            estancia.setHoras(horas);
            estancia.setConsumoExtra(consumoExtra);  // Este campo es el que tiene el detalle del consumo
            estancia.setValorConsumoExtra(valorConsumoExtra);  // El valor del consumo extra (puede variar)

            // Determinar el valor de la estadía (aquí puedes permitir que el usuario ingrese el valor)
            double valorEstadia = Double.parseDouble(txt_valor_estadia.getText().trim()); // Ahora el valor de estadía es ingresado por el usuario

            // Asignar el valor de la estadía sin sumar el valor de consumo extra
            estancia.setValorTotal(valorEstadia);  // El valor total solo refleja la estadía, no el consumo extra

            // Asignar desayuno incluido directamente como un String (por ejemplo, "Sí" o "No")
            estancia.setDesayunoIncluido(txt_desayuno_incluido.getText().trim());

            estancia.setObservacion(txt_observacion.getText().trim());

            // Llamar al método guardar
            boolean resultado = new Ctrl_Estancia().guardar(estancia);

            // Mostrar el resultado al usuario
            if (resultado) {
                JOptionPane.showMessageDialog(this, "Registro guardado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Limpiar los campos del formulario después del registro (opcional)
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error al guardar el registro.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Asegúrese de ingresar valores numéricos válidos en los campos correspondientes.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.limpiarFormulario();


    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void txt_valor_consumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valor_consumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valor_consumoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_registrar;
    private com.toedter.calendar.JDateChooser jDateChooser_hora_llegada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_consumo_extra;
    private javax.swing.JTextField txt_desayuno_incluido;
    private javax.swing.JTextField txt_horas;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_observacion;
    private javax.swing.JTextField txt_patente_o_rut;
    private javax.swing.JTextField txt_suite;
    private javax.swing.JTextField txt_valor_consumo;
    private javax.swing.JTextField txt_valor_estadia;
    // End of variables declaration//GEN-END:variables

    // Limpiar todos los campos del formulario
    private void limpiarFormulario() {
        txt_nombre.setText("");
        txt_suite.setText("");
        txt_horas.setText("");
        txt_consumo_extra.setText("");
        txt_valor_consumo.setText("");
        txt_patente_o_rut.setText("");
        txt_valor_estadia.setText("");
        txt_desayuno_incluido.setText("");
        txt_observacion.setText("");
        jDateChooser_hora_llegada.setDate(null);

    }
}