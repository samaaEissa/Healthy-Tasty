/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Hp
 */
public class Home extends javax.swing.JFrame {


    /**
     * Creates new form DietForm
     */
    public Home() {
        
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            URL resource = this.getClass().getResource("/Images/grape.png");
            BufferedImage image = ImageIO.read(resource);
            this.setIconImage(image);
        } catch (IOException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AddMeal2 = new javax.swing.JButton();
        order2 = new javax.swing.JButton();
        AddDiet1 = new javax.swing.JButton();
        AddCustomer1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 187, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello beautiful eat healthy");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 28));

        AddMeal2.setBackground(new java.awt.Color(97, 212, 195));
        AddMeal2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AddMeal2.setForeground(new java.awt.Color(255, 255, 255));
        AddMeal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info4.png"))); // NOI18N
        AddMeal2.setText("Add Meal");
        AddMeal2.setBorderPainted(false);
        AddMeal2.setContentAreaFilled(false);
        AddMeal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMeal2ActionPerformed(evt);
            }
        });
        jPanel2.add(AddMeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 40));

        order2.setBackground(new java.awt.Color(97, 212, 195));
        order2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        order2.setForeground(new java.awt.Color(255, 255, 255));
        order2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        order2.setText("Order");
        order2.setBorder(null);
        order2.setBorderPainted(false);
        order2.setContentAreaFilled(false);
        order2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order2ActionPerformed(evt);
            }
        });
        jPanel2.add(order2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 40));

        AddDiet1.setBackground(new java.awt.Color(97, 212, 195));
        AddDiet1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AddDiet1.setForeground(new java.awt.Color(255, 255, 255));
        AddDiet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info3.png"))); // NOI18N
        AddDiet1.setText("Add Diet");
        AddDiet1.setBorderPainted(false);
        AddDiet1.setContentAreaFilled(false);
        AddDiet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDiet1ActionPerformed(evt);
            }
        });
        jPanel2.add(AddDiet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 40));

        AddCustomer1.setBackground(new java.awt.Color(97, 212, 195));
        AddCustomer1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AddCustomer1.setForeground(new java.awt.Color(255, 255, 255));
        AddCustomer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info 5.png"))); // NOI18N
        AddCustomer1.setText("Add Customer");
        AddCustomer1.setBorderPainted(false);
        AddCustomer1.setContentAreaFilled(false);
        AddCustomer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomer1ActionPerformed(evt);
            }
        });
        jPanel2.add(AddCustomer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 480));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/giphy.gif"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 460, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 680, 440));

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMeal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMeal2ActionPerformed
        // TODO add your handling code here:
        AddMealForm mealForm = new  AddMealForm();
        mealForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddMeal2ActionPerformed

    private void order2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order2ActionPerformed
        // TODO add your handling code here:
        MakeAnOrder order1= new MakeAnOrder();
        order1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_order2ActionPerformed

    private void AddDiet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDiet1ActionPerformed
        // TODO add your handling code here:
        AddDiet addDiet =new AddDiet();
        addDiet.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddDiet1ActionPerformed

    private void AddCustomer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomer1ActionPerformed
        // TODO add your handling code here:
        AddCustomer addCustomer =new AddCustomer();
        addCustomer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddCustomer1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomer1;
    private javax.swing.JButton AddDiet1;
    private javax.swing.JButton AddMeal2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton order2;
    // End of variables declaration//GEN-END:variables
}
