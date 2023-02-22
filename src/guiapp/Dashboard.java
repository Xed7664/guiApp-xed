/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapp;
import java.awt.Color; 
import internalPages.*;
/**
 *
 * @author SCC-COLLEGE
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }
 Color navcolor = new Color(153,0,51);
 Color headcolor = new Color(0,51,102);
 Color bodycolor = new Color(153,204,255);   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        dashpane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userpane1 = new javax.swing.JPanel();
        userpane = new javax.swing.JLabel();
        reportpane = new javax.swing.JPanel();
        userpane3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        dtop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(153, 0, 51));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashpane.setBackground(new java.awt.Color(153, 0, 51));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        dashpane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        navbar.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 40));

        userpane1.setBackground(new java.awt.Color(153, 0, 51));
        userpane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpane1MouseExited(evt);
            }
        });
        userpane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userpane.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        userpane.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userpane.setText("USER PAGE");
        userpane1.add(userpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        navbar.add(userpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, 40));

        reportpane.setBackground(new java.awt.Color(153, 0, 51));
        reportpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportpaneMouseExited(evt);
            }
        });
        reportpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userpane3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        userpane3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userpane3.setText("REPORTS");
        reportpane.add(userpane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        navbar.add(reportpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, 40));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 140, 410);

        header.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(header);
        header.setBounds(140, 0, 620, 60);

        dtop.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout dtopLayout = new javax.swing.GroupLayout(dtop);
        dtop.setLayout(dtopLayout);
        dtopLayout.setHorizontalGroup(
            dtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        dtopLayout.setVerticalGroup(
            dtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel1.add(dtop);
        dtop.setBounds(140, 60, 620, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dashpaneMouseClicked

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
       dashpane.setBackground(bodycolor);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
       dashpane.setBackground(navcolor);
    }//GEN-LAST:event_dashpaneMouseExited

    private void userpane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane1MouseClicked
        userPage down = new userPage();
        dtop.add(down).setVisible(true);
    }//GEN-LAST:event_userpane1MouseClicked

    private void userpane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane1MouseEntered
        userpane1.setBackground(bodycolor);
    }//GEN-LAST:event_userpane1MouseEntered

    private void userpane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane1MouseExited
        userpane1.setBackground(navcolor);
    }//GEN-LAST:event_userpane1MouseExited

    private void reportpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpaneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reportpaneMouseClicked

    private void reportpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpaneMouseEntered
        reportpane.setBackground(bodycolor);
    }//GEN-LAST:event_reportpaneMouseEntered

    private void reportpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpaneMouseExited
        reportpane.setBackground(navcolor);
    }//GEN-LAST:event_reportpaneMouseExited

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashpane;
    private javax.swing.JDesktopPane dtop;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel reportpane;
    private javax.swing.JLabel userpane;
    private javax.swing.JPanel userpane1;
    private javax.swing.JLabel userpane3;
    // End of variables declaration//GEN-END:variables
}