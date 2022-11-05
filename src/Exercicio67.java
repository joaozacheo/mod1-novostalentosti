import java.util.Scanner;

public class Exercicio67 {
    public static void main(String[] args) {
        /*67) Faça um programa que apresente os resultados de uma tabuada de um número qualquer, a qual deve ser impressa no seguinte formato:
        Considerando como exemplo o fornecimento do número 2 para o número qualquer, ter-se-ia a seguinte situação:
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        ...
        2 x 10 = 20*/

        int num1 = 0;
        int result = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o número que deseja ver a tabuada: ");
        num1 = Integer.parseInt(leitor.nextLine());

        for(int c = 1; c <= 10; c++){
            result = num1 * c;
            System.out.println(String.format("%d x %d = %d", num1,c,result));
        }

        leitor.close();
    }
}
