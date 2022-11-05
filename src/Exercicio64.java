import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        /*64) Faça um algoritmo que calcule a multiplicação de dois números inteiros sem utilizar o operador “*”.
        Em vez disso, utilize apenas o operador de adição “+”. Para implementar esse algoritmo, devemos lembrar
        que qualquer multiplicação pode ser expressa por meio de somas. Por exemplo, o resultado da expressão 6 * 3
        é o mesmo que 6 + 6 + 6 ou 3 + 3 + 3 + 3 + 3 + 3. Ou seja, soma-se um elemento com ele próprio o número de vezes do segundo elemento. */

        int num1 = 0;
        int num2 = 0;
        int mult = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.print("Insira outro número inteiro: ");
        num2 = Integer.parseInt(leitor.nextLine());

        for(int contador = 1; contador <= num1; contador++){
            mult = mult + num2;
        }

        System.out.println(String.format("A multiplicação entre %d e %d é %d", num1,num2,mult));

        leitor.close();
    }
}
