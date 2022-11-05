import java.util.Scanner;

public class RacaoGatos {
    public static void main(String[] args) {
        /*36)Pedro comprou um saco de ração com peso em quilos.
        Pedro possui dois gatos para os quais fornece a quantidade
        de ração em gramas. Faça um programa que receba o peso do
        saco de ração e a quantidade de ração fornecida para cada
        gato. Calcule e mostre quanto restará de ração no saco após
        cinco dias. */

        float pesoRacao = 0;
        float quantGato1 = 0;
        float quantGato2 = 0;
        float racaoGramas = 0;
        float resto = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o peso do saco de racao (em quilos): ");
        pesoRacao = Float.parseFloat(leitor.nextLine());
        System.out.println("Insira a quantidade de ração dada para o primeiro gato por dia (em gramas): ");
        quantGato1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Insira a quantidade de ração dada para o segundo gato por dia (em gramas): ");
        quantGato2 = Float.parseFloat(leitor.nextLine());

        racaoGramas = pesoRacao * 1000;
        resto = racaoGramas - (5 *(quantGato1 + quantGato2));

        System.out.println(String.format("Após 5 dias, sobrarão %.2fg do saco de ração", resto));

        leitor.close();


    }
}
