/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapp;

import static guiapp.Dashboard.dtop;
import internalPages.bor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ortega
 */
public class rep extends javax.swing.JFrame {

     
    public rep() {
      
        initComponents();
        
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        addi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        meter = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        up = new javax.swing.JButton();
        del = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-left-30.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 20));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Square Meter", "Postal Code", "Prop. Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, 660, 130));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));

        addi.setBackground(new java.awt.Color(0, 51, 51));
        addi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Address:");
        addi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SqM:");
        addi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        jLabel3.setBackground(new java.awt.Color(51, 153, 255));
        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("P. Code:");
        addi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        meter.setBackground(new java.awt.Color(0, 51, 51));
        meter.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        meter.setForeground(new java.awt.Color(255, 255, 255));
        meter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        meter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 255)));
        meter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meterActionPerformed(evt);
            }
        });
        addi.add(meter, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 270, 30));

        code.setBackground(new java.awt.Color(0, 51, 51));
        code.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        code.setForeground(new java.awt.Color(255, 255, 255));
        code.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        code.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 255)));
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        addi.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 270, 30));

        jLabel7.setBackground(new java.awt.Color(51, 153, 255));
        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Price:");
        addi.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 70, 20));

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.setBorder(null);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        addi.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 70, 30));

        price.setBackground(new java.awt.Color(0, 51, 51));
        price.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 255)));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        addi.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 138, 270, 30));

        address.setBackground(new java.awt.Color(0, 51, 51));
        address.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 255)));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        addi.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 270, 30));

        up.setBackground(new java.awt.Color(0, 0, 0));
        up.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        up.setForeground(new java.awt.Color(255, 255, 255));
        up.setText("Update");
        up.setBorder(null);
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        addi.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 70, 30));

        del.setBackground(new java.awt.Color(0, 0, 0));
        del.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        del.setForeground(new java.awt.Color(255, 255, 255));
        del.setText("Delete");
        del.setBorder(null);
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        addi.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 70, 30));

        jTabbedPane1.addTab("Property Information", addi);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 640, 240));

        clear.setBackground(new java.awt.Color(0, 0, 0));
        clear.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.setBorder(null);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Real Estate page banner (1).jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void meterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meterActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // Add Button
 if((address.getText().equals("") || meter.getText().equals("")) || code.getText().equals("")|| price.getText().equals("")){
            
            JOptionPane.showMessageDialog(this,"NO!");
        } else {
            String data [] = {address.getText(), meter.getText(), code.getText(), price.getText()};   
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(data);
                 JOptionPane.showMessageDialog(this,"Success!");
                address.setText("");
                 meter.setText("");
                 code.setText("");
                 price.setText("");
        }
        
      
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        //Clear Button

        address.setText("");
        meter.setText("");
        code.setText("");
        price.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        
    }//GEN-LAST:event_priceActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        bor down = new bor();
        dtop.add(down).setVisible(true);
        down.setDefaultCloseOperation(rep.DISPOSE_ON_CLOSE); 
    }//GEN-LAST:event_backMouseClicked

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
      String tbladd = (String) tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
      String tblmeter = (String) tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
      String tblcode = (String) tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
      String tblprice = (String) tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
      
      address.setText(tbladd);
      meter.setText(tblmeter);
      code.setText(tblcode);
      price.setText(tblprice);
    }//GEN-LAST:event_jTable1MouseClicked

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 1){
        String ad = address.getText();
         String me = meter.getText();
          String co = code.getText();
           String pr = price.getText();
           
           tblModel.setValueAt(ad, jTable1.getSelectedRow(),0);
           tblModel.setValueAt(me, jTable1.getSelectedRow(),1);
           tblModel.setValueAt(co, jTable1.getSelectedRow(),2);
           tblModel.setValueAt(pr, jTable1.getSelectedRow(),3);
            JOptionPane.showMessageDialog(this,"Updated Successfully!");
                
        }else{
            if(jTable1.getSelectedRowCount() == 0){
                JOptionPane.showMessageDialog(this,"Table is Empty!");
        
        }else{
                 JOptionPane.showMessageDialog(this,"Select Row to Update!");
                }
    }//GEN-LAST:event_upActionPerformed
    }
    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
       DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
       if(jTable1.getSelectedRowCount() == 1){
       tblModel.removeRow(jTable1.getSelectedRow());
       
       }else{
       if(jTable1.getSelectedRowCount() == 0){
         JOptionPane.showMessageDialog(this,"Table is Empty!");
        }else{
        JOptionPane.showMessageDialog(this,"Select Row to Delete!");
       }
       }
    }//GEN-LAST:event_delActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JPanel addi;
    private javax.swing.JTextField address;
    private javax.swing.JLabel back;
    private javax.swing.JButton clear;
    private javax.swing.JTextField code;
    private javax.swing.JButton del;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField meter;
    private javax.swing.JTextField price;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables

  

}