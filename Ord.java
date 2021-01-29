
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
//Programa que ordena os numeros do menor para o maior 

public class Ord {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Entre com um número (int)");
        int a = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog("Entre com um número (int)");
        int b = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog("Entre com um número (int)");
        int c = Integer.parseInt(valor);
        
        if (a > b) {int tmp = a; a = b; b = tmp; }
        if (b > c) {int tmp = b; b = c; c = tmp; }
        if (a > b) {int tmp = a; a = b; b = tmp; }
        JOptionPane.showMessageDialog(null, "Ordem: "+ a + " " + b + " " + c);
    }
    
}
