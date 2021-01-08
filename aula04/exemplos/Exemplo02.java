package exemplos;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int calculo;
        int numero1;

        System.out.println("Informe um número inteiro:");
        numero1 = entrada.nextInt();

        calculo = soma(10,5);

        System.out.println(numero1 + " + 5 = " + calculo);

        entrada.close();
    }


    // recebe 2 valores inteiros e retorna 1 inteiro.
    public static int soma(int valor1, int valor2) {
        int resultado;

        resultado = valor1 + valor2;

        return resultado;

    }
}

