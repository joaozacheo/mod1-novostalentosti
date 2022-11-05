import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0; //String.format("%d é o maior", num1)

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira 3 números inteiros diferentes");
        System.out.print("Insira o primeiro número: ");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.print("Insira o segundo número: ");
        num2 = Integer.parseInt(leitor.nextLine());
        System.out.print("Insira o terceiro número: ");
        num3 = Integer.parseInt(leitor.nextLine());

        if(num1 > num2){
            if(num1 > num3){
                System.out.println(String.format("%d é o maior", num1));
                if(num2 > num3){
                    System.out.println(String.format("%d é o do meio", num2));
                    System.out.println(String.format("%d é o menor", num3));
                }else{
                    System.out.println(String.format("%d é o menor", num2));
                    System.out.println(String.format("%d é o do meio", num3));
                }
            }else{
                System.out.println(String.format("%d é o do meio", num1));
                System.out.println(String.format("%d é o menor", num2));
                System.out.println(String.format("%d é o maior", num3));
            }
        }else{
            if(num1 > num3){
                System.out.println(String.format("%d é o do meio", num1));
                System.out.println(String.format("%d é o maior", num2));
                System.out.println(String.format("%d é o menor", num3));
            }else{
                System.out.println(String.format("%d é o menor", num1));
                if(num2 > num3){
                    System.out.println(String.format("%d é o maior", num2));
                    System.out.println(String.format("%d é o do meio", num3));
                }else{
                    System.out.println(String.format("%d é o do meio", num2));
                    System.out.println(String.format("%d é o maior", num3));
                }
            }
        }

        leitor.close();
    }
}
