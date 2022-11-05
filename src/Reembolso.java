import java.util.Scanner;

public class Reembolso {
    public static void main(String[] args) {
        float km = 0;
        float reembolso =0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a sua kilometragem: ");
        km = Float.parseFloat(leitor.nextLine());

        reembolso = (km / 13) * 2.20f;

        //System.out.println("Seu reembolso é de: R$" + reembolso);
        System.out.println(String.format("Seu reembolso é de : R$%.2f", reembolso));

        leitor.close();
    }
}
