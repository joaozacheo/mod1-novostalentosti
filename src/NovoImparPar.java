import java.util.Scanner;

public class NovoImparPar {
    public static void main(String[] args) {
        int num = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        num = leitor.nextInt();

        int resto = num % 2;

        if(resto==0){
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");
        }

        leitor.close();
    }
}
