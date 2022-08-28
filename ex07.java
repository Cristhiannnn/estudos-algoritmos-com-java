/* Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade média da viagem, informe o tempo que uma família levará saindo de sua cidade de férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo calculado. */

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        float dist , vel , temp;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Quantos km de viagem para seu destino de férias? ");

        dist = in.nextFloat();

        System.out.print("Qual velocidade constante até o destino final? ");

        vel =  in.nextFloat();
        in.close();

        temp = dist/vel;

        System.out.println("o tempo até o destino é de aproximadamente "+ temp + " hrs");
    }
    
}
