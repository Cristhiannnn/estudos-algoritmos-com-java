/*Desenvolva o algoritmo de um programa para calcular a média de duas notas das avaliações de um aluno.*/

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe a nota da prova 01: ");
        float nota1 = in.nextFloat();

        System.out.print("Informe a nota da prova 02: ");
        float nota2 = in.nextFloat();
        in.close();
        
        float med = (nota1 + nota2)/2;

        System.out.println("A media do aluno ficou em "+ med + " pontos.");

        
        

        
    }
    
}
