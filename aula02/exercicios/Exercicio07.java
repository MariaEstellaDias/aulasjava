import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.println("Digite o salário: ");
        salario = entrada.nextDouble();

        if (salario > 2000) {
            System.out.println("Desconto de 30%");
        } else {
            if (salario > 1200) {
                System.out.println("Desconto de 25%");
            } else {
                if (salario > 600) {
                    System.out.println("Desconto de 20%");
                } else{
                    System.out.println("Isento");
                }
            }
        }

        entrada.close();
    }
}
