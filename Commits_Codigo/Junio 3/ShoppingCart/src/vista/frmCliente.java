package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
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
        this.setLocationRelativeTo(null);
   
        lblBienvenida.setText("Bienvenido, " + modelo.Sesion.nombreUsuario + "!");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTop = new javax.swing.JPanel();
        panelWest = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        panelEast = new javax.swing.JPanel();
        btnCart6 = new javax.swing.JToggleButton();
        btnWishlist = new javax.swing.JToggleButton();
        btnLogout = new javax.swing.JToggleButton();
        lblBienvenida = new javax.swing.JLabel();
        panelContenedor = new javax.swing.JPanel();
        scrollCatalogo = new javax.swing.JScrollPane();
        panelCatalogo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelMonitor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregarCarrito = new javax.swing.JButton();
        btnCart1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelMousePad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarCarrito1 = new javax.swing.JButton();
        btnCart = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTeclado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAgregarCarrito5 = new javax.swing.JButton();
        btnCart2 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jLabelDiademas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregarCarrito2 = new javax.swing.JButton();
        btnCart3 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelMouse = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAgregarCarrito3 = new javax.swing.JButton();
        btnCart4 = new javax.swing.JToggleButton();
        jPanel6 = new javax.swing.JPanel();
        jLabelMando = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAgregarCarrito4 = new javax.swing.JButton();
        btnCart5 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 800));

        panelTop.setBackground(new java.awt.Color(255, 255, 255));
        panelTop.setLayout(new java.awt.BorderLayout());

        panelWest.setBackground(new java.awt.Color(255, 255, 255));
        panelWest.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Carrito_Frame_60x60.png"))); // NOI18N
        panelWest.add(jLabel13);

        panelTop.add(panelWest, java.awt.BorderLayout.LINE_START);

        panelEast.setBackground(new java.awt.Color(255, 255, 255));

        btnCart6.setBackground(new java.awt.Color(255, 255, 255));
        btnCart6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Wishlist_Clear.png"))); // NOI18N
        btnCart6.setPreferredSize(new java.awt.Dimension(38, 38));
        btnCart6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCart6ActionPerformed(evt);
            }
        });
        panelEast.add(btnCart6);

        btnWishlist.setBackground(new java.awt.Color(255, 255, 255));
        btnWishlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Carrito_Clear.png"))); // NOI18N
        btnWishlist.setToolTipText("");
        btnWishlist.setPreferredSize(new java.awt.Dimension(38, 38));
        panelEast.add(btnWishlist);

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Logout_Clear.png"))); // NOI18N
        btnLogout.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnLogout.setPreferredSize(new java.awt.Dimension(38, 38));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        panelEast.add(btnLogout);

        panelTop.add(panelEast, java.awt.BorderLayout.LINE_END);

        lblBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBienvenida.setText("Bienvenido XXXXX ! ");
        panelTop.add(lblBienvenida, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelTop, java.awt.BorderLayout.PAGE_START);

        panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
        panelContenedor.setLayout(new javax.swing.BoxLayout(panelContenedor, javax.swing.BoxLayout.Y_AXIS));

        scrollCatalogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrollCatalogo.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panelCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        panelCatalogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 40, 20, 40));
        panelCatalogo.setVerifyInputWhenFocusTarget(false);
        panelCatalogo.setLayout(new java.awt.GridLayout(0, 3));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 1, 1, 1));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 250));
        jPanel4.setVerifyInputWhenFocusTarget(false);
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));
        jPanel4.add(jLabelMonitor);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Monitor Gamer Curvado");
        jPanel4.add(jLabel4);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("750.000");
        jPanel4.add(jLabel7);

        btnAgregarCarrito.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCarrito.setText("Agregar al Carrito");
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregarCarrito);

        btnCart1.setBackground(new java.awt.Color(255, 255, 255));
        btnCart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Wishlist_Clear.png"))); // NOI18N
        btnCart1.setPreferredSize(new java.awt.Dimension(38, 38));
        jPanel4.add(btnCart1);

        panelCatalogo.add(jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 1, 1, 1));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 250));
        jPanel3.setVerifyInputWhenFocusTarget(false);
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));
        jPanel3.add(jLabelMousePad);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("MousePad Java Commands");
        jPanel3.add(jLabel3);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("80.000");
        jPanel3.add(jLabel8);

        btnAgregarCarrito1.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCarrito1.setText("Agregar al Carrito");
        btnAgregarCarrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarCarrito1);

        btnCart.setBackground(new java.awt.Color(255, 255, 255));
        btnCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Wishlist_Clear.png"))); // NOI18N
        btnCart.setPreferredSize(new java.awt.Dimension(38, 38));
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });
        jPanel3.add(btnCart);

        panelCatalogo.add(jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 1, 1, 1));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 250));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jPanel1.add(jLabelTeclado);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Teclado Mecanico 60%");
        jPanel1.add(jLabel1);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("150.000");
        jPanel1.add(jLabel12);

        btnAgregarCarrito5.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCarrito5.setText("Agregar al Carrito");
        btnAgregarCarrito5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCarrito5);

        btnCart2.setBackground(new java.awt.Color(255, 255, 255));
        btnCart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Wishlist_Clear.png"))); // NOI18N
        btnCart2.setPreferredSize(new java.awt.Dimension(38, 38));
        btnCart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCart2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCart2);

        panelCatalogo.add(jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 250));
        jPanel5.setVerifyInputWhenFocusTarget(false);
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));
        jPanel5.add(jLabelDiademas);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Diademas Gamer");
        jPanel5.add(jLabel5);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("80.000");
        jPanel5.add(jLabel9);

        btnAgregarCarrito2.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCarrito2.setText("Agregar al Carrito");
        btnAgregarCarrito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito2ActionPerformed(evt);
            }
        });
        jPanel5.add(btnAgregarCarrito2);

        btnCart3.setBackground(new java.awt.Color(255, 255, 255));
        btnCart3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Wishlist_Clear.png"))); // NOI18N
        btnCart3.setPreferredSize(new java.awt.Dimension(38, 38));
        btnCart3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCart3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnCart3);

        panelCatalogo.add(jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 250));
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));
        jPanel2.add(jLabelMouse);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mouse Gamer RGB");
        jPanel2.add(jLabel2);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("70.000");
        jPanel2.add(jLabel10);

        btnAgregarCarrito3.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCarrito3.setText("Agregar al Carrito");
        btnAgregarCarrito3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCarrito3);

        btnCart4.setBackground(new java.awt.Color(255, 255, 255));
        btnCart4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Wishlist_Clear.png"))); // NOI18N
        btnCart4.setPreferredSize(new java.awt.Dimension(38, 38));
        btnCart4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCart4ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCart4);

        panelCatalogo.add(jPanel2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 250));
        jPanel6.setVerifyInputWhenFocusTarget(false);
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));
        jPanel6.add(jLabelMando);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Mando Inalambrico RGB");
        jPanel6.add(jLabel6);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("80.000");
        jPanel6.add(jLabel11);

        btnAgregarCarrito4.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCarrito4.setText("Agregar al Carrito");
        btnAgregarCarrito4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarrito4ActionPerformed(evt);
            }
        });
        jPanel6.add(btnAgregarCarrito4);

        btnCart5.setBackground(new java.awt.Color(255, 255, 255));
        btnCart5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Wishlist_Clear.png"))); // NOI18N
        btnCart5.setPreferredSize(new java.awt.Dimension(38, 38));
        btnCart5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCart5ActionPerformed(evt);
            }
        });
        jPanel6.add(btnCart5);

        panelCatalogo.add(jPanel6);

        scrollCatalogo.setViewportView(panelCatalogo);

        panelContenedor.add(scrollCatalogo);

        getContentPane().add(panelContenedor, java.awt.BorderLayout.CENTER);

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

    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCartActionPerformed

    private void btnCart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCart2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCart2ActionPerformed

    private void btnCart3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCart3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCart3ActionPerformed

    private void btnCart4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCart4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCart4ActionPerformed

    private void btnCart5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCart5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCart5ActionPerformed

    private void btnCart6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCart6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCart6ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        frmLogin login = new frmLogin(); // crea la ventana de login
        login.setVisible(true);          // la muestra
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(frmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JToggleButton btnCart;
    private javax.swing.JToggleButton btnCart1;
    private javax.swing.JToggleButton btnCart2;
    private javax.swing.JToggleButton btnCart3;
    private javax.swing.JToggleButton btnCart4;
    private javax.swing.JToggleButton btnCart5;
    private javax.swing.JToggleButton btnCart6;
    private javax.swing.JToggleButton btnLogout;
    private javax.swing.JToggleButton btnWishlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JPanel panelCatalogo;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelEast;
    private javax.swing.JPanel panelTop;
    private javax.swing.JPanel panelWest;
    private javax.swing.JScrollPane scrollCatalogo;
    // End of variables declaration//GEN-END:variables
}
