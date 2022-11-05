import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        /*73) Faça um programa que receba dez números e armazene em uma lista. Em seguida conte quantos
        números são impar e quantos são par. Apresente os contadores na tela. */

        int num = 0;
        float resto = 0;
        int cont = 0;
        int contPar = 0;

        Scanner leitor = new Scanner(System.in);

        for(int c = 0; c < 10; c++){
            System.out.print("Insira um número: ");
            num = Integer.parseInt(leitor.nextLine());
            resto = num % 2;
            if(resto != 0){
                cont++;
            }else{
                contPar++;
            }
        }

        System.out.println(String.format("São %d números ímpares e %d números pares", cont,contPar));

        leitor.close();
    }
}
