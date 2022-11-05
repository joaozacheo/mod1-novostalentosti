import java.util.Scanner;

public class ExemploBlocoRepeticao {
    public static void main(String[] args) {
        //enquanto
        int contador = 10;
        while(contador < 10){
            System.out.println("contando... " + contador);
            contador++;
        }

        while(contador >= 0){
            System.out.println("Contando..." + contador);
            contador--;
        }

        int resposta = 0;
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.println("Sim eu vou entrar pelo menos uma vez");
            System.out.println("Digite o número 5");
            resposta = Integer.parseInt(leitor.nextLine());
            if(resposta !=5){
                //continue - pula repetição atual do bloco e continua
                System.out.println("Valor invalido");
                //break - quebra o bloco de repetição mais próximo
            }
        }while(resposta !=5);

        for(int i=0; i<5; i++){
            System.out.println("FOR" + i);
        }

        leitor.close();

    }
}
