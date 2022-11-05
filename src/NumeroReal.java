import java.util.Scanner;

public class NumeroReal {
    public static void main(String[] args) {
        float numero = 0;
        float fracao = 0;
        float numeroInt = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um número real: ");
        numero = Float.parseFloat(leitor.nextLine());

        numeroInt = (int)numero;

        fracao = numero - numeroInt;

        System.out.println("Parte inteira: " + numeroInt);
        System.out.println(String.format("Parte fracionária %.2f", fracao));
        System.out.print("Arredondamento: " + Math.round(numero));

        leitor.close();
    }
}
