
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

public class PRODUCT_INVENTORY extends javax.swing.JFrame {


    public PRODUCT_INVENTORY() {
        initComponents();
        SelectMed();
        fillDealerIds(); 
    }
    
    
   private PreparedStatement pst = null;
   private ResultSet rs = null;
    
    
 // Method to populate dealer IDs dropdown  
    public void fillDealerIds() {
    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "root", "Geet@2004");
        String query = "SELECT DISTINCT D_ID FROM DEALERS"; // Query to fetch distinct dealer IDs
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        DefaultComboBoxModel model = new DefaultComboBoxModel();
        while (rs.next()) {
            int dealerId = rs.getInt("D_ID");
            model.addElement(dealerId);
        }
        DEALER_ID.setModel(model); // Set the model to the JComboBox
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
//            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
    
    
    Connection con = null;
    Statement st = null ;
    ResultSet Rs = null ;
    java.util.Date Dt;
    java.sql.Date MyDate; 
    
    public void SelectMed()
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PRODUCT_INVENTORY = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DESCRIPTION = new javax.swing.JTextField();
        PRICE = new javax.swing.JTextField();
        STRENGTH = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        ORDER_QTY = new javax.swing.JTextField();
        IN_QTY = new javax.swing.JTextField();
        P_ID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        UpdBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        ClrBtn = new javax.swing.JButton();
        EXP_DATE = new com.toedter.calendar.JDateChooser();
        MenuBtn = new javax.swing.JButton();
        DEALER_ID = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Futura-Bold", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(143, 48, 40));
        jLabel3.setText("INVENTORY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Futura-Bold", 1, 45)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(143, 48, 40));
        jLabel4.setText("PRODUCT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(47, 52, 55));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRODUCT_INVENTORY.setBackground(new java.awt.Color(47, 52, 55));
        PRODUCT_INVENTORY.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        PRODUCT_INVENTORY.setForeground(new java.awt.Color(238, 235, 233));
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
        PRODUCT_INVENTORY.setSelectionBackground(new java.awt.Color(143, 48, 40));
        PRODUCT_INVENTORY.setSelectionForeground(new java.awt.Color(255, 255, 255));
        PRODUCT_INVENTORY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRODUCT_INVENTORYMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PRODUCT_INVENTORY);
        if (PRODUCT_INVENTORY.getColumnModel().getColumnCount() > 0) {
            PRODUCT_INVENTORY.getColumnModel().getColumn(0).setPreferredWidth(15);
            PRODUCT_INVENTORY.getColumnModel().getColumn(2).setPreferredWidth(50);
            PRODUCT_INVENTORY.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 760, 90));

        jLabel9.setBackground(new java.awt.Color(203, 206, 211));
        jLabel9.setFont(new java.awt.Font("Futura-Bold", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(203, 206, 211));
        jLabel9.setText("PRODUCT_ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 20));

        jLabel10.setFont(new java.awt.Font("Futura-Bold", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(203, 206, 211));
        jLabel10.setText("CATALOGUE_DESCRIPTION");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Futura-Bold", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(203, 206, 211));
        jLabel8.setText("ORDERED_QUANTITY");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Futura-Bold", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(203, 206, 211));
        jLabel5.setText("EXP_DATE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Futura-Bold", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(203, 206, 211));
        jLabel6.setText("DEALER_ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Futura-Bold", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(203, 206, 211));
        jLabel7.setText("STRENGTH");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Futura-Bold", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(203, 206, 211));
        jLabel2.setText("PRICE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        DESCRIPTION.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        DESCRIPTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESCRIPTIONActionPerformed(evt);
            }
        });
        jPanel1.add(DESCRIPTION, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 240, 40));

        PRICE.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(PRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 240, 40));

        STRENGTH.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(STRENGTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 240, 40));

        AddBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(143, 48, 40));
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
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, 40));

        ORDER_QTY.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(ORDER_QTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 240, 40));

        IN_QTY.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(IN_QTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 240, 40));

        P_ID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(P_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 240, 40));

        jLabel14.setFont(new java.awt.Font("Futura-Bold", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(203, 206, 211));
        jLabel14.setText("INSTOCK_QUANTITY");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        UpdBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        UpdBtn.setForeground(new java.awt.Color(143, 48, 40));
        UpdBtn.setText("UPDATE");
        UpdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdBtnMouseClicked(evt);
            }
        });
        jPanel1.add(UpdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 120, 40));

        DelBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        DelBtn.setForeground(new java.awt.Color(143, 48, 40));
        DelBtn.setText("DELETE");
        DelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelBtnMouseClicked(evt);
            }
        });
        jPanel1.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 120, 40));

        ClrBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        ClrBtn.setForeground(new java.awt.Color(143, 48, 40));
        ClrBtn.setText("CLEAR");
        ClrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClrBtnMouseClicked(evt);
            }
        });
        jPanel1.add(ClrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 120, 40));
        jPanel1.add(EXP_DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 240, 40));

        MenuBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(143, 48, 40));
        MenuBtn.setText("MENU");
        MenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBtnMouseClicked(evt);
            }
        });
        jPanel1.add(MenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 120, 40));

        DEALER_ID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPanel1.add(DEALER_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 240, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 800, 650));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        jLabel11.setIcon(new javax.swing.ImageIcon("/Users/geet/Desktop/PHARMACY/medicinebox.jpg")); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 390, 580));

        jPanel2.setBackground(new java.awt.Color(47, 52, 55));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 100));

        jPanel4.setBackground(new java.awt.Color(47, 52, 55));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 380, 100));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DESCRIPTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESCRIPTIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DESCRIPTIONActionPerformed

   
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        
        
        if(P_ID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Cannot add record because Product ID is empty!");
            }
        else if(EXP_DATE.getDate()==null)
                {
                   JOptionPane.showMessageDialog(this, "Cannot add record because Date is empty!");
                }
        else{
            try{
                // Check if the dealer ID already exists
                    PreparedStatement checkIdStmt = con.prepareStatement("SELECT COUNT(*) FROM PRODUCT_INVENTORY WHERE P_ID = ?");
                    checkIdStmt.setInt(1, Integer.parseInt(P_ID.getText()));
                    ResultSet idResult = checkIdStmt.executeQuery();
                    idResult.next();
                    int idCount = idResult.getInt(1);
                
                if (idCount > 0) {
                    JOptionPane.showMessageDialog(this, "Product ID already exists!");
                }
                else{
                    Dt = EXP_DATE.getDate();
                    MyDate = new java.sql.Date(Dt.getTime());
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                    PreparedStatement add = con.prepareStatement("Insert into PRODUCT_INVENTORY values(?,?,?,?,?,?,?,?)");
                    add.setInt(1, Integer.parseInt(P_ID.getText()));
                    add.setString(2,DESCRIPTION.getText());
                    add.setString(3,STRENGTH.getText());
                    add.setInt(4, Integer.parseInt(PRICE.getText()));
                    add.setString(5, DEALER_ID.getSelectedItem().toString());
//                    add.setInt(5, Integer.parseInt(DEALER_ID.getText()));
                    add.setInt(6, Integer.parseInt(ORDER_QTY.getText()));
                    add.setInt(7, Integer.parseInt(IN_QTY.getText()));
                    add.setDate(8 ,MyDate);

                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"PRODUCT Record successfully added!");
                    con.close();
                }                                         
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this,"Cannot add record. CONNECTION ISSUES!");
                e.printStackTrace();
            }
            SelectMed();
        }

    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdBtnMouseClicked
        if(P_ID.getText().isEmpty()||DESCRIPTION.getText().isEmpty()|| STRENGTH.getText().isEmpty()|| PRICE.getText().isEmpty()|| ORDER_QTY.getText().isEmpty()|| IN_QTY.getText().isEmpty())
          {
                JOptionPane.showMessageDialog(this,"MISSING INFORMATION!");       
          } 
        else if(EXP_DATE.getDate() == null)
        {
            JOptionPane.showMessageDialog(this, "Cannot update record because Date is empty!");
        }
        else {
            try {
            Dt = EXP_DATE.getDate();
            MyDate = new java.sql.Date(Dt.getTime());
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb", "root", "Geet@2004");
            String updateQuery = "UPDATE root.PRODUCT_INVENTORY SET DESCRIPTION = ?,STRENGTH = ?,PRICE =? , DEALER_ID = ?, ORDER_QTY= ?, IN_QTY= ?, EXP_DATE= ? WHERE P_ID = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateQuery);           
            updateStatement.setString(1, DESCRIPTION.getText());
            updateStatement.setString(2, STRENGTH.getText());;
            updateStatement.setInt(3, Integer.parseInt(PRICE.getText()));
            updateStatement.setString(4, DEALER_ID.getSelectedItem().toString());
//            updateStatement.setInt(4, Integer.parseInt(DEALER_ID.getText()));
            updateStatement.setInt(5, Integer.parseInt(ORDER_QTY.getText()));
            updateStatement.setInt(6, Integer.parseInt(IN_QTY.getText()));
            updateStatement.setDate(7, MyDate);
            updateStatement.setInt(8, Integer.parseInt(P_ID.getText()));

                 
            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "PRODUCT RECORDS updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update PRODUCT RECORDS.");       
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
        P_ID.setText("");
        DESCRIPTION.setText("");
        STRENGTH.setText("");
        PRICE.setText("");
//        DEALER_ID.setText("");
        ORDER_QTY.setText("");
        IN_QTY.setText("");
    }//GEN-LAST:event_ClrBtnMouseClicked

    private void DelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelBtnMouseClicked
        if(P_ID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the PRODUCT ID to be deleted");
            
        }
        else
        {
            try{
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                String id = P_ID.getText();
                String Query= "delete from root.PRODUCT_INVENTORY where P_ID = "+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this,"PRODUCT RECORDS deleted successfully!");
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DelBtnMouseClicked

    private void PRODUCT_INVENTORYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRODUCT_INVENTORYMouseClicked
        DefaultTableModel model = (DefaultTableModel)PRODUCT_INVENTORY.getModel();
        int index = PRODUCT_INVENTORY.getSelectedRow();
        P_ID.setText(model.getValueAt(index, 0).toString());
        DESCRIPTION.setText(model.getValueAt(index, 1).toString());
        STRENGTH.setText(model.getValueAt(index, 2).toString());
        PRICE.setText(model.getValueAt(index, 3).toString());
//        DEALER_ID.setText(model.getValueAt(index, 4).toString());
        ORDER_QTY.setText(model.getValueAt(index, 5).toString());
        IN_QTY.setText(model.getValueAt(index, 6).toString());
        EXP_DATE.setDate(Dt);

    }//GEN-LAST:event_PRODUCT_INVENTORYMouseClicked

    private void MenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseClicked
        new MENU().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuBtnMouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCT_INVENTORY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClrBtn;
    private javax.swing.JComboBox<String> DEALER_ID;
    private javax.swing.JTextField DESCRIPTION;
    private javax.swing.JButton DelBtn;
    private com.toedter.calendar.JDateChooser EXP_DATE;
    private javax.swing.JTextField IN_QTY;
    private javax.swing.JButton MenuBtn;
    private javax.swing.JTextField ORDER_QTY;
    private javax.swing.JTextField PRICE;
    private javax.swing.JTable PRODUCT_INVENTORY;
    private javax.swing.JTextField P_ID;
    private javax.swing.JTextField STRENGTH;
    private javax.swing.JButton UpdBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
