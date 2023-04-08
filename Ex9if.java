// Escreva um programa que leia 3 números inteiros e imprima na tela os
// valores em ordem crescente.
import java.util.Scanner;

public class Ex9if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Digite o 1° número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o 2° número: ");
        num2 = scanner.nextInt();

        System.out.print("Digite o 3° número: ");
        num3 = scanner.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Valores em ordem crescente: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Valores em ordem crescente: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Valores em ordem crescente: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Valores em ordem crescente: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Valores em ordem crescente: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Valores em ordem crescente: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}
