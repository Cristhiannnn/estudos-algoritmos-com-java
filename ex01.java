/*1. Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
número digitado pelo usuário.
 */


import java.util.Scanner;

public class ex01 {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

            int inteiro = teclado.nextInt();
            int antecessor = (inteiro - 1);

        System.out.println("O número antecessor ao que você digitou é "+antecessor);


   }
    
}
