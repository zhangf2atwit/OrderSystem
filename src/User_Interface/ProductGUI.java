/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User_Interface;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ordersystem.Dessert;
import ordersystem.DessertDB;
import ordersystem.Dish;
import ordersystem.DishDB;
import ordersystem.Drink;
import ordersystem.DrinkDB;
import ordersystem.Pizza;
import ordersystem.PizzaDB;
import ordersystem.Sandwich;
import ordersystem.SandwichDB;

/**
 *
 * @author zhangf2
 */
public class ProductGUI extends javax.swing.JFrame {
    
    String databaseName = "sql5475007";
    String dbUserName = "sql5475007";
    String dbPassword = "avlj8CSFyF";
    
    PizzaDB pizzaDB = null;
    DishDB dishDB = null;
    SandwichDB sandwichDB = null;
    DrinkDB drinkDB = null;
    DessertDB dessertDB = null;

    /**
     * Creates new form ProductGUI
     */
    public ProductGUI() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        jLabel9 = new javax.swing.JLabel();
        BtnAdd = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        BtnRemove = new javax.swing.JButton();
        foodType = new javax.swing.JTextField();
        productID = new javax.swing.JTextField();
        productName = new javax.swing.JTextField();
        productSize = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        inventory = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(618, 531));

        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Product Management");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(130, 30, 420, 50);

        BtnAdd.setBackground(new java.awt.Color(204, 204, 204));
        BtnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/add.png"))); // NOI18N
        BtnAdd.setText("Add");
        BtnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAdd);
        BtnAdd.setBounds(460, 130, 110, 40);

        BtnEdit.setBackground(new java.awt.Color(204, 204, 204));
        BtnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/edit-validated-icon (1).png"))); // NOI18N
        BtnEdit.setText("Edit");
        BtnEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEdit);
        BtnEdit.setBounds(460, 210, 110, 40);

        BtnSave.setBackground(new java.awt.Color(204, 204, 204));
        BtnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/login.png"))); // NOI18N
        BtnSave.setText("Save");
        BtnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSave);
        BtnSave.setBounds(460, 290, 110, 40);

        BtnRemove.setBackground(new java.awt.Color(204, 204, 204));
        BtnRemove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cancel.png"))); // NOI18N
        BtnRemove.setText("Remove");
        BtnRemove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRemove);
        BtnRemove.setBounds(460, 380, 110, 40);

        foodType.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        foodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodTypeActionPerformed(evt);
            }
        });
        jPanel1.add(foodType);
        foodType.setBounds(190, 110, 200, 31);

        productID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(productID);
        productID.setBounds(190, 170, 200, 31);

        productName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(productName);
        productName.setBounds(190, 230, 200, 31);

        productSize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(productSize);
        productSize.setBounds(190, 290, 200, 31);

        productPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(productPrice);
        productPrice.setBounds(190, 350, 200, 31);

        inventory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryActionPerformed(evt);
            }
        });
        jPanel1.add(inventory);
        inventory.setBounds(190, 420, 200, 31);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Food Type :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 110, 110, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product ID :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 160, 110, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 220, 70, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Size :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 290, 60, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 350, 90, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inventory :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 420, 130, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/background3.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 620, 531);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        
        System.out.println("Add clicked!s");
        
        String type = foodType.getText();
        String id = productID.getText();
        String name = productName.getText();
        String size = productSize.getText();
        double price = Double.parseDouble(productPrice.getText());
        int amountLeft = Integer.parseInt(inventory.getText());
        
        System.out.println(type);
        
        if(type.equals("Pizza") || type.equals("pizza")){
            System.out.println(type + " is entered");
            Pizza pizza = new Pizza(id, name, size, price, amountLeft);
            
            pizzaDB = new PizzaDB(databaseName, dbUserName, dbPassword);
            
            try {
                pizzaDB.addPizza(pizza);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Pizza has been added successfully to the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Dish") || type.equals("dish")){
            Dish dish = new Dish(id, name, size, price, amountLeft);
            
            dishDB = new DishDB(databaseName, dbUserName, dbPassword);
            
            try {
                dishDB.addDish(dish);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Dish has been added successfully to the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Sandwich") || type.equals("sandwich")){
            Sandwich sandwich = new Sandwich(id, name, size, price, amountLeft);
            
            sandwichDB = new SandwichDB(databaseName, dbUserName, dbPassword);
            
            try {
                sandwichDB.addSandwich(sandwich);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Sandwich has been added successfully to the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Drink") || type.equals("drink")){
            Drink drink = new Drink(id, name, size, price, amountLeft);
            
            drinkDB = new DrinkDB(databaseName, dbUserName, dbPassword);
            
            try {
                drinkDB.addDrink(drink);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Drink has been added successfully to the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Dessert") || type.equals("dessert")){
            Dessert dessert = new Dessert(id, name, size, price, amountLeft);
            
            dessertDB = new DessertDB(databaseName, dbUserName, dbPassword);
            
            try {
                dessertDB.addDessert(dessert);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Dessert has been added successfully to the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else{
            JOptionPane.showMessageDialog(this,"Food type is wrong. Please enter a valid food type.");
        }
       
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
        String type = foodType.getText();
        String id = productID.getText();
        int amountLeft = Integer.parseInt(inventory.getText());
        
        if(type.equals("Pizza") || type.equals("pizza")){
            
            
            pizzaDB = new PizzaDB(databaseName, dbUserName, dbPassword);
            
            try {
                pizzaDB.updatePizzaAmount(id, amountLeft);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Pizza amount has been updated successfully in the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Dish") || type.equals("dish")){
            dishDB = new DishDB(databaseName, dbUserName, dbPassword);
            
            try {
                dishDB.updateDishAmount(id, amountLeft);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Dish amount has been updated successfully in the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Sandwich") || type.equals("sandwich")){
            sandwichDB = new SandwichDB(databaseName, dbUserName, dbPassword);
            
            try {
                sandwichDB.updateSandwichAmount(id, amountLeft);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Sandwich amount has been updated successfully in the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Drink") || type.equals("drink")){
            drinkDB = new DrinkDB(databaseName, dbUserName, dbPassword);
            
            try {
                drinkDB.updateDrinkAmount(id, amountLeft);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Drink amount has been updated successfully in the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Dessert") || type.equals("dessert")){
            dessertDB = new DessertDB(databaseName, dbUserName, dbPassword);
            
            try {
                dessertDB.updateDessertAmount(id, amountLeft);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Dessert amount has been updated successfully in the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else{
            JOptionPane.showMessageDialog(this,"Food type is wrong. Please enter a valid food type.");
        }
        
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void BtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveActionPerformed
        // TODO add your handling code here:
        String type = foodType.getText();
        String id = productID.getText();
        
        if(type.equals("Pizza") || type.equals("pizza")){
            
            
            pizzaDB = new PizzaDB(databaseName, dbUserName, dbPassword);
            
            try {
                pizzaDB.deletePizza(id);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Pizza has been deleted successfully from the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Dish") || type.equals("dish")){
            dishDB = new DishDB(databaseName, dbUserName, dbPassword);
            
            try {
                dishDB.deleteDish(id);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Dish has been deleted successfully from the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Sandwich") || type.equals("sandwich")){
            sandwichDB = new SandwichDB(databaseName, dbUserName, dbPassword);
            
            try {
                sandwichDB.deleteSandwich(id);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Sandwich has been deleted successfully from the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Drink") || type.equals("drink")){
            drinkDB = new DrinkDB(databaseName, dbUserName, dbPassword);
            
            try {
                drinkDB.deleteDrink(id);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Drink has been deleted successfully from the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(type.equals("Dessert") || type.equals("dessert")){
            dessertDB = new DessertDB(databaseName, dbUserName, dbPassword);
            
            try {
                dessertDB.deleteDessert(id);
                clearTexts();
                JOptionPane.showMessageDialog(this,"Dessert has been deleted successfully from the database.");
            } catch (Exception ex) {
                Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else{
            JOptionPane.showMessageDialog(this,"Food type is wrong. Please enter a valid food type.");
        }
    }//GEN-LAST:event_BtnRemoveActionPerformed

    private void inventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryActionPerformed

    private void foodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodTypeActionPerformed
    
    private void clearTexts(){
        foodType.setText("");
        productID.setText("");
        productName.setText("");
        productSize.setText("");
        productPrice.setText("");
        inventory.setText("");
    }
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
            java.util.logging.Logger.getLogger(ProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnRemove;
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel background;
    private javax.swing.JTextField foodType;
    private javax.swing.JTextField inventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField productID;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JTextField productSize;
    // End of variables declaration//GEN-END:variables
}
