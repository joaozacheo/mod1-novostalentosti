import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        /*41)Escreva um algoritmo que calcule o número de páginas
        mínimo que um leitor deve ler para terminar um livro em um
        determinado numero de dias informado. Caso o número de
        paginas a ler por dia for maior que 100, informe ao usuário
        que é impossível de realizar a leitura, caso contrário
        apresente o número de paginas.*/

        float pagLivro = 0;
        float dias = 0;
        float calc = 0;
        float diasArred = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o número de páginas do livro: ");
        pagLivro = Integer.parseInt(leitor.nextLine());
        System.out.print("Insira em quantos dias você pretende terminar: ");
        dias = Integer.parseInt(leitor.nextLine());

        calc = pagLivro/dias;

        diasArred = Math.round(calc);

        if(diasArred > 100){
            System.out.println("Impossível realizar a leitura");
        }else{
            if(calc == 1){
                System.out.println(String.format("Você precisa ler %.0f página por dia", diasArred));
            }else{
                System.out.println(String.format("Você precisa ler %.0f páginas por dia", diasArred));
            }
        }

        leitor.close();
    }
}
