import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {
        float area = 0;
        float diagonalMaior = 0;
        float diagonalMenor = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o comprimento (cm) da DIAGONAL MAIOR: ");
        diagonalMaior = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o comprimento (cm) da DIAGONAL MENOR: ");
        diagonalMenor = Float.parseFloat(leitor.nextLine());

        area = (diagonalMaior * diagonalMenor)/2;

        System.out.println(String.format("A area do losango é de: %.2fcm²", area));

        leitor.close();
    }
}
