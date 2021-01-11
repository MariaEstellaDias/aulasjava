package exemplos.exemplo01;

/**
 * Funcionario
 */
public class Funcionario {
    // atributos
    private String nome;
    private double salario;

    // método
    public Funcionario(){} //construtor default
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    // método

    public String exibir() {
        return nome + ": " + salario;
    }
    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}