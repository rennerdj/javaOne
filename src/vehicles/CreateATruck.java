/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import javax.swing.JOptionPane;

/**
 *
 * @author mydjr
 */
public class CreateATruck {
    
    public static void main(String[] args) {
        promptUser();
    }

    private static void promptUser() {
        String[] cab = new String[3];
        cab [0] = "Regular";
        cab [1] = "Supercab";
        cab [2] = "Supercrew";
        
        Object selectedCab = JOptionPane.showInputDialog(null,"Choose a Cab Type", "Cab Selection",JOptionPane.QUESTION_MESSAGE, null, cab, "Supercrew");
        System.out.println("Selected Cab: " + selectedCab);
    }
 }
