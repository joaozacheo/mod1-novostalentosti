import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        /*74)Faça um programa que receba o valor do salário mínimo e uma lista contendo a quantidade
        de quilowatts gasta por consumidor e o tipo do consumidor (1-Residencial, 2-Comercial, 3-Industrial).
        Calcule e mostre:
        - O valor de cada quilowatt, sabendo que o quilowatt custa 1/8 do salário mínimo;
        - O valor a ser pago por cada consumidor (conta final mais acréscimos), considerando que o acréscimo é o mesmo da tabela a seguir:
        
        ------------+-----------------------------------
        Tipo           | % de acréscimo sobre o valor gasto
        ------------+-----------------------------------
        1                |               5
        2                |              10
        3                |              15
        ------------+-----------------------------------
        - O faturamento geral da empresa
        - a quantidade de consumidores que pagam entre R$ 500,00 e R$ 1000,00
        Termine a entrada de dados quando a quantidade de quilowatts digitada for igual a zero.*/

        float salMin = 0;
        float kwConsumidor = 1;
        float valorKw = 0;
        int tipoConsumidor = 0;
        float valorPago = 0;
        float valorSemTaxa = 0;
        float faturamento = 0;
        int quant = 1;
        int quantConsumidor = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor de um salário mínimo: R$");
        salMin = Float.parseFloat(leitor.nextLine());

        valorKw = salMin/8;

        System.out.println(String.format("O valor de cada quilowatt é de R$%.2f", valorKw));

        for(float c = kwConsumidor; c > 0;){
            System.out.println("  ");
            System.out.println("Consumidor " + quant);
            System.out.print("Insira a quantidade de quilowatts consumida: ");
            kwConsumidor = Float.parseFloat(leitor.nextLine());
            if(kwConsumidor == 0) break;
            System.out.println("Selecione o tipo do consumidor:");
            System.out.println("1. Residencial");
            System.out.println("2. Comercial");
            System.out.println("3. Industrial");
            tipoConsumidor = Integer.parseInt(leitor.nextLine());

            valorSemTaxa = kwConsumidor * valorKw;

            if(tipoConsumidor == 1){
                valorPago = valorSemTaxa + (valorSemTaxa * 0.05f);
            }else{
                if(tipoConsumidor == 2){
                    valorPago = valorSemTaxa + (valorSemTaxa * 0.1f);
                }else{
                    if(tipoConsumidor == 3){
                        valorPago = valorSemTaxa + (valorSemTaxa * 0.15f);
                    }else{
                        System.out.println("Opção inexistente");
                        continue;
                    }
                }
            }

            System.out.println(String.format("O valor a ser pago pelo consumidor %d é de R$%.2f", quant,valorPago));
            faturamento = faturamento + valorPago;

            if(valorPago >= 500 && valorPago <= 1000){
                quantConsumidor++;
            }

            quant++;
        }
        
        System.out.println(String.format("O faturamento geral da empresa é de R$%.2f", faturamento));
        System.out.println(String.format("A quantidade de consuidores que pagam entre R$500,00 e R$1000,00 é %d", quantConsumidor));

        leitor.close();
    }   
}
