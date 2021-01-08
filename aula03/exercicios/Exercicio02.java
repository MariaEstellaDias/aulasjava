package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, cont;

        System.out.println("Digite um valor para mostrar a tabuada");
        n = entrada.nextInt();

        cont = 0;

        while (cont <= 10) {
            //System.out.println(n + " x " + cont + " = " + (cont * n));
            //System.out.printf("%d x %2d , %2d\n" , n, cont, (cont * n));
            System.out.printf("%d x %02d , %2d\n" , n, cont, (cont * n));
            cont++;
        }

        entrada.close();
        
    }
}
