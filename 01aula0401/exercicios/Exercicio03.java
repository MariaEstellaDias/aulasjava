import java.util.Scanner;

//ler salário e mostrar aumento de 25%

public class Exercicio03 {

    public static void main(String[] args) {
        // entrada: ler salário
        // declarar um scanner e uma variável
        Scanner entrada = new Scanner(System.in);
        double salario;
        double salarioajustado;

        System.out.println("Digite seu salário:");
        salario = entrada.nextDouble();

        // processamento: calcula a média
        salarioajustado = salario * 1.25;

        //saída: exibir o salário ajustado
      System.out.println("Seu salário atualizado é: " + salarioajustado);

        entrada.close();

    }

}