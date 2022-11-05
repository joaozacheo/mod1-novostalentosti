import java.util.Scanner;

public class IndicaçãoIdade {
    public static void main(String[] args) {
        int idade = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        idade = Integer.parseInt(leitor.nextLine());

        if(0 <= idade && idade <= 20){
            System.out.println("Você é jovem");
        }

        if(21 <= idade && idade <= 60){
            System.out.println("Você é adulto");
        }

        if(idade > 60){
            System.out.println("Você é idoso");
        }

        /*OUTRO JEITO DE FAZER:
        if (idade <= 20){
            //ENTAO
            System.out.println("JOVEM");
        }else{
            //SENAO
            if(idade <= 60){
                System.out.println("ADULTA");
            }else{
                System.out.println("IDOSO");
            }
        }*/

        leitor.close();
    }
}
