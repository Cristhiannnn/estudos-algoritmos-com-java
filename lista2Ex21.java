/*.A equipe Red Bull Racing de Fórmula 1 deseja calcular o número mínimo de litros que deverá colocar no tanque de seu carro para que ele possa percorrer um determinado número de voltas até o primeiro reabastecimento. Escreva um algoritmo que leia o comprimento da pista (em metros), o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e o consumo de combustível do carro (em Km/L). Calcular e escrever o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. Observação: Considere que o número de voltas entre os reabastecimentos é o mesmo.
 */

import java.util.Scanner;
public class lista2Ex21{
    public static void main(String[] args) {
        int comprimentopista , totalvoltaspercorridas , reabastecimentosdesejados , distanciatotalpercorridakm;

        float consumocarro , minimolitros;
        
        Scanner in = new Scanner(System.in);

        System.out.print("-> Comprimento total da pista: ");
        comprimentopista = in.nextInt();

        System.out.print("-> Total de voltas a serem percorridas: ");
        totalvoltaspercorridas = in.nextInt();

        System.out.print("-> Total de reabastecimentos desejados: ");
        reabastecimentosdesejados = in.nextInt();

        System.out.print("-> Consumo de combustivel do veículo: ");
        consumocarro = in.nextFloat();

        in.close();

        distanciatotalpercorridakm = comprimentopista * totalvoltaspercorridas /1000;

        minimolitros = (distanciatotalpercorridakm / reabastecimentosdesejados) / consumocarro;

        System.out.printf(" O minímo de combustivel até o primeiro abastecimento é de %.2f ltrs \n",minimolitros);

        


    }
}