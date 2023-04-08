//Escreva um programa que leia dois números e apresente a diferença do
//maior para o menor.
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A, B;
        System.out.println("Informe o 1° valor: ");
        A = entrada.nextDouble();

        System.out.println("Informe o 2° valor: ");
        B = entrada.nextDouble();

        // Verifica qual número é o maior
        if (A >= B){
            double dif = A - B;
            // Utiliza o printf para imprimir a diferença com duas casas decimais
            System.out.printf("A diferença do maior para o menor é: %.2f", dif);
        }

        else {
            double dif = B - A;
            // Utiliza o printf para imprimir a diferença com duas casas decimais
            System.out.printf("A diferença do maior para o menor é: %.2f", dif);
        }
    }
}
