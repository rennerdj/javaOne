/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import javax.swing.JOptionPane;

/**
 * This represents a driver of a vehicle
 * @author mydjr
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        promptUser();
       
    }
    
    /**
     * Prompt the user for information about trips and mpg
     */
    
    public static void promptUser() {
        String milesPerGallon = JOptionPane.showInputDialog("How many Miles per Gallon does the vehicle get?");
        int mpg = Integer.parseInt(milesPerGallon);
        double gallonsOfGas = 10;
        String journey = JOptionPane.showInputDialog("How far do you want to go?");
        int distance = Integer.parseInt(journey);
        
        double gallonsConsumed = distance / mpg;
        gallonsOfGas = gallonsOfGas - gallonsConsumed;
        if(gallonsOfGas >= 0) {
            System.out.println("Gas Consumed: " + gallonsConsumed + " Gallons Remaining: " + gallonsOfGas);
        } else { 
            System.out.println("You ran out of Gas!");
            
        } 
                
        
        
    }
    
}
