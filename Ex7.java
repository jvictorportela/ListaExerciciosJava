// Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
// valores de modo que a variável A passe a possuir o valor da variável B, e a
// variável B passe a possuir o valor da variável A. Apresentar os valores
// trocados.




import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B;

        System.out.println("Informe o valor do primeiro N°: ");
        A = entrada.nextInt();

        System.out.println("Informe o valor do segundo N°: ");
        B = entrada.nextInt();

        if (A != B){
            int newValorA = B;
            int newValorB = A;
            System.out.println("O valor do primeiro n° foi substituido pelo valor do segundo n°, e agora é  " + newValorA);
            System.out.println("O valor do segundo n° foi substituido pelo valor do primeiro n°, agora é " + newValorB);
        }

        else{
            System.out.println("O valor ja é o mesmo. ");
        }
    }
}