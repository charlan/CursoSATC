/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercioarrays;

import javax.swing.JOptionPane;

/**
 *
 * @author EDUTEC
 */
class EntradasAgenda {
    public static void main(String[] args) {
        String [][]entry = {{"Forence","735-1234","Manila"},
                             {"Joyce","983-3333","Quezon city"},
                             {"Becca","4563322","Manilla"}};
        
        for(int i=0;i<entry.length;i++){
            JOptionPane.showMessageDialog(null,entry[i]);
        }
    }
}
