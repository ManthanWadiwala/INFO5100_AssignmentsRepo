/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author manthanwadiwala
 */
public class Dishes {
    
    private String name;
    private String description;
    private long price;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return name;
    }

    public Dishes(String name,String description,long price) {
        this.name=name;
        this.price=price;
        this.description=description;
    }
    
}
