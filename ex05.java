/* Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para graus Celsius.
A fórmula para conversão é a seguinte: C/5 = F-32/9
 */

import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print(" Vou te ajudar a converter temparaturas Fahrenheigt em Celsius , me informe o valor da temperatura Fahº : ");

            float fah = in.nextFloat();
            float cel = ((fah-32)*5/9);

            System.out.println("Ok "+ fah + " º Fahrenheigt seria o mesmo que "+ cel + " º em celsius");

        
    }
    
}
