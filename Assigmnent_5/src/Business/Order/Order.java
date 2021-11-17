/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Menu;
import java.util.ArrayList;

/**
 *
 * @author manthanwadiwala
 */
public class Order {
    
    //private static int count = 0; 
    
    private String orderId;
    private String status;
    private String restaurantName;
    private String customerName;
    private String deliveryMan;
    private ArrayList<Menu> Order;
    private String cost;
    private String deliveryAddress;

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public ArrayList<Menu> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<Menu> Order) {
        this.Order = Order;
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
      
    //public Order() {
       // count++;
       // orderId = count;
    //}
    
    @Override
    public String toString() {
        return orderId;
    }
    
}
