import java.util.Scanner;

public class Exercício39 {
    public static void main(String[] args) {
        /*39)Escreva o algoritmo de um programa que
        solicite dois números quaisquer ao usuário,
        se os números forem iguais mostre uma mensagem
        e mostre a media dos dois, caso contrário mostre
        qual o maior número e qual o menor número.*/

        int num1 = 0;
        int num2 = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira dois numeros INTEIROS");
        System.out.print("Insira o primeiro número: ");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.print("Insira o segundo número: ");
        num2 = Integer.parseInt(leitor.nextLine());

        if(num1 == num2){
            int media = 0;
            media = (num1 + num2)/2;
            System.out.println("São iguais!");
            System.out.println(String.format("A média deles é %d", media));
        }else{
            if(num1 > num2){
                System.out.println(String.format("%d é maior que %d", num1,num2));
            }else{
                System.out.println(String.format("%d é maior que %d", num2,num1));
            }
        }

        leitor.close();
    }
}
