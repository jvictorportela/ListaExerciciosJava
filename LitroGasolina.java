// 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz	
// 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
// Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
// Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
// fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
// tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.

import java.util.Scanner;

public class LitroGasolina {

   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       double tempo, distancia, velocidadeM, litrosUsados, mediaL;
       System.out.println("Informe a duração da viagem: ");
       tempo = entrada.nextDouble();

       System.out.println("Informe a velocidade média: ");
       velocidadeM = entrada.nextDouble();
       mediaL = 12;

       distancia = tempo * velocidadeM;
       litrosUsados = distancia / mediaL;
       
       System.out.print("\n\n\nResultados:\n\n");
       
       System.out.println("A velocidade Média foi de " + velocidadeM + " Km/h");
       System.out.println("O tempo de viagem foi de: " + tempo + " Horas");
       System.out.println("A distância percorrida foi: " + distancia + " KM, e a quantidade de litros usados foi: " + litrosUsados + " L");



       
   }
}