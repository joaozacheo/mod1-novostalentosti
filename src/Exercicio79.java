import java.util.Scanner;

public class Exercicio79 {
    public static void main(String[] args) {
        /*79) Faça um programa que receba a quantidade de peças vendidas por vendedor e armazene essas quantidades em um vetor.
        Receba também o preço da peça vendida de cada vendedor e armazene esses preços em outro vetor. Existem apenas dez vendedores
        e cada vendedor pode vender apenas um tipo de peça, isto é, para cada vendedor existe apenas um preço. Calcule e mostre a
        quantidade total de peças vendidas por todos os vendedores e para cada vendedor calcule e mostre o valor total da venda, isto é,
        a quantidade de peças * o preço da peça. */

        Integer[] quantPecas = new Integer[10];
        Float[] precoPecas = new Float[10];
        int quantTotal = 0;
        float venda = 0;

        Scanner leitor = new Scanner(System.in);

        for(int c = 0; c < 10; c++){
            int d = c + 1;
            System.out.println(" ");
            System.out.println("Vendedor " + d);
            System.out.print("Insira a quantidade de peças vendidas: ");
            quantPecas[c] = Integer.parseInt(leitor.nextLine());
            System.out.print("Insira o preço da peça: R$");
            precoPecas[c] = Float.parseFloat(leitor.nextLine());

            quantTotal = quantTotal + quantPecas[c];
            venda = quantPecas[c] * precoPecas[c];
            System.out.println(String.format("O preço total da sua venda é de: R$%.2f", venda));
        }

        System.out.println("  ");
        System.out.println(String.format("O total de peças vendidas por todos os vendores é %d",quantTotal));

        leitor.close();
    }
}
