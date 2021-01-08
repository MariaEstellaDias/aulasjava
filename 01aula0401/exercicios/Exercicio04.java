import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        // entrada:

        Scanner entrada = new Scanner(System.in);
        Double salarioMinimo, quilowatt;

        System.out.println("Digite o salário mínimo:");
        salarioMinimo = entrada.nextDouble();

        System.out.println("Digite a quantidade de quilowatt:");
        quilowatt = entrada.nextDouble();

        // saída:
        System.out.println("O valor de cada quilowatt é: R$" + ( salarioMinimo / 500 )) ;
        System.out.println("O valor a ser pago por essa residência é: R$" + ((salarioMinimo / 500) * quilowatt));
        System.out.println("O valor a ser pago com desconto de 15%: " + ((salarioMinimo / 500) * quilowatt) * 0.85);

        entrada.close();

    }
}
