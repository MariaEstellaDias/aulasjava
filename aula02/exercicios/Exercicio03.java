import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double a, b;

        System.out.println("Digite primeiro valor: ");
        a = entrada.nextDouble();

        System.out.println("Digite segundo valor: ");
        b = entrada.nextDouble();

        if (a > b){
            System.out.println((a) + "," + (b));
        }else{
            System.out.println((b) + "," + (a));
        }
        entrada.close();

    }
}
