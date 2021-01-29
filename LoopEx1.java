
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
public class LoopEx1 {
    
    // 1 Problema
    // O usuario digita um numero "n", e o programa escreve os numeros de 1 até "n".
    
    /*public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog("Entre com um número (int nao negativo):");
        int n = Integer.parseInt(valor);
        int proxN = 1;
        
        while(proxN  <= n) {
            System.out.println(proxN);
            proxN ++;
        }
        
    }*/
    
    /*2 Problema
    O usuario digita um numero "n", e o programa escreve essa quantidade "n"
    de numeros pares em sequencia, de 0 até "n"
    */
    
    /*public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número (int nao negativo):"));
        int nPar = 0;
        
        while(n > 0){
            System.out.println(nPar);
            nPar = nPar + 2;
            n = n - 1;
        }                
    }*/
        
    /*3 Problema
    O usuario digita um numero "n", e o programa escreve a soma de todos 
    os numeros em sequencia, de 1 até "n"
    */ 
    
    /*public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número (int nao negativo):"));
        int k = 1;
        //k é o proximo numero a ser somado de 1 até "n"
        int soma = 0;
        
        while (k <= n){
            soma += k;
            //soma = soma + k; 
            k++;
            //k = k + 1;                     
        }
        System.out.println("O valor da soma é: " + soma);
    }*/
    
    /*4 Problema
    O usuario digita um numero "n", que será a quantidade de numeros(itens)
    que quer somar, depois o usuario digita todos os numeros(valores dos intens) que quer somar
    e por ultimo, o programa escreve a soma de todos os numeros(itens)
    */            
    
    /*public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens?"));
        //n é a qtde de itens
        int soma = 0;               
        while(n > 0){
            int x = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do item?"));
            //x é o valor do item
            soma += x;
            //soma = soma + x;
            n--;
        }
        System.out.println("O valor da soma dos itens é: " + soma);
    }*/
    
    //4 Problema usando "FOR"
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens?"));
        //n é a qtde de itens
        int soma = 0;
        
        //i será o contador de itens processados
        for(int i = 0;i < n; ++i){
            int x = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do item?"));
            //x é o valor do item
            soma += x;
            //soma = soma + x;
            //para FOR não precisa de n--; por causa do i++;
        }
        
        System.out.println("O valor da soma dos itens é: " + soma);        
    }
}
    
    