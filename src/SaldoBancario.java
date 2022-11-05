import java.util.Scanner;

public class SaldoBancario {
    public static void main(String[] args) {
        float salario = 0;
        float cheque1 = 0;
        float cheque2 = 0;
        float saldo = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor do salario recebido: R$");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o valor do primeiro cheque emitido: R$");
        cheque1 = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o valor do segundo cheque emitido: R$");
        cheque2 = Float.parseFloat(leitor.nextLine());

        saldo = salario - ((cheque1 * 0.0038f) + (cheque2 * 0.0038f) + cheque1 + cheque2);

        System.out.println(String.format("O seu saldo é de R$%.2f", saldo));

        leitor.close();
    }
}
