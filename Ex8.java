// Escreva um programa que leia um número inteiro e exiba o seu módulo.


import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler valores do teclado
        Scanner entrada = new Scanner(System.in);

        // Pedimos que o usuário digite um número inteiro
        System.out.print("Digite um número inteiro: ");

        // Lemos o número inteiro digitado pelo usuário com o método nextInt() do objeto Scanner
        int num = entrada.nextInt();

        // Calculamos o módulo do número digitado utilizando o método abs() da classe Math
        int modulo = Math.abs(num);

        System.out.println("O módulo de " + num + " é " + modulo);

    }
}