package exercicios.exercicio02;

import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao, numeroConta;
        double limite, valor;
        GerenciaContas gerencia = new GerenciaContas();

        do {
            System.out.println("1) Nova Conta Corrente");
            System.out.println("2) Nova Conta Especial");
            System.out.println("3) Nova Conta Poupança");
            System.out.println("4) Consulta Saldo");
            System.out.println("5) Saque");
            System.out.println("6) Depósito");
            System.out.println("7) Sair");
            System.err.print("==> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    gerencia.novaContaCorrente(numeroConta);
                    break;
                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe limite da conta:");
                    limite = teclado.nextDouble();
                    gerencia.novaContaEspecial(numeroConta, limite);
                    break;
                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    gerencia.novaContaPoupanca(numeroConta);
                    break;
                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println(gerencia.consultaSaldo(numeroConta));
                    break;
                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor:");
                    valor = teclado.nextDouble();
                    if(gerencia.sacar(numeroConta, valor)){
                        System.out.println("Saque efetuado");
                    }else{
                        System.out.println("Saque não realizado");
                    }
                    break;
                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor:");
                    valor = teclado.nextDouble();
                    if(gerencia.depositar(numeroConta, valor)){
                        System.out.println("Depósito efetuado");
                    }else{
                        System.out.println("Depósito não realizado");
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 7);

        teclado.close();

    }
}
