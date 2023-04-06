//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
//dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
//com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = entrada.nextInt();

        System.out.print("Digite sua idade em meses: ");
        int meses = entrada.nextInt();

        System.out.print("Digite sua idade em dias: ");
        int dias = entrada.nextInt();

        int idadeEmDias = anos * 365 + meses * 30 + dias;

        System.out.println("Sua idade em dias é: " + idadeEmDias);
    }
}

