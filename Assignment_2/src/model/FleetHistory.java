/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author manth
 */
public class FleetHistory {
    
    private ArrayList<Fleet> history;
    
        public FleetHistory()
            {
                this.history = new ArrayList<Fleet>();
            }

    public ArrayList<Fleet> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Fleet> history) {
        this.history = history;
    }
    
    public Fleet addNewFleet(){
        
        Fleet newFleet = new Fleet();
        history.add(newFleet);
        return newFleet;
    }
    
    public void deleteFleet(int index)
    {
        history.remove(index);
    }
    
        
}
