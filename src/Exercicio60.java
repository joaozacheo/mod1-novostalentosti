import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        /*60) Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do somatório e a média do total. */

        float valores = 0;
        float soma = 0;
        float media = 0;

        Scanner leitor = new Scanner(System.in);

        for(float contador = 1; contador <= 10; contador++){
            System.out.println("Insira 1 valor: ");
            valores = Float.parseFloat(leitor.nextLine());
            soma = soma + valores;
        }

        media = soma/10;

        System.out.println(soma);
        System.out.println(media);

        leitor.close();
    }
}
