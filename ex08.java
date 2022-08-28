/* Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
A entrada de dados será:
● Número total de eleitores; 
● Número de votos válidos; 
● Número de votos brancos; 
● Número de votos nulos.
O algoritmo deve calcular e exibir para o usuário as seguintes informações (em relação ao total de eleitores):
● Percentual de votos válidos; 
● Percentual de votos brancos; 
● Percentual de votos nulos;
 */


import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        float total,validos,brancos,nulos;

        Scanner in = new Scanner(System.in);
            System.out.print("Digite o total de eleitores: ");
            total = in.nextFloat();

            System.out.print("Digite o total de votos válidos: ");
            validos = in.nextFloat();

            System.out.print("Total de votos em branco: ");
            brancos = in.nextFloat();

            System.out.print("Total de votos nulos: ");
            nulos = in.nextFloat();
            in.close();

            float val = (validos/total)*100;
            float bran = (brancos/total)*100;
            float nul = (nulos/total)*100;

            System.out.format("tivemos %.2f", val);
            System.out.println(" % de votos válidos!");

            System.out.format("tivemos %.2f", bran);
            System.out.println(" % de votos em branco!");

            System.out.format("tivemos %.2f", nul);
            System.out.println(" % de votos em nulo!");

            



    }
    
}
