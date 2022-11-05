import java.util.Scanner;

public class ConsumoRacao {
    public static void main(String[] args) {
        float quantRef = 0;
        int refDia = 0;
        float racaoMes = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quantidade de ração consumida por refeição (em gramas): ");
        quantRef = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira a quanridade de refeições por dia: ");
        refDia = leitor.nextInt();

        racaoMes = (quantRef + refDia) * 30f;

        System.out.print(String.format("A quantidade de ração consumida por mês é de : %.2f g",racaoMes));

        leitor.close();
    }
}
