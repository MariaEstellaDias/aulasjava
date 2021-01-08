package uri;

import java.util.Scanner;

/**
 * Uri1064
 */
public class Uri1064 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double valor;

        for (int i = 1; i <= 6; i++) {
            valor = entrada.nextDouble();
            if (valor > 0) {
                cont++;
                media += valor;
            }
        }

        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n", media);

        entrada.close();

    }
}