import java.util.Arrays;
import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        /*80) Faça um programa que carregue dois vetores de dez elementos numéricos cada um e mostre um vetor
        resultante da intercalação desses dois vetores. */

        Float[] vetor1 = new Float[10];
        Float[] vetor2 = new Float[10];
        Float[] vetorFinal = new Float[20];
        int conta1 = 0;
        int conta2 = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Vetor 1");

        for(int c = 0; c < 10; c++){
            System.out.print("Insira um número: ");
            vetor1[c] = Float.parseFloat(leitor.nextLine());   
        }

        System.out.println("Vetor 2");

        for(int c = 0; c < 10; c++){
            System.out.print("Insira um número: ");
            vetor2[c] = Float.parseFloat(leitor.nextLine());   
        }

        for(int c = 0; c < 20; c++){
            float resto = c % 2;

            if(resto == 0){
                vetorFinal[c] = vetor1[conta1];
                conta1++;
            }else{
                vetorFinal[c] = vetor2[conta2];
                conta2++;
            }            
        }    
        
        System.out.println(Arrays.toString(vetorFinal));

        leitor.close();
    }
}
