
package exercicio12;

import java.util.Scanner;


public class Exercicio12 {

    
    public static void main(String[] args) {
        
        
        
        
          float salario;
         double imposto = 0;
         Scanner leia = new Scanner (System.in);
         System.out.println("Digite o seu salario");
         salario =Float.parseFloat(leia.nextLine());
         
        imposto =(salario*0.05);
         System.out.println(imposto);
       
    }
        
}
    
