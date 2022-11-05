import java.util.Scanner;

public class AumentoSalario2 {
    public static void main(String[] args) {
        /*30) Uma empresa decide dar um aumento de 30%
        aos funcionários com salários inferiores a R$ 500,00.
        Faça um programa que receba o salário do funcionário
        e mostre o valor do salário reajustado ou uma mensagem
        caso ele não tenha direito ao aumento.*/

        float salario = 0;
        float aumento = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira seu salário atual: ");
        salario = Float.parseFloat(leitor.nextLine());

        if(salario<=500){
            aumento = (salario * 0.3f) + salario;
            System.out.println(String.format("Seu novo salário é de R$%.2f",aumento));
        }else{
            System.out.println("Você não tem direito a aumento");
            System.out.println(String.format("Seu salário permanece no valor de R$%.2f",salario));
        }

        leitor.close();
    }
}
