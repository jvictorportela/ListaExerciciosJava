//Escrever um programa que leia dois números inteiros e mostre todos os 
//relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
//são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.


import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        // Testa se os números são iguais
        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");

            // Testa se o primeiro número é maior que o segundo
            if (num1 > num2) {
                System.out.println("O primeiro número é maior que o segundo.");
            } else {
                System.out.println("O segundo número é maior que o primeiro.");
            }

            // Testa se o primeiro número é menor que o segundo
            if (num1 < num2) {
                System.out.println("O primeiro número é menor que o segundo.");
            } else {
                System.out.println("O segundo número é menor que o primeiro.");
            }
        }
    }
}
