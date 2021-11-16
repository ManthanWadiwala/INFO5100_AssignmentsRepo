/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author manthanwadiwala
 */
public class Order {
    
    private static int count = 0;  
    private int orderId;
    
    public Order() {
        count++;
        orderId = count;
    }
    
}
