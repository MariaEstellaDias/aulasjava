package exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;

        for (int i = 1; i <= 10; i++) {
            num = entrada.nextInt();

            if (num % 2 == 0) {
                contPar++;
            }

            if (num % 2 == 1) {
                contImpar++;

            }
        }

        System.out.println("Foram digitados " + contPar + " numeros pares \n");
        System.out.println("E " + contImpar + " numeros impares \n");

        entrada.close();
    }
}
