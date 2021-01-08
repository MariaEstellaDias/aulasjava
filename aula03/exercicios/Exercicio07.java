package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        int qtdeTurma = 3;
        int qtdeAluno = 3;
        double somaTurma = 0;
        double mediaTurma = 0;
        double mediaAluno;
        Scanner entrada = new Scanner(System.in);

        for (int turma = 1; turma <= qtdeTurma; turma++) {
            for (int aluno = 1; aluno <= qtdeAluno; aluno++) {
                System.out.println("Entre com a média do aluno " + aluno + " da turma " + turma);
                mediaAluno = entrada.nextDouble();
                somaTurma = somaTurma + mediaAluno;
            }
            System.out.println("Média da turma " + turma + " é: " + (somaTurma / qtdeAluno));
            mediaTurma = mediaTurma + (somaTurma / qtdeAluno);
            somaTurma = 0;
        }
        System.out.println("A média geral das turmas é " + (mediaTurma / qtdeTurma));

        entrada.close();

    }
}
