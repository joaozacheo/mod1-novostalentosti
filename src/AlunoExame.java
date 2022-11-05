import java.util.Scanner;

public class AlunoExame {
    public static void main(String[] args) {
        /*32) Faça um programa que receba três notas de um aluno,
        calcule e mostre a média aritmética e a mensagem constante
        na tabela a seguir. Aos alunos que ficaram para exame, calcule
        e mostre a nota que deverão tirar para serem aprovados,
        considerando que a média exigida é 6.0
        Média Aritmética      Mensagem
        0,0    ●-------O     3,0      Reprovado
        3,0    ●-------O     7,0   Exame
        7,0    ●-------● 10,00 Aprovado*/

        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float media = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira sua primeira nota: ");
        nota1 = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira sua segunda nota: ");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira sua terceira nota: ");
        nota3 = Float.parseFloat(leitor.nextLine());

        media = (nota1 + nota2 + nota3)/3;

        if(media < 3){
            System.out.println("Reprovado");
        }

        if(3 <= media && media < 7){
            float notaExame = 0;
            System.out.println("Exame");
            notaExame = 24 - (nota1 + nota2 + nota3);
            System.out.println(String.format("Você deve tirar pelo menos %.2f para ser aprovado",notaExame));

        }

        if(media >= 7){
            System.out.println("Aprovado");
        }

        leitor.close();
    }
}
