package exercicios.exercicio02;

public class ContaPoupanca extends Conta {
    private static double taxaSaque = 0.1; //atributo de classe

    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor + taxaSaque) {
            super.sacar(valor + taxaSaque);
        }

    }
}
