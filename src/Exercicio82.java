import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        /*82) Faça um programa para corrigir provas de múltipla escolha com somatória. Cada prova tem dez questões e cada
        questão vale 1 ponto. O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros dados serão os números
        dos alunos e sua respectivas respostas. Existem 15 alunos matriculados. Calcule e mostre:
        - Para cada aluno seu número e sua nota;
        - A percentagem de aprovação, sabendo-se que a nota mínima é 6,0  */

        Integer[] gabarito = new Integer[10]; //12, 34, 26, 6, 18, 4, 20, 36, 24, 13
        Integer[] alunos = new Integer[15];
        Integer[] pontos = new Integer[10];
        int somaQuest = 0;
        int aprovados = 0;
        float percAprov = 0;

        Scanner leitor = new Scanner(System.in);

        //Leitura do gabarito
        System.out.println("GABARITO:");
        for(int c = 0; c < 10; c++){
            int d = c + 1;
            System.out.print("Resposta da questão " + d + ": ");
            gabarito[c] = Integer.parseInt(leitor.nextLine());
        }

        //Leitura dos alunos e notas
        for(int c = 0; c < 15; c++){
            somaQuest = 0;
            System.out.println(" ");
            System.out.print("Insira o número do aluno: ");
            alunos[c] = Integer.parseInt(leitor.nextLine());

            for(int i = 0; i < 10; i++){
                int d = i + 1;
                System.out.print("Insira a respota da questão " + d + ": ");
                pontos[i] = Integer.parseInt(leitor.nextLine());
                if(pontos[i].equals(gabarito[i])){
                    somaQuest++;
                }
            }

            if(somaQuest >= 6){
                aprovados++;
            }

            System.out.println("Esse aluno acertou " + somaQuest + "/10");
        }

        percAprov = (aprovados * 100)/alunos.length;
        System.out.println(String.format("O percentual de aprovados é %.2f%%", percAprov));

        leitor.close();
    }
}
