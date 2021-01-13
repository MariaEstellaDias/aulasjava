package exercicios.exercicio02;

import java.util.ArrayList;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        // ContaCorrente cc = new ContaCorrente(numeroConta);
        // contas.add(cc);
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.add(new ContaPoupanca(numeroConta));
    }

    public String consultaSaldo(int numeroConta) {
        for (Conta item: contas) {
            if (item.getNumero() == numeroConta) {
                return item.toString();
            }
        }

        return "Conta não encontrada";
    }

    public boolean sacar(int numeroConta, double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                conta.sacar(valor);
            }
        }
        return false; //não encontrou a conta
    }

    public boolean depositar(int numeroConta, double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta.depositar(valor);
            }
        }
        return false;
    }
}
