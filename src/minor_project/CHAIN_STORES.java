
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

public class CHAIN_STORES extends javax.swing.JFrame {

    public CHAIN_STORES() {
        initComponents();
        SelectMed();
    }
    
        public void SelectMed()
{
    try{
    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
    st = con.createStatement();
    Rs = st.executeQuery("Select * from root.CHAIN_STORES");
    CHAIN_STORES.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch(SQLException e){
        e.printStackTrace();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        UpdBtn = new javax.swing.JButton();
        ClrBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CHAIN_STORES = new javax.swing.JTable();
        ID = new javax.swing.JTextField();
        ZIPCODE = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        ADDRESS = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        CITY = new javax.swing.JTextField();
        MenuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(15, 78, 78));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/geet/Desktop/PHARMACY/GREENPHARMACY.jpg")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 384, 610));

        jLabel3.setFont(new java.awt.Font("Futura-Bold", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 146, 26));
        jLabel3.setText("CHAIN STORES");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel9.setBackground(new java.awt.Color(240, 234, 234));
        jLabel9.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(230, 227, 222));
        jLabel9.setText("ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jLabel8.setBackground(new java.awt.Color(240, 234, 234));
        jLabel8.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(230, 227, 222));
        jLabel8.setText("ADDRESS");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, -1, -1));

        jLabel6.setBackground(new java.awt.Color(240, 234, 234));
        jLabel6.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 227, 222));
        jLabel6.setText("ZIPCODE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, -1, -1));

        jLabel10.setBackground(new java.awt.Color(240, 234, 234));
        jLabel10.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(230, 227, 222));
        jLabel10.setText("CITY");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jLabel11.setBackground(new java.awt.Color(240, 234, 234));
        jLabel11.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(230, 227, 222));
        jLabel11.setText("PHONE");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, -1, -1));

        jLabel5.setBackground(new java.awt.Color(240, 234, 234));
        jLabel5.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(230, 227, 222));
        jLabel5.setText("NAME");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, 20));

        AddBtn.setBackground(new java.awt.Color(219, 133, 41));
        AddBtn.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 110, 40));

        UpdBtn.setBackground(new java.awt.Color(219, 133, 41));
        UpdBtn.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        UpdBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdBtn.setText("UPDATE");
        UpdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdBtnMouseClicked(evt);
            }
        });
        jPanel2.add(UpdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 110, 40));

        ClrBtn.setBackground(new java.awt.Color(219, 133, 41));
        ClrBtn.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        ClrBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClrBtn.setText("CLEAR");
        ClrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClrBtnMouseClicked(evt);
            }
        });
        jPanel2.add(ClrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 110, 40));

        DelBtn.setBackground(new java.awt.Color(219, 133, 41));
        DelBtn.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        DelBtn.setForeground(new java.awt.Color(255, 255, 255));
        DelBtn.setText("DELETE");
        DelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelBtnMouseClicked(evt);
            }
        });
        jPanel2.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 110, 40));

        CHAIN_STORES.setBackground(new java.awt.Color(15, 78, 78));
        CHAIN_STORES.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        CHAIN_STORES.setForeground(new java.awt.Color(255, 255, 255));
        CHAIN_STORES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "ADDRESS", "ZIP", "STREET", "CITY", "PHONE"
            }
        ));
        CHAIN_STORES.setSelectionBackground(new java.awt.Color(235, 146, 26));
        CHAIN_STORES.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CHAIN_STORES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHAIN_STORESMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CHAIN_STORES);
        if (CHAIN_STORES.getColumnModel().getColumnCount() > 0) {
            CHAIN_STORES.getColumnModel().getColumn(0).setPreferredWidth(25);
            CHAIN_STORES.getColumnModel().getColumn(0).setMaxWidth(25);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 750, 220));

        ID.setBackground(new java.awt.Color(230, 227, 222));
        ID.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        jPanel2.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 160, 30));

        ZIPCODE.setBackground(new java.awt.Color(230, 227, 222));
        ZIPCODE.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        jPanel2.add(ZIPCODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 160, 30));

        NAME.setBackground(new java.awt.Color(230, 227, 222));
        NAME.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        jPanel2.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 160, 30));

        ADDRESS.setBackground(new java.awt.Color(230, 227, 222));
        ADDRESS.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        jPanel2.add(ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 160, 30));

        PHONE.setBackground(new java.awt.Color(230, 227, 222));
        PHONE.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        jPanel2.add(PHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 160, 30));

        CITY.setBackground(new java.awt.Color(230, 227, 222));
        CITY.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        jPanel2.add(CITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 160, 30));

        MenuBtn.setBackground(new java.awt.Color(219, 133, 41));
        MenuBtn.setFont(new java.awt.Font("Futura-Bold", 1, 18)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        MenuBtn.setText("MENU");
        MenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBtnMouseClicked(evt);
            }
        });
        jPanel2.add(MenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 330, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    Statement st = null ;
    ResultSet Rs = null ;
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        
        if(ID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Cannot add record because Store ID is empty!");
            }
        
        else{
        
        try{
            
            // Check if the STORE ID already exists
                PreparedStatement checkIdStmt = con.prepareStatement("SELECT COUNT(*) FROM CHAIN_STORES WHERE ID = ?");
                checkIdStmt.setInt(1, Integer.parseInt(ID.getText()));
                ResultSet idResult = checkIdStmt.executeQuery();
                idResult.next();
                int idCount = idResult.getInt(1);

            // Check if the phone number already exists
                PreparedStatement checkPhoneStmt = con.prepareStatement("SELECT COUNT(*) FROM CHAIN_STORES WHERE PHONE = ?");
                checkPhoneStmt.setString(1, PHONE.getText());
                ResultSet phoneResult = checkPhoneStmt.executeQuery();
                phoneResult.next();
                int phoneCount = phoneResult.getInt(1);            

                if (idCount > 0) {
                    JOptionPane.showMessageDialog(this, "STORE ID already exists!");
                } else if (phoneCount > 0) {
                    JOptionPane.showMessageDialog(this, "Phone number already exists!");
                } 
                else
                {
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                    PreparedStatement add = con.prepareStatement("Insert into CHAIN_STORES values(?,?,?,?,?,?)");
                    add.setInt(1, Integer.valueOf(ID.getText()));
                    add.setString(2,NAME.getText());
                    add.setString(3,ADDRESS.getText());
                    add.setInt(4, Integer.valueOf(ZIPCODE.getText()));
                    add.setString(5,CITY.getText());
                    add.setString(6,PHONE.getText());

                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"CHAIN STORE'S Record successfully added!");
                    con.close();
                    SelectMed(); 
                }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdBtnMouseClicked
        if(ID.getText().isEmpty()||NAME.getText().isEmpty()||ADDRESS.getText().isEmpty()|| PHONE.getText().isEmpty()|| ZIPCODE.getText().isEmpty()|| CITY.getText().isEmpty())
          {
                JOptionPane.showMessageDialog(this,"missing information!");       
          }  
        else {
            try {
            
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "root", "Geet@2004");
            String updateQuery = "UPDATE root.CHAIN_STORES SET NAME = ?,ADDRESS= ?,ZIPCODE=?, CITY=?, PHONE= ? WHERE ID = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateQuery);           
            updateStatement.setString(1, NAME.getText());
            updateStatement.setString(2, ADDRESS.getText());
            updateStatement.setInt(3, Integer.parseInt(ZIPCODE.getText()));
            updateStatement.setString(4, ADDRESS.getText());
            updateStatement.setString(5, PHONE.getText());
            updateStatement.setInt(6, Integer.parseInt(ID.getText()));


                 
            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "CHAIN STORE RECORDS updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update records.");       
            }
            }
            catch(SQLException e)
        {
            e.printStackTrace();
        }
        SelectMed();
        }   
    }//GEN-LAST:event_UpdBtnMouseClicked

    private void DelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelBtnMouseClicked
        if(ID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the store ID to be deleted");
            
        }
        else
        {
            try{
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                String id = ID.getText();
                String Query= "delete from root.CHAIN_STORES where ID = "+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this,"CHAIN STORE RECORD deleted successfully!");
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DelBtnMouseClicked

    private void ClrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClrBtnMouseClicked
        ID.setText("");
        NAME.setText("");
        ZIPCODE.setText("");
        ADDRESS.setText("");
        PHONE.setText("");
        CITY.setText("");

    }//GEN-LAST:event_ClrBtnMouseClicked

    private void CHAIN_STORESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHAIN_STORESMouseClicked
        DefaultTableModel model = (DefaultTableModel)CHAIN_STORES.getModel();
        int index = CHAIN_STORES.getSelectedRow();
        ID.setText(model.getValueAt(index, 0).toString());
        NAME.setText(model.getValueAt(index, 1).toString());
        ADDRESS.setText(model.getValueAt(index, 2).toString());
        ZIPCODE.setText(model.getValueAt(index, 3).toString());
        CITY.setText(model.getValueAt(index, 4).toString());
        PHONE.setText(model.getValueAt(index, 5).toString());
    }//GEN-LAST:event_CHAIN_STORESMouseClicked

    private void MenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseClicked
         new MENU().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuBtnMouseClicked


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
            java.util.logging.Logger.getLogger(CHAIN_STORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CHAIN_STORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CHAIN_STORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CHAIN_STORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CHAIN_STORES().setVisible(true);
            }
        });
    }
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESS;
    private javax.swing.JButton AddBtn;
    private javax.swing.JTable CHAIN_STORES;
    private javax.swing.JTextField CITY;
    private javax.swing.JButton ClrBtn;
    private javax.swing.JButton DelBtn;
    private javax.swing.JTextField ID;
    private javax.swing.JButton MenuBtn;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PHONE;
    private javax.swing.JButton UpdBtn;
    private javax.swing.JTextField ZIPCODE;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
