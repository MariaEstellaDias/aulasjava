package exemplos;

public class Exemplo03 {

    public static void main(String[] args) {
        
        int i; //indice

        for (i = 1; i < 90; i++){ //'i' se torna LOCAL ao for
            System.out.println(i); 
        }

        System.out.println("Valor final do i eh: " + i);

    }
}
