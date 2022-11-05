import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        /*46)Construa um algoritmo que calcule o consumo de combustível
        de um veículo qualquer baseado nas informações de quilometragem 
        inicial e final de um percurso, e a quantidade de gasolina
        consumida em litros. Caso o consumo esteja entre 10 e 16 km/litros
        mostre a mensagem “consumo normal”, caso seja maior que 16
        km/litros apresente a mensagem “consumo anormal”.*/
        float kmInicial = 0;
        float kmFinal = 0;
        float percurso = 0;
        float gasolina = 0;
        float consumo = 0;
    
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quilometragem inicial: ");
        kmInicial = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira a quilometragem final: ");
        kmFinal = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira o consumo de gasolina no percurso (litros): ");
        gasolina = Float.parseFloat(leitor.nextLine());

        percurso = kmFinal - kmInicial;
        consumo = percurso/gasolina;

        if(consumo >= 10 && consumo <=16){
            System.out.println("Consumo normal");
        }
        if(consumo > 16){
            System.out.println("Consumo anormal");
        }

        leitor.close();
    }
}
