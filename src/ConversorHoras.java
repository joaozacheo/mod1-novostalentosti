import java.util.Scanner;

public class ConversorHoras {
    public static void main(String[] args) {
        int hora = 0;
        int minutos = 0;
        int horaConv = 0;
        int totalMinutos = 0;
        int segundos = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira as horas: ");
        hora = leitor.nextInt();
        System.out.print("Insira os minutos: ");
        minutos = leitor.nextInt();

        horaConv = hora * 60;
        totalMinutos = horaConv + minutos;
        segundos = totalMinutos * 60;

        System.out.println(String.format("As horas convertidas resultaram em %d minutos",horaConv));
        System.out.println(String.format("O que resultou num total de %d minutos",totalMinutos));
        System.out.println(String.format("Convertendo para segundos, são obtidos %d segundos",segundos));

        leitor.close();


    }
}
