import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_74 {
    public static void main(String[] args) {
        /*74) Faça um programa que receba dez números e armazene em uma lista. Em seguida,
        substitua todos os números cujo valor seja menor que 10 pelo valor ZERO. Imprima a lista em tela. */

        Integer[] listaNum = new Integer[10];

        Scanner leitor = new Scanner(System.in);
        
        for(int c = 0; c < 10; c++){
            System.out.print("Insira um número: ");
            listaNum[c] = Integer.parseInt(leitor.nextLine());
            if(listaNum[c] < 10){
                listaNum[c] = 0;
            }
        }

        System.out.println(Arrays.toString(listaNum));

        leitor.close();
    }
}
