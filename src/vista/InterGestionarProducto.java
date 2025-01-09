package vista;

import com.mysql.jdbc.Statement;
import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author caill
 */
public class InterGestionarProducto extends javax.swing.JInternalFrame {

    private int idProducto;
    int obtenerIdCategoriaCombo = 0;

    public InterGestionarProducto() {
        initComponents();
        this.setSize(new Dimension(904, 560));
        this.setTitle("Gestionar Productos");

        this.CargarTablaProductos();
        this.cargarComboCategoria();
        //insertar imagen en el label
        ImageIcon wallpaper = new ImageIcon("src/img/wallpaper12.jpg ");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(904, 560, WIDTH));
        jLabel_wallpaper.setIcon(icono);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt_pedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_observacion = new javax.swing.JTextField();
        jComboBox_iva = new javax.swing.JComboBox<>();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_entrega = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_busqueda_por_nombre = new javax.swing.JTextField();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_productos);

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

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pedido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Pedido:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Observación:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("IVA:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Categoria:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 90, -1));

        txt_cantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, -1));

        txt_observacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 170, -1));

        jComboBox_iva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione IVA:", " 0 (Exento de IVA)", "19%" }));
        jPanel3.add(jComboBox_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 170, -1));

        jComboBox_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones categoria:", "Item 2", "Item 3", "Item 4" }));
        jComboBox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_categoriaActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 170, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Cantidad:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Descripción:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 90, -1));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Entrega:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 90, -1));

        txt_entrega.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 170, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Nombre:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 870, 110));

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

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper12.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

        Producto producto = new Producto(); // modelo producto
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        String iva = "";
        String categoria = "";
        iva = jComboBox_iva.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        // Validar campos
        if (txt_nombre.getText().isEmpty() || txt_cantidad.getText().isEmpty() || txt_pedido.getText().isEmpty()
                || txt_entrega.getText().isEmpty() || txt_precio.getText().isEmpty()
                || txt_descripcion.getText().isEmpty() || txt_observacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            if (iva.equalsIgnoreCase("Seleccione IVA:")) {
                JOptionPane.showMessageDialog(null, "Seleccione IVA");
            } else {
                if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione categoría");
                } else {
                    try {
                        producto.setNombreProducto(txt_nombre.getText().trim());
                        producto.setCantidad(Integer.parseInt(txt_cantidad.getText().trim()));
                        producto.setPedido(Integer.parseInt(txt_pedido.getText().trim()));
                        producto.setEntrega(Integer.parseInt(txt_entrega.getText().trim()));

                        // Manejo del precio
                        String precioTXT = txt_precio.getText().trim();
                        double Precio = 0.0;
                        if (precioTXT.contains(",")) {
                            precioTXT = precioTXT.replace(",", ".");
                        }
                        Precio = Double.parseDouble(precioTXT);
                        producto.setPrecio(Precio);

                        producto.setDescripcion(txt_descripcion.getText().trim());
                        producto.setObservacion(txt_observacion.getText().trim());

                        // Manejo del porcentaje IVA
                        if (iva.equalsIgnoreCase("0(EXENTO DE IVA)")) {
                            producto.setPorcentajeIva(0);
                        } else if (iva.equalsIgnoreCase("19%")) {
                            producto.setPorcentajeIva(19);
                        }

                        // Método que obtiene el ID de la categoría seleccionada
                        this.IdCategoria();
                        producto.setIdCategoria(obtenerIdCategoriaCombo);

                        if (controlProducto.actualizar(producto, idProducto)) {
                            JOptionPane.showMessageDialog(null, "Registro actualizado");
                            this.cargarComboCategoria();
                            this.CargarTablaProductos();
                            this.jComboBox_iva.setSelectedItem("Seleccione IVA:");
                            this.limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                        }
                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Error en: " + e);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        if (idProducto == 0) {
            JOptionPane.showMessageDialog(null, "¡Seleccione un Producto!");
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
                if (controlProducto.eliminar(idProducto)) { // Si la eliminación es exitosa
                    JOptionPane.showMessageDialog(null, "¡Producto Eliminado!");
                    this.CargarTablaProductos();
                    this.cargarComboCategoria();
                    this.limpiar();
                } else { // Si la eliminación falla
                    JOptionPane.showMessageDialog(null, "¡Error al Eliminar Producto!");
                }
            }
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jComboBox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_categoriaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String criterioBusqueda = txt_busqueda_por_nombre.getText().trim();

        if (criterioBusqueda.isEmpty()) {
            // Si el campo está vacío, recargamos todos los productos
            CargarTablaProductos(); // Recargar todos los datos si no se ingresa un criterio
        } else {
            Ctrl_Producto productoController = new Ctrl_Producto();

            // Realizar la búsqueda por nombre o descripción
            ArrayList<Producto> listaProductos = productoController.buscar(criterioBusqueda);

            if (listaProductos.isEmpty()) {
                // Si no hay resultados, limpiar la tabla
                DefaultTableModel model = new DefaultTableModel();
                InterGestionarProducto.jTable_productos = new JTable(model);
                InterGestionarProducto.jScrollPane1.setViewportView(InterGestionarProducto.jTable_productos);

                // Definir las columnas de la tabla (vacía por ahora)
                model.addColumn("ID Producto");
                model.addColumn("Nombre");
                model.addColumn("Cantidad");
                model.addColumn("pedido");
                model.addColumn("entrega");
                model.addColumn("Precio");
                model.addColumn("Descripción");
                model.addColumn("Categoría");
                model.addColumn("IVA (%)");
                model.addColumn("observacion");
            } else {
                // Configurar la tabla con los resultados de búsqueda
                DefaultTableModel model = new DefaultTableModel();
                InterGestionarProducto.jTable_productos = new JTable(model);
                InterGestionarProducto.jScrollPane1.setViewportView(InterGestionarProducto.jTable_productos);

                // Definir las columnas de la tabla
                model.addColumn("ID Producto");
                model.addColumn("Nombre");
                model.addColumn("Cantidad");
                model.addColumn("Pedido");
                model.addColumn("Entrega");
                model.addColumn("Precio");
                model.addColumn("Descripción");
                model.addColumn("Categoría");
                model.addColumn("IVA (%)");
                model.addColumn("observacion");
                // Llenar las filas de la tabla con los resultados
                for (Producto producto : listaProductos) {
                    model.addRow(new Object[]{
                        producto.getIdProducto(),
                        producto.getNombreProducto(),
                        producto.getCantidad(),
                        producto.getPedido(),
                        producto.getEntrega(),
                        producto.getPrecio(),
                        producto.getDescripcion(),
                        producto.getIdCategoria(),
                        producto.getPorcentajeIva(),
                        producto.getObservacion()
                    });
                }

                // Agregar evento de selección en la tabla
                InterGestionarProducto.jTable_productos.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int filaSeleccionada = InterGestionarProducto.jTable_productos.rowAtPoint(e.getPoint());

                        if (filaSeleccionada >= 0) {
                            int idProductoSeleccionado = (int) model.getValueAt(filaSeleccionada, 0);
                            EnviarDatosProductoSeleccionado(idProductoSeleccionado); // Llamar al método para manejar el producto seleccionado
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
                        CargarTablaProductos(); // Recargar todos los datos si no se ingresa un criterio
                    } else {
                        Ctrl_Producto productoController = new Ctrl_Producto();

                        // Realizar la búsqueda por nombre o descripción
                        ArrayList<Producto> listaProductos = productoController.buscar(criterioBusqueda);

                        if (listaProductos.isEmpty()) {
                            // Si no hay resultados, limpiar la tabla
                            DefaultTableModel model = new DefaultTableModel();
                            InterGestionarProducto.jTable_productos = new JTable(model);
                            InterGestionarProducto.jScrollPane1.setViewportView(InterGestionarProducto.jTable_productos);

                            // Definir las columnas de la tabla (vacía por ahora)
                            model.addColumn("ID Producto");
                            model.addColumn("Nombre");
                            model.addColumn("Cantidad");
                            model.addColumn("Pedido");
                            model.addColumn("Entrega");
                            model.addColumn("Precio");
                            model.addColumn("Descripción");
                            model.addColumn("Categoría");
                            model.addColumn("IVA (%)");
                            model.addColumn("observacion");
                        } else {
                            // Configurar la tabla con los resultados de búsqueda
                            DefaultTableModel model = new DefaultTableModel();
                            InterGestionarProducto.jTable_productos = new JTable(model);
                            InterGestionarProducto.jScrollPane1.setViewportView(InterGestionarProducto.jTable_productos);

                            // Definir las columnas de la tabla
                            model.addColumn("ID Producto");
                            model.addColumn("Nombre");
                            model.addColumn("Cantidad");
                            model.addColumn("Pedido");
                            model.addColumn("Entrega");
                            model.addColumn("Precio");
                            model.addColumn("Descripción");
                            model.addColumn("Categoría");
                            model.addColumn("IVA (%)");
                            model.addColumn("observacion");

                            // Llenar las filas de la tabla con los resultados
                            for (Producto producto : listaProductos) {
                                model.addRow(new Object[]{
                                    producto.getIdProducto(),
                                    producto.getNombreProducto(),
                                    producto.getCantidad(),
                                    producto.getPedido(),
                                    producto.getEntrega(),
                                    producto.getPrecio(),
                                    producto.getDescripcion(),
                                    producto.getIdProducto(),
                                    producto.getPorcentajeIva(),
                                    producto.getObservacion()
                                });
                            }
                        }
                    }
                }
            }
        });
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_iva;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField txt_busqueda_por_nombre;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_entrega;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_observacion;
    private javax.swing.JTextField txt_pedido;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables

    private void cargarComboCategoria() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_categorias";
        Statement st;

        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Seleccione categoria: ");

            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar Categoria");
        }
    }

    private double calcularIva(double precio, int iva) {
        int p_iva = iva;
        switch (p_iva) {
            case 0 ->
                IVA = 0.0;
            case 19 ->
                IVA = precio * 0.19;
            default -> {
            }
        }
        IVA = (double) Math.round(IVA * 100) / 100;
        return IVA;
    }

    String descripcionCategoria = "";
    double precio = 0.0;
    int porcentajeIva = 0;
    double IVA = 0;

    private void CargarTablaProductos() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT p.id_producto, p.nombre_producto, p.cantidad, p.pedido, p.entrega, p.precio, p.descripcion, "
                + "p.porcentaje_iva, c.descripcion AS categoria, p.observacion "
                + "FROM tb_productos AS p "
                + "INNER JOIN tb_categorias AS c ON p.id_categoria = c.id_categoria";
        Statement st;

        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarProducto.jTable_productos = new JTable(model);
            InterGestionarProducto.jScrollPane1.setViewportView(InterGestionarProducto.jTable_productos);

            model.addColumn("N°"); // ID
            model.addColumn("Nombre");
            model.addColumn("Cantidad");
            model.addColumn("Pedido");
            model.addColumn("Entrega");
            model.addColumn("Precio");
            model.addColumn("Descripción");
            model.addColumn("IVA");
            model.addColumn("Categoría");
            model.addColumn("Observación");

            while (rs.next()) {
                double precio = rs.getDouble("precio");
                int porcentajeIva = rs.getInt("porcentaje_iva");

                Object fila[] = new Object[10]; // Ajustado para incluir todas las columnas

                fila[0] = rs.getInt("id_producto");
                fila[1] = rs.getString("nombre_producto");
                fila[2] = rs.getInt("cantidad");
                fila[3] = rs.getInt("pedido");
                fila[4] = rs.getInt("entrega");
                fila[5] = precio;
                fila[6] = rs.getString("descripcion");
                fila[7] = calcularIva(precio, porcentajeIva); // Método para calcular el IVA
                fila[8] = rs.getString("categoria");
                fila[9] = rs.getString("observacion");

                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla productos: " + e);
        }

        InterGestionarProducto.jTable_productos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaPoint = InterGestionarProducto.jTable_productos.rowAtPoint(e.getPoint());
                int columnaPoint = 0;

                if (filaPoint > -1) {
                    idProducto = (int) model.getValueAt(filaPoint, columnaPoint);
                    EnviarDatosProductoSeleccionado(idProducto); // Método para enviar datos
                }
            }
        });
    }

    private void EnviarDatosProductoSeleccionado(int idProducto) {

        try {
            try (Connection con = Conexion.conectar()) {
                PreparedStatement pst = con.prepareStatement(
                        "SELECT * FROM tb_productos WHERE id_producto = ?");
                pst.setInt(1, idProducto);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txt_nombre.setText(rs.getString("nombre_producto"));
                    txt_cantidad.setText(String.valueOf(rs.getInt("cantidad")));
                    txt_pedido.setText(String.valueOf(rs.getInt("pedido")));
                    txt_entrega.setText(String.valueOf(rs.getInt("entrega")));
                    txt_precio.setText(String.valueOf(rs.getDouble("precio")));
                    txt_descripcion.setText(rs.getString("descripcion"));
                    txt_observacion.setText(rs.getString("observacion"));

                    int iva = rs.getInt("porcentaje_iva");
                    switch (iva) {
                        case 0 ->
                            jComboBox_iva.setSelectedItem("0(EXENTO DE IVA)");
                        case 19 ->
                            jComboBox_iva.setSelectedItem("19%");
                        default ->
                            jComboBox_iva.setSelectedItem("Seleccione IVA:");
                    }

                    int idCategoria = rs.getInt("id_categoria");
                    jComboBox_categoria.setSelectedItem(relacionarCategoria(idCategoria)); // Método para obtener el nombre de la categoría
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al seleccionar producto: " + e);
        }
    }

    private String relacionarCategoria(int idCategoria) {

        String sql = "select descripcion from tb_categorias where id_categoria = '" + idCategoria + "'";
        Statement st;

        try {
            try (Connection cn = Conexion.conectar()) {
                st = (Statement) cn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    descripcionCategoria = rs.getString("descripcion");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el id de la Categoria!");
        }
        return descripcionCategoria;
    }

    private int IdCategoria() {
        String sql = "select * from tb_categorias where descripcion = '" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("id_categoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener id categoria");
        }
        return obtenerIdCategoriaCombo;
    }

//METODO PARA LIMPIAR
    private void limpiar() {
        txt_nombre.setText("");
        txt_cantidad.setText("");
        txt_pedido.setText("");
        txt_entrega.setText("");
        txt_precio.setText("");
        txt_descripcion.setText("");
        txt_observacion.setText("");
        jComboBox_iva.setSelectedItem("Seleccione IVA:");
        jComboBox_categoria.setSelectedItem("Seleccione categoria:");
    }

}
