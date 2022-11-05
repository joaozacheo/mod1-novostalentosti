import java.util.Scanner;

public class CodigoProdutos {
    public static void main(String[] args) {
        /*33) Faça um programa que receba:
        - o código de um produto comprado, supondo que a digitação do código do produto seja sempre válida, isso é, um número inteiro entre 1 e 10;
        - o peso do produto em quilos;
        - o código do país de origem, supondo que a digitação do código seja sempre válida, isso é, um número inteiro entre 1 e 3.
    
        Tabelas:                                    
        Código do país de origem    Imposto         Código do produto    Preço por grama   
        1                              0%           1 a 4                    R$ 10,00
        2                             15%           5 a 7                    R$ 25,00
        3                             25%           8 a 10                   R$ 35,00
        
        Calcule e mostre:
        - o peso do produto convertido em gramas;
        - o preço total do produto comprado;
        - o valor do imposto, sabendo que ele é cobrado sobre o preço total do produto comprado e depende do país de origem;
        - o valor total, preço total do produto mais imposto.
        */

        int codProd = 0;
        float peso = 0;
        int codPais = 0;
        float gramas = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o código do produto: ");
        codProd = Integer.parseInt(leitor.nextLine());
        System.out.print("Insira o peso do produto em Kg: ");
        peso = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o código do país: ");
        codPais = Integer.parseInt(leitor.nextLine());

        //PESO EM GRAMAS:
        gramas = peso * 1000;
        System.out.println(String.format("O peso do produto em gramas é: %.2f",gramas));

        //PREÇO TOTAL:
        if(1 <= codProd && codProd <= 4){
            float preçoTotal = 0;
            float valorTotal = 0;

            preçoTotal = gramas * 10;
            System.out.println(String.format("O preço total é de R$%.2f", preçoTotal));

            //IMPOSTO:
            if(codPais == 1){
                float imposto = 0;
                imposto = preçoTotal * 0;
                System.out.println(String.format("O valor de imposto sobre o produto é de R$%.2f",imposto));
                //VALOR TOTAL
                valorTotal = preçoTotal + imposto;
                System.out.println(String.format("O valor total é de R$%.2f", valorTotal));
            }
            if(codPais == 2){
                float imposto = 0;
                imposto = preçoTotal * 0.15f;
                System.out.println(String.format("O valor de imposto sobre o produto é de R$%.2f",imposto));
                //VALOR TOTAL
                valorTotal = preçoTotal + imposto;
                System.out.println(String.format("O valor total é de R$%.2f", valorTotal));
            }
            if(codPais == 3){
                float imposto = 0;
                imposto = preçoTotal * 0.25f;
                System.out.println(String.format("O valor de imposto sobre o produto é de R$%.2f",imposto));
                //VALOR TOTAL
                valorTotal = preçoTotal + imposto;
                System.out.println(String.format("O valor total é de R$%.2f", valorTotal));
            }
        }

        if(5 <= codProd && codProd <= 7){
            float preçoTotal = 0;
            float valorTotal = 0;

            preçoTotal = gramas * 25;
            System.out.println(String.format("O preço total é de R$%.2f", preçoTotal));

            //IMPOSTO:
            if(codPais == 1){
                float imposto = 0;
                imposto = preçoTotal * 0;
                System.out.println(String.format("O valor de imposto sobre o produto é de R$%.2f",imposto));
                //VALOR TOTAL
                valorTotal = preçoTotal + imposto;
                System.out.println(String.format("O valor total é de R$%.2f", valorTotal));
            }
            if(codPais == 2){
                float imposto = 0;
                imposto = preçoTotal * 0.15f;
                System.out.println(String.format("O valor de imposto sobre o produto é de R$%.2f",imposto));
                //VALOR TOTAL
                valorTotal = preçoTotal + imposto;
                System.out.println(String.format("O valor total é de R$%.2f", valorTotal));
            }
            if(codPais == 3){
                float imposto = 0;
                imposto = preçoTotal * 0.25f;
                System.out.println(String.format("O valor de imposto sobre o produto é de R$%.2f",imposto));
                //VALOR TOTAL
                valorTotal = preçoTotal + imposto;
                System.out.println(String.format("O valor total é de R$%.2f", valorTotal));
            }
        }

        if(8 <= codProd && codProd <= 10){
            float preçoTotal = 0;
            float valorTotal = 0;

            preçoTotal = gramas * 35;
            System.out.println(String.format("O preço total é de R$%.2f", preçoTotal));

            //IMPOSTO:
            if(codPais == 1){
                float imposto = 0;
                imposto = preçoTotal * 0;
                System.out.println(String.format("O valor de imposto sobre o produto é de R$%.2f",imposto));
                //VALOR TOTAL
                valorTotal = preçoTotal + imposto;
                System.out.println(String.format("O valor total é de R$%.2f", valorTotal));
            }
            if(codPais == 2){
                float imposto = 0;
                imposto = preçoTotal * 0.15f;
                System.out.println(String.format("O valor de imposto sobre o produto é de R$%.2f",imposto));
                //VALOR TOTAL
                valorTotal = preçoTotal + imposto;
                System.out.println(String.format("O valor total é de R$%.2f", valorTotal));
            }
            if(codPais == 3){
                float imposto = 0;
                imposto = preçoTotal * 0.25f;
                System.out.println(String.format("O valor de imposto sobre o produto é de R$%.2f",imposto));
                //VALOR TOTAL
                valorTotal = preçoTotal + imposto;
                System.out.println(String.format("O valor total é de R$%.2f", valorTotal));
            }
        }

        leitor.close();
    }
}
