import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        float salario = 0;
        float percAumento = 0;
        float aumento = 0;
        float salarioFinal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o seu salário atual: R$");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o percentual de aumento: ");
        percAumento = Float.parseFloat(leitor.nextLine());

        aumento = salario * (percAumento/100);
        salarioFinal = aumento + salario;

        System.out.println(String.format("O valor do aumento é de R$%.2f", aumento));
        System.out.println(String.format("O valor do salario com aumento é de R$%.2f", salarioFinal));

        leitor.close();
    }
}
