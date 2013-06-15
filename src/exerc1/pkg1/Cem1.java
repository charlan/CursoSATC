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
class Cem1 {
    public static void main(String[] args){
    
        int op,i = 0;
        String nome;
        
        op = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe como deseja resolver \n 1- while \n 2- do-while \n 3-for"));
        
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null,"while");
                nome=JOptionPane.showInputDialog("Informe seu nome");
                while(i<100){
                    System.out.println("-"+nome);
                }           
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"do while");
                nome=JOptionPane.showInputDialog("Informe seu nome");
                    while(i<100){
                    System.out.println("-"+nome);
                }
                           break;                            
            case 3:
                JOptionPane.showMessageDialog(null,"for");
                nome=JOptionPane.showInputDialog("Informe seu nome");
                for(i=0;i<100;i++){
                System.out.println("-"+nome);
                }
                break;
               default : JOptionPane.showMessageDialog(null,"Exercicio não encontrado não encontrado");
        
    }
}
}

