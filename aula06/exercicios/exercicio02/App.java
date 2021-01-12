package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa("João", "(11) 987678567");
        Estudante e = new Estudante("Maria", "(11) 982289387", "Biologia");
        Professor p = new Professor("José", "(11) 987678942", 3000);

        //System.out.println(p1);
        //System.out.println(e);
        //System.out.println(p);

        Pessoa pe = e; // new e ("Maria", "(11) 982289387", "Biologia");
        System.out.println(pe);
        pe = p;
        System.out.println(pe);
    }
}
