/* Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores */
import java.util.Scanner;
public class lista2Ex08 {
    public static void main(String[] args) {
        int totaleleitores , brancos , nulos , validos;
        float tbrancos , tnulos , tvalidos;

        Scanner in = new Scanner(System.in);

        System.out.print("Qual o número total de eleitores? ");
        totaleleitores = in.nextInt();

        System.out.print(" Votos em branco: ");
        brancos = in.nextInt();

        System.out.print("Votos nulos: ");
        nulos = in.nextInt();

        System.out.print("Votos válidos: ");
        validos = in.nextInt();

        in.close();

        tbrancos = (brancos*100)/totaleleitores;
        tnulos = (nulos * 100)/ totaleleitores;
        tvalidos = (validos * 100)/ totaleleitores;

        System.out.printf("-> A porcentagem de votos em branco foi de %.2f %% \n",tbrancos);

        System.out.printf("-> A porcentagem de votos nulos foi de %.2f %%\n", tnulos);

        System.out.printf("-> A porcentagem de votos válidos foi de %.2f %%\n", tvalidos);

        
        
    }
}
