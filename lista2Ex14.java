/*.Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). */
import java.util.Calendar;
import java.util.Scanner;
public class lista2Ex14 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int atual = c.get(Calendar.YEAR);
        int ano;

        Scanner in = new Scanner(System.in);

        System.out.print("Qual o ano do seu nascimento? ");
            ano = in.nextInt();

            in.close();

        if (atual - ano >= 18) {
            System.out.print("-> Você já pode votar!");
        } else {
            System.out.println("-> Você não vota!");
        }

        
    }
}
