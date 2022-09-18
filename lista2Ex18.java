/*.Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5%
do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor. */
import java.util.Scanner;
public class lista2Ex18 {
    public static void main(String[] args) {
        int numero;
        float valortotal , salariof , comissaof , salario , participação;

        Scanner in = new Scanner(System.in);

        System.out.print("Quantos carros você vendeu ente mês? ");

        numero = in.nextInt();

        System.out.print("Qual o valor total dos carros vendidos este mês? ");

        valortotal = in.nextFloat();

        System.out.print("Qual o valor do seu salário bruto?  ");

        salariof = in.nextFloat();

        System.out.println("Quanto você recebe por cada carro vendido? ");

        comissaof = in.nextFloat();

        in.close();

        participação = (valortotal * 0.05f);

        salario = participação + (comissaof * numero) + salariof;

        System.out.printf("Seu salário neste mês vai ficar em %.2f R$ \n", salario);


        
    }
}
