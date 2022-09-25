/* Fatores Primos - Desenvolva o código necessário para fazer a
decomposição em fatores primos. Lembrando que um número é considerado primo
quando possui apenas dois divisores, 1 e ele mesmo, por exemplo, o número 17 é
primo pois nenhum número entre 2 e 16 tem resto 0 quando tentamos dividir o
número 17. O número decomposto em fatores primos nada mais é do que
reescrever o número como uma sequência de multiplicações onde todos os valore
são primos, por exemplo:
225 = 3 * 3 * 5 * 5
1001 = 7 * 11 * 13
Neste exercício, você irá solicitar ao usuário um número positivo e maior que 1 e,
apresentará sua decomposição em fatores primos, mostrando um valor primo por linha,
valores repetidos aparecerão um ao lado do outro, por exemplo: */

import java.util.Scanner;
public class AvaliacaoEx05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor = in.nextInt();
        int divisor = 2;


        while (valor > 1) {
            if (valor % divisor == 0) {
                System.out.print(divisor + " ");
                valor = valor / divisor;
                if (valor % divisor != 0) System.out.println();
            } else {
                divisor++;
            }
        }

    }
}
