/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;
import javax.swing.text.Element;

/**
 *
 * @author manthanwadiwala
 */
public class OrderHistory {
    
    private ArrayList <Order> orderHistory;

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
    
    public OrderHistory()
    {
        this.orderHistory = new ArrayList<Order>();
    }
    
    public Order newOrder()
    {
        Order newOrder = new Order();
        orderHistory.add(newOrder);
        return newOrder;
    }
    
    public void deleteOrder(Element e)
    {
        orderHistory.remove(e);
    }
}
