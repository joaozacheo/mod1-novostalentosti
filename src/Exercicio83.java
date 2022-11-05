import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        /*83) Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em um vetor. Calcule e mostre a maior e a menor
        temperatura do ano e em que mês elas ocorreram (mostrar o mês por extenso: 1- Janeiro, 2 – Fevereiro). Desconsidere empates. */

        Float[] tempMes = new Float[12];
        String[] mes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        float maior = 0;
        float menor = 0;
        int localMaior = 0;
        int localMenor = 0;
        int num1 = 0;
        int num2 = 0;
        String menorMes;
        String maiorMes;

        Scanner leitor = new Scanner(System.in);

        for(int m = 0; m < 12; m++){
            System.out.println("  ");
            System.out.print("Insira a temperatura do mês de " + mes[m] + ": ");
            tempMes[m] = Float.parseFloat(leitor.nextLine());

            if(m == 0){
                maior = tempMes[m];
                localMaior = m;
            }else{
                if(tempMes[m] > maior){
                    maior = tempMes[m];
                    localMaior = m;
                }
            }
            if(m == 0){
                menor = tempMes[m];
                localMenor = m;
            }else{
                if(tempMes[m] < menor){
                    menor = tempMes[m];
                    localMenor = m;
                }
            }
        }

        maiorMes = mes[localMaior];
        menorMes = mes[localMenor];
        num1 = localMaior + 1;
        num2 = localMenor + 1;

        System.out.println(String.format("O mês com a maior temperatura é %d- ", num1)+ maiorMes);
        System.out.println(String.format("O mês com a menor temperatura é %d- ", num2)+ menorMes);

        leitor.close();
    }
}
