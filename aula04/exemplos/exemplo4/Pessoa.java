package exemplos.exemplo4;

public class Pessoa {
    //atributos
    String nome;
    double salario;


    //métodos

    Pessoa (String n, double s) { //método construtor, obrigatório mesmo nome da classe (classe = Pessoa)
        this.nome = n;
        this.salario = s; //'this' se refere ao próprio objeto. 
        //this.nome é o atributo
        //apenas 'nome' é o parametro do construtor.
    }
    void exibirDados(){ //método é a definição de uma ação do objeto.
        System.out.println(nome + " : " + salario);
    }
    
}
