import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        /*52)Um supermercado deseja reajustar os preços de seus produtos usando o seguinte critério:
        o produto poderá ter seu preço aumentado ou diminuído. Para alterar o preço o produto deve
        preencher pelo menos um dos requisitos a seguir:
 
        Requisitos                                     |Reajuste
        -----------------------------------------------+-------------------------------------
        Venda Média Mensal          Preço Atual        | % de Aumento    % de Redução
        -----------------------------------------------+-------------------------------------
        < R$ 500                              < R$ 30  |     12               não    
        >= 500 e < 1.600           >= R$ 30 e < R$ 80  |     15               não    
        >= 1.600                          >= R$ 80,00  |     não               25
        */

        float precoAtual = 0;
        float vendaMensal = 0;
        float novoPreco = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o preço atual: ");
        precoAtual = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira a venda média mensal: ");
        vendaMensal = Float.parseFloat(leitor.nextLine());

        if(vendaMensal < 500 && precoAtual < 30){
            novoPreco = precoAtual*1.12f;
            System.out.println(String.format("O novo preço do produto é R$%.2f", novoPreco));
        }else{
            if(vendaMensal >= 500 && vendaMensal < 1600 && precoAtual >= 30 && precoAtual < 80){
                novoPreco = precoAtual * 1.15f;
                System.out.println(String.format("O novo preço do produto é R$%.2f", novoPreco));
            }else{
                if(vendaMensal >= 1600 && precoAtual >= 80){
                    novoPreco = precoAtual - (precoAtual*0.25f);
                    System.out.println(String.format("O novo preço do produto é R$%.2f", novoPreco));
                }else{
                    System.out.println("Não tem mudança de preço");
                }
            }
        }

        leitor.close();
    }
}
