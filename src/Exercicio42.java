import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        /*42)Escreva um algoritmo que calcule o valor da multa (em UFIR)
        que um motorista deve receber de acordo com a velocidade de seu carro.
        Acima de 60km/h e ate 100km/h multa media 60 UFIR, acima de 100 km/h
        até 160km/h grave 120 UFIR, e acima de 160km/h gravíssima 180 UFIR */

        int velocidadeCarro = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("CALCULADORA DE MULTA DE CARRO");
        System.out.print("Insira a velocidade do carro: ");
        velocidadeCarro = Integer.parseInt(leitor.nextLine());

        if(velocidadeCarro > 60 && velocidadeCarro <= 100){
            System.out.println("Multa MÉDIA");
            System.out.println("Custo 60 UFIR");
        }else{
            if(velocidadeCarro > 100 && velocidadeCarro <= 160){
                System.out.println("Multa GRAVE");
                System.out.println("Custo 120 UFIR");
            }else{
                if(velocidadeCarro > 160 && velocidadeCarro <= 180){
                    System.out.println("Multa GRAVÍSSIMA");
                    System.out.println("Custo 180 UFIR");
                }else{
                    System.out.println("Não recebe multa");
                }
            }
        }

        leitor.close();
    }
}
