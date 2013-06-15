/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc1.pkg1;

import javax.swing.*;


public class Exerc11 {

    public static void main(String[] args) {
       
        
       
       
        
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o exercicio que deseja executar \n 1- Notas \n 2- Números por extenso \n 3- Cem vezes \n 3- Potências"));
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null,"Notas");
                Notas1.main(args);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Numero por extenso");
                Extenso1.main(args);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Cem vezes");
                Cem1.main(args);
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Numero por extenso");
                Potencia.main(args);
                break;
            default : JOptionPane.showMessageDialog(null,"Exercicio não encontrado não encontrado");
                
        }
            }
            
    }
    


        
        
        
    

