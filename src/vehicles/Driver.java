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
        //create a variable of type Vehicle
        
        Vehicle myVehicle = new Vehicle();
        
        // print the current state of the vehicle
        String dashboard = myVehicle.toString();
        System.out.println(dashboard);
        
        // prompt user 
        
        String strGallonsOfGas = JOptionPane.showInputDialog("Enter Gallons of gas");
        
        //convert the String return to a double
        
        double dblGallonsOfGas = Double.parseDouble(strGallonsOfGas);
        
        myVehicle.setGallonsOfGas(dblGallonsOfGas);
        
        
        String strMilesPerGallon = JOptionPane.showInputDialog("Enter Miles per Gallon");
        int intMilesPerGallon = Integer.parseInt(strMilesPerGallon);
        
        myVehicle.setMilesPerGallon(intMilesPerGallon);
        
        final String strOdometer = JOptionPane.showInputDialog("Enter Odometer: ");
        final int intOdometer = Integer.parseInt(strOdometer);
        
        myVehicle.setOdometer(intOdometer);
        
        final String strDistanceTravelled = JOptionPane.showInputDialog("Enter distance to travel");
        final int distance = Integer.parseInt(strDistanceTravelled);
        
 
        //print the current state of this vehicle
        System.out.println("My Vehicle: " + myVehicle.toString());
        
        //move the vehicle
        myVehicle.go(distance);

         //Print the current state of the vehicle
        System.out.println(myVehicle.toString());    
    
        //create a new Object --- your Vehicle
        Vehicle yourVehicle = new Vehicle (25,25,25000);
        
        System.out.println("Your Vehicle: " + yourVehicle);
        
        yourVehicle.go(distance);
        
        System.out.println("Your Vehicle, after move: " + yourVehicle);
        
        System.out.println("My Vehicle: " + myVehicle.toString());
    }
    
}
