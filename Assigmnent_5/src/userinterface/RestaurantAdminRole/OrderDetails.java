/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Dishes;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.CustomerRole.CustomerAreaJPanel1;

/**
 *
 * @author manthanwadiwala
 */
public class OrderDetails extends javax.swing.JPanel {

    /**
     * Creates new form OrderDetails
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    Order order;
    EcoSystem system;
    public OrderDetails(JPanel userProcessContainer, UserAccount account, Order order, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.order = order;
        this.system = system;
        populateTable();
        jTextField1.setText(order.getStatus());
        
        for(Customer cust:system.getCustomerDirectory().getCustList()){
            if(order.getCustomerName().equals(cust.getUserName())){
                for(Order o : cust.getOrderList()){
                    if(o.getOrder_id().equals(order.getOrder_id()))
                    {
                        jLabel3.setText(o.getComments());              
                    }
                }
            }
        }
    }

    private void populateTable() {
        jLabel1.setText("Order ID:"+order.getOrder_id());
         DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);
        
         
         Object[] row = new Object[3];
                for(Dishes dish:order.getOrder()){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
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
        orderTable = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        statusBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderTable.setBackground(new java.awt.Color(8, 34, 137));
        orderTable.setForeground(new java.awt.Color(255, 255, 255));
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Description", "Amount"
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
        jScrollPane1.setViewportView(orderTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 550, 150));

        BackBtn.setBackground(new java.awt.Color(8, 34, 137));
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("<< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel1.setText("Order ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        statusBtn.setBackground(new java.awt.Color(8, 34, 137));
        statusBtn.setForeground(new java.awt.Color(255, 255, 255));
        statusBtn.setText("Update");
        statusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusBtnActionPerformed(evt);
            }
        });
        add(statusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel2.setText("Update Order Status:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 30));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 460, 20));

        jLabel4.setText("Comments:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jTextField1.setToolTipText("");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_BackBtnActionPerformed

    private void statusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusBtnActionPerformed
        // TODO add your handling code here:
        
        String orderStatus=jTextField1.getText();
        if(orderStatus.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please enter order status!");
        }
        else
        {            
            order.setStatus(orderStatus);
            for(Customer cust:system.getCustomerDirectory().getCustList()){
                if(order.getCustomerName().equals(cust.getUserName())){
                    for(Order o : cust.getOrderList()){
                        if(o.getOrder_id().equals(order.getOrder_id()))
                        {
                        o.setStatus(orderStatus);
                        }
                    }
                }
            }
        }
        
        for(Customer cust:system.getCustomerDirectory().getCustList()){
            
        }
        
    }//GEN-LAST:event_statusBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton statusBtn;
    // End of variables declaration//GEN-END:variables
}
