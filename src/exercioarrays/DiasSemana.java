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
class DiasSemana {
    public static void main(String[] args) {
        
        String Days[] = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sabdo"};
        int op = 0;
        int i = 0;
        System.out.println("informe a metodo de execução \n -1 For \n 2-  While \n 3- Do while");
        switch(op){
            case 1:
                for(i=0;i<Days.length;i++){
            System.out.println("-"+Days[i]);
                }
             break;
            case 2:
                while(i<Days.length){
                System.out.println("-"+Days[i]);    
                }
                
                break;
            case 3:
                do{
                     System.out.println("-"+Days[i]);
                     i++;
                }while(i<Days.length);               
                break;
            
        }
    }
}
