import java.util.Scanner;

public class PrecoProduto {
    public static void main(String[] args) {
        float produto = 0;
        float novoPreco = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o preço do produto: R$");
        produto = Float.parseFloat(leitor.nextLine());

        novoPreco =  produto - ((produto * 10)/100);

        System.out.print(String.format("O preço do produto ccom desconto é: R$%.2f", novoPreco));

        leitor.close();
    }
}
