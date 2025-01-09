package vista;

import com.mysql.jdbc.Statement;
import conexion.Conexion;
import controlador.Ctrl_Turno;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Turno;

/**
 *
 * @author caill
 */
public class InterGestionarTurno extends javax.swing.JInternalFrame {

    private int idTurno;

    public InterGestionarTurno() {
        initComponents();
        this.setSize(new Dimension(904, 560));
        this.setTitle("Gestionar Turnos");

        this.CargarTablaTurno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_busqueda_por_nombre = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_turno = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_numero_ficha = new javax.swing.JTextField();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jComboBox_turno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, -1));

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

        txt_busqueda_por_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel4.add(txt_busqueda_por_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 11, 610, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 870, 50));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_turno.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_turno);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 730, 270));

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
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 130, 270));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Turno:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fecha:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 80, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nombre:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Monto:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 90, -1));

        txt_monto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 170, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Nro Ficha:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        txt_numero_ficha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_numero_ficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));
        jPanel3.add(jDateChooser_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 170, -1));

        jComboBox_turno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione turno:", "Dia", "Noche", "Intermedio" }));
        jPanel3.add(jComboBox_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 870, 110));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Turnos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper14.jpg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String criterioBusqueda = txt_busqueda_por_nombre.getText().trim();

        if (criterioBusqueda.isEmpty()) {
            // Si el campo está vacío, recargamos todos los productos
            CargarTablaTurno(); // Recargar todos los datos si no se ingresa un criterio
        } else {
            Ctrl_Turno turnoController = new Ctrl_Turno();

            // Realizar la búsqueda por nombre o descripción
            ArrayList<Turno> listaTurnos = turnoController.buscar(criterioBusqueda);

            if (listaTurnos.isEmpty()) {
                // Si no hay resultados, limpiar la tabla
                DefaultTableModel model = new DefaultTableModel();
                InterGestionarTurno.jTable_turno = new JTable(model);
                InterGestionarTurno.jScrollPane1.setViewportView(InterGestionarTurno.jTable_turno);

                // Definir las columnas de la tabla (vacía por ahora)
                model.addColumn("ID Turno");
                model.addColumn("Nro Ficha");
                model.addColumn("Nombre");
                model.addColumn("Turno");
                model.addColumn("Fecha");
                model.addColumn("Monto");

            } else {
                // Configurar la tabla con los resultados de búsqueda
                DefaultTableModel model = new DefaultTableModel();
                InterGestionarTurno.jTable_turno = new JTable(model);
                InterGestionarTurno.jScrollPane1.setViewportView(InterGestionarTurno.jTable_turno);

                // Definir las columnas de la tabla
                model.addColumn("ID Turno");
                model.addColumn("Nro Ficha");
                model.addColumn("Nombre");
                model.addColumn("Turno");
                model.addColumn("Fecha");
                model.addColumn("Monto");
                // Llenar las filas de la tabla con los resultados
                for (Turno turno : listaTurnos) {
                    model.addRow(new Object[]{
                        turno.getIdTurno(),
                        turno.getNumeroFicha(),
                        turno.getNombre(),
                        turno.getTurno(),
                        turno.getFecha(),
                        turno.getMontoCaja(),});
                }

                // Agregar evento de selección en la tabla
                InterGestionarTurno.jTable_turno.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int filaSeleccionada = InterGestionarTurno.jTable_turno.rowAtPoint(e.getPoint());

                        if (filaSeleccionada >= 0) {
                            int idTurnoSeleccionado = (int) model.getValueAt(filaSeleccionada, 0);
                            EnviarDatosTurnoSeleccionado(idTurnoSeleccionado); // Llamar al método para manejar el producto seleccionado
                        }
                    }
                });
            }

            // Limpiar campo de búsqueda después de la búsqueda
            txt_busqueda_por_nombre.setText("");
        }

        // Agregar el KeyListener para el campo de búsqueda
        txt_busqueda_por_nombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Verificar si la tecla presionada es Enter
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String criterioBusqueda = txt_busqueda_por_nombre.getText().trim();

                    if (criterioBusqueda.isEmpty()) {
                        // Si el campo está vacío, recargamos todos los productos
                        CargarTablaTurno(); // Recargar todos los datos si no se ingresa un criterio
                    } else {
                        Ctrl_Turno turnoController = new Ctrl_Turno();

                        // Realizar la búsqueda por nombre o descripción
                        ArrayList<Turno> listaTurnos = turnoController.buscar(criterioBusqueda);

                        if (listaTurnos.isEmpty()) {
                            // Si no hay resultados, limpiar la tabla
                            DefaultTableModel model = new DefaultTableModel();
                            InterGestionarTurno.jTable_turno = new JTable(model);
                            InterGestionarTurno.jScrollPane1.setViewportView(InterGestionarTurno.jTable_turno);

                            // Definir las columnas de la tabla (vacía por ahora)
                            model.addColumn("ID Turno");
                            model.addColumn("Nro Ficha");
                            model.addColumn("Nombre");
                            model.addColumn("Turno");
                            model.addColumn("Fecha");
                            model.addColumn("Monto");

                        } else {
                            // Configurar la tabla con los resultados de búsqueda
                            DefaultTableModel model = new DefaultTableModel();
                            InterGestionarTurno.jTable_turno = new JTable(model);
                            InterGestionarTurno.jScrollPane1.setViewportView(InterGestionarTurno.jTable_turno);

                            // Definir las columnas de la tabla
                            model.addColumn("ID Turno");
                            model.addColumn("Nro Ficha");
                            model.addColumn("Nombre");
                            model.addColumn("Turno");
                            model.addColumn("Fecha");
                            model.addColumn("Monto");

                            // Llenar las filas de la tabla con los resultados
                            for (Turno turno : listaTurnos) {
                                model.addRow(new Object[]{
                                    turno.getIdTurno(),
                                    turno.getNumeroFicha(),
                                    turno.getNombre(),
                                    turno.getTurno(),
                                    turno.getFecha(),
                                    turno.getMontoCaja(),});
                            }
                        }
                    }
                }
            }
        });
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        if (!validarCampos()) {
            return;
        }
        //instanciando clase Turno y el controlador
        Turno turno = new Turno(); 
        Ctrl_Turno controlTurno = new Ctrl_Turno(); 

        try {
            // Asignar valores al objeto Turno
            turno.setNumeroFicha(Integer.parseInt(txt_numero_ficha.getText().trim()));
            turno.setNombre(txt_nombre.getText().trim());
            turno.setTurno(jComboBox_turno.getSelectedItem().toString());

            java.util.Date date = jDateChooser_fecha.getDate();
            if (date != null) {
                // Asignar directamente la fecha al modelo
                turno.setFecha(date);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fecha.");
                return;
            }
            turno.setMontoCaja(Double.parseDouble(txt_monto.getText().trim()));

            // Log de valores antes de actualizar
            System.out.println("=== Valores del Turno antes de actualizar ===");
            System.out.println("Número de ficha: " + turno.getNumeroFicha());
            System.out.println("Nombre: " + turno.getNombre());
            System.out.println("Turno: " + turno.getTurno());
            System.out.println("Fecha: " + turno.getFecha());
            System.out.println("Monto en caja: " + turno.getMontoCaja());
            System.out.println("=============================================");
          
            // Intentar actualizar el turno
            if (controlTurno.actualizar(turno, idTurno)) {
                JOptionPane.showMessageDialog(null, "El turno fue actualizado correctamente.");
                limpiar(); // Método para limpiar los campos
                this.CargarTablaTurno(); // Método para recargar la tabla
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el turno.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos en los campos correspondientes.");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JComboBox<String> jComboBox_turno;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_turno;
    private javax.swing.JTextField txt_busqueda_por_nombre;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numero_ficha;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

    private void CargarTablaTurno() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT id_turno, numero_ficha, nombre, turno, fecha, monto_caja FROM tb_turnos";
        Statement st = null;
        ResultSet rs = null;

        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);

            // Configurar la tabla y el modelo en InterGestionarTurno
            InterGestionarTurno.jTable_turno = new JTable(model);
            InterGestionarTurno.jScrollPane1.setViewportView(InterGestionarTurno.jTable_turno);

            // Agregar las columnas al modelo
            model.addColumn("ID");
            model.addColumn("Nro Ficha");
            model.addColumn("Nombre");
            model.addColumn("Turno");
            model.addColumn("Fecha");
            model.addColumn("Monto");

            // Llenar la tabla con los datos obtenidos
            while (rs.next()) {
                Object[] fila = new Object[6]; // El número de columnas debe ser 6

                // Obtener los valores de cada columna del ResultSet
                fila[0] = rs.getInt("id_turno");
                fila[1] = rs.getObject("numero_ficha");
                fila[2] = rs.getObject("nombre");
                fila[3] = rs.getObject("turno");
                fila[4] = rs.getObject("fecha");
                fila[5] = rs.getObject("monto_caja");

                // Agregar la fila al modelo de la tabla
                model.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla Turno: " + e);
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
        InterGestionarTurno.jTable_turno.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaPoint = InterGestionarTurno.jTable_turno.rowAtPoint(e.getPoint());
                int columnaPoint = 0;

                if (filaPoint > -1) {
                    idTurno = (int) model.getValueAt(filaPoint, columnaPoint);
                    EnviarDatosTurnoSeleccionado(idTurno);
                }
            }
        });
    }

    private void EnviarDatosTurnoSeleccionado(int idTurno) {
        try {
            // Establecemos la conexión con la base de datos
            try (Connection con = Conexion.conectar()) {
                // Creamos la consulta SQL para obtener los datos de la estancia
                PreparedStatement pst = con.prepareStatement("SELECT * FROM tb_turnos WHERE id_turno = ?");
                pst.setInt(1, idTurno);
                ResultSet rs = pst.executeQuery();

                // Si la consulta devuelve resultados
                if (rs.next()) {
                    // Asignamos los valores obtenidos de la base de datos a los campos de la interfaz
                    // Asignar valores a los campos de texto
                    txt_numero_ficha.setText(String.valueOf(rs.getInt("numero_ficha")));
                    txt_nombre.setText(rs.getString("nombre"));
                    jComboBox_turno.setSelectedItem(rs.getString("turno"));

                    // Declarar e inicializar la instancia de Turno
                    Turno turno = new Turno();

                    // Obtener la fecha de la base de datos como Timestamp
                    java.sql.Timestamp timestamp = rs.getTimestamp("fecha");

                    // Verificar si la fecha no es null
                    if (timestamp != null) {
                        // Convertir Timestamp a java.util.Date directamente
                        java.util.Date fecha = new java.util.Date(timestamp.getTime());

                        // Asignar el Date al modelo
                        turno.setFecha(fecha);

                        // Asignar el Date al jDateChooser
                        jDateChooser_fecha.setDate(fecha);
                    } else {
                        // Si la fecha es null, manejar el caso
                        turno.setFecha(null);
                        jDateChooser_fecha.setDate(null); // Vaciar el campo en el jDateChooser
                    }

                    // Asignar valores a los campos de texto
                    txt_numero_ficha.setText(String.valueOf(rs.getInt("numero_ficha"))); 
                    txt_nombre.setText(rs.getString("nombre"));
                    jComboBox_turno.setSelectedItem("turno");
                    txt_monto.setText(String.valueOf(rs.getDouble("monto_caja")));

                }
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar tutno: " + e);
        }
    }

    //METODO PARA VALIDAR CAMPOS
    private boolean validarCampos() {
        if (txt_numero_ficha.getText().isEmpty() || txt_nombre.getText().isEmpty()
                || jDateChooser_fecha.getDate() == null || txt_monto.getText().isEmpty()
                || jComboBox_turno.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos obligatorios.");
            return false;
        }
        return true;
    }

    private void limpiar() {

        txt_numero_ficha.setText("");
        txt_nombre.setText("");
        jComboBox_turno.setSelectedItem("Seleccione turno:");
        jDateChooser_fecha.setDate(null);
        txt_monto.setText("");
    }

}
