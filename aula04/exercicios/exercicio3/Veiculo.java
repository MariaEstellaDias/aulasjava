package exercicios.exercicio3;

public class Veiculo {
    
    //atributos
    String modelo;
    String marca;
    Double consumo;

    //métodos

    Veiculo (String modelo, String marca, double consumo) { //método construtor, obrigatório mesmo nome da classe (classe = Pessoa)
        this.modelo = modelo;
        this.marca = marca; 
        this.consumo = consumo;
    }
    void exibirDados(){ //método é a definição de uma ação do objeto.
        System.out.println("Veículo: " + modelo + " : " + marca);
    }
    double ResultadoConsumo() {
        return consumo;
    }
    
}
