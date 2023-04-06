//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
//V = 3.14159 * R * R * A
//Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.


import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double PI, volume, R, A;
        PI = 3.14;
        
        
        System.out.println("Informe o valor do raio: ");
        R = entrada.nextDouble();

        System.out.println("Informe o valor da altura: ");
        A = entrada.nextDouble();
        
        volume = PI * (R * R) * A;

        System.out.println("O valor do volume é :" + volume);
        
    }
}