/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje. a. Desafio e pesquisa: utilizando a classe Calendar ou Date do Java, peça que o usuário informe sua data de nascimento e o sistema irá calcular quantos anos, meses e dias a pessoa viveu. */
import java.util.Calendar;
import java.util.Scanner;
public class lista2Ex06 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        int ano, mes, dia , idade , mescont , diacont, restames;
        int anoatual = c.get(Calendar.YEAR);
        int mesatual = c.get(Calendar.MONTH);
        int diaatual = c.get(Calendar.DAY_OF_MONTH);
        Scanner in =new Scanner(System.in);

        System.out.print("informe seu ano de nascimento: ");
        ano = in.nextInt();

        System.out.print("informe seu mês de nascimento: ");
        mes = in.nextInt();

        System.out.print("informe seu dia de nascimento: ");
        dia = in.nextInt();
        in.close();

        if (mesatual < mes) {
             idade = (anoatual - ano) - 1;
        } else { idade = (anoatual - ano);}


        if (mes >= mesatual) {
            restames = (12-mes)+mesatual+1;
        } else {
            restames = (12-mes)+mesatual+1-12;
            
        }

        mescont = (idade*12) + restames;
        diacont = (idade*365)+(restames*30)+ diaatual;
        
        
        System.out.println("-> Você tem "+ idade + " anos.");

        System.out.println("-> Você tem "+ mescont + " meses de idade.");

        System.out.println("-> E você já viveu "+ diacont + " dias");



    }
}
