import java.util.Scanner;

public class Exercicio76 {
    public static void main(String[] args) {
        /*76) Faça um programa que receba dez números e armazene em uma lista. Em seguida percorra
        toda a lista e procure qual o MAIOR valor dentro da lista e qual o MENOR valor dentro da lista.
        No final apresente o MAIOR e o MENOR valor. */

        Integer[] listaNum = new Integer[10];
        int maior = 0;
        int menor = 0;

        Scanner leitor = new Scanner(System.in);

        for(int c = 0; c < 10; c++){
            System.out.print("Insira um número: ");
            listaNum[c] = Integer.parseInt(leitor.nextLine());
            if(c == 0 || listaNum[c] < menor){
                menor = listaNum[c];
            }else{
                if(listaNum[c] > maior){
                    maior = listaNum[c];
                }
            }
        }

        System.out.println(String.format("O maior valor é %d e o menor é %d", maior, menor));

        leitor.close();
    }
}
