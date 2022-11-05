import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        /*66) Faça um algoritmo que calcule a soma de todos os números ímpares dentro de uma
        faixa de valores determinada pelo usuário. Um número é ímpar quando sua divisão por 2
        não é exata, ou seja, o resto resultante da divisão inteira pelo número 2 tem valor 1.
        Utilize a palavra resto como operador que calcula o resto da divisão de um numero por outro. */

        float num1 = 0;
        float num2 = 0;
        float soma = 0;
        float resto = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        num1 = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o segundo número: ");
        num2 = Float.parseFloat(leitor.nextLine());

        for(float c = num1; c <= num2; c++){
            resto = c % 2;
            if(resto == 1){
                soma = soma + c;
            }
        }

        System.out.println(String.format("Soma dos ímpares: %.0f", soma));

        leitor.close();
    }
}
