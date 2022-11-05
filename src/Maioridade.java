import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        int idade = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a sua idade: ");
        idade = leitor.nextInt();

        if(idade >= 18){
            System.out.println("Você é de maior");
        }

        else{
            System.out.println("Você não é de maior");
        }

        leitor.close();
    }
}
