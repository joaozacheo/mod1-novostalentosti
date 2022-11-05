import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        /*53)Faça um UNICO programa em que receba o nome, o salário-base e o tempo de serviço de um funcionário. 
 
        Calcule e mostre TODOS os itens abaixo em um UNICO PROGRAMA:
        a.    O imposto que esta na tabela a seguir:
        
        Salário Base                                         |   % de imposto sobre Salário Base
        -----------------------------------------------------+----------------------------------------
        Menor R$200,00 (inclusive)                           |             Isento
        Maior que R$200,00 até R$ 450,00 (inclusive)         |               3%
        Entre R$450,00 e R$ 700,00                           |               8%
        Igual a R$ 700,00                                    |               10%
        Maior que R$ 700,00                                  |               12%
        
        
        b.    A Gratificação conforme a tabela a seguir:
        Salário Base                    |Tempo de Serviço                   |Gratificação
        --------------------------------+-----------------------------------+-----------------------------------------
        Superior a R$500,00             |Até 3 anos (inclusive)             |2% do salário base mais R$ R$ 50,00 reais
                                        +-----------------------------------+-----------------------------------------
                                        |Mais de 3 anos                     |3% do salário base mais R$ 60,00 reais
        --------------------------------+-----------------------------------+-----------------------------------------
        Até R$ 500,00 (inclusive)       |Até 3 anos (inclusive)             |5% do salário base mais R$ 23 reais
                                        +-----------------------------------+-----------------------------------------
                                        |Entre 3 e 6 anos                   |6% do salário base mais R$ 35,00 reais
                                        +-----------------------------------+-----------------------------------------
                                        |De 6 anos para cima (inclusive)    |10% do salário base mais R$ 33 reais
        
        c.    Calcule o valor do auxilio alimentação:
        Tempo de Serviço             |Valor do auxilio alimentação
        -----------------------------+----------------------------
        Até 10 anos (inclusive)      |4% salário Base
        -----------------------------+----------------------------
        Mais de 10 anos              |6% salário Base
        
        d.    Calcule o salário líquido, subtraindo o imposto e somando a gratificação, o auxilio alimentação ao salário base.*/

        String nome;
        float salBase = 0;
        float tempoServico = 0;
        float imposto = 0;
        float gratificacao = 0;
        float auxAliment = 0;
        float salLiquido = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        nome = leitor.nextLine();
        System.out.print("Insira seu salário-base: R$");
        salBase = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira seu tempo de serviço (anos): ");
        tempoServico = Float.parseFloat(leitor.nextLine());

        //Nome
        System.out.println("Funcionário: " + nome);

        //Salário Base
        if(salBase <= 200){
            System.out.println("Isento de imposto");
        }
        if(salBase > 200 && salBase <= 450){
            imposto = salBase * 0.03f;
            System.out.println(String.format("O imposto sobre seu salário-base tem o valor de R$%.2f",imposto));
        }
        if(salBase > 450 && salBase < 700){
            imposto = salBase * 0.08f;
            
            System.out.println(String.format("O imposto sobre seu salário-base tem o valor de R$%.2f",imposto));
        }
        if(salBase == 700){
            imposto = salBase * 0.1f;
            System.out.println(String.format("O imposto sobre seu salário-base tem o valor de R$%.2f",imposto));
        }
        if(salBase > 700){
            imposto = salBase * 0.12f;
            System.out.println(String.format("O imposto sobre seu salário-base tem o valor de R$%.2f",imposto));
        }

        //Gratificação
        if(salBase > 500){
            if(tempoServico <= 3){
                gratificacao = (salBase * 0.02f) + 50;
                System.out.println(String.format("Sua gratificação é de R$%.2f", gratificacao));
            }else{
                gratificacao = (salBase * 0.03f) + 60;
                System.out.println(String.format("Sua gratificação é de R$%.2f", gratificacao));
            }
        }else{
            if(tempoServico <=3){
                gratificacao = (salBase * 0.05f) + 23;
                System.out.println(String.format("Sua gratificação é de R$%.2f", gratificacao));
            }else{
                if(tempoServico > 3 && tempoServico < 6){
                    gratificacao = (salBase * 0.06f) + 35;
                    System.out.println(String.format("Sua gratificação é de R$%.2f", gratificacao));
                }else{
                    gratificacao = (salBase * 0.1f) + 33;
                    System.out.println(String.format("Sua gratificação é de R$%.2f", gratificacao));
                }
            }
        }

        //Auxílio Alimentação
        if(tempoServico <= 10){
            auxAliment = salBase * 0.04f;
            System.out.println(String.format("Seu auxílio alimentação é de R$%.2f", auxAliment));
        }else{
            auxAliment = salBase * 0.06f;
            System.out.println(String.format("Seu auxílio alimentação é de R$%.2f", auxAliment));
        }

        salLiquido = salBase + gratificacao + auxAliment - imposto;
        System.out.println(String.format("Seu salário final é de R$%.2f", salLiquido));

        leitor.close();
    }
}
