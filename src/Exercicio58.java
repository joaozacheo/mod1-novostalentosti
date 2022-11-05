import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        /*58) Faça um programa que leia um número N que indica quantos valores
        inteiros e positivos devem ser lidos a seguir. Para cada número lido,
        mostre o valor lido e o fatorial desse valor. */

        float n = 0;
        int nLido = 0;
        int nInt = 0;
        int fact = 1;
        
        float resto = 0;

        Scanner leitor = new Scanner(System.in);

        for(int foi = 0; foi < 1;){
            System.out.print("Insira um número natural: ");
            n = Float.parseFloat(leitor.nextLine());

            nInt = (int)n;
            resto = n - nInt;

            if(n < 0 || resto > 0){
                System.out.println("Número inválido");
            }else{
                for(int contador = 1; contador <= n; contador++){
                    System.out.print("Novo número:");
                    nLido = Integer.parseInt(leitor.nextLine());
        
                    for (int c = nLido; c >= 1; c--) {
                        fact = fact * c;
                    }
        
                    System.out.println(nLido);
                    System.out.println(fact);
        
                    fact = 1;
                }
                foi = 1;  
            }     
        }       

        leitor.close();
    }
}
