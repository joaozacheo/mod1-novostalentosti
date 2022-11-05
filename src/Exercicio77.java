import java.util.Arrays;
import java.util.Scanner;

public class Exercicio77 {
    public static void main(String[] args) {
        /*77) Faça um programa que receba dez números e armazene em uma lista. Em seguida
        solicite um outro número e armazene em uma variável chamada multiplicador. Percorra
        todo a lista e multiplique cada número pelo multiplicador e apresente em tela. */

        Integer[] listaNum = new Integer[10];
        int multiplicador = 0;
        
        Scanner leitor = new Scanner(System.in);

        for(int c = 0; c < 10; c++){
            System.out.print("Insira um número: ");
            listaNum[c] = Integer.parseInt(leitor.nextLine());
        }

        System.out.print("Insira um multiplicador: ");
        multiplicador = Integer.parseInt(leitor.nextLine());

        for(int c = 0; c < 10; c++){
            listaNum[c] = listaNum[c] * multiplicador;
        }

        System.out.println("Os números multiplicados resultam em:");
        System.out.println(Arrays.toString(listaNum));

        leitor.close();
    }
}
