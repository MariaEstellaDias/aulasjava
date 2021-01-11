package exemplos.exemplo01;

/**
 * Funcionario
 */
public class Funcionario { //extends Object { //implicito
    // atributos
    private String nome;
    private double salario;

    // método
    public Funcionario() {
    } // construtor default

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        setSalario(salario);
    }
    // método

    public String exibir() {
        return nome + ": " + salario;
    }

    public double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }

    }

    @Override
    public String toString() {
        return exibir();
    }

    public void aumentarSalario(double taxa) {
        salario = salario + salario * taxa;
    }
}