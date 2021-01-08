import java.util.Scanner;

public class Uri1010 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int codItem1 = entrada.nextInt();
        int qtdItem1 = entrada.nextInt();
        double valorItem1 = entrada.nextDouble();
        int codItem2 = entrada.nextInt();
        int qtdItem2 = entrada.nextInt();
        double valorItem2 = entrada.nextDouble();

        double  valorTotal = (qtdItem1 * valorItem1) + (qtdItem2 * valorItem2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        entrada.close();

    }
}
