/*2. O algoritmo deve ter como entrada um número real e a saída deve ser o valor atualizado com os 20%.
 */

import java.util.Scanner; 

public class ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

            System.out.print("Digite um número: ");

            float numero = teclado.nextFloat();
            float atualizado = (numero * 0.2f + numero);
        
            System.out.println("A atualização com 20% fica: "+atualizado);
    }
    
}
