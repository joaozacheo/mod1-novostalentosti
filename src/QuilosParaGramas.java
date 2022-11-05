import java.util.Scanner;

public class QuilosParaGramas {
    public static void main(String[] args) {
        float pesoQuilo = 0;
        float pesoGrama = 0;

        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Insira seu peso em quilos: ");
        pesoQuilo = Float.parseFloat(leitor.nextLine());

        pesoGrama = pesoQuilo * 1000;

        System.out.println(String.format("Seu peso em gramas é de: %.2fg", pesoGrama));

        leitor.close();
    }
}
