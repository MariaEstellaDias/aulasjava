package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int cont, soma;

        soma = 0;
        cont = 0;

        while(cont<10){
            System.out.println(cont);
            soma += cont;
            cont++; // cont = cont + 1;
        }
            System.out.println("soma = " + soma);


    }
}