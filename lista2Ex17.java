/*.O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 */

import java.util.Scanner; 
public class lista2Ex17 {
    public static void main(String[] args) {
        float custof , percentualdist , impostos, custoc;

        Scanner in = new Scanner(System.in);

        System.out.print("Escreva o custo de fábricação do veículo: ");

        custof = in.nextFloat();

        percentualdist = (custof * 0.28f);

        impostos = (custof * 0.45f);
        
        custoc = custof + percentualdist + impostos;

        in.close();

        System.out.printf("O custo de fábricação do veículo é %.2f R$ , a participação do distribuidor fica %.2f R$ , os impostos resultam em %.2f R$ e o preço na ponta ao consumidor será %.2f R$ \n", custof , percentualdist , impostos , custoc);
    }
}
