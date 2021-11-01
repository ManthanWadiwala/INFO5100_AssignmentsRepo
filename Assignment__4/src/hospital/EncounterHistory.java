/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import javax.swing.text.Element;

/**
 *
 * @author manthanwadiwala
 */
public class EncounterHistory {
    
           private ArrayList<Encounter> encounterHistory;
    
        public EncounterHistory()
            {
                this.encounterHistory = new ArrayList<Encounter>();
            }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addNewEncounter(){
        
        Encounter newEncounter = new Encounter();
        encounterHistory.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter(Element e)
    {
        encounterHistory.remove(e);
    }
    
    
    
    
    
}
