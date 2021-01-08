package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        final int qtidade = 10; // constante
        Scanner entrada = new Scanner(System.in);
        int valor, qtdePares, qtdeImpares;
        double mediaPares;
        
        mediaPares = 0;
        qtdePares = 0;
        qtdeImpares = 0;
    

        for (int i = 1; i <= qtidade; i++){
            System.out.printf("Digite o %dº número: ", i);
            valor = entrada.nextInt();

            if(valor % 2 == 0){
                mediaPares = mediaPares + valor;
                qtdePares++;
            }else{
                qtdeImpares++;
            }
        }
        if(qtdePares > 0){
            mediaPares = mediaPares / qtdePares;
            System.out.println("Média dos pares = " + mediaPares);
        }else{
            System.out.println("Nenhum número par foi digitado.");
        }
        
System.out.printf("Números ímpares = %.2f %%\n" , ((double)qtdeImpares / qtidade) * 100);
        

        entrada.close();
    }
}
