/*.Desenvolva um algoritmo que será utilizado para automatizar o cálculo do público e da renda total de um evento esportivo. Este evento esportivo possui um valor fixo cobrado por ingresso, no entanto, os sócios do clube em cujas dependências ocorre o evento possuem um desconto de 30% no valor do ingresso e as crianças menores
de 10 anos não pagam ingresso. Baseado nos dados acima apresentados o usuário deverá digitar 4 informações de entrada para o sistema, 
são elas: 
- Valor de cada ingresso 
- Número de pessoas (público do evento) que são sócias do clube - Número de pessoas (público do evento) não pagantes (menores de 10 anos) 
- Número de pessoas (público do evento) pagantes (sem desconto algum)
O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento e o valor que deixou de ser arrecadada devido aos descontos e isenções. */


import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        int socios, crianças, pagantes;
        float valor;

        Scanner in = new Scanner(System.in);
        System.out.print("Qual o valor dos ingressos? ");
         valor = in.nextFloat();

         System.out.print("Quantidade de sócios do clube: ");
         socios = in.nextInt();

         System.out.print("Quantidade de crianças: ");
         crianças = in.nextInt();

         System.out.print("Quantidade de pagantes: ");
         pagantes = in.nextInt();

         in.close();

         int total = (socios+crianças+pagantes);
         float valorsoc =(valor*socios)*0.3f;
         float rendatotal =(pagantes*valor*socios-valorsoc);
         float descontos = (total*valor)- rendatotal;
         
         System.out.println("-> Neste evento tivemos a presença de "+ total + " de pessoas presentes.");

         System.out.println("-> O evento deixou "+rendatotal +" R$ de arrecadação.");

         System.out.println("-> E teve computado o valor de "+ descontos + " R$ de descontos que deixaram de ser arrecadados.");

         

         


         

        
    }
    
}
