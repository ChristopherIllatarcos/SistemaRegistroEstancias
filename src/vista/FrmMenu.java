package vista;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author caill
 */
public class FrmMenu extends javax.swing.JFrame {
    
    public static JDesktopPane jDesktoPane_menu;
    
    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(FrmMenu.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("MOTEL TANTRA");
        
        this.setLayout(null);
        jDesktoPane_menu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        // Crear JDesktopPane con imagen de fondo
        jDesktoPane_menu = new JDesktopPane() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Cargar imagen de fondo
                ImageIcon icon = new ImageIcon("src/img/wallpaper8.jpg"); // Ruta 
                Image img = icon.getImage(); // Convertir la imagen a un objeto Image
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this); // Dibujar la imagen redimensionada
            }
        };
        
        jDesktoPane_menu.setBounds(0, 0, ancho, alto - 110);
        this.add(jDesktoPane_menu);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu9 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenuItem_actualizar_stock = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_nueva_estadia = new javax.swing.JMenuItem();
        jMenuItem_gestionar_estadia = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categoria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_nuevo_turno = new javax.swing.JMenuItem();
        jMenuItem_gestionar_turno = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nuevo_retiro = new javax.swing.JMenuItem();
        jMenuItem_gestionar_retiro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_nuevo_cierre_caja = new javax.swing.JMenuItem();
        jMenuItem_gestionar_cierre_caja = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_reporte_producto = new javax.swing.JMenuItem();
        jMenuItem_reporte_estadia = new javax.swing.JMenuItem();
        jMenuItem_reporte_categoria = new javax.swing.JMenuItem();
        jMenuItem_reporte_turno = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem_reporte_cierre = new javax.swing.JMenuItem();
        jMenuItem_reporte_ventas = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem_ver_historial = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem_cerrar_sesion = new javax.swing.JMenuItem();

        jMenu9.setText("jMenu9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu1.setText("Productos");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu1.setMinimumSize(new java.awt.Dimension(135, 50));
        jMenu1.setPreferredSize(new java.awt.Dimension(138, 50));

        jMenuItem_nuevo_producto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem_nuevo_producto.setText("Nuevo Producto");
        jMenuItem_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_producto);

        jMenuItem_gestionar_producto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_gestionar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenuItem_gestionar_producto.setText("Gestionar Producto");
        jMenuItem_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_producto);

        jMenuItem_actualizar_stock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_actualizar_stock.setText("Actualizar Stock");
        jMenuItem_actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_actualizar_stockActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_actualizar_stock);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estancia.png"))); // NOI18N
        jMenu2.setText("Estadia");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(138, 50));

        jMenuItem_nueva_estadia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_nueva_estadia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_nueva_estadia.setText("Nuevo Estadia");
        jMenuItem_nueva_estadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_estadiaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_nueva_estadia);

        jMenuItem_gestionar_estadia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_gestionar_estadia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estancia.png"))); // NOI18N
        jMenuItem_gestionar_estadia.setText("Gestionar Estadia");
        jMenuItem_gestionar_estadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_estadiaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestionar_estadia);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu3.setText("Categoria");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(138, 50));

        jMenuItem_nueva_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_nueva_categoria.setText("Nueva Categoria");
        jMenuItem_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nueva_categoria);

        jMenuItem_gestionar_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_gestionar_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenuItem_gestionar_categoria.setText("Gestionar Categoria");
        jMenuItem_gestionar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_categoriaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_gestionar_categoria);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/turnos.png"))); // NOI18N
        jMenu4.setText("Turno");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(138, 50));

        jMenuItem_nuevo_turno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_nuevo_turno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_nuevo_turno.setText("Nuevo Turno");
        jMenuItem_nuevo_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_turnoActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_nuevo_turno);

        jMenuItem_gestionar_turno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_gestionar_turno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/turnos.png"))); // NOI18N
        jMenuItem_gestionar_turno.setText("Gestionar Turno");
        jMenuItem_gestionar_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_turnoActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_gestionar_turno);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dinero.png"))); // NOI18N
        jMenu5.setText("Retiro");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(138, 50));

        jMenuItem_nuevo_retiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_nuevo_retiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_nuevo_retiro.setText("Nuevo Retiro");
        jMenu5.add(jMenuItem_nuevo_retiro);

        jMenuItem_gestionar_retiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_gestionar_retiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dinero.png"))); // NOI18N
        jMenuItem_gestionar_retiro.setText("Gestionar Retiro");
        jMenu5.add(jMenuItem_gestionar_retiro);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cierre.png"))); // NOI18N
        jMenu6.setText("Cierre");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(138, 50));

        jMenuItem_nuevo_cierre_caja.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_nuevo_cierre_caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_nuevo_cierre_caja.setText("Nuevo Cierre Caja");
        jMenu6.add(jMenuItem_nuevo_cierre_caja);

        jMenuItem_gestionar_cierre_caja.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_gestionar_cierre_caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cierre.png"))); // NOI18N
        jMenuItem_gestionar_cierre_caja.setText("Gestionar Cierre Caja");
        jMenu6.add(jMenuItem_gestionar_cierre_caja);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/factura.png"))); // NOI18N
        jMenu7.setText("Facturar");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(138, 50));

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem14.setText("Nueva Venta");
        jMenu7.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem15.setText("Gestionar Venta");
        jMenu7.add(jMenuItem15);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu8.setText("Reportes");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(138, 50));

        jMenuItem_reporte_producto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_reporte_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reporte_producto.setText("Reporte Productos");
        jMenu8.add(jMenuItem_reporte_producto);

        jMenuItem_reporte_estadia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_reporte_estadia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reporte_estadia.setText("Reporte Estadia");
        jMenu8.add(jMenuItem_reporte_estadia);

        jMenuItem_reporte_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_reporte_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reporte_categoria.setText("Reporte Categoria");
        jMenu8.add(jMenuItem_reporte_categoria);

        jMenuItem_reporte_turno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_reporte_turno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reporte_turno.setText("Reporte Turno");
        jMenu8.add(jMenuItem_reporte_turno);

        jMenuItem20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem20.setText("Reporte Retiro");
        jMenu8.add(jMenuItem20);

        jMenuItem_reporte_cierre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_reporte_cierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reporte_cierre.setText("Reporte Cierre");
        jMenu8.add(jMenuItem_reporte_cierre);

        jMenuItem_reporte_ventas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_reporte_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reporte_ventas.setText("Reporte Ventas");
        jMenu8.add(jMenuItem_reporte_ventas);

        jMenuBar1.add(jMenu8);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu10.setText("Historial");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu10.setPreferredSize(new java.awt.Dimension(138, 50));

        jMenuItem_ver_historial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_ver_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem_ver_historial.setText("Ver Historial");
        jMenu10.add(jMenuItem_ver_historial);

        jMenuBar1.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu11.setText("Cerrar Sesión");
        jMenu11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu11.setMinimumSize(new java.awt.Dimension(140, 50));
        jMenu11.setPreferredSize(new java.awt.Dimension(155, 50));

        jMenuItem_cerrar_sesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem_cerrar_sesion.setText("Cerrar Sesión");
        jMenu11.add(jMenuItem_cerrar_sesion);

        jMenuBar1.add(jMenu11);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_categoriaActionPerformed
        InterCategoria interCategoria = new InterCategoria();
        jDesktoPane_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_categoriaActionPerformed

    private void jMenuItem_gestionar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_categoriaActionPerformed
        InterGestionarCategoria interGestionarCategoria = new InterGestionarCategoria();
        jDesktoPane_menu.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_categoriaActionPerformed

    private void jMenuItem_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_productoActionPerformed
        InterProducto interProducto = new InterProducto();
        jDesktoPane_menu.add(interProducto);
        interProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_productoActionPerformed

    private void jMenuItem_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_productoActionPerformed
        InterGestionarProducto intergestionarProducto = new InterGestionarProducto();
        jDesktoPane_menu.add(intergestionarProducto);
        intergestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_productoActionPerformed

    private void jMenuItem_nueva_estadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_estadiaActionPerformed
        InterEstadia interEstadia = new InterEstadia();
        jDesktoPane_menu.add(interEstadia);
        interEstadia.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_estadiaActionPerformed

    private void jMenuItem_gestionar_estadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_estadiaActionPerformed
        InterGestionarEstadia interGestionEstadia = new InterGestionarEstadia();
        jDesktoPane_menu.add(interGestionEstadia);
        interGestionEstadia.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_estadiaActionPerformed

    private void jMenuItem_actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_actualizar_stockActionPerformed
        InterActualizarStock interActualizarStock = new InterActualizarStock();
        jDesktoPane_menu.add(interActualizarStock);
        interActualizarStock.setVisible(true);
    }//GEN-LAST:event_jMenuItem_actualizar_stockActionPerformed

    private void jMenuItem_nuevo_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_turnoActionPerformed
        InterTurno interTurno = new InterTurno();
        jDesktoPane_menu.add(interTurno);
        interTurno.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_turnoActionPerformed

    private void jMenuItem_gestionar_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_turnoActionPerformed
        InterGestionarTurno interGestionarTurno = new InterGestionarTurno();
        jDesktoPane_menu.add(interGestionarTurno);
        interGestionarTurno.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_turnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem_actualizar_stock;
    private javax.swing.JMenuItem jMenuItem_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem_gestionar_categoria;
    private javax.swing.JMenuItem jMenuItem_gestionar_cierre_caja;
    private javax.swing.JMenuItem jMenuItem_gestionar_estadia;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_retiro;
    private javax.swing.JMenuItem jMenuItem_gestionar_turno;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nueva_estadia;
    private javax.swing.JMenuItem jMenuItem_nuevo_cierre_caja;
    private javax.swing.JMenuItem jMenuItem_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem_nuevo_retiro;
    private javax.swing.JMenuItem jMenuItem_nuevo_turno;
    private javax.swing.JMenuItem jMenuItem_reporte_categoria;
    private javax.swing.JMenuItem jMenuItem_reporte_cierre;
    private javax.swing.JMenuItem jMenuItem_reporte_estadia;
    private javax.swing.JMenuItem jMenuItem_reporte_producto;
    private javax.swing.JMenuItem jMenuItem_reporte_turno;
    private javax.swing.JMenuItem jMenuItem_reporte_ventas;
    private javax.swing.JMenuItem jMenuItem_ver_historial;
    // End of variables declaration//GEN-END:variables
}
