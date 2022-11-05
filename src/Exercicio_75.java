import java.util.Scanner;

public class Exercicio_75 {
    public static void main(String[] args) {
        /*75) Faça um programa que receba dez números e armazene em uma lista. Em seguida calcule a
        soma de todos os números percorrendo novamente a lista. Apresente a soma e em seguida a média
        baseada na soma e no número de números armazenados. */

        Integer[] listaNum = new Integer[10];
        int soma = 0;
        int count = 0;
        float media = 0;

        Scanner leitor = new Scanner(System.in);

        for(int c = 0; c < 10; c++){
            System.out.print("Insira um número: ");
            listaNum[c] = Integer.parseInt(leitor.nextLine());
            soma = soma + listaNum[c];
            count++;
        }

        media = soma/count;

        System.out.println(String.format("A soma dos números é %d e a média dos mesmos é %.2f", soma, media));

        leitor.close();
    }
}
