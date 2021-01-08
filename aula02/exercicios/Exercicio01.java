import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.println("Digite um número inteiro: ");
        nota = entrada.nextInt();

        if (nota > 20) {

            System.out.println("A metade é: " + (double) nota / 2); //casting - conversão tipo

            entrada.close();

        }
    }
}
