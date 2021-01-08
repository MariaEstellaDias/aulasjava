import java.util.Scanner;

public class Uri1004 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int prod1, prod2, prod;

        prod1 = entrada.nextInt();
        prod2 = entrada.nextInt();

        prod = prod1 * prod2;

        System.out.println("PROD = " + prod);

        entrada.close();

    }
}
