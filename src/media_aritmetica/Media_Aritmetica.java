/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_aritmetica;

/**
 *
 * @author LAB202-06
 */
import javax.swing.JOptionPane;
public class Media_Aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float ma, n1, n2, n3, n4;
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª nota"));
    n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª nota"));
    n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3ª nota"));
    n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 4ª nota"));
    ma = (n1+n2+n3+n4)/2;
    JOptionPane.showMessageDialog(null, "a média do aluno é" + ma);
    if(ma >=6){
    JOptionPane.showMessageDialog(null, "O aluno foi aprovado");
    }
    else if(ma>=3 && ma<6){
    JOptionPane.showMessageDialog(null, "O aluno deverá fazer um exame");
    }
    else{
    JOptionPane.showMessageDialog(null, "O aluno foi retido");
    }
    }
    
}
