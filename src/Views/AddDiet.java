/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DataAccessLayer.DTOClasses.Diet;
import DataAccessLayer.Repositories.DietRepository;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class AddDiet extends javax.swing.JFrame {

//     static AddCustomer addCustomer =new AddCustomer();
//      static Home dietForm= new Home();
//   static AddMealForm mealForm = new  AddMealForm();
//   static MakeAnOrder order1= new MakeAnOrder();
   Diet diet=new Diet();
    DietRepository dietRepository= new DietRepository();
   
    /**
     * Creates new form AddDiet
     */
    public AddDiet() {
        //initComponents();
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
        AddCustomer = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        addDiet = new javax.swing.JButton();
        carb = new javax.swing.JTextField();
        proutin = new javax.swing.JTextField();
        fat = new javax.swing.JTextField();
        mineral = new javax.swing.JTextField();
        vits = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        describe = new javax.swing.JTextArea();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 590));
        setPreferredSize(new java.awt.Dimension(1030, 590));
        setResizable(false);
        setSize(new java.awt.Dimension(1030, 590));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel2.add(AddMeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 40));

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
        jPanel2.add(order2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 40));

        AddCustomer.setBackground(new java.awt.Color(97, 212, 195));
        AddCustomer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        AddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info 5.png"))); // NOI18N
        AddCustomer.setText("Add Customer");
        AddCustomer.setBorderPainted(false);
        AddCustomer.setContentAreaFilled(false);
        AddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerActionPerformed(evt);
            }
        });
        jPanel2.add(AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 180, 40));

        Home.setBackground(new java.awt.Color(97, 212, 195));
        Home.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info.png"))); // NOI18N
        Home.setText("Home");
        Home.setBorderPainted(false);
        Home.setContentAreaFilled(false);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel2.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 520));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jLabel1.setText("Carb Percent");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 130, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Add Diet ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 110, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jLabel11.setText("Proutin Percent");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 150, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jLabel12.setText("vitamin Percent");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 160, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jLabel13.setText("Minerals Percent");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 160, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jLabel14.setText("Fat Percent");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 140, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jLabel15.setText("Description");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 140, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jLabel16.setText("Name ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 110, 30));

        addDiet.setBackground(new java.awt.Color(110, 72, 170));
        addDiet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        addDiet.setText("Add Diet");
        addDiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDietActionPerformed(evt);
            }
        });
        jPanel1.add(addDiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 180, 30));

        carb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        carb.setBorder(null);
        jPanel1.add(carb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 210, 30));

        proutin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        proutin.setBorder(null);
        jPanel1.add(proutin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 210, 30));

        fat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fat.setBorder(null);
        jPanel1.add(fat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 210, 40));

        mineral.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mineral.setBorder(null);
        jPanel1.add(mineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 210, 30));

        vits.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        vits.setBorder(null);
        jPanel1.add(vits, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 210, 30));

        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name.setBorder(null);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 210, 30));

        describe.setColumns(20);
        describe.setRows(5);
        describe.setBorder(null);
        jScrollPane1.setViewportView(describe);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 210, 100));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 210, 10));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 210, 10));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 210, 10));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 210, 10));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 210, 10));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 210, 10));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(130, 50, 720, 470);

        jPanel3.setBackground(new java.awt.Color(110, 72, 170));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1060, 620);

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

    private void AddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerActionPerformed
        // TODO add your handling code here:
        AddCustomer addCustomer =new AddCustomer();
        addCustomer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddCustomerActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        Home dietForm= new Home();
        dietForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeActionPerformed

    private void addDietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDietActionPerformed
        if (name == null ||name.getText().length()== 0) {
            JOptionPane.showMessageDialog(null, "please enter diet name");
            return;
        }
         if (carb == null ||carb.getText().length()== 0) {
            JOptionPane.showMessageDialog(null, "please enter Carbs percent");
            return;
        }
          if (fat == null ||fat.getText().length()== 0) {
            JOptionPane.showMessageDialog(null, "please enter fats percent");
            return;
        }
           if (proutin == null ||proutin.getText().length()== 0) {
            JOptionPane.showMessageDialog(null, "please enter proutins percent");
            return;
        }
            if (vits == null ||vits.getText().length()== 0) {
            JOptionPane.showMessageDialog(null, "please enter Vitamins percent");
            return;
        }
             if (mineral == null ||mineral.getText().length()== 0) {
            JOptionPane.showMessageDialog(null, "please enter minerals percent");
            return;
        }
             if (describe == null ||describe.getText().length()== 0) {
            JOptionPane.showMessageDialog(null, "please enter describtion");
            return;
        }
             try{
            int carbs= Integer.parseInt(carb.getText());
            int fats= Integer.parseInt(fat.getText());
            int prtn= Integer.parseInt(proutin.getText());
            int vit= Integer.parseInt(vits.getText());
            int mini= Integer.parseInt(mineral.getText());
             diet.setName(name.getText());
            diet.setCarbPercent(carbs);
            diet.setFatPercent(fats);
            diet.setProutinPercent(prtn);
            diet.setVitaminPercent(vit);
            diet.setMineralsPercent(mini);}
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null, "please enter numeric values for diet percentages");
                 return;
             }
            
            diet.setDescription(describe.getText());
            dietRepository.Save(diet);
            JOptionPane.showMessageDialog(null, "new diet is added");
            Home dietForm= new Home();
            dietForm.setVisible(true);
              this.setVisible(false);
    }//GEN-LAST:event_addDietActionPerformed

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
            java.util.logging.Logger.getLogger(AddDiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDiet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomer;
    private javax.swing.JButton AddMeal2;
    private javax.swing.JButton Home;
    private javax.swing.JButton addDiet;
    private javax.swing.JTextField carb;
    private javax.swing.JTextArea describe;
    private javax.swing.JTextField fat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JTextField mineral;
    private javax.swing.JTextField name;
    private javax.swing.JButton order2;
    private javax.swing.JTextField proutin;
    private javax.swing.JTextField vits;
    // End of variables declaration//GEN-END:variables
}