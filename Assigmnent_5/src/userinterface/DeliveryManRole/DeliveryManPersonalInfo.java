/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import userinterface.CustomerRole.*;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author manthanwadiwala
 */
public class DeliveryManPersonalInfo extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    EcoSystem system;
    private UserAccount account;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DeliveryManPersonalInfo(JPanel userProcessContainer, UserAccount account,EcoSystem system) {
        initComponents();
        
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        valueLabel.setText(account.getName());
        //populateTable();
        //pastTblPopulate();
        populateInfo();
        
    }

    public void populateInfo(){
        for (DeliveryMan d:system.getDeliveryManDirectory().getDeliveryManList()) {
           
            if (d.getUserName().equals(account.getUsername())) {
                     jTextField2.setText(d.getNumber());
            }
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

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        valueLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Delivery Man:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 127, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 310, 26));

        valueLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel2.setText("Your Information");
        add(valueLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 158, 26));

        jButton1.setBackground(new java.awt.Color(8, 34, 137));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 170, -1));

        jLabel1.setText("Contact Number: *");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 30));

        backBtn.setBackground(new java.awt.Color(8, 34, 137));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
       
        String contact=jTextField2.getText();
        
        
        if(contact.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill the mandatory fields!");
        }
        else
        {
              
            String regex = "\\d{10}"; //regex for 10 digits
          
            if(contact.matches(regex))
            {
                for (DeliveryMan d: system.getDeliveryManDirectory().getDeliveryManList()) {
                    if (d.getUserName().equals(account.getUsername())) {
                        d.setNumber(contact);
                        JOptionPane.showMessageDialog(this,"Personal Information updated successfully!");
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid phone number format.");                
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel2;
    // End of variables declaration//GEN-END:variables

}
