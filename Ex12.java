// Escreva um programa que leia dois números e exiba mensagem informando o
// valor do maior número e o valor do menor número. Se os dois números forem
// iguais, o programa deve exibir mensagem informando este fato.

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A, B;

        System.out.println("Informe o primeiro número: ");
        A = entrada.nextDouble();

        System.out.println("Informe o segundo número: ");
        B = entrada.nextDouble();

        if (A > B){
            System.out.println("O número maior é: " + A + " e o número menor é: " + B);
        }

        else if (B > A){
            System.out.println("O número maior é: " + B + " e o número menor é: " + A);
        }

        else {
            System.out.println("Os números são iguais. ");
        }

    }
}
