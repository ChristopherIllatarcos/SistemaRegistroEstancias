package vista;

import com.mysql.jdbc.Statement;
import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Producto;

/**
 *
 * @author caill
 */
public class InterActualizarStock extends javax.swing.JInternalFrame {

    //VARIABLES
    int idProducto = 0;
    int cantidad = 0;

    public InterActualizarStock() {
        initComponents();
        initComponents();
        setTitle("Actualizar Stock");
        setSize(new Dimension(400, 300));
        
        this.cargarComboProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_producto = new javax.swing.JComboBox<>();
        txt_cantidad_actual = new javax.swing.JTextField();
        txt_cantidad_nueva = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Stock");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Stock Actual:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Stock Nuevo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, -1));

        jComboBox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto:", "Item 2", "Item 3", "Item 4" }));
        jComboBox_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_productoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 170, -1));

        txt_cantidad_actual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cantidad_actual.setEnabled(false);
        getContentPane().add(txt_cantidad_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 95, 170, -1));

        txt_cantidad_nueva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_cantidad_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 170, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 170, 35));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper14.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 390, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_productoActionPerformed
        this.MostrarStock();
    }//GEN-LAST:event_jComboBox_productoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //validamos selección de productos
        if (!jComboBox_producto.getSelectedItem().equals("Seleccione Producto:")) {
            //validamos campo vacios
            if (!txt_cantidad_nueva.getText().isEmpty()) {
                //validamos que el usario no ingrese otros caracteres
                boolean validacion = validar(txt_cantidad_nueva.getText().trim());
                if (validacion == true) {
                    //validamos la cantidad sea mayor a (0)
                    if (Integer.parseInt(txt_cantidad_nueva.getText()) > 0) {

                        Producto producto = new Producto();
                        Ctrl_Producto controlProducto = new Ctrl_Producto();
                        int stockActual = Integer.parseInt(txt_cantidad_actual.getText().trim());
                        int stockNuevo = Integer.parseInt(txt_cantidad_nueva.getText().trim());

                        stockNuevo = stockActual + stockNuevo;
                        producto.setCantidad(stockNuevo);

                        if (controlProducto.actualizarStock(producto, idProducto)) {
                            JOptionPane.showMessageDialog(null, "Stock Actualizado");
                            jComboBox_producto.setSelectedItem("Seleccione Producto:");
                            txt_cantidad_actual.setText("");
                            txt_cantidad_nueva.setText("");
                            this.cargarComboProducto();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al actualizar Stock");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero ni negativo");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se adminten carácteres no numéricos");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese cantidad    ");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_cantidad_actual;
    private javax.swing.JTextField txt_cantidad_nueva;
    // End of variables declaration//GEN-END:variables

    //METODO PARA CARGAR LOS PRODUCTOS
    private void cargarComboProducto() {

        Connection cn = Conexion.conectar();
        String sql = "select * from tb_productos";
        Statement st;
        try {

            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_producto.removeAllItems();
            jComboBox_producto.addItem("Seleccione Producto:");
            while (rs.next()) {
                jComboBox_producto.addItem(rs.getString("nombre_producto"));
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar los productos en:" + e);
        }
    }

    //METODO PARA MOSTRAR EL STOCK SELECCIONADO
    private void MostrarStock() {
        try {

            Connection cn = Conexion.conectar();
            String sql = "select * from tb_productos where nombre_producto = '" + this.jComboBox_producto.getSelectedItem() + "'";
            Statement st;
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idProducto = rs.getInt("id_producto");
                cantidad = rs.getInt("cantidad");
                txt_cantidad_actual.setText(String.valueOf(cantidad));
            } else {
                txt_cantidad_actual.setText("");

            }

        } catch (SQLException e) {
            System.out.println("Error al obtener stock en:" + e);
        }
    }

    //METODO DE VALIDACION DE CARACTERES NO NUMERICOS 
    private boolean validar(String valor) {
        int num;

        try {
            num = Integer.parseInt(valor);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }

    }

}
