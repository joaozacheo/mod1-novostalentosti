import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        /*54)Faça um ÚNICO programa para auxiliar uma empresa de importação a calcular o valor do preço final
        de importação de um produto. Para isso solicite ao usuário: o preço original do produto em dólares, o
        valor da cotação do dólar, o preço do transporte em reais e o tipo de imposto que deve incidir sobre
        o preço do produto (1 – IPI, 2 – ICMS, 3 – Ambos IPI e ICMS).
 
        Para CADA item abaixo calcule e mostre: 
        
        O preço do produto em reais, que consiste no preço original do produto em dólares e o valor da cotação do dólar.
        
        O valor do imposto federal em reais, de acordo com a tabela abaixo, considerando o tipo
        informado de imposto que incide sobre o produto e o preço do produto em reais já calculado:
        
        Tipo Imposto             |Preço do Produto em Reais              |% de Imposto 
        -------------------------+--------------------------------------+----------------
        IPI                      |Até R$3.000,00 (inclusive)            | 1,5% 
                                 |Mais de R$3.000,00                    | 2% 
        -------------------------+--------------------------------------+----------------
        ICMS                     |Até R$ 1.500,00                       | 2% 
                                 |Mais de R$ 1.500,00 (inclusive)       | 3,5% 
        -------------------------+--------------------------------------+----------------
        Ambos IPI e ICMS                                                | 5% 
        -------------------------+--------------------------------------+----------------
        
        O valor do imposto estadual em reais, conforme a regra abaixo:
        O valor do imposto estadual em reais será 2/7 (dois sétimos) do valor do imposto federal em reais calculado anteriormente.
        
        O valor do preço final de importação de um produto, consiste na soma do preço do produto em reais com o valor do
        imposto federal em reais, o preço do transporte em reais, e o valor do imposto estadual em reais.*/

        float precoAtual = 0;
        float cotacaoDolar = 0;
        float transporte = 0;
        int tipoImposto = 0;
        float precoReais = 0;
        float impostoFed = 0;
        float impostoEst = 0;
        float precoFinal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o preço original do produto em dólares: $");
        precoAtual = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira a cotação do dólar: R$");
        cotacaoDolar = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o preço do transporte em reais: R$");
        transporte = Float.parseFloat(leitor.nextLine());
        System.out.println("Selecione o imposto a ser aplicado ao produto:");
        System.out.println("1. IPI");
        System.out.println("2. ICMS");
        System.out.println("3. IPI e ICMS");
        tipoImposto = Integer.parseInt(leitor.nextLine());

        //PREÇO EM REAIS
        precoReais = precoAtual * cotacaoDolar;

        //IMPOSTO FEDERAL
        if(tipoImposto == 1){
            if(precoReais <= 3000){
                impostoFed = precoReais * 0.015f;
            }else{
                impostoFed = precoReais * 0.02f;
            }
        }else{
            if(tipoImposto == 2){
                if(precoReais < 1500){
                    impostoFed = precoReais * 0.02f;
                }else{
                    impostoFed = precoReais * 0.035f;
                }
            }else{
                if(tipoImposto == 3){
                    impostoFed = precoReais * 0.05f;
                }else{
                    System.out.println("Essa opção não existe");
                }
            }
        }

        //IMPOSTO ESTADUAL
        impostoEst = (impostoFed * 2)/7;

        //PREÇO FINAL
        precoFinal = precoReais + impostoFed + impostoEst + transporte;

        System.out.println(String.format("O preço do produto em reais é R$%.2f", precoReais));
        System.out.println(String.format("O valor do imposto federal é de R$%.2f", impostoFed));
        System.out.println(String.format("O valor do imposto estadual é de R$%.2f", impostoEst));
        System.out.println(String.format("O preço final de importação do produto é de R$%.2f", precoFinal));

        leitor.close();
    }
}
