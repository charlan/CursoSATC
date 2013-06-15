/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc1.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author EDUTEC
 */
public class Notas1 {
    
    
    
        
       public static void main(String[] args){
        float nota1, nota2, nota3, media;
                               
            
            nota1=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 1: ")); 
            nota2=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 2: ")); 
            nota3=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 3: ")); 
            
            media =  (nota1+nota2+nota3)/3;
            
            if(media>= 60){
                JOptionPane.showMessageDialog(null,"A Media é :"+media+" :-)");
                  }else {JOptionPane.showMessageDialog(null,"A Media é :"+media+" :-(");
            }
}
}
