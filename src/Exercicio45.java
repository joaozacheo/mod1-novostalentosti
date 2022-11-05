import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        /*45)Escreva um algoritmo que calcule o valor de desconto
        que será oferecido ao comprador de uma loja de acordo com
        o valor da compra: compras até R$100 desconto de 5%,
        compras maiores que R$ 100 e ate R$400 desconto de 10%, e
        acima de R$ 400 desconto de 13%. Após o calculo do valor
        com desconto, acrescente o valor da taxa de entrega que é
        de R$ 1,5 por item comprado.*/

        float valor = 0;
        int itens = 0;
        float desconto = 0;
        float preçoFinal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor da compra: R$");
        valor = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira a quantidade de itens comprados: ");
        itens = Integer.parseInt(leitor.nextLine());
        
        if(valor <= 100){
            desconto = valor * 0.05f;
            preçoFinal = valor - desconto + (itens * 1.5f);
            System.out.println(String.format("O desconto de 5%% é de %.2f", desconto));
            System.out.println(String.format("O valor final com desconto e taxa de entrega é de R$%.2f", preçoFinal));
        }else{
            if(valor > 100 && valor <= 400){
                desconto = valor * 0.1f;
                preçoFinal = valor - desconto + (itens * 1.5f);
                System.out.println(String.format("O desconto de 10%% é de %.2f", desconto));
                System.out.println(String.format("O valor final com desconto e taxa de entrega é de R$%.2f", preçoFinal));
            }else{
                desconto = valor * 0.13f;
                preçoFinal = valor - desconto + (itens * 1.5f);
                System.out.println(String.format("O desconto de 13%% é de %.2f", desconto));
                System.out.println(String.format("O valor final com desconto e taxa de entrega é de R$%.2f", preçoFinal)); 
            }
        }

        leitor.close();
    }
}
