package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;
        String calculo;

        System.out.println("Informe um número inteiro:");
        valor = entrada.nextInt();

        calculo = soma(valor);

        System.out.println("O número informado é " + calculo);

        entrada.close();

    }

    public static String soma(int valor) {
        String resposta;

        if(valor % 2 == 0 ) {
            resposta = "par";
        } else {
            resposta = "ímpar";
        }
        return resposta;
    }

}
