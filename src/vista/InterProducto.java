package vista;

import com.mysql.jdbc.Statement;
import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Producto;

/**
 *
 * @author caill
 */
public class InterProducto extends javax.swing.JInternalFrame {

    int obtenerIdCategoriaCombo = 0;

    public InterProducto() {
        initComponents();
        this.setSize(new Dimension(400, 400));
        this.setTitle("Nuevo Producto");
        this.cargarComboCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_entrega = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_observacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_iva = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jButton_guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Pedido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, -1));

        txt_pedido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pedidoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, -1));

        txt_cantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Entrega:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, -1));

        txt_entrega.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Observación:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 90, -1));

        txt_observacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("IVA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 90, -1));

        jComboBox_iva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione IVA:", " 0 (Exento de IVA)", "19%" }));
        getContentPane().add(jComboBox_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Categorias:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 90, -1));

        jComboBox_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones categoria:", "Item 2", "Item 3", "Item 4" }));
        jComboBox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_categoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 170, -1));

        jButton_guardar.setBackground(new java.awt.Color(0, 153, 153));
        jButton_guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_guardar.setText("REGISTRAR");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 120, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Descripción:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, -1));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper11.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pedidoActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void jComboBox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_categoriaActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        Producto producto = new Producto();
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        String iva = "";
        String categoria = "";
        iva = jComboBox_iva.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        // Validar campos
        if (txt_nombre.getText().equals("") || txt_cantidad.getText().equals("")
                || txt_pedido.getText().equals("") || txt_entrega.getText().equals("")
                || txt_precio.getText().equals("") || txt_observacion.getText().equals("")
                || txt_descripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");

        } else {
            if (iva.equalsIgnoreCase("Seleccione IVA:")) {
                JOptionPane.showMessageDialog(null, "Seleccione IVA");
            } else if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                JOptionPane.showMessageDialog(null, "Seleccione categoría");
            } else {
                try {
                    producto.setNombreProducto(txt_nombre.getText().trim());
                    producto.setCantidad(Integer.parseInt(txt_cantidad.getText().trim()));
                    producto.setPedido(Integer.parseInt(txt_pedido.getText().trim()));
                    producto.setEntrega(Integer.parseInt(txt_entrega.getText().trim()));
                    String precioTXT = "";
                    double Precio = 0.0;
                    precioTXT = txt_precio.getText().trim();
                    boolean aux = false;

                    // Si el usuario ingresa una coma (,) como punto decimal, la transformamos a punto (.)
                    for (int i = 0; i < precioTXT.length(); i++) {
                        if (precioTXT.charAt(i) == ',') {
                            String precioNuevo = precioTXT.replace(",", ".");
                            Precio = Double.parseDouble(precioNuevo);
                            aux = true;
                        }
                    }

                    // Evaluar la condición
                    if (aux) {
                        producto.setPrecio(Precio);
                    } else {
                        Precio = Double.parseDouble(precioTXT);
                        producto.setPrecio(Precio);
                    }

                    producto.setDescripcion(txt_descripcion.getText().trim());
                    producto.setObservacion(txt_observacion.getText().trim());

                    // Porcentaje IVA
                    if (iva.equalsIgnoreCase("0(EXENTO DE IVA")) {
                        producto.setPorcentajeIva(0);
                    } else if (iva.equalsIgnoreCase("19%")) {
                        producto.setPorcentajeIva(19);
                    }

                    // Obtener el ID de la categoría
                    this.IdCategoria();
                    producto.setIdCategoria(obtenerIdCategoriaCombo);

                    // Guardar producto
                    if (controlProducto.guardar(producto)) {
                        JOptionPane.showMessageDialog(null, "Registro guardado");
                        this.cargarComboCategoria();
                        this.jComboBox_iva.setSelectedItem("Seleccione IVA:");
                        this.limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Guardar");
                    }

                } catch (HeadlessException | NumberFormatException e) {
                    System.out.println("Error en: " + e);
                }
            }
        }
    }//GEN-LAST:event_jButton_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wallpaper;
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
            jComboBox_categoria.addItem("Seleccione categoria:");

            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar categoria");
        }
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

    private void limpiar() {
        txt_nombre.setText("");
        txt_cantidad.setText("");
        txt_pedido.setText("");
        txt_entrega.setText("");
        txt_precio.setText("");
        txt_observacion.setText("");
        txt_descripcion.setText("");
    }

}
