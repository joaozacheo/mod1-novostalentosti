import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        double area = 0;
        double lado = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o comprimento (cm) do lado do quadrado: ");
        lado = Float.parseFloat(leitor.nextLine());

        area = Math.pow(lado, 2);

        System.out.print(String.format("A área do quadrado é de: %.2fcm²",area));

        leitor.close();
    }
}
