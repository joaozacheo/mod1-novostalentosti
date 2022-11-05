import java.util.Scanner;

public class CarneChurrasco {
    public static void main(String[] args) {
        int pessoas = 0;
        int carne = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o número de pessoas: ");
        pessoas = leitor.nextInt();

        carne = pessoas * 250;

        System.out.println("A quantidade de carne neccessária é de: " + carne + "g");

        leitor.close();

    }
}
