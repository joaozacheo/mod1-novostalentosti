import java.util.Scanner;

public class ContasAtrasadas {
    public static void main(String[] args) {
        float conta1 = 0;
        float conta2 = 0;
        float salario = 0;
        float valorPagamento = 0;
        float restoSalario = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor da primeira conta: R$");
        conta1 = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o valor da segunda conta: R$");
        conta2 = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o valor do seu salario: R$");
        salario = Float.parseFloat(leitor.nextLine());

        valorPagamento = ((conta1 * 0.02f)+ conta1) + ((conta2 * 0.02f)+ conta2);
        restoSalario = salario - valorPagamento;

        System.out.println(String.format("Você devera pagar R$%.2f", valorPagamento));
        System.out.print(String.format("Pagando as contas, restam R$%.2f do seu salário", restoSalario));

        leitor.close();
    }
}
