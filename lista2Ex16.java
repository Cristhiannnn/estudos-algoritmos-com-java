/*.Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação não pode ultrapassar 30% do salário. Faça um programa que receba o salário, o valor do empréstimo e o número de prestações e informe se o empréstimo pode ser concedido. Nenhum dos valores informados pode ser zero ou negativo.
 */

import java.util.Scanner;
public class lista2Ex16 {
    public static void main(String[] args) {

    float salario , valor , parcela , testeparcela;
    int prestac;

    Scanner in = new Scanner(System.in);

    System.out.print(" Qual o valor do seu salário bruto? ");
    salario = in.nextFloat();

    System.out.print("Qual o valor do empréstimo solicitado? ");
    valor = in.nextFloat();

    System.out.print("Em quantas parcelas você quer pagar o empréstimo? ");
    prestac = in.nextInt();

    parcela = (valor / prestac);

    testeparcela = (salario * 0.30f); 

    in.close();
    
    if (parcela > testeparcela) {
        System.out.printf("EMPRÉSTIMO NEGADO! (o valor da parcela (%.2f) fica superior a 30%% do seu salário!)\n",parcela);
    } else {
        System.out.printf("EMPRÉSTIMO APROVADO! o valor das parcelas fica %.2f R$ por mês \n",parcela);
    }


        
    }
}
