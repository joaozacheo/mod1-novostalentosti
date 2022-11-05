import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        /*63) Faça um programa que receba 'vários números, calcule e mostre:
        - a soma dos números digitados;
        - a quantidade de números digitados;
        - a média dos números digitados; 
        - o maior número digitado;
        - o menor número digitado;
        - a média dos números pares;
        - a porcentagem dos números ímpares entre todos os números digitados.
        Finalize a entrada de dados com a digitação do número 30000.
        */

        float variosNum = 0;
        float soma = 0;
        float media = 0;
        float maiorNum = 0;
        float menorNum = 0;
        float mediaPares = 0;
        float pctImpares = 0;
        float pares = 0;
        int quantPares = 0;
        int quantImpares = 0;
        int contador = 0;
        float resto = 0;

        Scanner leitor = new Scanner(System.in);

        do{
            System.out.print("Insira um número: ");
            variosNum = Float.parseFloat(leitor.nextLine());
            if(variosNum == 30000) break;

            soma = soma + variosNum;
            
            if(variosNum > maiorNum){
                maiorNum = variosNum;
            }

            if(contador == 0){
                menorNum = variosNum;
            }else{
                if(variosNum < menorNum){
                    menorNum = variosNum;
                }
            }

            if(resto == variosNum % 2){
                pares = pares + variosNum;
                quantPares++;
            }else{
                quantImpares++;
            }

            contador++;            
        }while(variosNum < 30000);

        media = soma/contador;
        mediaPares = pares/quantPares;
        pctImpares = (quantImpares * 100)/contador;

        System.out.println(String.format("Soma: %.2f",soma));
        System.out.println(String.format("Quantidade de números digitados: %d",contador));
        System.out.println(String.format("Media de tudo: %.2f",media));
        System.out.println(String.format("Maior número: %.2f",maiorNum));
        System.out.println(String.format("Menor número: %.2f",menorNum));
        System.out.println(String.format("Média dos números pares: %.2f",mediaPares));
        System.out.println(String.format("Porcentagem dos ímpares: %.2f%%",pctImpares));

        leitor.close();
    }
}