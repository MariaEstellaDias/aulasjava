package exercicios.exercicio02;

public class AppContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111);
        ContaEspecial ce = new ContaEspecial(222, 200);
        ContaPoupanca cp = new ContaPoupanca(333);
 
         cc.depositar(500);
         cc.sacar(200);
 
         System.out.println(cc);

         ce.depositar(300);
         ce.sacar(400);

         System.out.println(ce);

         cp.depositar(1000);
         cp.sacar(300);
         System.out.println(cp);
     }
 }
