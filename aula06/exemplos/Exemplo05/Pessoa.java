package exemplos.Exemplo05;

public abstract class Pessoa { //classe abstrata não instancia objeto.
    private String nome, telefone;

      public Pessoa (String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Nr Telefone: " + telefone;
    }
}
