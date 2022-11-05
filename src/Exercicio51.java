import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        /*51)Faça um programa que receba o número de horas trabalhadas, o valor do salário mínimo
        e o número de horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as regras abaixo:
        a) a hora trabalhada vale 1/8 do salário mínimo;
        b) a hora extra vale ¼ do salário mínimo;
        c) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalha (apresente o valor para o usuário);
        d) a quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas multiplicado pelo
        valor da hora extra (apresente o valor para o usuário);
        e) o salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras(apresente o valor para o usuário);
        */

        float horasTrab = 0;
        float salMinimo = 0;
        float horaExtra = 0;
        float valorHT = 0;
        float valorHE = 0;
        float salBruto = 0;
        float valorExtra = 0;
        float salFinal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quantidade das horas trabalhadas: ");
        horasTrab = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o valor de um salário mínimo: ");
        salMinimo = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira a quantidade de horas extras trabalhadas: ");
        horaExtra = Float.parseFloat(leitor.nextLine());

        valorHT = salMinimo/8;
        valorHE = salMinimo/4;
        salBruto = horasTrab * valorHT;
        valorExtra = horaExtra * valorHE;
        salFinal = salBruto + valorExtra;

        System.out.println(String.format("O salário bruto é de R$%.2f", salBruto));
        System.out.println(String.format("O valor a receber pelas horas extras é de R$%.2f", valorExtra));
        System.out.println(String.format("O salário final a receber é de R$%.2f", salFinal));

        leitor.close();
    }
}
