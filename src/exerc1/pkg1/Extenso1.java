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
public class Extenso1 {
    public static void main(String[] args){
    
    int num = 0;
    
    num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
    if(num==1){JOptionPane.showMessageDialog(null,"Um");}
    if(num==2){JOptionPane.showMessageDialog(null,"Dois");}
    if(num==3){JOptionPane.showMessageDialog(null,"Tres");}
    if(num==4){JOptionPane.showMessageDialog(null,"Quatro");}
    if(num==5){JOptionPane.showMessageDialog(null,"Cinco");}
    if(num==6){JOptionPane.showMessageDialog(null,"Seis");}
    if(num==7){JOptionPane.showMessageDialog(null,"Sete");}
    if(num==8){JOptionPane.showMessageDialog(null,"Oito");}
    if(num==9){JOptionPane.showMessageDialog(null,"Nove");}
    if(num==10){JOptionPane.showMessageDialog(null,"Dez");}
    else{if(num<1 && num >10)JOptionPane.showMessageDialog(null,"Numero invalido, informe somente numeros de 1 a 10");
}
}
}