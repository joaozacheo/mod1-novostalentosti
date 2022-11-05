import java.util.Scanner;

public class ProcedenciaProduto {
    public static void main(String[] args) {
        /*38) Faça um programa que receba o preço de um produto e o
        seu código de origem e mostre a sua procedência. A procedência
        obedece a tabela a seguir:
        Código de origem    Procedência
        1                       Sul
        2                      Norte
        3                      Leste
        4                      Oeste
        5 ou 6                Noroeste
        7 ou 8 ou 9           Sudeste
        10 a 20             Centro-Oeste
        21 a 30               Nordeste
        */

        float precoProd = 0;
        int codigoProd = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o preço do produto: R$");
        precoProd = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o código do produto: ");
        codigoProd = Integer.parseInt(leitor.nextLine());

        System.out.println(String.format("O preço do produto é: R$%.2f",precoProd));

        if(codigoProd == 1){
            System.out.println("Procedência: Sul");
        }
        if(codigoProd == 2){
            System.out.println("Procedência: Norte");
        }
        if(codigoProd == 3){
            System.out.println("Procedência: Leste");
        }
        if(codigoProd == 4){
            System.out.println("Procedência: Oeste");
        }
        if(codigoProd == 5 | codigoProd == 6){
            System.out.println("Procedência: Noroeste");
        }
        if(codigoProd == 7 | codigoProd == 8 | codigoProd == 9){
            System.out.println("Procedência: Sudeste");
        }
        if(10 <= codigoProd && codigoProd <= 20){
            System.out.println("Procedência: Centro-Oeste");
        }
        if(21 <= codigoProd && codigoProd <= 30){
            System.out.println("Procedência: Nordeste");
        }

        leitor.close();
    }
}
