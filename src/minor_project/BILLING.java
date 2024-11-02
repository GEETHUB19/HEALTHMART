
package minor_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class BILLING extends javax.swing.JFrame {
    
    Connection con = null;
    Statement st = null ;
    ResultSet Rs = null ;
    java.util.Date Dt;
    java.sql.Date MyDate;

    public BILLING() {
        initComponents();
        SelectMed();
        SelectProd();
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BILLING = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        MenuBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PROD_ID = new javax.swing.JTextField();
        QUANTITY = new javax.swing.JTextField();
        CUST_ID = new javax.swing.JTextField();
        PROD_NAME = new javax.swing.JTextField();
        BILL_ID = new javax.swing.JTextField();
        UNIT_PRICE = new javax.swing.JTextField();
        GROSS_PRICE = new javax.swing.JTextField();
        DISCOUNT = new javax.swing.JTextField();
        NET_PRICE = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdBtn = new javax.swing.JButton();
        ClrBtn = new javax.swing.JButton();
        DATE = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        PRODUCT_INVENTORY = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 173, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BILLING.setBackground(new java.awt.Color(254, 173, 183));
        BILLING.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        BILLING.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BILL_ID", "CUST_ID", "PROD_ID", "PROD_NAME", "DATE", "QUANTITY", "UNIT_PRICE", "GROSS_PRICE", "DISCOUNT", "NET_PRICE"
            }
        ));
        BILLING.setPreferredSize(new java.awt.Dimension(600, 80));
        BILLING.setSelectionBackground(new java.awt.Color(204, 0, 0));
        BILLING.setSelectionForeground(new java.awt.Color(255, 255, 255));
        BILLING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BILLINGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BILLING);
        if (BILLING.getColumnModel().getColumnCount() > 0) {
            BILLING.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 1030, 130));

        jLabel2.setFont(new java.awt.Font("Futura-Bold", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("BILLING");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("BILL_ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("DATE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("CUST_ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        MenuBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(204, 0, 0));
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
        jPanel1.add(MenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 120, 40));

        DelBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        DelBtn.setForeground(new java.awt.Color(204, 0, 0));
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
        jPanel1.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/geet/Desktop/PHARMACY/BASKET copy.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 300));

        jLabel4.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("PROD_ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("QUANTITY");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("PROD_NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("UNIT_PRICE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("GROSS_PRICE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("DISCOUNT");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Futura-Bold", 1, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("NET_PRICE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, -1, -1));

        PROD_ID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(PROD_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 200, 40));

        QUANTITY.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(QUANTITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 200, 40));

        CUST_ID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(CUST_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 200, 40));

        PROD_NAME.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(PROD_NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 200, 40));

        BILL_ID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(BILL_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 200, 40));

        UNIT_PRICE.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(UNIT_PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 200, 40));

        GROSS_PRICE.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(GROSS_PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 200, 40));

        DISCOUNT.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(DISCOUNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 200, 40));

        NET_PRICE.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(NET_PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 200, 40));

        AddBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(204, 0, 0));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 40));

        UpdBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        UpdBtn.setForeground(new java.awt.Color(204, 0, 0));
        UpdBtn.setText("UPDATE");
        UpdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdBtnMouseClicked(evt);
            }
        });
        jPanel1.add(UpdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 40));

        ClrBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        ClrBtn.setForeground(new java.awt.Color(204, 0, 0));
        ClrBtn.setText("CLEAR");
        ClrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClrBtnMouseClicked(evt);
            }
        });
        jPanel1.add(ClrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, 40));
        jPanel1.add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 200, 40));

        PRODUCT_INVENTORY.setBackground(new java.awt.Color(254, 173, 183));
        PRODUCT_INVENTORY.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        PRODUCT_INVENTORY.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "P_ID", "DESCRIPTION", "STRENGTH", "PRICE", "DEALER_ID", "ORDER_QTY", "IN_QTY", "EXP_DATE"
            }
        ));
        PRODUCT_INVENTORY.setSelectionBackground(new java.awt.Color(204, 0, 0));
        PRODUCT_INVENTORY.setSelectionForeground(new java.awt.Color(255, 255, 255));
        PRODUCT_INVENTORY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRODUCT_INVENTORYMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(PRODUCT_INVENTORY);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 1030, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//
    public void SelectMed()
{
    try{
    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
    st = con.createStatement();
    Rs = st.executeQuery("Select * from root.BILLING");
    BILLING.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch(SQLException e){
        e.printStackTrace();
    }
}
    public void SelectProd()
{
    try{
    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
    st = con.createStatement();
    Rs = st.executeQuery("Select * from root.PRODUCT_INVENTORY");
    PRODUCT_INVENTORY.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch(SQLException e){
        e.printStackTrace();
    }
}
    
   
    
    
    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelBtnActionPerformed

    
      
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        
        if(BILL_ID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Cannot add record because Bill ID is empty!");
            }
        else if(DATE.getDate()==null)
                {
                   JOptionPane.showMessageDialog(this, "Cannot add record because Date is empty!");
                }
        else{
                  
        try{
            // Check if the BILL ID already exists
                PreparedStatement checkIdStmt = con.prepareStatement("SELECT COUNT(*) FROM BILLING WHERE BILL_ID = ?");
                checkIdStmt.setInt(1, Integer.parseInt(BILL_ID.getText()));
                ResultSet idResult = checkIdStmt.executeQuery();
                idResult.next();
                int idCount = idResult.getInt(1);

                      

                if (idCount > 0) {
                    JOptionPane.showMessageDialog(this, "BILL ID already exists!");
                } 
                
                else
                {
                Dt = DATE.getDate();
                MyDate = new java.sql.Date(Dt.getTime());        
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                PreparedStatement add = con.prepareStatement("Insert into BILLING values(?,?,?,?,?,?,?,?,?,?)");
                add.setInt (1, Integer.valueOf(BILL_ID.getText()));
                add.setInt(2, Integer.valueOf(CUST_ID.getText()));
                add.setInt(3, Integer.valueOf(PROD_ID.getText()));
                add.setString(4,PROD_NAME.getText());
                add.setDate(5 ,MyDate);
                add.setInt (6, Integer.valueOf(QUANTITY.getText()));
                add.setInt (7, Integer.valueOf(UNIT_PRICE.getText()));
                add.setInt (8, Integer.valueOf(GROSS_PRICE.getText()));
                add.setInt (9, Integer.valueOf(DISCOUNT.getText()));
                add.setInt (10, Integer.valueOf(NET_PRICE.getText()));


                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Customer Bill Record successfully added!");
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
        if(BILL_ID.getText().isEmpty() || CUST_ID.getText().isEmpty()|| PROD_ID.getText().isEmpty()||PROD_NAME.getText().isEmpty()|| QUANTITY.getText().isEmpty()|| UNIT_PRICE.getText().isEmpty()|| GROSS_PRICE.getText().isEmpty()|| DISCOUNT.getText().isEmpty()|| NET_PRICE.getText().isEmpty())
          {
                JOptionPane.showMessageDialog(this,"missing information!");       
          } 
        else if(DATE.getDate() == null)
        {
            JOptionPane.showMessageDialog(this, "Cannot update record because Date is empty!");
        }
        else {
            try {
            Dt = DATE.getDate();
            MyDate = new java.sql.Date(Dt.getTime());
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "root", "Geet@2004");
            String updateQuery = "UPDATE root.BILLING SET CUST_ID = ?, PROD_ID = ?, PROD_NAME = ?, DATE = ?, QUANTITY= ? ,UNIT_PRICE= ? , GROSS_PRICE= ? ,DISCOUNT= ?, NET_PRICE= ? WHERE BILL_ID = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateQuery);
            updateStatement.setInt(1, Integer.parseInt(CUST_ID.getText()));
            updateStatement.setInt(2, Integer.parseInt(PROD_ID.getText()));
            updateStatement.setString(3, PROD_NAME.getText());
            updateStatement.setDate(4, MyDate);
            updateStatement.setInt(5, Integer.parseInt(QUANTITY.getText()));
            updateStatement.setInt(6, Integer.parseInt(UNIT_PRICE.getText()));
            updateStatement.setInt(7, Integer.parseInt(GROSS_PRICE.getText()));
            updateStatement.setInt(8, Integer.parseInt(DISCOUNT.getText()));
            updateStatement.setInt(9, Integer.parseInt(NET_PRICE.getText()));
            updateStatement.setInt(10, Integer.parseInt(BILL_ID.getText()));

      
            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "BILL updated successfully!");
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
       
    }//GEN-LAST:event_UpdBtnMouseClicked

    private void ClrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClrBtnMouseClicked
        BILL_ID.setText("");
        CUST_ID.setText("");
        PROD_ID.setText("");
        PROD_NAME.setText("");
        QUANTITY.setText("");
        UNIT_PRICE.setText("");
        GROSS_PRICE.setText("");
        DISCOUNT.setText("");
        NET_PRICE.setText("");
 
    }//GEN-LAST:event_ClrBtnMouseClicked

    private void DelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelBtnMouseClicked
        if(BILL_ID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the BILL ID to be deleted");
            
        }
        else
        {
            try{
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                String id = BILL_ID.getText();
                String Query= "delete from root.BILLING where BILL_ID = "+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this,"BILL deleted successfully!");
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DelBtnMouseClicked

    private void BILLINGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BILLINGMouseClicked
        DefaultTableModel model = (DefaultTableModel)BILLING.getModel();
        int index = BILLING.getSelectedRow();
        int ProdId = Integer.valueOf(model.getValueAt(index,2).toString());
//        int price = Integer.valueOf(model.getValueAt(index, 6));
        BILL_ID.setText(model.getValueAt(index, 0).toString());
        CUST_ID.setText(model.getValueAt(index, 1).toString());
        PROD_ID.setText(model.getValueAt(index, 2).toString());
        PROD_NAME.setText(model.getValueAt(index, 3).toString());
        QUANTITY.setText(model.getValueAt(index, 5).toString());
        UNIT_PRICE.setText(model.getValueAt(index, 6).toString());
        GROSS_PRICE.setText(model.getValueAt(index, 7).toString());
        DISCOUNT.setText(model.getValueAt(index, 8).toString());
        NET_PRICE.setText(model.getValueAt(index,9 ).toString());

    }//GEN-LAST:event_BILLINGMouseClicked

    private void MenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseClicked
        new MENU().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuBtnMouseClicked

    private void MenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuBtnActionPerformed

    private void PRODUCT_INVENTORYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRODUCT_INVENTORYMouseClicked
        DefaultTableModel model = (DefaultTableModel)PRODUCT_INVENTORY.getModel();
        int index = PRODUCT_INVENTORY.getSelectedRow();
//        P_ID.setText(model.getValueAt(index, 0).toString());
//        DESCRIPTION.setText(model.getValueAt(index, 1).toString());
//        STRENGTH.setText(model.getValueAt(index, 2).toString());
//        PRICE.setText(model.getValueAt(index, 3).toString());
//        //        DEALER_ID.setText(model.getValueAt(index, 4).toString());
//        ORDER_QTY.setText(model.getValueAt(index, 5).toString());
//        IN_QTY.setText(model.getValueAt(index, 6).toString());
//        EXP_DATE.setDate(Dt);
    }//GEN-LAST:event_PRODUCT_INVENTORYMouseClicked

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BILLING().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTable BILLING;
    private javax.swing.JTextField BILL_ID;
    private javax.swing.JTextField CUST_ID;
    private javax.swing.JButton ClrBtn;
    private com.toedter.calendar.JDateChooser DATE;
    private javax.swing.JTextField DISCOUNT;
    private javax.swing.JButton DelBtn;
    private javax.swing.JTextField GROSS_PRICE;
    private javax.swing.JButton MenuBtn;
    private javax.swing.JTextField NET_PRICE;
    private javax.swing.JTable PRODUCT_INVENTORY;
    private javax.swing.JTextField PROD_ID;
    private javax.swing.JTextField PROD_NAME;
    private javax.swing.JTextField QUANTITY;
    private javax.swing.JTextField UNIT_PRICE;
    private javax.swing.JButton UpdBtn;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
