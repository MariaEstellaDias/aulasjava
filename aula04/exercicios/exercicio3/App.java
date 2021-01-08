package exercicios.exercicio3;

public class App {
    
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Gol", "Wolksvagen", 9.0) ;

                
        veiculo1.exibirDados();
        System.out.println("Consumo: " + veiculo1.ResultadoConsumo());

    }
}
