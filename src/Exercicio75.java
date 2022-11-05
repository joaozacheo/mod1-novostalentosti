import java.util.Scanner;

public class Exercicio75 {
    public static void main(String[] args) {
        /*75) Faça um programa que receba a idade de 15 pessoas e que calcule e mostre:
        - A quantidade de pessoas em cada faixa etária
        - A percentagem de pessoas em cada uma das faixas etárias, com relação ao total de pessoas, de acordo com a tabela abaixo:
        --------------+-----------------------------------
        Faixa Etária   | Idade
        --------------+-----------------------------------
        1                   | Até 15 anos
        2                   | De 16 a 30 anos
        3                   | De 31 a 45 anos
        4                   | De 46 a 60 anos
        5                   | Acima de 61 anos
        --------------+----------------------------------- */

        float idade = 0;
        float faixa1 = 0;
        float faixa2 = 0;
        float faixa3 = 0;
        float faixa4 = 0;
        float faixa5 = 0;
        float pct1 = 0;
        float pct2 = 0;
        float pct3 = 0;
        float pct4 = 0;
        float pct5 = 0;

        Scanner leitor = new Scanner(System.in);

        for(int c = 1; c <= 15; c++){
            System.out.println("  ");
            System.out.println("Pessoa " + c);
            System.out.print("Insira a idade da pessoa: ");
            idade = Float.parseFloat(leitor.nextLine());

            if(idade <= 15){
                faixa1++;
                pct1 = (faixa1*100)/15;
            }else{
                if(idade >= 16 && idade <= 30){
                    faixa2++;
                    pct2 = (faixa2*100)/15;
                }else{
                    if(idade >= 31 && idade <= 45){
                        faixa3++;
                        pct3 = (faixa3*100)/15;
                    }else{
                        if(idade >= 46 && idade <= 60){
                            faixa4++;
                            pct4 = (faixa4*100)/15;
                        }else{
                            if(idade >= 61){
                                faixa5++;
                                pct5 = (faixa5*100)/15;
                            }else{
                                System.out.println("Idade inválida");
                                continue;
                            }
                        }
                    }
                }
            }
        }

        System.err.println("  ");
        System.out.println(String.format("%.0f pessoas tem até 15 anos, o que é %.2f do total de pessoas", faixa1, pct1));
        System.out.println(String.format("%.0f pessoas tem entre 16 e 30 anos, o que é %.2f do total de pessoas", faixa2, pct2));
        System.out.println(String.format("%.0f pessoas tem entre 31 e 45 anos, o que é %.2f do total de pessoas", faixa3, pct3));
        System.out.println(String.format("%.0f pessoas tem entre 46 e 60 anos, o que é %.2f do total de pessoas", faixa4, pct4));
        System.out.println(String.format("%.0f pessoas tem acima de 61 anos, o que é %.2f do total de pessoas", faixa5, pct5));

        leitor.close();
    }
}
