import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        /*35)O custo ao consumidor de um carro novo é a soma do preço
        da fábrica com o percentual de lucro do distribuidor e dos
        impostos aplicados ao preço de fábrica. Faça um programa que
        receba o preço de fábrica de um veículo, o percentual de lucro
        do distribuidor e o percentual de impostos.
        Calcule e mostre:
        a.O valor correspondente ao lucro do distribuidor
        b.O valor correspondente aos impostos
        c.O preço final do veículo
        */

        float precoFabrica = 0;
        float percLucro = 0;
        float percImportos = 0;
        float precoFinal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o preço de fábrica: R$");
        precoFabrica = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o percentual de lucro do distribuidor: ");
        percLucro = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o percentual de impostos: ");
        percImportos = Float.parseFloat(leitor.nextLine());

        percLucro = (precoFabrica * percLucro)/100;
        percImportos = (precoFabrica * percImportos)/100;
        precoFinal = precoFabrica + percLucro + percImportos;

        System.out.println(String.format("O valor correspondente ao lucro do consumidor é de R$%.2f", percLucro));
        System.out.println(String.format("O valor correspondente aos impostos é de R$%.2f", percImportos));
        System.out.println(String.format("O preço final do veículo é de R$%.2f", precoFinal));

        leitor.close();
    }
}
