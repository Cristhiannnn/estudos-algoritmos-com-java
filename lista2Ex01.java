/*  Faça um algoritmo que converta metros para centímetros. Lembrando que 1m = 100cm*/
import java.util.Scanner;


public class lista2Ex01 {
    public static void main(String[] args) {
        float metros , centimetros;
        Scanner in = new Scanner(System.in);

        System.out.print(" Digite um valor em metros: ");
        metros = in.nextFloat();
        centimetros = ( metros*100);

        in.close();

        System.out.println(" A conversão de "+ metros + " m em centímetros fica " + centimetros + " cm");

    

    
        
    }
}
