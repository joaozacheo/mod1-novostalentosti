import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        /*47)Escreva um algoritmo que calcule o valor de Imposto
        de Renda que uma Pessoa Física deve pagar de acordo com
        o valor total de seu rendimento anual: abaixo de R$19.200
        isento, acima deste valor e até R$30.000 8%. Mais que R$30.000 anuais 11%. */

        float rendAnual = 0;
        float percentual = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor de seu rendimento anual: R$");
        rendAnual = Float.parseFloat(leitor.nextLine());
        
        if(rendAnual <= 19200){
            System.out.println("Isento de imposto");
        }else{
            if(rendAnual > 19200 && rendAnual <= 30000){
                percentual = rendAnual * 0.08f;
                System.out.println("Seu imposto é de 8%");
                System.out.println(String.format("Valor do imposto: R$%.2f", percentual));
            }else{
                percentual = rendAnual * 0.11f;
                System.out.println("Seu imposto é de 11%");
                System.out.println(String.format("Valor do imposto: R$%.2f", percentual));
            }
        }

        leitor.close();
    }
}
