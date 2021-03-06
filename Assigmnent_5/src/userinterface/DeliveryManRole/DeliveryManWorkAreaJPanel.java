

package userinterface.DeliveryManRole;


import userinterface.CustomerRole.*;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author manthanwadiwala
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
 
    
    /** Creates new form AdminWorkAreaJPanel */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        //this.restaurant=restaurant;
        //this.account=account;
      
        valueLabel.setText(account.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        updateInfoBtn = new javax.swing.JButton();
        assignedOrderButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area - Delivery Man Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        updateInfoBtn.setBackground(new java.awt.Color(8, 34, 137));
        updateInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateInfoBtn.setText("Update Personal Info");
        updateInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInfoBtnActionPerformed(evt);
            }
        });
        add(updateInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 310, -1));

        assignedOrderButton.setBackground(new java.awt.Color(8, 34, 137));
        assignedOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        assignedOrderButton.setText("View Assigned Orders");
        assignedOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignedOrderButtonActionPerformed(evt);
            }
        });
        add(assignedOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 310, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Delivery Man:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void updateInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInfoBtnActionPerformed
        DeliveryManPersonalInfo personalInfo=new DeliveryManPersonalInfo(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",personalInfo);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updateInfoBtnActionPerformed

    private void assignedOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignedOrderButtonActionPerformed
        AssignedOrdersJPanel assignedOrdersPanel=new AssignedOrdersJPanel(userProcessContainer,account,system);
        userProcessContainer.add("Assigned Orders",assignedOrdersPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_assignedOrderButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignedOrderButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton updateInfoBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
