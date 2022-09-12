/* Faça um programa que receba dois números e efetua a adição. Caso o valor somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 10.
 */

import java.util.Scanner;
public class lista2Ex11 {
    public static void main(String[] args) {
        int n1 , n2 , resultado;

        Scanner in = new Scanner(System.in);

        System.out.print(" Digite dois números: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        resultado = n1+ n2;

        in.close();

        if( resultado > 20) {
            resultado+=8;
            System.out.println("-> O resultado da soma dos dois números mais 8 será: "+ resultado);
        } else {

            resultado-=10;
            System.out.println("-> O resultado da soma dos dois números menos 10 será: "+ resultado);

        }
        
    }
}
