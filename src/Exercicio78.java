import java.util.Arrays;
import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        /*78) Faça um programa que receba dez números e armazene em uma lista. Em seguida
        copie todos os números da primeira lista para uma segunda lista, mas na ordem invertida da primeira lista. */

        Integer[] listaNum = new Integer[10];
        Integer[] lista2 = new Integer[10];
        int ordem = 0;

        Scanner leitor = new Scanner(System.in);

        for(int c = 0; c < 10; c++){
            System.out.print("Insira um número: ");
            listaNum[c] = Integer.parseInt(leitor.nextLine());
        }

        for(int i = 9; i >= 0; i--){
            lista2[ordem] = listaNum[i];
            ordem++;
        }

        System.out.println("A lista invertida fica: " + Arrays.toString(lista2));

        leitor.close();
    }
}
