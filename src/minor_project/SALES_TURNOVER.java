
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

public class SALES_TURNOVER extends javax.swing.JFrame {


    public SALES_TURNOVER() {
        initComponents();
        SelectMed();
    }

    public void SelectMed()
{
    try{
    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
    st = con.createStatement();
    Rs = st.executeQuery("Select * from root.SALES_TURNOVER");
    SALES_TURNOVER.setModel(DbUtils.resultSetToTableModel(Rs));
    }
    catch(SQLException e){
        e.printStackTrace();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SALES_ID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DAY = new javax.swing.JTextField();
        JLABEL4 = new javax.swing.JLabel();
        PROFIT_MARGIN = new javax.swing.JTextField();
        SALES_QTY = new javax.swing.JTextField();
        NET_SALES = new javax.swing.JTextField();
        MenuBtn = new javax.swing.JButton();
        UpdBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        DATE = new com.toedter.calendar.JDateChooser();
        AddBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ClrBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SALES_TURNOVER = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(202, 182, 175));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SALES_ID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        SALES_ID.setForeground(new java.awt.Color(74, 26, 0));
        SALES_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALES_IDActionPerformed(evt);
            }
        });
        jPanel1.add(SALES_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 40));

        jLabel7.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(53, 114, 124));
        jLabel7.setText("SALES_ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(53, 114, 124));
        jLabel8.setText("DATE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(53, 114, 124));
        jLabel6.setText("DAY");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(53, 114, 124));
        jLabel5.setText("PROFIT_MARGIN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 114, 124));
        jLabel3.setText("SALES_QTY");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        DAY.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        DAY.setForeground(new java.awt.Color(74, 26, 0));
        jPanel1.add(DAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 180, 40));

        JLABEL4.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        JLABEL4.setForeground(new java.awt.Color(53, 114, 124));
        JLABEL4.setText("NET_SALES");
        jPanel1.add(JLABEL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        PROFIT_MARGIN.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        PROFIT_MARGIN.setForeground(new java.awt.Color(74, 26, 0));
        jPanel1.add(PROFIT_MARGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 180, 40));

        SALES_QTY.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        SALES_QTY.setForeground(new java.awt.Color(74, 26, 0));
        jPanel1.add(SALES_QTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 180, 40));

        NET_SALES.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        NET_SALES.setForeground(new java.awt.Color(74, 26, 0));
        jPanel1.add(NET_SALES, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 180, 40));

        MenuBtn.setBackground(new java.awt.Color(192, 148, 83));
        MenuBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        MenuBtn.setText("MENU");
        MenuBtn.setOpaque(true);
        MenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBtnMouseClicked(evt);
            }
        });
        jPanel1.add(MenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 120, 40));

        UpdBtn.setBackground(new java.awt.Color(192, 148, 83));
        UpdBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        UpdBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdBtn.setText("UPDATE");
        UpdBtn.setOpaque(true);
        UpdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdBtnMouseClicked(evt);
            }
        });
        jPanel1.add(UpdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 120, 40));

        DelBtn.setBackground(new java.awt.Color(192, 148, 83));
        DelBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        DelBtn.setForeground(new java.awt.Color(255, 255, 255));
        DelBtn.setText("DELETE");
        DelBtn.setOpaque(true);
        DelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelBtnMouseClicked(evt);
            }
        });
        jPanel1.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 120, 40));
        jPanel1.add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 40));

        AddBtn.setBackground(new java.awt.Color(192, 148, 83));
        AddBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.setOpaque(true);
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 120, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/geet/Desktop/PHARMACY/SALESTURNOVER.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 540, 510));

        ClrBtn.setBackground(new java.awt.Color(192, 148, 83));
        ClrBtn.setFont(new java.awt.Font("Futura-Bold", 1, 20)); // NOI18N
        ClrBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClrBtn.setText("CLEAR");
        ClrBtn.setOpaque(true);
        ClrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClrBtnMouseClicked(evt);
            }
        });
        jPanel1.add(ClrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 120, 40));

        jLabel2.setFont(new java.awt.Font("Futura-Bold", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 114, 124));
        jLabel2.setText("SALES TURNOVER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 50));

        SALES_TURNOVER.setBackground(new java.awt.Color(225, 201, 189));
        SALES_TURNOVER.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        SALES_TURNOVER.setForeground(new java.awt.Color(53, 114, 124));
        SALES_TURNOVER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "SALES_ID", "DATE", "DAY", "PROFIT_MARGIN", "SALES_QTY", "NET_SALES"
            }
        ));
        SALES_TURNOVER.setRowHeight(25);
        SALES_TURNOVER.setSelectionBackground(new java.awt.Color(251, 213, 144));
        SALES_TURNOVER.setSelectionForeground(new java.awt.Color(53, 114, 124));
        SALES_TURNOVER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALES_TURNOVERMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SALES_TURNOVER);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 970, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    Connection con = null;
    Statement st = null ;
    ResultSet Rs = null ;
    java.util.Date Dt;
    java.sql.Date MyDate; 
    
    private void SALES_TURNOVERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALES_TURNOVERMouseClicked
        DefaultTableModel model = (DefaultTableModel)SALES_TURNOVER.getModel();
        int index = SALES_TURNOVER.getSelectedRow();
        SALES_ID.setText(model.getValueAt(index, 0).toString());
        DAY.setText(model.getValueAt(index, 2).toString());
        PROFIT_MARGIN.setText(model.getValueAt(index, 3).toString());
        SALES_QTY.setText(model.getValueAt(index, 4).toString());
        NET_SALES.setText(model.getValueAt(index, 5).toString());
    }//GEN-LAST:event_SALES_TURNOVERMouseClicked

    private void SALES_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALES_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SALES_IDActionPerformed

    private void MenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseClicked
        new MENU().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuBtnMouseClicked

    private void UpdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdBtnMouseClicked
