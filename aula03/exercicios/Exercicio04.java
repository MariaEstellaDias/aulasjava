package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, cont, soma;

        numero = 1;
        soma = 0;
        cont = 1;

        while (numero != 0) {
            System.out.printf("Digite o %d número: ", cont);
            numero = entrada.nextInt();
            cont++;
            soma = soma + numero;
        }

        System.out.printf("A soma dos valores é de: %d", soma);
        
        entrada.close();
    }
}
