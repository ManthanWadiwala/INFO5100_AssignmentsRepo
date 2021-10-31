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
public class PatientDirectory {
    
       private ArrayList<Patient> patientHistory;
    
        public PatientDirectory()
            {
                this.patientHistory = new ArrayList<Patient>();
            }

    public ArrayList<Patient> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<Patient> patientHistory) {
        this.patientHistory = patientHistory;
    }
    
    public Patient addNewPatient(){
        
        Patient newPatient = new Patient();
        patientHistory.add(newPatient);
        return newPatient;
    }
    
    public void deletePatient(int index)
    {
        patientHistory.remove(index);
    }
    
    
    
    
}
