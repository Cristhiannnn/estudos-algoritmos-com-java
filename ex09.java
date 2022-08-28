/* Considere que você deseja uma comemoração especial para o seu aniversário e assim irá convidar familiares a amigos para um churrasco na sua residência. Você irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa de uma forma de calcular a quantidade certa a ser adquirida.
Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças consomem uma quantidades diferentes de carne.
Homens: 400 gramas 
Mulheres: 320 gramas 
Crianças: 200 gramas 

*Observação: geralmente é adicionada uma margem de segurança na quantidade de carne a ser comprada para evitar que falte. Adicione uma margem de segurança de 20% no total de carne a ser adquirida.
 */


import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int homens, mulheres,crianças;
        float carneH, carneM,carneC,acrecimo,totalcarne;

        System.out.print("total de homens convidados: ");
        homens = in.nextInt();

        System.out.print("Total de mulheres convidadas: ");
        mulheres = in.nextInt();

        System.out.print("Tatoal de crianças: ");
        crianças = in.nextInt();
        in.close();

        carneH = homens*0.4f;
        carneM = mulheres*0.32f;
        carneC = crianças*0.2f;
        acrecimo =(carneH + carneM + carneC)*0.2F;
        totalcarne = (carneH + carneM + carneC)+ acrecimo;

    

        System.out.println("Compre "+ totalcarne + " Kg de carne sem osso para alimentar todos os convidados!");

        

    
    }
    
}
