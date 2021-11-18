/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    private Customer customer;

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public CustomerDirectory()
            {
                this.customerList = new ArrayList<Customer>();
            }

    public Customer addNewCustomer(String username)
    {
        customer = new Customer(username);
        customerList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(int index)
    {
        customerList.remove(index);
    }
}
