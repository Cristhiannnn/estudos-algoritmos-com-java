/* Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do triângulo. */

import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
            System.out.print("Olá, Qual é o seu nome? ");
            String nome = imput.next();

            System.out.print("Seja bem vindo "+ nome + " vou te ajudar a calcular a área de um triângulo, por favor me informe a tamanho da base do triângulo em cm: ");
            
            float base = imput.nextFloat();

            System.out.print(" Me informe a altura do triângulo em cm: ");

            float alt = imput.nextFloat();
            float area = (base*alt/2f);
            imput.close();

            System.out.println("A área total do triângulo fica com "+ area + " cm");

        
    }
    
}
