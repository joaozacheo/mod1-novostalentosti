import java.util.Scanner;

public class MultaBoleto {
    public static void main(String[] args) {
        float boleto = 0;
        float percMulta = 0;
        float resultado = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor do boleto: R$");
        boleto = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o percentual da multa: ");
        percMulta = Float.parseFloat(leitor.nextLine());

        resultado = (boleto * percMulta)/100;

        System.out.print(String.format("Valor da multa a pagar: R$%.2f", resultado));

        leitor.close();
    }
}
