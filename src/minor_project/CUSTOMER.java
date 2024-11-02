
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

public class CUSTOMER extends javax.swing.JFrame {

    
    public CUSTOMER() {
        initComponents();
        SelectMed();
    }
    
    public void SelectMed()
{
    try{
    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
    st = con.createStatement();
    Rs = st.executeQuery("Select * from root.CUSTOMER");
    CUSTOMER.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch(SQLException e){
        e.printStackTrace();
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CUSTOMER = new javax.swing.JTable();
        ClrBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        UpdBtn = new javax.swing.JButton();
        MenuBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CUST_ID = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        DOB = new com.toedter.calendar.JDateChooser();
        GENDER = new javax.swing.JComboBox<>();
        PROD_ID = new javax.swing.JTextField();
        ADDRESS = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(186, 221, 231));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(186, 221, 231));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 730, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/geet/Desktop/PHARMACY/CUSTOMERS.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 490));

        jPanel3.setBackground(new java.awt.Color(186, 221, 231));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CUSTOMER.setBackground(new java.awt.Color(186, 221, 231));
        CUSTOMER.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CUSTOMER.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        CUSTOMER.setForeground(new java.awt.Color(13, 41, 73));
        CUSTOMER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CUST_ID", "NAME", "DOB", "GENDER", "PROD_ID", "ADDRESS", "PHNO"
            }
        ));
        CUSTOMER.setRowHeight(25);
        CUSTOMER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CUSTOMERMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CUSTOMER);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1030, 200));

        ClrBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        ClrBtn.setForeground(new java.awt.Color(13, 41, 73));
        ClrBtn.setText("CLEAR");
        ClrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClrBtnMouseClicked(evt);
            }
        });
        ClrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClrBtnActionPerformed(evt);
            }
        });
        jPanel3.add(ClrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, 120, 40));

        DelBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        DelBtn.setForeground(new java.awt.Color(13, 41, 73));
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
        jPanel3.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, 120, 40));

        UpdBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        UpdBtn.setForeground(new java.awt.Color(13, 41, 73));
        UpdBtn.setText("UPDATE");
        UpdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdBtnMouseClicked(evt);
            }
        });
        UpdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdBtnActionPerformed(evt);
            }
        });
        jPanel3.add(UpdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 120, 40));

        MenuBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(13, 41, 73));
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
        jPanel3.add(MenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 120, 40));

        AddBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(13, 41, 73));
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
        jPanel3.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 120, 40));

        jLabel3.setFont(new java.awt.Font("Futura-Bold", 1, 51)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 41, 73));
        jLabel3.setText("CUSTOMER");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        CUST_ID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        CUST_ID.setForeground(new java.awt.Color(13, 41, 73));
        CUST_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUST_IDActionPerformed(evt);
            }
        });
        jPanel3.add(CUST_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 230, 40));

        NAME.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        NAME.setForeground(new java.awt.Color(13, 41, 73));
        jPanel3.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 230, 40));
        jPanel3.add(DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 230, 40));

        GENDER.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        GENDER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "MALE", "FEMALE" }));
        jPanel3.add(GENDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 230, 40));

        PROD_ID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        PROD_ID.setForeground(new java.awt.Color(13, 41, 73));
        jPanel3.add(PROD_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 230, 40));

        ADDRESS.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ADDRESS.setForeground(new java.awt.Color(13, 41, 73));
        jPanel3.add(ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 230, 40));

        PHONE.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        PHONE.setForeground(new java.awt.Color(13, 41, 73));
        jPanel3.add(PHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 230, 40));

        jLabel5.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 41, 73));
        jLabel5.setText("PHONE");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 41, 73));
        jLabel6.setText("ADDRESS");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 41, 73));
        jLabel4.setText("PROD_ID");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(13, 41, 73));
        jLabel9.setText("GENDER");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(13, 41, 73));
        jLabel8.setText("DOB");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(13, 41, 73));
        jLabel7.setText("NAME");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(13, 41, 73));
        jLabel10.setText("CUST_ID");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CUST_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUST_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CUST_IDActionPerformed

    private void ClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClrBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClrBtnActionPerformed

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void UpdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdBtnActionPerformed

    
    
    Connection con = null;
    Statement st = null ;
    ResultSet Rs = null ;
    java.util.Date Dt;
    java.sql.Date MyDate;
    
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        
        if(CUST_ID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Cannot add record because Customer ID is empty!");
            }
        else if(DOB.getDate()==null)
                {
                   JOptionPane.showMessageDialog(this, "Cannot add record because Date of Birth(DOB) is empty!");
                }
        else if(GENDER.getSelectedItem()=="SELECT")
        {
            JOptionPane.showMessageDialog(this, "Cannot add record because Gender is not choosen!");
        }
        else{       
        try{
            
            // Check if the dealer ID already exists
                PreparedStatement checkIdStmt = con.prepareStatement("SELECT COUNT(*) FROM CUSTOMER WHERE CUST_ID = ?");
                checkIdStmt.setInt(1, Integer.parseInt(CUST_ID.getText()));
                ResultSet idResult = checkIdStmt.executeQuery();
                idResult.next();
                int idCount = idResult.getInt(1);

            // Check if the phone number already exists
                PreparedStatement checkPhoneStmt = con.prepareStatement("SELECT COUNT(*) FROM CUSTOMER WHERE PHONE = ?");
                checkPhoneStmt.setString(1, PHONE.getText());
                ResultSet phoneResult = checkPhoneStmt.executeQuery();
                phoneResult.next();
                int phoneCount = phoneResult.getInt(1);            

                if (idCount > 0) {
                    JOptionPane.showMessageDialog(this, "CUSTOMER ID already exists!");
                } else if (phoneCount > 0) {
                    JOptionPane.showMessageDialog(this, "Phone number already exists!");
                } 
                else
                {
                    Dt = DOB.getDate();
                    MyDate = new java.sql.Date(Dt.getTime());
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                    PreparedStatement add = con.prepareStatement("Insert into CUSTOMER values(?,?,?,?,?,?,?)");
                    add.setInt(1, Integer.valueOf(CUST_ID.getText()));
                    add.setString(2,NAME.getText());
                    add.setDate(3 ,MyDate);
                    add.setString(4, GENDER.getSelectedItem().toString());
                    add.setInt(5, Integer.valueOf(PROD_ID.getText()));
                    add.setString(6,ADDRESS.getText());
                    add.setString(7,PHONE.getText());

                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Customer Record successfully added!");
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
        if(CUST_ID.getText().isEmpty()||NAME.getText().isEmpty()|| PROD_ID.getText().isEmpty()|| ADDRESS.getText().isEmpty()|| PHONE.getText().isEmpty())
          {
                JOptionPane.showMessageDialog(this,"missing information!");       
          } 
        else if(DOB.getDate() == null)
        {
            JOptionPane.showMessageDialog(this, "Cannot update record because Date is empty!");
        }
        else if(GENDER.getSelectedItem()=="SELECT")
        {
            JOptionPane.showMessageDialog(this, "Cannot Update record because Gender is not chosen!");
        }
        else {
            try {
            Dt = DOB.getDate();
            MyDate = new java.sql.Date(Dt.getTime());
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "root", "Geet@2004");
            String updateQuery = "UPDATE root.CUSTOMER SET NAME = ?,DOB = ?,GENDER =? , PROD_ID = ?, ADDRESS= ?, PHONE= ? WHERE CUST_ID = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateQuery);           
            updateStatement.setString(1, NAME.getText());
            updateStatement.setDate(2, MyDate);
            updateStatement.setString(3, GENDER.getSelectedItem().toString());
            updateStatement.setInt(4, Integer.parseInt(PROD_ID.getText()));
            updateStatement.setString(5, ADDRESS.getText());
            updateStatement.setString(6, PHONE.getText());
            updateStatement.setInt(7, Integer.parseInt(CUST_ID.getText()));

                 
            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "CUSTOMER RECORDS updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update CUSTOMER RECORDS.");       
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
        if(CUST_ID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the CUST ID to be deleted");
            
        }
        else
        {
            try{
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                String id = CUST_ID.getText();
                String Query= "delete from root.CUSTOMER where CUST_ID = "+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this,"CUSTOMER RECORDS deleted successfully!");
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DelBtnMouseClicked

    private void ClrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClrBtnMouseClicked
        CUST_ID.setText("");
        NAME.setText("");
        PROD_ID.setText("");
        ADDRESS.setText("");
        PHONE.setText("");
    }//GEN-LAST:event_ClrBtnMouseClicked

    private void CUSTOMERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CUSTOMERMouseClicked
        DefaultTableModel model = (DefaultTableModel)CUSTOMER.getModel();
        int index = CUSTOMER.getSelectedRow();
        CUST_ID.setText(model.getValueAt(index, 0).toString());
        NAME.setText(model.getValueAt(index, 1).toString());
        PROD_ID.setText(model.getValueAt(index, 4).toString());
        ADDRESS.setText(model.getValueAt(index, 5).toString());
        PHONE.setText(model.getValueAt(index, 6).toString());
    }//GEN-LAST:event_CUSTOMERMouseClicked

    private void MenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseClicked
         new MENU().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuBtnMouseClicked

    private void MenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuBtnActionPerformed


    public static void main(String args[]) {


        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESS;
    private javax.swing.JButton AddBtn;
    private javax.swing.JTable CUSTOMER;
    private javax.swing.JTextField CUST_ID;
    private javax.swing.JButton ClrBtn;
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JButton DelBtn;
    private javax.swing.JComboBox<String> GENDER;
    private javax.swing.JButton MenuBtn;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PHONE;
    private javax.swing.JTextField PROD_ID;
    private javax.swing.JButton UpdBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
