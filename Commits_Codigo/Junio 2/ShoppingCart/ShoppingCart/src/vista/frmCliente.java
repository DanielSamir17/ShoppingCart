package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class frmCliente extends javax.swing.JFrame {

    private void cargarImagenesCatalogo() {
        setLayout(null);

// Teclado
        ImageIcon iconoTeclado = new ImageIcon(getClass().getResource("/Resources/Icons/teclado.png"));
        Image imgTeclado = iconoTeclado.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        jLabelTeclado.setIcon(new ImageIcon(imgTeclado));
        jLabelTeclado.setBounds(50, 50, 150, 150);

// Mouse
        ImageIcon iconoMouse = new ImageIcon(getClass().getResource("/Resources/Icons/Mouse.png"));
        Image imgMouse = iconoMouse.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        jLabelMouse.setIcon(new ImageIcon(imgMouse));
        jLabelMouse.setBounds(300, 50, 150, 150);

// Monitor
        ImageIcon iconoMonitor = new ImageIcon(getClass().getResource("/Resources/Icons/Monitor_Gamer.png"));
        Image imgMonitor = iconoMonitor.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        jLabelMonitor.setIcon(new ImageIcon(imgMonitor));
        jLabelMonitor.setBounds(50, 250, 150, 150);

// Mando
        ImageIcon iconoMando = new ImageIcon(getClass().getResource("/Resources/Icons/Mando_Inalambrico.png"));
        Image imgMando = iconoMando.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        jLabelMando.setIcon(new ImageIcon(imgMando));
        jLabelMando.setBounds(300, 250, 150, 150);

// Diademas
        ImageIcon iconoDiademas = new ImageIcon(getClass().getResource("/Resources/Icons/Diademas_Gamer.png"));
        Image imgDiademas = iconoDiademas.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        jLabelDiademas.setIcon(new ImageIcon(imgDiademas));
        jLabelDiademas.setBounds(50, 450, 150, 150);

// MousePad
        ImageIcon iconoMousePad = new ImageIcon(getClass().getResource("/Resources/Icons/Mouse_Pad_Java_Commands.png"));
        Image imgMousePad = iconoMousePad.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        jLabelMousePad.setIcon(new ImageIcon(imgMousePad));
        jLabelMousePad.setBounds(300, 450, 150, 150);

    }

    public frmCliente() {
        initComponents();
        cargarImagenesCatalogo(); // ← Esto prepara el panel con los productos

        panelCatalogo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelCatalogo.setLayout(new GridLayout(3, 2, 20, 30));

        this.setSize(800, 600);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        panelCatalogo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelMonitor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregarCarrito = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelMousePad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarCarrito1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTeclado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAgregarCarrito5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabelDiademas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregarCarrito2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelMouse = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAgregarCarrito3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabelMando = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAgregarCarrito4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 1000));

        panelCatalogo.setLayout(new java.awt.GridLayout(3, 2, 20, 20));

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jLabelMonitor.setText("Monitor");
        jPanel4.add(jLabelMonitor);

        jLabel4.setText("Monitor Gamer Curvado");
        jPanel4.add(jLabel4);

        jLabel7.setText("750.000");
        jPanel4.add(jLabel7);

        btnAgregarCarrito.setText("Agregar al Carrito");
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregarCarrito);

        panelCatalogo.add(jPanel4);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        jLabelMousePad.setText("MousePad");
        jPanel3.add(jLabelMousePad);

        jLabel3.setText("MousePad Java Commands");
        jPanel3.add(jLabel3);

        jLabel8.setText("80.000");
        jPanel3.add(jLabel8);

        btnAgregarCarrito1.setText("Agregar al Carrito");
        btnAgregarCarrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarCarrito1);

        panelCatalogo.add(jPanel3);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jLabelTeclado.setText("Teclado");
        jPanel1.add(jLabelTeclado);

        jLabel1.setText("Teclado Mecanico 60%");
        jPanel1.add(jLabel1);

        jLabel12.setText("150.000");
        jPanel1.add(jLabel12);

        btnAgregarCarrito5.setText("Agregar al Carrito");
        btnAgregarCarrito5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCarrito5);

        panelCatalogo.add(jPanel1);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jLabelDiademas.setText("Diademas");
        jPanel5.add(jLabelDiademas);

        jLabel5.setText("Diademas Gamer");
        jPanel5.add(jLabel5);

        jLabel9.setText("80.000");
        jPanel5.add(jLabel9);

        btnAgregarCarrito2.setText("Agregar al Carrito");
        btnAgregarCarrito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito2ActionPerformed(evt);
            }
        });
        jPanel5.add(btnAgregarCarrito2);

        panelCatalogo.add(jPanel5);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabelMouse.setText("Mouse");
        jPanel2.add(jLabelMouse);

        jLabel2.setText("Mouse Gamer RGB");
        jPanel2.add(jLabel2);

        jLabel10.setText("70.000");
        jPanel2.add(jLabel10);

        btnAgregarCarrito3.setText("Agregar al Carrito");
        btnAgregarCarrito3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCarrito3);

        panelCatalogo.add(jPanel2);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jLabelMando.setText("Mando");
        jPanel6.add(jLabelMando);

        jLabel6.setText("Mando Inalambrico RGB");
        jPanel6.add(jLabel6);

        jLabel11.setText("80.000");
        jPanel6.add(jLabel11);

        btnAgregarCarrito4.setText("Agregar al Carrito");
        btnAgregarCarrito4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito4ActionPerformed(evt);
            }
        });
        jPanel6.add(btnAgregarCarrito4);

        panelCatalogo.add(jPanel6);

        panelContenedor.add(panelCatalogo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCarritoActionPerformed

    private void btnAgregarCarrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarrito1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCarrito1ActionPerformed

    private void btnAgregarCarrito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarrito2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCarrito2ActionPerformed

    private void btnAgregarCarrito3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarrito3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCarrito3ActionPerformed

    private void btnAgregarCarrito4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarrito4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCarrito4ActionPerformed

    private void btnAgregarCarrito5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarrito5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCarrito5ActionPerformed

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton btnAgregarCarrito1;
    private javax.swing.JButton btnAgregarCarrito2;
    private javax.swing.JButton btnAgregarCarrito3;
    private javax.swing.JButton btnAgregarCarrito4;
    private javax.swing.JButton btnAgregarCarrito5;
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
    private javax.swing.JLabel jLabelDiademas;
    private javax.swing.JLabel jLabelMando;
    private javax.swing.JLabel jLabelMonitor;
    private javax.swing.JLabel jLabelMouse;
    private javax.swing.JLabel jLabelMousePad;
    private javax.swing.JLabel jLabelTeclado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel panelCatalogo;
    private javax.swing.JPanel panelContenedor;
    // End of variables declaration//GEN-END:variables
}
