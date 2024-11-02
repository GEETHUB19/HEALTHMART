
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

public class DEALERS_SUPPLIERS extends javax.swing.JFrame {

    public DEALERS_SUPPLIERS() {
        initComponents();
        SelectMed();
    }
    
    public void SelectMed()
{
    try{
    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
    st = con.createStatement();
    Rs = st.executeQuery("Select * from root.DEALERS");
    DEALERS_SUPPLIERS.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch(SQLException e){
        e.printStackTrace();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DEALERS_SUPPLIERS = new javax.swing.JTable();
        UpdBtn = new javax.swing.JButton();
        ClrBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LEAD_TIME = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        IN_CHARGE = new javax.swing.JTextField();
        PROD_LINE = new javax.swing.JTextField();
        DEALER_ID = new javax.swing.JTextField();
        CONTACT = new javax.swing.JTextField();
        CITY = new javax.swing.JTextField();
        PAY_TERMS = new javax.swing.JTextField();
        ADDRESS = new javax.swing.JTextField();
        AMNT = new javax.swing.JTextField();
        MenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(104, 97, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DEALERS_SUPPLIERS.setBackground(new java.awt.Color(104, 97, 51));
        DEALERS_SUPPLIERS.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        DEALERS_SUPPLIERS.setForeground(new java.awt.Color(238, 235, 233));
        DEALERS_SUPPLIERS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DEALER_ID", "D_NAME", "IN-CHARGE", "CONTACT", "ADDRESS", "CITY", "PROD_LINE", "LEAD_TIME", "PAY_TERMS", "AMNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DEALERS_SUPPLIERS.setSelectionBackground(new java.awt.Color(159, 128, 74));
        DEALERS_SUPPLIERS.setSelectionForeground(new java.awt.Color(255, 255, 255));
        DEALERS_SUPPLIERS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEALERS_SUPPLIERSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DEALERS_SUPPLIERS);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 1110, 240));

        UpdBtn.setBackground(new java.awt.Color(104, 97, 51));
        UpdBtn.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        UpdBtn.setForeground(new java.awt.Color(238, 235, 233));
        UpdBtn.setText("UPDATE");
        UpdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdBtnMouseClicked(evt);
            }
        });
        jPanel2.add(UpdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 130, 50));

        ClrBtn.setBackground(new java.awt.Color(104, 97, 51));
        ClrBtn.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        ClrBtn.setForeground(new java.awt.Color(238, 235, 233));
        ClrBtn.setText("CLEAR");
        ClrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClrBtnMouseClicked(evt);
            }
        });
        jPanel2.add(ClrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 130, 50));

        AddBtn.setBackground(new java.awt.Color(104, 97, 51));
        AddBtn.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(238, 235, 233));
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
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 130, 50));

        DelBtn.setBackground(new java.awt.Color(104, 97, 51));
        DelBtn.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        DelBtn.setForeground(new java.awt.Color(238, 235, 233));
        DelBtn.setText("DELETE");
        DelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelBtnMouseClicked(evt);
            }
        });
        jPanel2.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 130, 50));

        jLabel5.setFont(new java.awt.Font("Futura-Bold", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 235, 233));
        jLabel5.setText("DEALERS - SUPPLIERS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Futura-Bold", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(104, 97, 51));
        jLabel8.setText("CONTACT");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Futura-Bold", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(104, 97, 51));
        jLabel7.setText("IN-CHARGE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Futura-Bold", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(104, 97, 51));
        jLabel10.setText("ADDRESS");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Futura-Bold", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(104, 97, 51));
        jLabel11.setText("CITY");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Futura-Bold", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(104, 97, 51));
        jLabel6.setText("NAME");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Futura-Bold", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(104, 97, 51));
        jLabel4.setText("DEALER_ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 30));

        jLabel12.setFont(new java.awt.Font("Futura-Bold", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(104, 97, 51));
        jLabel12.setText("PAY_TERMS");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Futura-Bold", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(104, 97, 51));
        jLabel13.setText("AMNT");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Futura-Bold", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(104, 97, 51));
        jLabel15.setText("LEAD_TIME");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        jLabel14.setFont(new java.awt.Font("Futura-Bold", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(104, 97, 51));
        jLabel14.setText("PROD_LINE");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        LEAD_TIME.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        LEAD_TIME.setForeground(new java.awt.Color(109, 73, 2));
        LEAD_TIME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LEAD_TIMEActionPerformed(evt);
            }
        });
        jPanel2.add(LEAD_TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 210, 40));

        NAME.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        NAME.setForeground(new java.awt.Color(109, 73, 2));
        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });
        jPanel2.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 210, 40));

        IN_CHARGE.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        IN_CHARGE.setForeground(new java.awt.Color(109, 73, 2));
        IN_CHARGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IN_CHARGEActionPerformed(evt);
            }
        });
        jPanel2.add(IN_CHARGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 210, 40));

        PROD_LINE.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        PROD_LINE.setForeground(new java.awt.Color(109, 73, 2));
        PROD_LINE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROD_LINEActionPerformed(evt);
            }
        });
        jPanel2.add(PROD_LINE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 210, 40));

        DEALER_ID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        DEALER_ID.setForeground(new java.awt.Color(109, 73, 2));
        DEALER_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEALER_IDActionPerformed(evt);
            }
        });
        jPanel2.add(DEALER_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 210, 40));

        CONTACT.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        CONTACT.setForeground(new java.awt.Color(109, 73, 2));
        CONTACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONTACTActionPerformed(evt);
            }
        });
        jPanel2.add(CONTACT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 210, 40));

        CITY.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        CITY.setForeground(new java.awt.Color(109, 73, 2));
        CITY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CITYActionPerformed(evt);
            }
        });
        jPanel2.add(CITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 210, 40));

        PAY_TERMS.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        PAY_TERMS.setForeground(new java.awt.Color(109, 73, 2));
        PAY_TERMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAY_TERMSActionPerformed(evt);
            }
        });
        jPanel2.add(PAY_TERMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 210, 40));

        ADDRESS.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ADDRESS.setForeground(new java.awt.Color(109, 73, 2));
        ADDRESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDRESSActionPerformed(evt);
            }
        });
        jPanel2.add(ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 210, 40));

        AMNT.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        AMNT.setForeground(new java.awt.Color(109, 73, 2));
        AMNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMNTActionPerformed(evt);
            }
        });
        jPanel2.add(AMNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 210, 40));

        MenuBtn.setBackground(new java.awt.Color(104, 97, 51));
        MenuBtn.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(238, 235, 233));
        MenuBtn.setText("MENU");
        MenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBtnMouseClicked(evt);
            }
        });
        jPanel2.add(MenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/geet/Desktop/PHARMACY/STORE1.jpg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 840, 520));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
   
    private void IN_CHARGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IN_CHARGEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IN_CHARGEActionPerformed

    private void PROD_LINEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROD_LINEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PROD_LINEActionPerformed

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEActionPerformed

    private void CONTACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONTACTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CONTACTActionPerformed

    private void CITYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CITYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CITYActionPerformed

    private void LEAD_TIMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LEAD_TIMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LEAD_TIMEActionPerformed

    private void DEALER_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEALER_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEALER_IDActionPerformed

    private void PAY_TERMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAY_TERMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAY_TERMSActionPerformed

    private void AMNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMNTActionPerformed

    private void ADDRESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDRESSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDRESSActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    
    Connection con = null;
    Statement st = null ;
    ResultSet Rs = null ;
    
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        
        if(DEALER_ID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Cannot add record because Dealer ID is empty!");
            }
        
        else{
        
            try{
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");

            // Check if the dealer ID already exists
                PreparedStatement checkIdStmt = con.prepareStatement("SELECT COUNT(*) FROM DEALERS WHERE D_ID = ?");
                checkIdStmt.setInt(1, Integer.parseInt(DEALER_ID.getText()));
                ResultSet idResult = checkIdStmt.executeQuery();
                idResult.next();
                int idCount = idResult.getInt(1);

            // Check if the phone number already exists
                PreparedStatement checkPhoneStmt = con.prepareStatement("SELECT COUNT(*) FROM DEALERS WHERE CONTACT = ?");
                checkPhoneStmt.setString(1, CONTACT.getText());
                ResultSet phoneResult = checkPhoneStmt.executeQuery();
                phoneResult.next();
                int phoneCount = phoneResult.getInt(1);            

                if (idCount > 0) {
                    JOptionPane.showMessageDialog(this, "Dealer ID already exists!");
                } else if (phoneCount > 0) {
                    JOptionPane.showMessageDialog(this, "Phone number already exists!");
                } 
                else
                {
                    PreparedStatement add = con.prepareStatement("Insert into DEALERS values(?,?,?,?,?,?,?,?,?,?)");
                    add.setInt(1, Integer.parseInt(DEALER_ID.getText()));
                    add.setString(2,NAME.getText());
                    add.setString(3,IN_CHARGE.getText());
        //            add.setInt(4, Integer.parseInt(CONTACT.getText()));
        //            add.setString(4,CONTACT.getText());
                    add.setString(4,PROD_LINE.getText());
                    add.setString(5,LEAD_TIME.getText());
                    add.setString(6,ADDRESS.getText());
                    add.setString(7,CITY.getText());
                    add.setInt(8, Integer.parseInt(AMNT.getText()));
                    add.setString(9,PAY_TERMS.getText());
                    add.setString(10,CONTACT.getText());


                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"DEALER Record successfully added!");
                    con.close();
                    SelectMed(); 
                }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid format for Dealer ID or Amount!");
        }
        }
        
        
        
    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdBtnMouseClicked
        if(DEALER_ID.getText().isEmpty()||NAME.getText().isEmpty()|| IN_CHARGE.getText().isEmpty()|| CONTACT.getText().isEmpty()|| PROD_LINE.getText().isEmpty()|| LEAD_TIME.getText().isEmpty()|| ADDRESS.getText().isEmpty()|| CITY.getText().isEmpty()|| AMNT.getText().isEmpty()|| PAY_TERMS.getText().isEmpty())
          {
                JOptionPane.showMessageDialog(this,"MISSING INFORMATION!");       
          }  
        else {
            try {
            
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "root", "Geet@2004");
            String updateQuery = "UPDATE root.DEALERS SET NAME = ?,IN_CHARGE = ?,CONTACT =? , PROD_LINE = ? , LEAD_TIME = ?, ADDRESS= ?, CITY= ? , AMNT = ? , PAY_TERMS= ? WHERE D_ID = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateQuery);           
            updateStatement.setString(1, NAME.getText());
            updateStatement.setString(2, IN_CHARGE.getText());
            updateStatement.setString(3, CONTACT.getText());
            updateStatement.setString(4, PROD_LINE.getText());
            updateStatement.setString(5, LEAD_TIME.getText());
            updateStatement.setString(6, ADDRESS.getText());
            updateStatement.setString(7, CITY.getText());        
            updateStatement.setInt(8, Integer.parseInt(AMNT.getText()));
            updateStatement.setString(9, PAY_TERMS.getText());
            updateStatement.setInt(10, Integer.parseInt(DEALER_ID.getText()));

                 
            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "DEALER RECORDS updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update DEALER RECORDS.");       
            }
            }
            catch(SQLException e)
        {
            e.printStackTrace();
        }
        SelectMed();
        }   
    }//GEN-LAST:event_UpdBtnMouseClicked

    private void ClrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClrBtnMouseClicked
        DEALER_ID.setText("");
        NAME.setText("");
        IN_CHARGE.setText("");
        CONTACT.setText("");
        PROD_LINE.setText("");
        LEAD_TIME.setText("");
        ADDRESS.setText("");
        CITY.setText("");
        AMNT.setText("");
        PAY_TERMS.setText("");

    }//GEN-LAST:event_ClrBtnMouseClicked

    private void DelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelBtnMouseClicked
        if(DEALER_ID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the DEALER ID to be deleted");
            
        }
        else
        {
            try{
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                String id = DEALER_ID.getText();
                String Query= "delete from root.DEALERS where D_ID = "+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this,"DEALER RECORDS deleted successfully!");
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DelBtnMouseClicked

    private void DEALERS_SUPPLIERSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEALERS_SUPPLIERSMouseClicked
        DefaultTableModel model = (DefaultTableModel)DEALERS_SUPPLIERS.getModel();
        int index = DEALERS_SUPPLIERS.getSelectedRow();
        DEALER_ID.setText(model.getValueAt(index, 0).toString());
        NAME.setText(model.getValueAt(index, 1).toString());
        IN_CHARGE.setText(model.getValueAt(index, 2).toString());
        CONTACT.setText(model.getValueAt(index, 9).toString());
        PROD_LINE.setText(model.getValueAt(index, 3).toString());
        LEAD_TIME.setText(model.getValueAt(index, 4).toString());
        ADDRESS.setText(model.getValueAt(index, 5).toString());
        CITY.setText(model.getValueAt(index, 6).toString());
        AMNT.setText(model.getValueAt(index, 7).toString());
        PAY_TERMS.setText(model.getValueAt(index, 8).toString());
    }//GEN-LAST:event_DEALERS_SUPPLIERSMouseClicked

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
            java.util.logging.Logger.getLogger(DEALERS_SUPPLIERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEALERS_SUPPLIERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEALERS_SUPPLIERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEALERS_SUPPLIERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEALERS_SUPPLIERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESS;
    private javax.swing.JTextField AMNT;
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CITY;
    private javax.swing.JTextField CONTACT;
    private javax.swing.JButton ClrBtn;
    private javax.swing.JTable DEALERS_SUPPLIERS;
    private javax.swing.JTextField DEALER_ID;
    private javax.swing.JButton DelBtn;
    private javax.swing.JTextField IN_CHARGE;
    private javax.swing.JTextField LEAD_TIME;
    private javax.swing.JButton MenuBtn;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PAY_TERMS;
    private javax.swing.JTextField PROD_LINE;
    private javax.swing.JButton UpdBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
