/*.Faça um programa que receba a idade de um nadador e classifique-o numa das seguintes categorias: 
• Adulto (idade >= 18); 
• Juvenil (idade >= 14 e idade < 18); 
• Infantil (idade >=9 e idade < 14); 
• Mirim (Idade < 9).
 */
import java.util.Scanner;

public class lista2Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        String resultado;

        System.out.print("Qual a idade do nadador? ");
        idade = in.nextInt();

        in.close();

        if (idade<9 ) {
            resultado = "Mirim";
            System.out.println(resultado);

        } else if (idade >=14 && idade < 18) {
            resultado = "Juvenil";
            System.out.println(resultado);
            
        } else if (idade >= 9 && idade <14 ){
            resultado = "Infantil";
            System.out.println(resultado);
        } else {
            resultado = "Adulto";
            System.out.println(resultado);
        }
        
        
    }
}