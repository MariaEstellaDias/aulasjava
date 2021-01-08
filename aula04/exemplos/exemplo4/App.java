package exemplos.exemplo4;

public class App {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Maria", 2000); //criação objeto, e chamada do construtor.
        Pessoa pessoa2 = new Pessoa("Nelson", 500); //

        pessoa1.exibirDados();
        pessoa2.exibirDados();
    }
}
