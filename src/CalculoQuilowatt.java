import java.util.Scanner;

public class CalculoQuilowatt {
    public static void main(String[] args) {
        float salarioMin = 0;
        float valorResidencia = 0;
        float quilowatt = 0;
        float valorQW = 0;
        float valorDesconto = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor de um salário mínimo: R$");
        salarioMin = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira a quantidade de quilowatts consumida na residência: ");
        valorResidencia = Float.parseFloat(leitor.nextLine());

        quilowatt = salarioMin/5;
        valorQW = valorResidencia * quilowatt;
        valorDesconto = valorQW - (valorQW * 0.15f);

        System.out.println(String.format("O valor por quilowatt é de R$%.2f",quilowatt));
        System.out.println(String.format("O valor a ser pago pela residência é de R$%.2f",valorQW));
        System.out.println(String.format("O valor a ser pago pela residência com desconto de 15%% é de R$%.2f", valorDesconto));

        leitor.close();
    }
}
