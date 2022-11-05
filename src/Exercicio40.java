import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        /*40)Escreva um algoritmo que solicite
        a quantidade total em miligramas de colesterol
        mau existente no sangue de um paciente.
        Considerando que o valor máximo ideal para uma
        pessoa saudável é 130mg, caso a quantidade esteja
        menor apresente uma mensagem indicando que esta menor.
        Caso esteja acima, calcule o percentual que esta acima e
        apresente uma mensagem.*/

        float colestMau = 0;
        float percentual = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quantidade total de colesterol mau (mg): ");
        colestMau = Float.parseFloat(leitor.nextLine());
        
        if(colestMau < 130){
            System.out.println("Seu colesterol mau está abaixo do normal");
        }
        if(colestMau > 130){
            percentual = ((colestMau * 100)/130)-100;
            System.out.println(String.format("Seu colesterol mau está %.2f%% acima do normal", percentual));
        }
        if(colestMau == 130){
            System.out.println("Seu colesterol mau está normal");
        }

        leitor.close();
    }
}
