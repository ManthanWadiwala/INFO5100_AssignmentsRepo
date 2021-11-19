/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.RestaurantAdminRole.ManageMenu;

/**
 *
 * @author monal
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    EcoSystem system;
    private UserAccount account;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem system) {
        initComponents();
        
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        valueLabel.setText(account.getName());
        populateTable();
        pastTblPopulate();
        populateInfo();
        
    }
    
    public void populateInfo(){
        for (Customer cust:system.getCustomerDirectory().getCustList()) {
           
            if (cust.getUserName().equals(account.getUsername())) {
                jTextField1.setText(cust.getAddress());
                jTextField2.setText(cust.getNumber());
            }
        }
    }
    
    
    public void populateTable(){
         DefaultTableModel model = (DefaultTableModel) restaurentTable.getModel();
        
        model.setRowCount(0);
         
       
                Object[] row = new Object[3];
                //System.out.println();
                for(Restaurant restro:system.getRestaurantDirectory().getRestaurantList()){
                     row[0] = restro;
                     //System.out.println(restro.getAdminUName());
                     row[1] = restro.getAddress();
                     row[2] = restro.getNumber();
                     model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        restaurentTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        valueLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pastTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        valueLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        restaurentTable.setBackground(new java.awt.Color(8, 34, 137));
        restaurentTable.setForeground(new java.awt.Color(255, 255, 255));
        restaurentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurant Name", "Address", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(restaurentTable);
        if (restaurentTable.getColumnModel().getColumnCount() > 0) {
            restaurentTable.getColumnModel().getColumn(0).setResizable(false);
            restaurentTable.getColumnModel().getColumn(1).setResizable(false);
            restaurentTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 130, 480, 97));

        requestTestJButton.setBackground(new java.awt.Color(8, 34, 137));
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Order Food");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        refreshTestJButton.setBackground(new java.awt.Color(8, 34, 137));
        refreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 110, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Customer:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 127, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 310, 26));

        valueLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel1.setText("Restaurants");
        add(valueLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 150, 26));

        valueLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel2.setText("Your Information");
        add(valueLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 158, 26));

        pastTbl.setBackground(new java.awt.Color(8, 34, 137));
        pastTbl.setForeground(new java.awt.Color(255, 255, 255));
        pastTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Restaurant Name", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(pastTbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 480, 100));

        jButton1.setText("Update Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 670, -1, -1));

        jTextField1.setText("jTextField1");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 170, -1));

        jTextField2.setText("jTextField2");
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 170, -1));

        valueLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel3.setText("Order History");
        add(valueLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 158, 26));

        jLabel1.setText("Contact Number:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, -1, 30));

        jLabel2.setText("Delivery Address: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        int selectedRow = restaurentTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
           Restaurant restaurant = (Restaurant)restaurentTable.getValueAt(selectedRow, 0);
            
            
              MenuPanel1 manageMenu=new MenuPanel1(userProcessContainer,account,system,restaurant);
             userProcessContainer.add("Manage Restaurents",manageMenu);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        }
        
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        pastTblPopulate();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String address=jTextField1.getText();
        String contact=jTextField2.getText();
        
        for (Customer cust:system.getCustomerDirectory().getCustList()) {
           
            if (cust.getUserName().equals(account.getUsername())) {
                cust.setAddress(address);
                cust.setNumber(contact);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable pastTbl;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable restaurentTable;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JLabel valueLabel2;
    private javax.swing.JLabel valueLabel3;
    // End of variables declaration//GEN-END:variables

    private void pastTblPopulate() {
        DefaultTableModel model = (DefaultTableModel) pastTbl.getModel();
        
        model.setRowCount(0);
         
       
          for (Customer cust:system.getCustomerDirectory().getCustList()) {
           
            if (cust.getUserName().equals(account.getUsername())) {
               // System.out.println(restro.getOrderList());
               for(Order menu:cust.getOrderList()){
                Object[] row = new Object[4];
                row[0] = menu;
                row[1] = menu.getRestaurantName();
               
                row[2] = menu.getCost();
                row[3] = menu.getStatus();
                model.addRow(row);
               }
                
            }
            
        }
        
        
    }
}
