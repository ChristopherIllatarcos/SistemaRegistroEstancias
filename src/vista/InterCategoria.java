package vista;

import controlador.Ctrl_Categoria;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Categoria;

/**
 *
 * @author caill
 */
public class InterCategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterCategoria
     */
    public InterCategoria() {
        initComponents();
        this.setSize(new Dimension(400, 200));
        this.setTitle("Nueva Categoria");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_descricpcion = new javax.swing.JTextField();
        jButton_guardar = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripción Categoria:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txt_descricpcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_descricpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descricpcionActionPerformed(evt);
            }
        });
        txt_descricpcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_descricpcionKeyPressed(evt);
            }
        });
        getContentPane().add(txt_descricpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 170, -1));

        jButton_guardar.setBackground(new java.awt.Color(0, 153, 153));
        jButton_guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 100, 30));

        jLabel_wallpaper.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper9.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 390, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_descricpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descricpcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descricpcionActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        Categoria categoria = new Categoria();
        Ctrl_Categoria controlCategoria = new Ctrl_Categoria();
        categoria.setDescripcion(txt_descricpcion.getText().trim());

        if (txt_descricpcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todo los campos");
        } else {
            if (!controlCategoria.existeCategoria(txt_descricpcion.getText().trim())) {
                categoria.setDescripcion(txt_descricpcion.getText().trim());

                if (controlCategoria.guardar(categoria)) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "La Categoria ya existe  ");
            }

        }
        //LIMPIAR CAMPOS
        txt_descricpcion.setText("");
    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void txt_descricpcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descricpcionKeyPressed
        // Verificar si se presionó la tecla Enter
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            // Simular el clic del botón Guardar
            guardarCategoria();
        }
    }

// Método para guardar la categoría
    private void guardarCategoria() {
        Categoria categoria = new Categoria();
        Ctrl_Categoria controlCategoria = new Ctrl_Categoria();
        categoria.setDescripcion(txt_descricpcion.getText().trim());

        if (txt_descricpcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todo los campos");
        } else {
            if (!controlCategoria.existeCategoria(txt_descricpcion.getText().trim())) {
                categoria.setDescripcion(txt_descricpcion.getText().trim());

                if (controlCategoria.guardar(categoria)) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "La Categoria ya existe");
            }
        }

        // LIMPIAR CAMPOS
        txt_descricpcion.setText("");
    }//GEN-LAST:event_txt_descricpcionKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_descricpcion;
    // End of variables declaration//GEN-END:variables

    private void jButton_guardarActionPerformed(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
