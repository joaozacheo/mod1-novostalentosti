import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        /*57) Faça um programa que leia um valor N inteiro e positivo. Calcule e mostre o valor de E, conforme a fórmula a seguir:
        E = 1 + 1/(1!) + 1/(2!) + 1/(3!) + ... + 1/(N!) */

        float n = 0;
        float resto = 0;
        int nInt = 0;
        float fact = 1;
        float e = 1;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um número inteiro e positivo: ");
        n = Float.parseFloat(leitor.nextLine());

        nInt = (int)n;
        resto = n - nInt;
        
        if(n < 0 || resto > 0){
            System.out.println("Número inválido");
        }else{
            for (float i = n; i >= 1; i--) {
                fact = fact * i;
                e = e + 1/(fact);
            }
            System.out.println(String.format("%.5f", e));            
        }

        leitor.close();
    }
}
