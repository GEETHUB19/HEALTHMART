
package minor_project;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class testing extends javax.swing.JFrame {
//call selectmed here1
    public testing() {
        initComponents();
        SelectMed();   
    }
    
    Connection con = null;
    Statement st = null ;
    ResultSet Rs = null ;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NAME = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PHNO = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEST = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("name");

        jLabel2.setText("phno");

        PHNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHNOActionPerformed(evt);
            }
        });

        jButton1.setText("ADD");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        TEST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NAME", "PHNO"
            }
        ));
        TEST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TESTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TEST);

        jButton2.setText("delete");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("update");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(PHNO, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(387, 387, 387)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PHNO, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void SelectMed()
{
    try{
    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
    st = con.createStatement();
    Rs = st.executeQuery("Select * from root.TEST");
    TEST.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch(SQLException e){
        e.printStackTrace();
    }
}
 
    
//    
    private void PHNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PHNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PHNOActionPerformed

    //call selectmed here2
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
            PreparedStatement add = con.prepareStatement("Insert into test values(?,?)");
            add.setString(1,NAME.getText());
            add.setInt(2, Integer.valueOf(PHNO.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Medicine successfully added");
            con.close();
            SelectMed();
        }catch(SQLException e){
            e.printStackTrace();
        
        }
        
            
        
    }//GEN-LAST:event_jButton1MouseClicked

        //call selectmed here3
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if(PHNO.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the phno to be deleted");
            
        }
        else
        {
            try{
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                String id = PHNO.getText();
                String Query= "delete from root.Test where PHNO = "+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this,"phno deleted successfully!");
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
                                      
      if(PHNO.getText().isEmpty() || NAME.getText().isEmpty())
          {
                JOptionPane.showMessageDialog(this,"missing information!");       

          }  
    else {
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
            String updateQuery = "UPDATE TEST SET NAME = ? WHERE PHNO = ?";
            
            // Create PreparedStatement for the update query
            PreparedStatement updateStatement = con.prepareStatement(updateQuery);
            updateStatement.setString(1, NAME.getText()); // Set the new name
            updateStatement.setInt(2, Integer.parseInt(PHNO.getText())); // Specify the PHNO to update
//            Execute the update statement
            int rowsUpdated = updateStatement.executeUpdate();
            // Check if any rows were updated
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Records updated successfully!");
                SelectMed(); // Refresh the table
            } else {
                JOptionPane.showMessageDialog(this, "No records found for the specified PHNO.");
            }
            con.close();

            }
        catch (SQLException e) {
            e.printStackTrace();
        }
      }
                    
    


        
//        if(PHNO.getText().isEmpty() || NAME.getText().isEmpty())
//          {
//                JOptionPane.showMessageDialog(this,"missing information!");       
//
//          }
//          else
//          {
//              try{
//                  con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
//                  String updateQuery ="update root.TEST set NAME= "+NAME.getText()+" ";
////                 +"NAME= " +NAME.getText()
//                  Statement add = con.createStatement();
//                  add.executeUpdate(updateQuery);
//                  JOptionPane.showMessageDialog(this,"records updated successfully!");       
//              }
//              catch(SQLException e)
//              {
//                  e.printStackTrace();
//              }
//              SelectMed();
//              
//          }

    }//GEN-LAST:event_jButton3MouseClicked

    private void TESTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TESTMouseClicked
        //to be able to cick on records in the table
        DefaultTableModel model = (DefaultTableModel)TEST.getModel();
        int index = TEST.getSelectedRow();
        NAME.setText(model.getValueAt(index, 0).toString());
        PHNO.setText(model.getValueAt(index, 1).toString());
    }//GEN-LAST:event_TESTMouseClicked

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
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PHNO;
    private javax.swing.JTable TEST;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}



//private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
//    try {
//        con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "root", "Geet@2004");
//        
//        // Check if PHNO already exists
//        PreparedStatement checkStmt = con.prepareStatement("SELECT * FROM TEST WHERE PHNO = ?");
//        checkStmt.setInt(1, Integer.valueOf(PHNO.getText()));
//        ResultSet existingRecords = checkStmt.executeQuery();
//        
//        if (existingRecords.next()) {
//            // PHNO already exists, handle accordingly (update or prompt user)
//            JOptionPane.showMessageDialog(this, "PHNO already exists. Consider updating the existing record.");
//        } else {
//            // PHNO doesn't exist, proceed with insertion
//            PreparedStatement add = con.prepareStatement("INSERT INTO TEST VALUES (?, ?)");
//            add.setString(1, NAME.getText());
//            add.setInt(2, Integer.valueOf(PHNO.getText()));
//            int row = add.executeUpdate();
//            JOptionPane.showMessageDialog(this, "Medicine successfully added");
//            SelectMed();
//        }
//        con.close();
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//}
