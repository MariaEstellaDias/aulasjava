package exercicios.exercicio02;

public class App {
     public static void main(String[] args) {
         Estudante e = new Estudante("Maria", "982289387", "Biologia");
         Professor p = new Professor("José", "987678942", 3000);

         System.out.println(e);
         System.out.println(p);
     }
}
