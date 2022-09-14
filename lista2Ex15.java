/*.Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte
 */
import java.util.Scanner;

public class lista2Ex15 {
    public static void main(String[] args) {
        int inicio , fim , tempo;

        Scanner in = new Scanner(System.in);

        System.out.print("Que horas começou o jogo? ");
        inicio = in.nextInt();

        System.out.print("Que horas encerrou o jogo? ");
        fim = in.nextInt();

        in.close();

        if (inicio > fim) {
            tempo = 24-(inicio - fim);
            System.out.println("-> A partida levou "+ tempo + "horas para chegar ao fim!");

        } else if (inicio < fim) {
            tempo = fim - inicio;
            System.out.println("-> A partida levou "+ tempo + "horas para chegar ao fim!");

        } else if (inicio == fim) {
            tempo = 24;
            System.out.println("-> A partida levou "+ tempo + "horas para chegar ao fim!");
        }

        
    
        
    }
}
