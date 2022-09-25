/*1. Escreva um algoritmo para ler as dimensões de uma cozinha
retangular (comprimento, largura e altura), calcular e escrever a quantidade de
caixas de azulejos para se colocar em todas as suas paredes (considere que não
será descontada a área ocupada por portas e janelas). Cada caixa de azulejos
possui 1.5 m2 .
 */

import java.util.Scanner;

public class AvaliacaoEx01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float comprimento, largura, altura;
        System.out.println("Informe as dimensoes, comprimento, largura e altura");
        comprimento = in.nextFloat();
        largura = in.nextFloat();
        altura = in.nextFloat();

        in.close();

        float area = 2 * (comprimento + largura) * altura;
        float caixas = area / 1.5f;

        System.out.println("O TOTAL DE CAIXAS NECESSARIAS É " + caixas);
    }
}