import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        /*44)Escreva um algoritmo que calcule o valor de uma
        chamada de telefone. Deverá ser informado a quantidade
        de minutos falados durante a ligação além de sua origem.
        Considere que uma ligação “local” custa R$0.020, ligação
        “intermunicipal” R$0,08 e “interestadual” R$0,1.*/

        int minutos = 0;
        int origem = 0;
        float custo = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quantidade de minutos: ");
        minutos = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a opção que corresponde ao tipo de ligação:");
        System.out.println("1. Ligação local");
        System.out.println("2. Ligação intermunicipal");
        System.out.println("3. Ligação interestadual");
        origem = Integer.parseInt(leitor.nextLine());

        switch (origem) {
            case 1:
                custo = minutos * 0.02f;
                System.out.println(String.format("O custo da ligação é de R$%.2f", custo));
            break;

            case 2:
                custo = minutos * 0.08f;
                System.out.println(String.format("O custo da ligação é de R$%.2f", custo));
            break;

            case 3:
                custo = minutos * 0.1f;
                System.out.println(String.format("O custo da ligação é de R$%.2f", custo));
            break;
        
            default:
                System.out.println("Essa opção não existe");
            break;
        }

        leitor.close();
    }
}
