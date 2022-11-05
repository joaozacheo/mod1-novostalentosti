import java.util.Scanner;

public class ConversaoMoedas {
    public static void main(String[] args) {
        float quantDinheiro = 0;
        float dolar = 0;
        float marcoAlemao = 0;
        float libraEst = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quantia de dinheiro: R$");
        quantDinheiro = Float.parseFloat(leitor.nextLine());

        dolar = quantDinheiro / 1.8f;
        marcoAlemao = quantDinheiro / 2;
        libraEst = quantDinheiro / 1.57f;

        System.out.println(String.format("O valor em DÓLAR é de: $%.2f",dolar));
        System.out.println(String.format("O valor em MARCO ALEMÃO é de: %.2fDEM",marcoAlemao));
        System.out.println(String.format("O valor em LIBRA ESTERLINA é de: £%.2f",libraEst));

        leitor.close();
    }
}
