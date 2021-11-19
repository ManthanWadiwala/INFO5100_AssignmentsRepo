/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String adminUName;
    private ArrayList<Dishes> Menu;
    private ArrayList<Order> orderList;
    int id=1;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
     public void addOrder(String restaurantName, String customerName, String deliverMan, ArrayList<Dishes> Order, String cost, String deliveryAddress,String contact) {
        Order order=new Order();
        order.setOrder_id(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setContactNumber(contact);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    public ArrayList<Dishes> getMenu() {
        return Menu;
    }
    public void addDishes(Dishes menu){ 
        Menu.add(menu);
        
    }
 

    public void removeDishes(String item){    
        //Menu.remove(menu);
        Iterator<Dishes> dish = Menu.iterator();
        while (dish.hasNext()) {
               if (dish.next().getName().equals(item)) {
                   dish.remove();
               }
           }
        
    }

    public String getAdminUName() {
        return adminUName;
    }
    

    public void setAdminUName(String adminUName) {
        this.adminUName = adminUName;
    }

    public Restaurant(String UName) {
        this.adminUName=UName;
        Menu=new ArrayList<Dishes>();
        orderList=new ArrayList<Order>();
    }
     
    private String name;
    private String address;
    private String number;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
