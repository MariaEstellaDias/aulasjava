package exercicios.exercicio4;

public class App {

    public static void main(String[] args) {
        Relogio horario = new Relogio(16,44,44);

        horario.exibirHora();

        horario.setHora(18);
                
        horario.exibirHora();
        System.out.println("Hora atual: " + horario.getHora());
        System.out.println("Minuto atual: " + horario.getMinuto());
        System.out.println("Segundo atual: " + horario.getSegundo());
    }
}
