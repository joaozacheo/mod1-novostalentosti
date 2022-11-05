import java.util.Scanner;

public class Cargos {
    public static void main(String[] args) {
        /*37)Faça um programa que receba o código correspondente ao cargo
        de um funcionário e seu salário atual e mostre o cargo, o valor do
        aumento e seu novo salário. Os cargos estão na seguinte tabela:
        Código    Cargo            Percentual
        1      Escriturário           50%
        2       Secretário            35%
        3         Caixa               20%
        4        Gerente              10%
        5        Diretor         Não tem aumento
        */

        int codigo = 0;
        float salAtual = 0;
        float aumento = 0;
        float novoSalario = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o código do seu cargo: ");
        codigo = Integer.parseInt(leitor.nextLine());
        System.out.print("Insira seu salário atual: ");
        salAtual = Float.parseFloat(leitor.nextLine());

        if(codigo == 1){
            aumento = salAtual * 0.5f;
            novoSalario = salAtual + aumento;
            System.out.println("ESCRITUÁRIO");
            System.out.println(String.format("O valor do seu aumento é de R$%.2f", aumento));
            System.out.println(String.format("Seu novo salário é de R$%.2f", novoSalario));

        }

        if(codigo == 2){
            aumento = salAtual * 0.35f;
            novoSalario = salAtual + aumento;
            System.out.println("SECRETÁRIO");
            System.out.println(String.format("O valor do seu aumento é de R$%.2f", aumento));
            System.out.println(String.format("Seu novo salário é de R$%.2f", novoSalario));

        }

        if(codigo == 3){
            aumento = salAtual * 0.2f;
            novoSalario = salAtual + aumento;
            System.out.println("CAIXA");
            System.out.println(String.format("O valor do seu aumento é de R$%.2f", aumento));
            System.out.println(String.format("Seu novo salário é de R$%.2f", novoSalario));

        }

        if(codigo == 4){
            aumento = salAtual * 0.1f;
            novoSalario = salAtual + aumento;
            System.out.println("GERENTE");
            System.out.println(String.format("O valor do seu aumento é de R$%.2f", aumento));
            System.out.println(String.format("Seu novo salário é de R$%.2f", novoSalario));

        }

        if(codigo == 5){
            System.out.println("DIRETOR");
            System.out.println("Você não tem direito à aumento");
        }

        leitor.close();
    }
}
