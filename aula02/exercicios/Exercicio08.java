import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        System.out.printf("Digite lado 1: ");
        a = entrada.nextInt();

        System.out.printf("Digite lado 2: ");
        b = entrada.nextInt();

        System.out.printf("Digite lado 3: ");
        c = entrada.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && a == c) {
                System.out.printf("Triângulo Equilatero\n");
            } else {
                if (a == b || a == c || b == c) {
                    System.out.printf("Triângulo Isosceles\n");
                } else {
                    System.out.printf("Triângulo Escaleno\n");
                }
            }

        } else {
            System.out.printf("Os 3 lados não formam um triângulo!\n");
        }

        entrada.close();
    }
}
