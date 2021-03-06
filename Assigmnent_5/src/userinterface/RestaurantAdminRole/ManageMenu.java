/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Dishes;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author manthanwadiwala
 */
public class ManageMenu extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenu
     */
     EcoSystem system;
     Dishes menu;
    JPanel userProcessContainer;
    UserAccount account;
    public ManageMenu(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        populateTable();
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
        amtTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        dishNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        addDishBtn = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Description");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        amtTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtTxtActionPerformed(evt);
            }
        });
        add(amtTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 160, -1));

        MenuTable.setBackground(new java.awt.Color(8, 34, 137));
        MenuTable.setForeground(new java.awt.Color(255, 255, 255));
        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Description", "Price"
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
        MenuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MenuTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 620, 100));

        jLabel2.setText("Item Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        dishNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishNameTxtActionPerformed(evt);
            }
        });
        add(dishNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 160, -1));

        jLabel3.setText("Amount");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        descTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descTxtActionPerformed(evt);
            }
        });
        add(descTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 160, -1));

        deleteBtn.setBackground(new java.awt.Color(8, 34, 137));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 100, 30));

        backBtn.setBackground(new java.awt.Color(8, 34, 137));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        addDishBtn.setBackground(new java.awt.Color(8, 34, 137));
        addDishBtn.setForeground(new java.awt.Color(255, 255, 255));
        addDishBtn.setText("Add");
        addDishBtn.setPreferredSize(new java.awt.Dimension(84, 29));
        addDishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDishBtnActionPerformed(evt);
            }
        });
        add(addDishBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 100, 30));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Manage Menu Items");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void amtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtTxtActionPerformed

    private void dishNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dishNameTxtActionPerformed

    private void descTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descTxtActionPerformed

    private void addDishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDishBtnActionPerformed
        // TODO add your handling code here:
        String name=dishNameTxt.getText();
        String desc=descTxt.getText();
        String amount=amtTxt.getText();
        
        if(amount.equals("") || name.equals("") || desc.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
        }
        else
        {    
            try{
                Double.parseDouble(amount);
            for(Restaurant restro:system.getRestaurantDirectory().getRestaurantList()){
               if(restro.getAdminUName().equals(account.getUsername())){
                    menu=system.getRestaurantDirectory().AddMenuDishes(restro,name, desc, amount);
                    JOptionPane.showMessageDialog(this, "Added Menu Item successfully.");
                }   
            }
            populateTable();
            dishNameTxt.setText("");
            descTxt.setText("");
            amtTxt.setText("");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Invalid Item Amount format.");
            }
        }
        
    }//GEN-LAST:event_addDishBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = MenuTable.getSelectedRow();
        if(selectedRow>=0){
            //int selectionButton = JOptionPane.YES_NO_OPTION;
            //int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            //if(selectionResult == JOptionPane.YES_OPTION){
                
                for(Restaurant restro : system.getRestaurantDirectory().getRestaurantList()){
                    if(restro.getAdminUName().equals(account.getUsername())){
                        System.out.println("Found username");
                        String item=MenuTable.getValueAt(selectedRow, 0).toString();
                        menu=system.getRestaurantDirectory().DeleteDishes(restro, item);
                        JOptionPane.showMessageDialog(null, "Deleted Menu Item successfully.");
                    }   
                }
                populateTable();
            //}
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this); 
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void MenuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTableMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_MenuTableMouseClicked
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        
        model.setRowCount(0);
        
       
        for (Restaurant restro:system.getRestaurantDirectory().getRestaurantList()) {
           
            if (restro.getAdminUName().equals(account.getUsername())) {
                
               for(Dishes menu:restro.getMenu()){
                Object[] row = new Object[3];
                row[0] = menu.getName();
                row[1] = menu.getDescription();
                row[2] = menu.getPrice();
                model.addRow(row);
               }
                
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MenuTable;
    private javax.swing.JButton addDishBtn;
    private javax.swing.JTextField amtTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField descTxt;
    private javax.swing.JTextField dishNameTxt;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
