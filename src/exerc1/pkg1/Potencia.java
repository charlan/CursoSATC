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
class Potencia {
    public static void main(String[] args){
          
    
        int op,i = 0;
        int num = 0, pot= 0;
        
        op = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe como deseja resolver \n 1- while \n 2- do-while \n 3-for"));
        
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null,"while");
                num=Integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
                pot=Integer.parseInt(JOptionPane.showInputDialog("Informe a potencia"));
                float numDefault = num;
                while(num!=pot-1){
                    numDefault = numDefault * num;
                    i++;
                }JOptionPane.showMessageDialog(null,"o numero "+num+" elevado à "+pot+" é igual a: "+numDefault);           
                break;
            case 2:
                num=Integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
                pot=Integer.parseInt(JOptionPane.showInputDialog("Informe a potencia"));
                numDefault = num;
                while(i!=pot-1){
                   numDefault = numDefault * num;
                    i++;
                }JOptionPane.showMessageDialog(null,"o numero "+num+" elevado à "+pot+" é igual a: "+numDefault);
                break;                            
            case 3:
                num=Integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
                pot=Integer.parseInt(JOptionPane.showInputDialog("Informe a potencia"));
                numDefault = num;
                for(i=1;i<pot;i++){
                    numDefault = numDefault * num;
                     
                }JOptionPane.showMessageDialog(null,"o numero "+num+" elevado à "+pot+" é igual a: "+numDefault);
                                break;
               default : JOptionPane.showMessageDialog(null,"Exercicio não encontrado não encontrado");
        
    }
}
        
    }
    

