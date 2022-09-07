/* Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora) e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês e qual será seu salário atual. Calcule também o salário líquido (desconto de impostos) considerando 15% de impostos e mostre esses valores. a. Pergunte ao usuário qual a % de imposto que é descontada do salário.
 */
import java.util.Scanner;

public class lista2Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float htrabalhada , horas , desconto , totalsal , salliq;

        System.out.print("Quanto você recebe por hora trabalhada? ");
        htrabalhada = in.nextFloat();

        System.out.print("Quantas horas você trabalha por mês? ");
        horas = in.nextFloat();

        System.out.print("Qual a porcentagem (%) descontada do seu salário referente a tributação de INSS? ");
        desconto = in.nextFloat();

        in.close();

        totalsal = (htrabalhada * horas);
        salliq = totalsal - (desconto/100)* totalsal;
        
        System.out.printf("-> Seu salário bruto é de %.2f R$ \n", totalsal);

        System.out.printf("-> Seu salário líquido fica em %.2f R$ referente ao desconto de INSS que você indicou \n", salliq);

        


    }
}
