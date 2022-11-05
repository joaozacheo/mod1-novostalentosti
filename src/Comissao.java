import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        float salario = 0;
        float vendas = 0;
        float comissao = 0;
        float salarioFinal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira seu salário fixo: R$");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o valor de suas vendas: R$");
        vendas = Float.parseFloat(leitor.nextLine());

        comissao = (vendas * 4)/100;
        salarioFinal = comissao + salario;

        System.out.print(String.format("Sua comissão é de R$%.2f e seu salário final é de R$%.2f", comissao,salarioFinal));

        leitor.close();
    }
}