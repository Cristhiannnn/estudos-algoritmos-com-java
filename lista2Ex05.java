/* Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma mensagem de erro.
 */
import java.util.Scanner;
public class lista2Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float denominador , divisor , produto;

        System.out.print("Digite um número: ");
        denominador = in.nextFloat();

        System.out.print(" Digite outro número: ");
        divisor = in.nextFloat();
        produto = (denominador/divisor);

        in.close();

        if(denominador != 0){
            System.out.printf("-> O resultado da divisão entre os dois números é %.2f \n", produto);
        } else {
            System.out.println("-> ERRO! O primeiro número precisa ser diferente de 0 !");
        }

        
    }
}
