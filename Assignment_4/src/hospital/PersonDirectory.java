/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author manthanwadiwala
 */
public class PersonDirectory {
    
        private ArrayList<Person> personHistory;
    
        public PersonDirectory()
            {
                this.personHistory = new ArrayList<Person>();
            }

    public ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }
    
    public Person addNewPerson(){
        
        Person newPerson = new Person();
        personHistory.add(newPerson);
        return newPerson;
        
    }
    
    public void deletePerson(int index)
    {
        personHistory.remove(index);
    }
    
    
}
