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
class MaiorNumero {
    public static void main(String[] args) {
        float Array[]= new float[10];
         float menor, maior = 0, num;
        JOptionPane.showMessageDialog(null,"Informe 10  Numeros");
        for(int i=0;i<Array.length-1;i++){
            Array[i] =Float.parseFloat(JOptionPane.showInputDialog("Informe o numero :"+i));
               if(maior < Array[i]){
                maior = Array[i];
        }
            
        }
        JOptionPane.showMessageDialog(null,"O maior elemento e "+maior);
    }
    
}
