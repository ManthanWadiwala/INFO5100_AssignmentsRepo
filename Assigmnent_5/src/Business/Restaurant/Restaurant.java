/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    private String name;
    private String address;
    private int number;
    private String adminUsername;
    private ArrayList<Dishes> Menu;
    private ArrayList<Order> orderList;
    int id=1;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number =  number;
    }
   
    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUName(String adminUsername) {
        this.adminUsername = adminUsername;
    }
    
    public ArrayList<Dishes> getMenu() {
        return Menu;
    }
    public void addDishes(Dishes menu){
        
        Menu.add(menu);
    }
    
    public void removeDishes(Dishes menu){
        
        Menu.remove(menu);
    }
    
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }


    public Restaurant(String adminUsername) {
        this.adminUsername=adminUsername;
        Menu=new ArrayList<Dishes>();
        orderList=new ArrayList<Order>();
    }
  
    
    @Override
    public String toString() {
        return name;
    }
    
}
