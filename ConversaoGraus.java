//Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
//temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
//Fahrenheit e a variável C representa é a temperatura em graus Celsius.




import java.util.Scanner;

public class ConversaoGraus {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double temperaturaC, temperaturaF;

        System.out.println("Informe a temperatura em graus Celsius: ");
        temperaturaC = entrada.nextDouble();
        
        temperaturaF = (9 * temperaturaC + 160) / 5;

        System.out.println("A temperatura convertida em Fahrenheit é: " + temperaturaF + "F");


    }
}
