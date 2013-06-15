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
public class ExercioArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       
        
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o exercicio que deseja executar \n 1- Dias da semana \n 2- Maior número \n 3- Entrada de agenda telefonica"));
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null,"Exercicio 2.1");
                DiasSemana.main(args);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Exercicio 2.2");
                MaiorNumero.main(args);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Exercicio 2.3");
                EntradasAgenda.main(args);
                break;
                        default : JOptionPane.showMessageDialog(null,"Exercicio não encontrado não encontrado");
    }
  }
}
