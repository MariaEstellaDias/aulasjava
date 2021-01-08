//ler 2 notas de um aluno e calcular a sua média

import java.util.Scanner;

public class Exercicio02 {

   public static void main(String[] args) {
      // entrada: ler 2 notas

      // declarar um scanner e duas variáveis
      Scanner entrada = new Scanner(System.in);
      double nota1, nota2, media ;

      System.out.println("Digite a sua primeira nota:");
      nota1 = entrada.nextDouble();
      System.out.println("Digite a sua segunda nota:");
      nota2 = entrada.nextDouble();

      //processamento: calcula a média
      media = (nota1 + nota2) / 2;

      //saída: exibir a média
      System.out.println("Sua média é: " + media);

      entrada.close();

   }
}
