import java.util.Scanner;

/**
 * Uri1048
 */
public class Uri1048 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salario = entrada.nextDouble();
        double novo1 = salario + (salario*0.15), reajuste1 = (salario*0.15);
        double novo2 = salario + (salario*0.12), reajuste2 = (salario*0.12);
        double novo3 = salario + (salario*0.10), reajuste3 = (salario*0.10);
        double novo4 = salario + (salario*0.07), reajuste4 = (salario*0.07);
        double novo5 = salario + (salario*0.04), reajuste5 = (salario*0.04);

        if(salario >= 0.00 && salario <= 400.00){
            System.out.printf("Novo salario: %.2f\n" , novo1);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste1);
            System.out.println("Em percentual: 15 %");
        } else
        if(salario >= 400.01 && salario <= 800.00) {
            System.out.printf("Novo salario: %.2f\n" , novo2);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste2);
            System.out.println("Em percentual: 12 %");
        } else
        if(salario >= 800.01 && salario <= 1200.00){
            System.out.printf("Novo salario: %.2f\n" , novo3);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste3);
            System.out.println("Em percentual: 10 %");
        } else
        if(salario >= 1200.01 && salario <= 2000.00){
            System.out.printf("Novo salario: %.2f\n" , novo4);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste4);
            System.out.println("Em percentual: 7 %");
        } else
        if(salario >2000.01){
            System.out.printf("Novo salario: %.2f\n" , novo5);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste5);
            System.out.println("Em percentual: 4 %");
        }

        entrada.close();
    }
}