/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monal
 */
public class OrderHistory extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    EcoSystem system;
    private UserAccount account;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public OrderHistory(JPanel userProcessContainer, UserAccount account,EcoSystem system) {
        initComponents();
        
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        valueLabel.setText(account.getName());
        //populateTable();
        pastTblPopulate();
        //populateInfo();
        
    }



    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pastTbl = new javax.swing.JTable();
        valueLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshTestJButton.setBackground(new java.awt.Color(8, 34, 137));
        refreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 110, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Customer:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 127, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 310, 26));

        pastTbl.setBackground(new java.awt.Color(8, 34, 137));
        pastTbl.setForeground(new java.awt.Color(255, 255, 255));
        pastTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Restaurant Name", "Amount", "Status", "Delivery Man"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(pastTbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 480, 280));

        valueLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel3.setText("Order History");
        add(valueLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 158, 26));

        backBtn.setText("<<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        pastTblPopulate();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable pastTbl;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel3;
    // End of variables declaration//GEN-END:variables

    private void pastTblPopulate() {
        DefaultTableModel model = (DefaultTableModel) pastTbl.getModel();
        
        model.setRowCount(0);
         
       
          for (Customer cust:system.getCustomerDirectory().getCustList()) {
           
            if (cust.getUserName().equals(account.getUsername())) {
               // System.out.println(restro.getOrderList());
               for(Order order:cust.getOrderList()){
                Object[] row = new Object[4];
                row[0] = order.getOrder_id();
                row[1] = order.getRestaurantName();            
                row[2] = order.getCost();
                row[3] = order.getStatus();
                //row[4] = order.getDeliverMan();
                model.addRow(row);
               }
                
            }
            
        }
        
        
    }
}
