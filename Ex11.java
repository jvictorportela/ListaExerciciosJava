// Escreva um programa que leia quatro notas escolares de um aluno e
// apresente uma mensagem que o aluno foi aprovado se o valor da média escolar
// for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
// da recuperação, somar com o valor da média e obter a nova média. Se a nova
// média for maior ou igual a 7, apresentar uma mensagem informando que o aluno
// foi aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma
// mensagem informando esta condição. Apresentar junto com as mensagens o valor
// da média do aluno.


import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lê as quatro notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // verifica se as notas estão dentro do intervalo permitido
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10 || nota4 < 0 || nota4 > 10) {
            System.out.println("Alguma das notas digitadas está fora do intervalo permitido (0 a 10).");
            return;
        }

        // calcula a média do aluno
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // verifica se o aluno foi aprovado ou não
        if (media >= 7) {
            System.out.printf("Parabéns! Você foi aprovado com média %.2f.\n", media);
        } 
        else {
            System.out.printf("Sua média foi %.2f. Você está em recuperação.\n", media);

            // lê a nota da recuperação
            System.out.print("Digite a nota da recuperação: ");
            double notaRecuperacao = scanner.nextDouble();

            // verifica se a nota da recuperação está dentro do intervalo permitido
            if (notaRecuperacao < 0 || notaRecuperacao > 10) {
                System.out.println("A nota da recuperação está fora do intervalo permitido (0 a 10).");
                return;
            }

            // calcula a nova média do aluno
            double novaMedia = (media + notaRecuperacao) / 2;

            // verifica se o aluno foi aprovado na recuperação ou não
            if (novaMedia >= 7) {
                System.out.printf("Parabéns! Você foi aprovado na recuperação com média %.2f.\n", novaMedia);
            } else {
                System.out.printf("Sua média final foi %.2f. Infelizmente você não foi aprovado.\n", novaMedia);
            }
        }

    }
}