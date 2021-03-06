/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import BusinessLayer.CustomerManneger;
import BusinessLayer.orderMannager;
import DataAccessLayer.DTOClasses.Customer;
import DataAccessLayer.DTOClasses.Diet;
import DataAccessLayer.DTOClasses.Meal;
import DataAccessLayer.DTOClasses.Order;
import DataAccessLayer.Repositories.DietRepository;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class MakeAnOrder extends javax.swing.JFrame {

//     static AddCustomer addCustomer =new AddCustomer();
//   static AddDiet addDiet =new AddDiet();
//   static Home dietForm= new Home();
//   static AddMealForm mealForm = new  AddMealForm();
    orderMannager mannager = new orderMannager();
    CustomerManneger customerManneger = new CustomerManneger();
    Customer customer = null;
    float total = 0.0f;
    boolean state = false;
    Diet diet;
    DietRepository  dietRepository=new DietRepository();
    /**
     * Creates new form AddDietForm
     */
    public MakeAnOrder() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        browse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Diet_name = new javax.swing.JLabel();
        jTextField_Cost = new javax.swing.JTextField();
        btn_remove = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AddMeal2 = new javax.swing.JButton();
        home = new javax.swing.JButton();
        AddDiet1 = new javax.swing.JButton();
        AddCustomer1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tx_phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1230, 591));
        setPreferredSize(new java.awt.Dimension(1230, 591));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 72, 170));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info 2.png"))); // NOI18N
        jLabel10.setText("Phone number :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 150, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 450, 250));

        browse.setBackground(new java.awt.Color(110, 72, 170));
        browse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jPanel3.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 90, -1));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(153, 0, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meal Name", "price"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setGridColor(new java.awt.Color(204, 102, 255));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(150);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 240, 250));

        Diet_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Diet_name.setForeground(new java.awt.Color(128, 0, 128));
        jPanel3.add(Diet_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 140, 30));

        jTextField_Cost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_Cost.setForeground(new java.awt.Color(110, 72, 170));
        jTextField_Cost.setText("0.0");
        jPanel3.add(jTextField_Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 120, 30));

        btn_remove.setBackground(new java.awt.Color(110, 72, 170));
        btn_remove.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel3.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 130, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hello beautiful eat healthy");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 28));

        AddMeal2.setBackground(new java.awt.Color(97, 212, 195));
        AddMeal2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AddMeal2.setForeground(new java.awt.Color(255, 255, 255));
        AddMeal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info4.png"))); // NOI18N
        AddMeal2.setText("AddMeal");
        AddMeal2.setBorderPainted(false);
        AddMeal2.setContentAreaFilled(false);
        AddMeal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMeal2ActionPerformed(evt);
            }
        });
        jPanel4.add(AddMeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, 40));

        home.setBackground(new java.awt.Color(97, 212, 195));
        home.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info.png"))); // NOI18N
        home.setText("Home");
        home.setBorder(null);
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel4.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 40));

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
        jPanel4.add(AddDiet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 40));

        AddCustomer1.setBackground(new java.awt.Color(97, 212, 195));
        AddCustomer1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AddCustomer1.setForeground(new java.awt.Color(255, 255, 255));
        AddCustomer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info 5.png"))); // NOI18N
        AddCustomer1.setText("Add customer");
        AddCustomer1.setBorderPainted(false);
        AddCustomer1.setContentAreaFilled(false);
        AddCustomer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomer1ActionPerformed(evt);
            }
        });
        jPanel4.add(AddCustomer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 480));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(110, 72, 170));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info3.png"))); // NOI18N
        jLabel3.setText("Diet name :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        tx_phone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(tx_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 220, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(110, 72, 170));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_restaurant_menu_93247.png"))); // NOI18N
        jLabel6.setText("Menu");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(110, 72, 170));
        jLabel7.setText("Total Price : ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, 30));

        done.setBackground(new java.awt.Color(110, 72, 170));
        done.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        jPanel3.add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 110, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 970, -1));

        jPanel1.setBackground(new java.awt.Color(110, 72, 170));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
        //Clear Data
        jPanel2.removeAll();       
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        int rowCount = dm.getRowCount();
         //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
         jTextField_Cost.setText("0.0");
        //------------------------       
        ArrayList<Meal> meals = new ArrayList<Meal>();
        String phone = tx_phone.getText();
        if (phone == null || phone.length() == 0) {
            JOptionPane.showMessageDialog(null, "please enter phone number");
            return;
        }
        customer = customerManneger.getCustomer(phone);
        if (customer == null) {
            JOptionPane.showMessageDialog(null, "somthing is wrong please re enter phone number");
            return;
        }
        diet=dietRepository.GetById(customer.getDietID());
        
        Diet_name.setText(""+diet.getName());
        meals = customerManneger.getCustomerMeals(phone);
        if (!meals.isEmpty()) {
            for (Meal m : meals) {
                //  System.out.print("Welcome");
                JButton btn = new JButton();

                btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                btn.setIcon(new ImageIcon(m.getImage()));
                btn.setToolTipText(m.getName());
                //                btn.setText(m.getName());

                //  jPanel5.setLayout(new java.awt.GridLayout(20, 1));
                btn.addActionListener(new java.awt.event.ActionListener() {

                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Order order = new Order();
                        order.setCustomerId(customer.getID());
                        order.setMealId(m.getID());
                        state = mannager.ordering(order);
                        if (state == true) {
                            total += 0;
                        } else {
                            total += m.getPrice();
                        }
                        Vector rowData = new Vector();
                        rowData.add(m.getName());
                        rowData.add(m.getPrice());
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(rowData);
                        jTable1.validate();
                        JLabel jLabel2 = new JLabel();
                        jLabel2.setText("   total cost =  " + total);
                        jTextField_Cost.setText(total + "");
                        pack();
                    }
                });

                jPanel2.add(btn);
            }
        } else {
            JOptionPane.showMessageDialog(null, "the meals of this diet is not added to the system yet");
        }
        this.pack();
    }//GEN-LAST:event_browseActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            // remove selected row from the model
            int selectedRowIndex = jTable1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            float price = (float) model.getValueAt(selectedRowIndex, 1);
            total = total - price;
            jTextField_Cost.setText(total + "");
            model.removeRow(selectedRowIndex);
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void AddMeal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMeal2ActionPerformed
        // TODO add your handling code here:
        AddMealForm mealForm = new  AddMealForm();
        mealForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddMeal2ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Home dietForm= new Home();
        dietForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

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

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "the total price is :"+ total+"$ bon appétit");
        Home dietForm= new Home();
        dietForm.setVisible(true);
         this.setVisible(false);
        
    }//GEN-LAST:event_doneActionPerformed

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
            java.util.logging.Logger.getLogger(MakeAnOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeAnOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeAnOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeAnOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeAnOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomer1;
    private javax.swing.JButton AddDiet1;
    private javax.swing.JButton AddMeal2;
    private javax.swing.JLabel Diet_name;
    private javax.swing.JButton browse;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton done;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Cost;
    private javax.swing.JTextField tx_phone;
    // End of variables declaration//GEN-END:variables
}
