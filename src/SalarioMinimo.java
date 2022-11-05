import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        float salarioMin = 0;
        float seuSalario = 0;
        float resultado = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor de um salário mmínimo: R$");
        salarioMin = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o valor do seu salário: R$");
        seuSalario = Float.parseFloat(leitor.nextLine());

        resultado = seuSalario/salarioMin;

        System.out.print(String.format("O seu salário equivale a %.1f salários mínimos", resultado));

        leitor.close();


    }
}
