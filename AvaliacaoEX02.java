/*2. - Escreva um algoritmo para ler o número de lados de um
polígono regular e a medida do lado (em cm). Calcular e imprimir o seguinte:
- Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu
perímetro.
- Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
- Se o número de lados for igual a 5 escrever PENTÁGONO.
- Mostrar a mensagem FIGURA DESCONHECIDA caso o valor seja diferente de 3, 4
ou 5
 */
import java.util.Scanner;
public class AvaliacaoEX02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lados = in.nextInt();
        int medida = in.nextInt();

        in.close();

        if (lados == 3) {
            System.out.println("TRIANGULO");
            int perimetro = 3 * medida;
            System.out.println("PERIMETRO " + perimetro);
        } else if (lados == 4) {
            System.out.println("QUADRADO");
            int area = medida * medida;
            System.out.println("AREA " + area);
        } else if (lados == 5) {
            System.out.println("PENTAGONO");
        } else {
            System.out.println("FIGURA DESCONHECIDA");
        }
}
}
