import java.util.Scanner;

public class ConversorFahrenheit {
    public static void main(String[] args) {
        float celsius = 0;
        float fahrenheit = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a temperatura em Celsius: ");
        celsius = Float.parseFloat(leitor.nextLine());

        fahrenheit = celsius * 1.8f + 32f;

        System.out.println(String.format("A temperatura é equivalente a %.2f Fahrenheit", fahrenheit));

        leitor.close();
    }
}
