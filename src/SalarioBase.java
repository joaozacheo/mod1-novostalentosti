import java.util.Scanner;

public class SalarioBase {
    public static void main(String[] args) {
        float salarioBase = 0;
        float salarioFinal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor do salário-base: R$");
        salarioBase = Float.parseFloat(leitor.nextLine());

        salarioFinal = salarioBase - (salarioBase * 0.1f) + 50;

        System.out.println(String.format("Seu salário final é de R$%.2f",salarioFinal));

        leitor.close();
    }
}
