import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        /*43)Escreva um algoritmo que calcule o numero
        de prateleiras necessárias para guardar uma quantidade
        informada de livros. Considerando que em média uma
        prateleira comporta 32 livros. */

        int numLivros = 0;
        int pratileiras = 0;
        int pratArred = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quantidade de livros: ");
        numLivros = Integer.parseInt(leitor.nextLine());

        if(numLivros < 32){
            System.out.println("É necessária somente 1 pratileira");
        }else{
            pratileiras = numLivros/32;
            pratArred = pratileiras + 1;
            System.out.println(String.format("São necessárias %d pratileiras", pratArred));
        }

        leitor.close();
    }
}
