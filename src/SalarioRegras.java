import java.util.Scanner;

public class SalarioRegras {
    public static void main(String[] args) {
        float horasTrabalhadas = 0;
        float salarioMin = 0;
        float hT = 0;
        float salarioBruto = 0;
        float imposto = 0;
        float salarioFinal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o número de horas trabalhadas: ");
        horasTrabalhadas = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o valor do salário míinimo: R$");
        salarioMin = Float.parseFloat(leitor.nextLine());

        hT = salarioMin/2;
        salarioBruto = horasTrabalhadas * hT;
        imposto = salarioBruto * 0.03f;
        salarioFinal = salarioBruto - imposto;

        System.out.println(String.format("O salário final tem o valor de R$%.2f",salarioFinal));

        leitor.close();
    }
}
