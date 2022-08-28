/* Desenvolva o algoritmo de um programa onde o usuário irá informar um número inteiro e o programa deve calcular e exibir quadrado do número informado pelo usuário. */

import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            System.out.print("informe um némero inteiro: ");

            int num = teclado.nextInt();
            teclado.close();
            
            int quad = (int)Math.pow(num,2);
            System.out.println("O quadrado do número informado é : "+quad);

    }
    
}
