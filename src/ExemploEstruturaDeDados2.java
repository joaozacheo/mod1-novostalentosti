import java.util.Scanner;

public class ExemploEstruturaDeDados2 {
    public static void main(String[] args) {
        //int[] numero = new int[10];
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numeros2[0]);

        char[] nome = {'u','n','i','v','i','l','l','e'};
        //for each - iterador
        for(char umaLetra : nome){
            System.out.println((int)umaLetra);
        }

        String nome2 = "univille";
        System.out.println(nome2.hashCode());
        System.out.println(nome2);
        System.out.println(nome2.toUpperCase());
        //SAO IMUTÁVEIS
        nome2 = "UNIVILLE"; //string pool
        System.out.println(nome2.hashCode());
        //MD5 - não é usado para senhas
        //SHA-2 - pode ser usado para senhas e segurança

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite UNIVILLE");
        String entrada = leitor.nextLine();

        if(nome2.equalsIgnoreCase(entrada)){
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais");
        }

        leitor.close();
    }
}
