import java.util.Scanner;

public class ValorFotos {
    public static void main(String[] args) {
        int fotos = 0;
        float valor = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quantidade de fotos: ");
        fotos = leitor.nextInt();

        valor = fotos * 0.90f;

        System.out.print(String.format("O valor final é de: R$%.2f", valor));

        leitor.close();
    }
}
