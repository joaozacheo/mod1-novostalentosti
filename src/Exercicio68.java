import java.util.Scanner;

public class Exercicio68 {
    public static void main(String[] args) {
        /*68) Faça um algoritmo que calcule a média de todas as turmas de uma escola. Considere como entradas
        o número de turmas e o número de alunos de cada turma. A média de cada turma deve ser apresentada,
        além da média geral, que será o resultado da média das turmas. */

        int turmas = 0;
        int alunos = 0;
        float nota = 0;
        float mediaTurma = 0;
        float somaGeral = 0;
        float mediaGeral = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o número de turmas: ");
        turmas = Integer.parseInt(leitor.nextLine());

        for(int t = 1; t <= turmas; t++){
            float soma = 0;
            System.out.println("  ");
            System.out.println(String.format("Turma %d:", t));
            System.out.print("Insira o número de alunos: ");
            alunos = Integer.parseInt(leitor.nextLine());

            for(int a = 1; a <= alunos; a++){                
                System.out.print("Insira a média deste aluno: ");
                nota = Float.parseFloat(leitor.nextLine());
                soma = soma + nota;
            }

            mediaTurma = soma/alunos;
            System.out.println("  ");
            System.out.println(String.format("A média desta turma é %.2f", mediaTurma));
            somaGeral = somaGeral + mediaTurma;
        }

        mediaGeral = somaGeral/turmas;

        System.out.println("  ");
        System.out.println(String.format("A média de todas as turmas é %.2f", mediaGeral));

        leitor.close();        
    }
}
