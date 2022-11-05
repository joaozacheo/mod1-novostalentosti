import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        /*34)Faça um programa que receba o salário-base de um funcionário,
        calcule e mostre o salário a receber, sabendo-se que esse funcionário
        tem gratificação de 5% sobre o salário base e paga imposto de 7%
        sobre o salário-base. */

        float salBase = 0;
        float imposto = 0;
        float gratificação = 0;
        float salFinal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o salário base: R$");
        salBase = Float.parseFloat(leitor.nextLine());
        
        imposto = salBase * 0.07f;
        gratificação = salBase * 0.05f;
        salFinal = (salBase + gratificação) - imposto;

        System.out.println(String.format("Você de recceber um salário de R$%.2f", salFinal));

        leitor.close();
    }
}
