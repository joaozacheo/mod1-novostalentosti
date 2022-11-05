import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        /*61) Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total
        do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o
        usuário estiver fornecedor valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo. */

        float valores = 0;
        float soma = 0;
        float media = 0;

        Scanner leitor = new Scanner(System.in);

        do{
            System.out.print("Insira um número natural: ");
            valores = Float.parseFloat(leitor.nextLine());
            soma = soma + valores;

            if(valores < 0) break;

        }while(valores >= 0);

        soma = soma - valores;
        media = (soma - valores)/10;

        System.out.println(String.format("%.2f", soma));
        System.out.println(String.format("%.2f", media));

        leitor.close();
    }
}
