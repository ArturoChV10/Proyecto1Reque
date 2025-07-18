
package com.mycompany.proyectoreque;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Julio David
 */
public class Password extends javax.swing.JPanel {

    /**
     * Creates new form password
     */
    public Password(String email) {
        initComponents();
        lblEmail.setText(email);
    }
    
     public boolean validarContraseña(String password) {
      
        String userPassword = "1234";
        CheckUsers validacion = new CheckUsers();
        
        // Si está vacío
        if (password.isEmpty()) {
            lblForgot.setText("Enter your password");
            lblForgot.setForeground(Color.RED);
            return false;
        }

        /*
        if (!password.equals(userPassword)) {
            lblForgot.setText("Invalid password");
            lblForgot.setForeground(Color.RED);
            return false;
        }
        */
        
        if(!validacion.validateUser(lblEmail.getText(), password)) {
            System.out.println("CONTRASEÑA INVALIDA");
            lblForgot.setText("Invalid password");
            lblForgot.setForeground(Color.RED);
            return false;
        }
        
        // Si es válido, limpiar el mensaje de error
        lblForgot.setText("I forgot my password");
        lblForgot.setForeground(Color.BLACK);
        return true;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNext = new javax.swing.JButton();
        lblForgot = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEnterPassword = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNext.setBackground(new java.awt.Color(0, 51, 255));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 213, 117, -1));

        lblForgot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblForgot.setText("I forgot my password");
        lblForgot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblForgotFocusGained(evt);
            }
        });
        add(lblForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 175, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("email");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 76, 330, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 139, 282, 30));

        lblEnterPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEnterPassword.setText("Enter password");
        add(lblEnterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 102, -1, -1));

        lblLogo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(30, 140, 200));
        lblLogo.setIcon(new javax.swing.ImageIcon("D:\\chava\\Documents\\NetBeansProjects\\proyectoReque\\images\\logotipo.png")); // NOI18N
        lblLogo.setText("Medict");
        add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 26, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String password = txtPassword.getText().trim();
        boolean valido = validarContraseña(password);
        if (valido == true){
            ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        String[] args = null;
        homeMenu.main(args);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void lblForgotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblForgotFocusGained
        lblForgot.setText("I forgot my password");
        lblForgot.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblForgotFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnterPassword;
    private javax.swing.JLabel lblForgot;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
