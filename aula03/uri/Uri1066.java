package uri;

import java.util.Scanner;

public class Uri1066 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            valor = entrada.nextInt();
            if (valor % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (valor > 0) {
                positivo++;
            }
            if (valor < 0) {
                negativo++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);

        entrada.close();

    }
}
