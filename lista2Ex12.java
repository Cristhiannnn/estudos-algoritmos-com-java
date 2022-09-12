/*.As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$ 1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. */

import java.util.Scanner;
public class lista2Ex12 {
    public static void main(String[] args) {
        float un , valor , custo;

        Scanner in = new Scanner(System.in);

        System.out.print("Quantas maçãs você deseja comprar? ");
        un = in.nextFloat();

        in.close();

        if (un>=12) {
            valor = 1.30f;
        } else {
            valor = 1.50f;
        }

        custo = un*valor;

        System.out.printf("Comprando %.0f maçãs o valor total fica %.2f \n",un , custo);

        

        


        
    }
}
