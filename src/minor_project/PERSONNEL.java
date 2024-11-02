
package minor_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class PERSONNEL extends javax.swing.JFrame {

    public PERSONNEL() {
        initComponents();
        SelectMed();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Aname = new javax.swing.JTextField();
        Aage = new javax.swing.JTextField();
        Agender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Aid = new javax.swing.JTextField();
        Aphone = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        ClrBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        MenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AgentsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(135, 185, 194));
        jPanel2.setForeground(new java.awt.Color(135, 185, 194));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 80, 103));
        jLabel3.setText("GENDER");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        Aname.setFont(new java.awt.Font("Futura", 0, 16)); // NOI18N
        Aname.setForeground(new java.awt.Color(13, 80, 103));
        jPanel2.add(Aname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 250, 38));

        Aage.setFont(new java.awt.Font("Futura", 0, 16)); // NOI18N
        Aage.setForeground(new java.awt.Color(13, 80, 103));
        jPanel2.add(Aage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 250, 40));

        Agender.setFont(new java.awt.Font("Futura", 0, 16)); // NOI18N
        Agender.setForeground(new java.awt.Color(13, 80, 103));
        Agender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        jPanel2.add(Agender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 250, 40));

        jLabel5.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 80, 103));
        jLabel5.setText("AGE");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 80, 103));
        jLabel6.setText("NAME");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Futura-Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 80, 103));
        jLabel2.setText("PERSONNEL");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(13, 80, 103));
        jLabel8.setText("PHONE");
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(13, 80, 103));
        jLabel7.setText("ID");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        Aid.setFont(new java.awt.Font("Futura", 0, 16)); // NOI18N
        Aid.setForeground(new java.awt.Color(13, 80, 103));
        Aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AidActionPerformed(evt);
            }
        });
        jPanel2.add(Aid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 250, 40));

        Aphone.setFont(new java.awt.Font("Futura", 0, 16)); // NOI18N
        Aphone.setForeground(new java.awt.Color(13, 80, 103));
        Aphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AphoneActionPerformed(evt);
            }
        });
        jPanel2.add(Aphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 250, 40));

        AddBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(13, 80, 103));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 409, 112, 40));

        UpdateBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(13, 80, 103));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        jPanel2.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, 40));

        ClrBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        ClrBtn.setForeground(new java.awt.Color(13, 80, 103));
        ClrBtn.setText("CLEAR");
        ClrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClrBtnMouseClicked(evt);
            }
        });
        jPanel2.add(ClrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 479, 112, 40));

        DelBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        DelBtn.setForeground(new java.awt.Color(13, 80, 103));
        DelBtn.setText("DELETE");
        DelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelBtnMouseClicked(evt);
            }
        });
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 478, 112, 40));

        MenuBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(13, 80, 103));
        MenuBtn.setText("MENU");
        MenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBtnMouseClicked(evt);
            }
        });
        MenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBtnActionPerformed(evt);
            }
        });
        jPanel2.add(MenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 549, 112, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/geet/Desktop/PHARMACY/AGENTS.jpg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 470, 700));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jPanel1.setBackground(new java.awt.Color(135, 185, 194));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgentsTable.setBackground(new java.awt.Color(190, 219, 222));
        AgentsTable.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        AgentsTable.setForeground(new java.awt.Color(13, 80, 103));
        AgentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "AID", "ANAME", "AAGE", "APHONE", "AGEN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AgentsTable.setRowHeight(25);
        AgentsTable.setSelectionBackground(new java.awt.Color(13, 80, 103));
        AgentsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        AgentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgentsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AgentsTable);
        if (AgentsTable.getColumnModel().getColumnCount() > 0) {
            AgentsTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            AgentsTable.getColumnModel().getColumn(2).setPreferredWidth(10);
            AgentsTable.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 680, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 770, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectMed()
{
    try{
    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
    st = con.createStatement();
    Rs = st.executeQuery("Select * from root.AGENTS");
    AgentsTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch(SQLException e){
        e.printStackTrace();
    }
}
    
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelBtnActionPerformed

    private void AphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AphoneActionPerformed

    Connection con = null;
    Statement st = null ;
    ResultSet Rs = null ;
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        
        if(Aid.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Cannot add record because Agent/Personnel ID is empty!");
            }
        else if(Agender.getSelectedItem()=="Select")
        {
            JOptionPane.showMessageDialog(this,"Cannot add record because Gender is not choosen!");
        }
        
        else{
        try{
            // Check if the PERSONNEL ID already exists
                PreparedStatement checkIdStmt = con.prepareStatement("SELECT COUNT(*) FROM AGENTS WHERE AID = ?");
                checkIdStmt.setInt(1, Integer.parseInt(Aid.getText()));
                ResultSet idResult = checkIdStmt.executeQuery();
                idResult.next();
                int idCount = idResult.getInt(1);

            // Check if the phone number already exists
                PreparedStatement checkPhoneStmt = con.prepareStatement("SELECT COUNT(*) FROM AGENTS WHERE APHONE = ?");
                checkPhoneStmt.setString(1, Aphone.getText());
                ResultSet phoneResult = checkPhoneStmt.executeQuery();
                phoneResult.next();
                int phoneCount = phoneResult.getInt(1);            

                if (idCount > 0) {
                    JOptionPane.showMessageDialog(this, "AGENT ID already exists!");
                } else if (phoneCount > 0) {
                    JOptionPane.showMessageDialog(this, "Phone number already exists!");
                } 
                else
                {
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                    PreparedStatement add = con.prepareStatement("Insert into Agents values(?,?,?,?,?)");
                    add.setInt (1, Integer.valueOf(Aid.getText()));
                    add.setString(2, Aname.getText());
                    add.setInt (3, Integer.valueOf(Aage.getText()));
                    add.setString(4, Aphone.getText());
                    add.setString(5, Agender.getSelectedItem().toString());
                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Agent successfully added!");
                    con.close();
                    SelectMed();
                }
        }catch(SQLException e){
            e.printStackTrace();
        
        }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AidActionPerformed

    private void ClrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClrBtnMouseClicked
        Aid.setText("");
        Aname.setText("");
        Aage.setText("");
        Aphone.setText("");

    }//GEN-LAST:event_ClrBtnMouseClicked

    private void DelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelBtnMouseClicked
        if(Aid.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the Agent ID to be deleted");
            
        }
        else
        {
            try{
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                String id = Aid.getText();
                String Query= "delete from root.AGENTS where Aid = "+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this,"Agent deleted successfully!");
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DelBtnMouseClicked

    private void AgentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgentsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)AgentsTable.getModel();
        int index = AgentsTable.getSelectedRow();
        Aid.setText(model.getValueAt(index, 0).toString());
        Aname.setText(model.getValueAt(index, 1).toString());
        Aage.setText(model.getValueAt(index, 2).toString());
        Aphone.setText(model.getValueAt(index, 3).toString());
        
    }//GEN-LAST:event_AgentsTableMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if(Aid.getText().isEmpty() || Aname.getText().isEmpty()|| Aage.getText().isEmpty()|| Aphone.getText().isEmpty()|| Aname.getText().isEmpty())
          {
                JOptionPane.showMessageDialog(this,"missing information!");       
          } 
        else if(Agender.getSelectedItem() == "Select")
        {
            JOptionPane.showMessageDialog(this, "Cannot update record because Gender is not chosen!");
        }
        else {
            try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "root", "Geet@2004");
            String updateQuery = "UPDATE root.AGENTS SET ANAME = ?, AGE = ?, APHONE = ?, AGENDER = ? WHERE AID = ?";


            PreparedStatement updateStatement = con.prepareStatement(updateQuery);
            updateStatement.setString(1, Aname.getText());
            updateStatement.setInt(2, Integer.parseInt(Aage.getText()));
            updateStatement.setString(3, Aphone.getText());
            updateStatement.setString(4, Agender.getSelectedItem().toString());
            updateStatement.setInt(5, Integer.parseInt(Aid.getText()));

            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Agent updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update agent.");       
            }
            }
            catch(SQLException e)
        {
            e.printStackTrace();
        }
        SelectMed();
        }                                     
       
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void MenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseClicked
        new MENU().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuBtnMouseClicked

    private void MenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PERSONNEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PERSONNEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PERSONNEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PERSONNEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PERSONNEL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aage;
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> Agender;
    private javax.swing.JTable AgentsTable;
    private javax.swing.JTextField Aid;
    private javax.swing.JTextField Aname;
    private javax.swing.JTextField Aphone;
    private javax.swing.JButton ClrBtn;
    private javax.swing.JButton DelBtn;
    private javax.swing.JButton MenuBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