//                           JOptionPane.showMessageDialog(this, "Cannot add record because Date is empty!");

        if(SALES_ID.getText().isEmpty()||DAY.getText().isEmpty()|| PROFIT_MARGIN.getText().isEmpty()|| SALES_QTY.getText().isEmpty()|| NET_SALES.getText().isEmpty())
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
                String updateQuery = "UPDATE root.SALES_TURNOVER SET DATE = ?,DAY = ?, PROFIT_MARGIN= ?, SALES_QTY= ?, NET_SALES= ? WHERE SALES_ID = ?";
                PreparedStatement updateStatement = con.prepareStatement(updateQuery);
                updateStatement.setDate(1, MyDate);
                updateStatement.setString(2, DAY.getText());
                updateStatement.setInt(3, Integer.parseInt(PROFIT_MARGIN.getText()));
                updateStatement.setInt(4, Integer.parseInt(SALES_QTY.getText()));
                updateStatement.setInt(5, Integer.parseInt(NET_SALES.getText()));
                updateStatement.setInt(6, Integer.parseInt(SALES_ID.getText()));

                int rowsAffected = updateStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "SALES RECORDS updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update SALES RECORDS.");
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
        if(SALES_ID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the SALES ID to be deleted");

        }
        else
        {
            try{
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                String id = SALES_ID.getText();
                String Query= "delete from root.SALES_TURNOVER where SALES_ID = "+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this,"SALES RECORDS deleted successfully!");
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DelBtnMouseClicked

    private void ClrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClrBtnMouseClicked
        SALES_ID.setText("");
        DAY.setText("");
        PROFIT_MARGIN.setText("");
        SALES_QTY.setText("");
        NET_SALES.setText("");
    }//GEN-LAST:event_ClrBtnMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(SALES_ID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Cannot add record because Sales ID is empty!");
            }
        else if(DATE.getDate()==null)
                {
                   JOptionPane.showMessageDialog(this, "Cannot add record because Date is empty!");
                }
        else{
            try{
                // Check if the dealer ID already exists
                PreparedStatement checkIdStmt = con.prepareStatement("SELECT COUNT(*) FROM SALES_TURNOVER WHERE SALES_ID = ?");
                checkIdStmt.setInt(1, Integer.parseInt(SALES_ID.getText()));
                ResultSet idResult = checkIdStmt.executeQuery();
                idResult.next();
                int idCount = idResult.getInt(1);
                
                if (idCount > 0) {
                    JOptionPane.showMessageDialog(this, "SALES ID already exists!");
                }
                else
                {              
                    Dt = DATE.getDate();
                    MyDate = new java.sql.Date(Dt.getTime());
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDb","root","Geet@2004");
                    PreparedStatement add = con.prepareStatement("Insert into SALES_TURNOVER values(?,?,?,?,?,?)");
                    add.setInt(1, Integer.parseInt(SALES_ID.getText()));
                    add.setString(3,DAY.getText());
                    add.setInt(4, Integer.parseInt(PROFIT_MARGIN.getText()));
                    add.setInt(5, Integer.parseInt(SALES_QTY.getText()));
                    add.setInt(6, Integer.parseInt(NET_SALES.getText()));
                    add.setDate(2 ,MyDate);

                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Sales Record successfully added!");
                    con.close();
                }
              
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            SelectMed();
        }

    }//GEN-LAST:event_AddBtnMouseClicked


    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALES_TURNOVER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClrBtn;
    private com.toedter.calendar.JDateChooser DATE;
    private javax.swing.JTextField DAY;
    private javax.swing.JButton DelBtn;
    private javax.swing.JLabel JLABEL4;
    private javax.swing.JButton MenuBtn;
    private javax.swing.JTextField NET_SALES;
    private javax.swing.JTextField PROFIT_MARGIN;
    private javax.swing.JTextField SALES_ID;
    private javax.swing.JTextField SALES_QTY;
    private javax.swing.JTable SALES_TURNOVER;
    private javax.swing.JButton UpdBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
