import java.util.Scanner;

public class MenuOperações {
    public static void main(String[] args) {
        int escolha = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Menu de Opções");
        System.out.println("Qual operção você deseja realizar?");
        System.out.println("1. Somar dois números");
        System.out.println("2. Raíz quadrada de um número");

        escolha = Integer.parseInt(leitor.nextLine());

        if(escolha == 1){
            float num1 = 0;
            float num2 = 0;
            float soma = 0;
            System.out.print("Digite o primeiro número: ");
            num1 = Float.parseFloat(leitor.nextLine());
            System.out.print("Digite o segundo número: ");
            num2 = Float.parseFloat(leitor.nextLine());

            soma = num1 + num2;

            System.out.println(String.format("O resultado da soma é de %.2f",soma));
        } 
        
        if(escolha == 2){
            int num3 = 0;
            float raiz = 0;

            System.out.print("Digite o número: ");
            num3 = Integer.parseInt(leitor.nextLine());

            raiz = (float)(Math.sqrt(num3));

            System.out.println(String.format("A raiz de %d é: %.0f",num3,raiz));
        }
        
        if(escolha >= 3){
            System.out.println("Essa opção não existe :/");
        }

        leitor.close();
    }
}
