
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
public class ExDec {
    //Programa que escreve o numero maior entre dois números que o usuário digitar
    /*public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Entre com um número (int)");
        int a = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog("Entre com um número (int)");
        int b = Integer.parseInt(valor);
        /*ao invés de: 
        if (a > b || a == b)
        use: 
        */ 
        /* if (a >= b){
            JOptionPane.showMessageDialog(null, "O maximo vale: " + a);
            
        
        /*ao invés de: 
        } if (a < b);{
        use: 
        */
        /*} else {
            JOptionPane.showMessageDialog(null, "O maximo vale: " + b);       
        }
        JOptionPane.showMessageDialog(null, "Fim");
    }*/        
    
    //Programa que escreve o numero maior entre quatro números que o usuário digitar
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Entre com um número (int)");
        int a = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog("Entre com um número (int)");
        int b = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog("Entre com um número (int)");
        int c = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog("Entre com um número (int)");
        int d = Integer.parseInt(valor);

        /* ao ivés de:
        if (a >= b && a >= c && a >= d){
        JOptionPane.showMessageDialog(null, "O maximo vale: " + a);       

        } else {
            // a nao é o max            
        if (b >= c && b >= d){
        JOptionPane.showMessageDialog(null, "O maximo vale: " + b);
                
        } else {                    
        if (c >= d){
        JOptionPane.showMessageDialog(null, "O maximo vale: " + c);
                        
        } else {
        JOptionPane.showMessageDialog(null, "O maximo vale: " + d);
        }
        }                               
        }  
        
        JOptionPane.showMessageDialog(null, "Fim");
        //use: o codigo abaixo sem {} no else, fica menos poluido*/
        
        /*if (a >= b && a >= c && a >= d){
        JOptionPane.showMessageDialog(null, "O maximo vale: " + a);            
            // a nao é o max            
        } else if (b >= c && b >= d){
        JOptionPane.showMessageDialog(null, "O maximo vale: " + b);
        
        } else if (c >= d){
        JOptionPane.showMessageDialog(null, "O maximo vale: " + c);
        
        } else {
        JOptionPane.showMessageDialog(null, "O maximo vale: " + d);
        
        }                                                        
        JOptionPane.showMessageDialog(null, "Fim");*/
                
        //outra soluçao
        /*
        m1 = a;
        if (b > m1) {m1 = b;}
        
        m2 = c;
        if (d > m2) {m2 = d;}
        
        max = m1
        if (m2 > max) {max = m2;}
        */
                               
        //mesmo codigo abaixo cada vez menos poluido
        
        /*int max = a;
        
        if (b > max) {
            max = b;
        }
        
        if (c > max) {
            max = c;            
        }
        
        if (d > max) {
            max = d;
        }*/
        
        //mesmo codigo abaixo ainda menos poluido
        
        /*int max = a;
        
        if (b > max) {max = b;}
        
        if (c > max) {max = c;}
        
        if (d > max) {max = d;}

        JOptionPane.showMessageDialog(null, "O maximo vale: " + max);*/

        //outra maneira com operador ternario
        
        int m1 = a >= b ? a : b;
        int m2 = c >= d ? c : d;
        int max = m1 >= m2 ? m1 : m2;
        
        JOptionPane.showMessageDialog(null, "O maximo vale: " + max);                                       
    }        
}



