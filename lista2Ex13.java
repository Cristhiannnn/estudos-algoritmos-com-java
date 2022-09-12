/*.Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que média igual ou maior que 6.0 o aluno é aprovado). Escrever também a média calculada.
 */

import java.util.Scanner;
public class lista2Ex13 {
    public static void main(String[] args) {
        
        float media ,  nota1 , nota2;

        Scanner in = new Scanner(System.in);

        System.out.print("Informe a nota da prova1: ");
        nota1 = in.nextFloat();

        System.out.print("Informe a nota da prova2: ");
        nota2 = in.nextFloat();

        in.close();

        media = (nota1 + nota2)/2;

        if (media>=6) {
            System.out.printf("A media do aluno ficou %.2f , seu status é APROVADO! \n", media);
        } else {
            System.out.printf("A media do aluno ficou %.2f , seu status é REPROVADO! \n", media);
        }
    }
}
