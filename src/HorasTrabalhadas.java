import java.util.Scanner;

public class HorasTrabalhadas {
    public static void main(String[] args) {
        //1) Faça um programa que solicite o número de horas que um trabalhador realiza por dia,
        //solicite o número de dias trabalhados em um mês e apresente o número total de horas trabalhadas no mês.
        float horasTrab = 0;
        float diasTrab = 0;
        float resultado = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a quantidade de horas trabalhadas por dia: ");
        horasTrab = Float.parseFloat(leitor.nextLine());
        System.out.print("Insira a quantidade de dias trabalhados no mês: ");
        diasTrab = Float.parseFloat(leitor.nextLine());

        resultado = horasTrab * diasTrab;

        System.out.print("A quantidade de horas trabalhadas é de: " + resultado + " horas");

        leitor.close();
    }
    
}
