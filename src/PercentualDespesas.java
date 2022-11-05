import java.util.Scanner;

public class PercentualDespesas {
    public static void main(String[] args) {
        double salario = 0;
        double despesas = 0;
        double resultado = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira seu salário atual: R$");
        salario = leitor.nextDouble();
        System.out.print("Insira suas despersas mensais: R$");
        despesas = leitor.nextDouble();

        resultado = (despesas * 100)/ salario;

        System.out.println(String.format("Suas despesas equivalem a %.2f%% do seu salário atual",resultado));

        leitor.close();
    }
}
