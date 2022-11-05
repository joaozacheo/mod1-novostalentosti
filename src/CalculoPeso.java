import java.util.Scanner;

public class CalculoPeso {
    public static void main(String[] args) {
        float peso = 0;
        float pesoEngordar = 0;
        float pesoEmagrecer = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira seu peso atual: ");
        peso = Float.parseFloat(leitor.nextLine());

        pesoEngordar = peso + (peso * 0.15f);
        pesoEmagrecer = peso - (peso * 0.20f);

        System.out.println(String.format("Se você engordar 15%%, seu peso será %.2fkg", pesoEngordar));
        System.out.print(String.format("Se você emagreccer 20%%, seu peso será %.2fkg", pesoEmagrecer));

        leitor.close();
    }
}
