package vista;

import com.mysql.jdbc.Statement;
import conexion.Conexion;
import controlador.Ctrl_Estancia;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.WIDTH;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Estancia;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author caill
 */
public class InterGestionarEstadia extends javax.swing.JInternalFrame {

    private int idEstancia;

    public InterGestionarEstadia() {
        initComponents();
        this.setSize(new Dimension(904, 573));
        this.setTitle("Gestionar Estadia");

        this.CargarTablaEstancia();

        //insertar imagen en el label
        ImageIcon wallpaper = new ImageIcon("src/img/wallpaper14.jpg ");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(904, 573, WIDTH));
//        wallpaper.setIcon(icono);
//        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_estancia = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txt_numero_suite = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_patente_o_rut = new javax.swing.JTextField();
        txt_desayuno_incluido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_horas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_consumo_extra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jDateChooser_hora_llegada = new com.toedter.calendar.JDateChooser();
        txt_valor_total = new javax.swing.JTextField();
        txt_valor_consumo_extra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_observacion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_busqueda_por_patente_o_rut = new javax.swing.JTextField();
        wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Estadia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_estancia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_estancia);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 730, 270));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_numero_suite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_numero_suite, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Observación:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Hora llegada:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Desayuno:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Valor Extra:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Precio:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 90, -1));

        txt_patente_o_rut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_patente_o_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        txt_desayuno_incluido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_desayuno_incluido, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 170, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Patente/ Rut:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Horas:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 90, -1));

        txt_horas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Consumo Ex:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 100, -1));

        txt_consumo_extra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_consumo_extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 170, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Nombre:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));
        jPanel3.add(jDateChooser_hora_llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, -1));
        jPanel3.add(txt_valor_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 170, -1));
        jPanel3.add(txt_valor_consumo_extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 170, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Suite:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, -1));
        jPanel3.add(txt_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 870, 130));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_actualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 130, 270));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Patente/Rut:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        btn_buscar.setBackground(new java.awt.Color(0, 153, 153));
        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 120, 30));

        txt_busqueda_por_patente_o_rut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel4.add(txt_busqueda_por_patente_o_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 11, 580, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 870, 50));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper14.jpg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

        if (!validarCampos()) {
            return;
        }

        Estancia estancia = new Estancia();
        Ctrl_Estancia controlEstancia = new Ctrl_Estancia();

        try {
            estancia.setNombreCliente(txt_nombre.getText().trim());
            estancia.setPatenteOIdentificacion(txt_patente_o_rut.getText().trim());
            estancia.setNumeroSuite(Integer.parseInt(txt_numero_suite.getText().trim()));
            estancia.setHoras(Integer.parseInt(txt_horas.getText().trim()));
            estancia.setConsumoExtra(txt_consumo_extra.getText().trim());
            estancia.setValorConsumoExtra(Double.parseDouble(txt_valor_consumo_extra.getText().trim()));
            estancia.setValorTotal(Double.parseDouble(txt_valor_total.getText().trim()));
            estancia.setDesayunoIncluido(txt_desayuno_incluido.getText().trim());
            estancia.setObservacion(txt_observacion.getText().trim());

            java.util.Date date = jDateChooser_hora_llegada.getDate();
            if (date != null) {
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                estancia.setHoraLlegada(sdf.format(date));
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una hora de llegada válida.");
                return;
            }

            if (controlEstancia.actualizar(estancia, idEstancia)) {
                JOptionPane.showMessageDialog(null, "Estancia actualizada");
                limpiar();
                this.CargarTablaEstancia();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar la estancia.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos.");
        }


    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        Ctrl_Estancia controlEstancia = new Ctrl_Estancia();

        if (idEstancia == 0) {
            JOptionPane.showMessageDialog(null, "¡Seleccione un Registro!");
        } else {
            // Mostrar advertencia de confirmación
            int confirmacion = JOptionPane.showConfirmDialog(
                    null,
                    "¿Está seguro de que desea eliminar el producto?",
                    "Confirmación de Eliminación",
                    JOptionPane.YES_NO_OPTION
            );

            // Verificar la respuesta del usuario
            if (confirmacion == JOptionPane.YES_OPTION) {
                if (controlEstancia.eliminar(idEstancia)) { // Si la eliminación es exitosa
                    JOptionPane.showMessageDialog(null, "¡Producto Eliminado!");
                    this.CargarTablaEstancia();
                    this.limpiar();
                } else { // Si la eliminación falla
                    JOptionPane.showMessageDialog(null, "¡Error al Eliminar Registro!");
                }
            }
        }


    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String criterioBusqueda = txt_busqueda_por_patente_o_rut.getText().trim();

        if (criterioBusqueda.isEmpty()) {
            // Si el campo está vacío, recargamos todos los registros
            CargarTablaEstancia(); // Recargar todos los datos si no se ingresa un criterio
        } else {
            Ctrl_Estancia estanciaController = new Ctrl_Estancia();

            // Realizar la búsqueda por RUT o patente
            Estancia estanciaEncontrada = estanciaController.buscarPorRutOPatente(criterioBusqueda);

            if (estanciaEncontrada == null) {
                // Si no hay resultados, limpiar la tabla
                DefaultTableModel model = new DefaultTableModel();
                InterGestionarEstadia.jTable_estancia = new JTable(model);
                InterGestionarEstadia.jScrollPane1.setViewportView(InterGestionarEstadia.jTable_estancia);

                // Definir las columnas de la tabla (vacía por ahora)
                model.addColumn("ID Estancia");
                model.addColumn("Nombre Cliente");
                model.addColumn("Patente o Identificación");
                model.addColumn("Número Suite");
                model.addColumn("Hora Llegada");
                model.addColumn("Horas");
                model.addColumn("Consumo Extra");
                model.addColumn("Valor Consumo Extra");
                model.addColumn("Valor Total");
                model.addColumn("Desayuno Incluido");
                model.addColumn("Observación");
            } else {
                // Si se encuentra una estancia, mostrar los detalles en la tabla
                DefaultTableModel model = new DefaultTableModel();
                InterGestionarEstadia.jTable_estancia = new JTable(model);
                InterGestionarEstadia.jScrollPane1.setViewportView(InterGestionarEstadia.jTable_estancia);

                // Definir las columnas de la tabla
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Patente o Rut");
                model.addColumn("Número Suite");
                model.addColumn("Hora Llegada");
                model.addColumn("Horas");
                model.addColumn("Consumo Extra");
                model.addColumn("Valor Consumo Extra");
                model.addColumn("Valor Total");
                model.addColumn("Desayuno Incluido");
                model.addColumn("Observación");

                // Llenar las filas de la tabla con los resultados
                model.addRow(new Object[]{
                    estanciaEncontrada.getIdEstancia(),
                    estanciaEncontrada.getNombreCliente(),
                    estanciaEncontrada.getPatenteOIdentificacion(),
                    estanciaEncontrada.getNumeroSuite(),
                    estanciaEncontrada.getHoraLlegada(),
                    estanciaEncontrada.getHoras(),
                    estanciaEncontrada.getConsumoExtra(),
                    estanciaEncontrada.getValorConsumoExtra(),
                    estanciaEncontrada.getValorTotal(),
                    estanciaEncontrada.getDesayunoIncluido(),
                    estanciaEncontrada.getObservacion()
                });
            }

            // Limpiar el campo de búsqueda después de la búsqueda
            txt_busqueda_por_patente_o_rut.setText("");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private com.toedter.calendar.JDateChooser jDateChooser_hora_llegada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_estancia;
    private javax.swing.JTextField txt_busqueda_por_patente_o_rut;
    private javax.swing.JTextField txt_consumo_extra;
    private javax.swing.JTextField txt_desayuno_incluido;
    private javax.swing.JTextField txt_horas;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numero_suite;
    private javax.swing.JTextField txt_observacion;
    private javax.swing.JTextField txt_patente_o_rut;
    private javax.swing.JTextField txt_valor_consumo_extra;
    private javax.swing.JTextField txt_valor_total;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

    private void CargarTablaEstancia() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT id_estancia, nombre_cliente, patente_o_identificacion, numero_suite, hora_llegada, horas, "
                + "consumo_extra, valor_consumo_extra, valor_total, desayuno_incluido, observacion "
                + "FROM tb_estancias";
        Statement st = null;
        ResultSet rs = null;

        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);

            // Configurar la tabla y el modelo en InterGestionarEstadia
            InterGestionarEstadia.jTable_estancia = new JTable(model);
            InterGestionarEstadia.jScrollPane1.setViewportView(InterGestionarEstadia.jTable_estancia);

            // Agregar columnas al modelo de la tabla
            model.addColumn("ID");
            model.addColumn("Nombre Cliente");
            model.addColumn("Patente/RUT");
            model.addColumn("N° Suite");
            model.addColumn("Hora Llegada");
            model.addColumn("Horas");
            model.addColumn("Consumo Extra");
            model.addColumn("Valor Consumo Extra");
            model.addColumn("Valor Total");
            model.addColumn("Desayuno Incluido");
            model.addColumn("Observación");

            // Llenar filas
            while (rs.next()) {
                Object fila[] = new Object[11];

                fila[0] = rs.getInt("id_estancia");
                fila[1] = rs.getString("nombre_cliente");
                fila[2] = rs.getString("patente_o_identificacion");
                fila[3] = rs.getInt("numero_suite");
                fila[4] = rs.getString("hora_llegada");
                fila[5] = rs.getInt("horas");
                fila[6] = rs.getString("consumo_extra");
                fila[7] = rs.getDouble("valor_consumo_extra");
                fila[8] = rs.getDouble("valor_total");
                fila[9] = rs.getString("desayuno_incluido");
                fila[10] = rs.getString("observacion");

                model.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla estancias: " + e);
        } finally {
            // Cerrar los recursos para evitar fugas de memoria
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e);
            }
        }

        // Evento de clic en la tabla
        InterGestionarEstadia.jTable_estancia.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaPoint = InterGestionarEstadia.jTable_estancia.rowAtPoint(e.getPoint());
                int columnaPoint = 0;

                if (filaPoint > -1) {
                    idEstancia = (int) model.getValueAt(filaPoint, columnaPoint);
                    EnviarDatosEstanciaSeleccionado(idEstancia);
                }
            }
        });
    }

    private void EnviarDatosEstanciaSeleccionado(int idEstancia) {
        try {
            // Establecemos la conexión con la base de datos
            try (Connection con = Conexion.conectar()) {
                // Creamos la consulta SQL para obtener los datos de la estancia
                PreparedStatement pst = con.prepareStatement("SELECT * FROM tb_estancias WHERE id_estancia = ?");
                pst.setInt(1, idEstancia);
                ResultSet rs = pst.executeQuery();

                // Si la consulta devuelve resultados
                if (rs.next()) {
                    // Asignamos los valores obtenidos de la base de datos a los campos de la interfaz
                    txt_nombre.setText(rs.getString("nombre_cliente"));
                    txt_patente_o_rut.setText(rs.getString("patente_o_identificacion"));
                    txt_numero_suite.setText(String.valueOf(rs.getInt("numero_suite")));

                    // Declarar e inicializar la instancia de Estancia
                    Estancia estancia = new Estancia();

                    // Obtener la fecha de la base de datos como Timestamp
                    java.sql.Timestamp timestamp = rs.getTimestamp("hora_llegada");  

                    // Verificar si la fecha no es null
                    if (timestamp != null) {
                        // Convertir Timestamp a String usando el formato deseado
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String horaLlegadaStr = sdf.format(timestamp);

                        // Asignar el String al modelo
                        estancia.setHoraLlegada(horaLlegadaStr);

                        // Convertir el Timestamp a java.util.Date para el jDateChooser
                        jDateChooser_hora_llegada.setDate(new java.util.Date(timestamp.getTime()));
                    } else {
                        // Si la fecha es null, manejar el caso
                        estancia.setHoraLlegada(null);
                        jDateChooser_hora_llegada.setDate(null); // Vaciar el campo en el jDateChooser
                    }

                    // Asignar valores a los campos de texto
                    txt_horas.setText(String.valueOf(rs.getInt("horas"))); // Cambiar de double a int
                    txt_consumo_extra.setText(rs.getString("consumo_extra"));
                    txt_valor_consumo_extra.setText(String.valueOf(rs.getDouble("valor_consumo_extra")));
                    txt_valor_total.setText(String.valueOf(rs.getDouble("valor_total")));
                    txt_desayuno_incluido.setText(rs.getString("desayuno_incluido"));
                    txt_observacion.setText(rs.getString("observacion"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar estancia: " + e);
        }
    }

    //METODO PARA VALIDAR CAMPOS
    private boolean validarCampos() {
        if (txt_nombre.getText().isEmpty() || txt_patente_o_rut.getText().isEmpty()
                || txt_numero_suite.getText().isEmpty() || txt_horas.getText().isEmpty()
                || txt_consumo_extra.getText().isEmpty() || txt_valor_consumo_extra.getText().isEmpty()
                || txt_valor_total.getText().isEmpty() || txt_desayuno_incluido.getText().isEmpty()
                || txt_observacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos obligatorios.");
            return false;
        }
        return true;
    }

    //METODO PARA LIMPIAR
    private void limpiar() {
        txt_nombre.setText("");
        txt_patente_o_rut.setText("");
        txt_numero_suite.setText("");
        txt_horas.setText("");
        txt_consumo_extra.setText("");
        txt_valor_consumo_extra.setText("");
        txt_valor_total.setText("");
        txt_desayuno_incluido.setText("");
        txt_observacion.setText("");

    }

}
