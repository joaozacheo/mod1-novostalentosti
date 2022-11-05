import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        float area = 0;
        float baseMaior = 0;
        float baseMenor = 0;
        float altura = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o comprimento (m) da BASE MAIOR: ");
        baseMaior = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o comprimento (m) da BASE MENOR: ");
        baseMenor = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o comprimento (m) da ALTURA: ");
        altura = Float.parseFloat(leitor.nextLine());

        area = ((baseMaior + baseMenor) * altura)/2;

        System.out.print(String.format("A área do trapézio é de: %.2fm²", area));

        leitor.close();
    }
}
