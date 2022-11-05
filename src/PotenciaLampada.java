import java.util.Scanner;

public class PotenciaLampada {
    public static void main(String[] args) {
        float dimensao1 = 0;
        float dimensao2 = 0;
        float area = 0;
        float watts = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o commprimento (m) da primeira dimensão do cômodo: ");
        dimensao1 = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o commprimento (m) da segunda dimensão do cômodo: ");
        dimensao2 = Float.parseFloat(leitor.nextLine());

        area = dimensao1 * dimensao2;
        watts = area * 18f;

        System.out.println(String.format("A potencia necessária para iluminar o cômodo é de %.0fwatts", watts));

        leitor.close();
    }
}
