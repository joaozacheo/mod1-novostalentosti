import java.util.Scanner;

public class CalcMediaAluno {
    public static void main(String[] args) {
        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 05;
        float percPresenca = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        nota1 = Float.parseFloat(leitor.nextLine());
        System.out.print("Digite sua segunda nota: ");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.print("Digite sua terceira nota: ");
        nota3 = Float.parseFloat(leitor.nextLine());
        System.out.print("Digite sua quarta nota: ");
        nota4 = Float.parseFloat(leitor.nextLine());

        System.out.print("Digite seu percentual de presença: ");
        //Converte o texto digitado (nextLine) de String para um primitivo Float
        percPresenca = Float.parseFloat(leitor.nextLine());

        //CONSTANTE = modificador final
        /*"tipo" a palavrra VAR permite que o JAVA
        crie a variável com o tipo do valor
        que foi ATRIBUIDO no código*/
        final var media = (nota1 + nota2 + nota3 + nota4) / 4.0f;

        System.out.println("Com média: " + media);
        System.out.println("e presença: " + percPresenca);

        boolean situacao = media >= 7 && percPresenca >= 75;

        //Operador Ternário                     <condição>?<verdadeiro><falso>
        System.out.println("Sua situação é: " + (situacao?"Aprovado":"Reprovado"));

        if(media >= 7 && percPresenca >= 75){
            System.out.println("Você foi aprovado!");
        }

        else{
            System.out.println("Você foi reprovado");
        }

        leitor.close();
    }
}
