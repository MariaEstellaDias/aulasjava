package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nr, cont;

        System.out.println("Digite um valor");
        nr = entrada.nextInt();
        cont = 1;

        System.out.print("1");

        while (cont <= nr / 2) {
            cont = cont * 2;
            System.out.printf(", %d", (cont));

        }

        entrada.close();

    }

}
