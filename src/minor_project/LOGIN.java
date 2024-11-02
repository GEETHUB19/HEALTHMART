
package minor_project;

import javax.swing.JOptionPane;

public class LOGIN extends javax.swing.JFrame {

    public LOGIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        USERNAME = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        ClrBtn = new javax.swing.JButton();
        show = new javax.swing.JCheckBox();
        PASSWORD = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 91, 16));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Futura-Bold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 63, 112));
        jLabel4.setText("LOGIN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 63, 112));
        jLabel2.setText("USERNAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 63, 112));
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        USERNAME.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        USERNAME.setForeground(new java.awt.Color(4, 63, 112));
        jPanel1.add(USERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 220, 40));

        LoginBtn.setBackground(new java.awt.Color(248, 91, 16));
        LoginBtn.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("LOGIN");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });
        jPanel1.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 100, 40));

        ClrBtn.setBackground(new java.awt.Color(248, 91, 16));
        ClrBtn.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        ClrBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClrBtn.setText("CLEAR");
        ClrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClrBtnMouseClicked(evt);
            }
        });
        jPanel1.add(ClrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 100, 40));

        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 20, 20));
        jPanel1.add(PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 220, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/geet/Desktop/PHARMACY/LOGIN.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 58, 610, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
        String pass = new String(PASSWORD.getPassword());
        if(USERNAME.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please fill out Username!");
        }
        else if(pass.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please fill out Password!");
        }
        
        else if(USERNAME.getText().equals("PHARMING") && pass.equals("1119")){
                    JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFULL!!");
                      new MENU().setVisible(true);
                      this.dispose();
                }
        else
                {
                    JOptionPane.showMessageDialog(null,"Wrong Password or Username!!!","Message",JOptionPane.ERROR_MESSAGE);                                
                }                           
    }//GEN-LAST:event_LoginBtnMouseClicked

    
    private void ClrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClrBtnMouseClicked
        USERNAME.setText("");
        PASSWORD.setText("");
        
    }//GEN-LAST:event_ClrBtnMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        if(show.isSelected())
        {
            PASSWORD.setEchoChar((char)0);
        }
        else
        {
            PASSWORD.setEchoChar('*');
        }
                
    }//GEN-LAST:event_showMouseClicked

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClrBtn;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField PASSWORD;
    private javax.swing.JTextField USERNAME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox show;
    // End of variables declaration//GEN-END:variables
}
