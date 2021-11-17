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

    private String restaurantName;
    private String adminUsername;
    private ArrayList<Menu> Menu;
    private ArrayList<Order> orderList;
    int id=1;
    
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public ArrayList<Menu> getMenu() {
        return Menu;
    }

    public void setMenu(ArrayList<Menu> Menu) {
        this.Menu = Menu;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    
    public void addOrder(String restaurantName, String customerName, String deliveryMan, ArrayList<Menu> Order, String cost, String deliveryAddress) {
        Order order=new Order();
        //order.setOrder_id(String.valueOf(id));
        order.setOrderId(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliveryMan(deliveryMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    
}
