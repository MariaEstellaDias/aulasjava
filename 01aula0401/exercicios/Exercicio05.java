import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
//Entrada

double custoFabrica, imposto, custoDistribuidor, custoFinal;

Scanner entrada = new Scanner(System.in);
System.out.println("Digite o custo de fábrica do veículo");
custoFabrica = entrada.nextDouble();

//Processamento
imposto = custoFabrica * 0.45;
custoDistribuidor = custoFabrica * 0.28;
custoFinal = custoFabrica + custoDistribuidor + imposto;

//Saída
System.out.println("Custo final: " + imposto);
System.out.println("Imposto a ser pago: " + custoFinal);


entrada.close();

    }
}
