import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        /*65) Faça um algoritmo que leia um número inteiro e calcule o seu fatorial. Se o número for negativo,
        informe que o valor é inválido. Sabemos que o fatorial de um número n, representado por n!, é dado por:
        n * (n-1) * (n-2) * ... * 1, para n > 0 e n! = 1 para n = 0 */

        float num1 = 0;
        float fatorial = 1;
        float resto = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        num1 = Float.parseFloat(leitor.nextLine());

        resto = num1 % 2;

        if(num1 < 0 || resto != 0){
            System.out.println("Número inválido");
        }else{
            for(float f = num1; f >= 1; f--){
                fatorial = fatorial * f;
            }
            System.out.print(fatorial);
        }

        leitor.close();
    }
}
