import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String senha;
        boolean aceita;

        System.out.println("Digite sua senha: ");
        senha = entrada.nextLine();

        // System.out.println(senha.equals("R10p5"));
        // System.out.println(senha.equalsIgnoreCase("R10p5"));

        aceita = senha.equals("R10p5");

        if(aceita) {//if (aceita == true) {
            System.out.println("Acesso Concedido!");
        }else{
            System.out.println("Acesso Negado!");
        }

        entrada.close();

    }
}
