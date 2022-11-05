import java.util.Arrays;
import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        /*81) Faça um programa que carregue dois vetores, X e Y, com dez números inteiros cada um. Considere que os números de
        cada vetor digital, X e Y, não podem estar repetidos. Calcule e mostre os seguintes vetores resultantes:
        - a união de X com Y (todos os elementos de X e os elementos de Y que não estejam em X)
        - a diferença entre X e Y (todos os elementos de X que não existam em Y)
        - a soma entre X e Y (soma de cada elemento de X com o elemento de mesma posição em Y)
        - produto entre X e Y (multiplicação de cada elemento de X com o elemento de mesma posição em Y)
        - a interseção entre X e Y (apenas os elementos que aparecem nos dois vetores) */

        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] y = { 1, 20, 3, 40, 50, 60, 70, 80, 9, 100 };
        // TO DO: immplementar a entrada
        int[] uniao = new int[20];

        Scanner leitor = new Scanner(System.in);

        // UNIÃO
        System.err.println("");
        System.out.println("|| UNIÃO ||");
        for (int c = 0; c < 10; c++) {
            uniao[c] = x[c];
        }
        int proximolivre = 10;

        for (int c = 0; c < 10; c++) {
            System.out.println(y[c]);
            boolean achei = false;
            for (int j = 0; j < 10; j++) {
                // System.out.println("\t"+x[j]);
                if (y[c] == x[j]) {
                    achei = true; 
                    break;
                }
            }
            if (achei == false) {
                System.out.println("Não achei em lugar nenhum");
                uniao[proximolivre] = y[c];
                proximolivre++;
            }
        }
        System.out.println(Arrays.toString(uniao));

        //a diferença X e Y (todos os elementos de X que não existam em Y)
        System.out.println("");
        System.out.println("|| DIFERENÇA ||");
        proximolivre = 0;
        int[] diferenca = new int[10];
        for(int i = 0; i <10; i++){
            System.out.println("dif X:" + x[i]);
            boolean achei = false;
            for(int j = 0; j < 10; j++){
                System.out.println("\tdif Y:" + y[j]);
                if(x[i] == y[j]){
                    System.out.println("ACHEI IGUAL!!!");
                    achei = true;
                    break;
                }
            }
            if(!achei){
                diferenca[proximolivre] = x[i];
                proximolivre++;
            }
        }
        System.out.println(Arrays.toString(diferenca));

        //a soma entre X e Y (soma de cada elemento de X com o elemento de mesma posição em Y)
        System.out.println("");
        System.out.println("|| SOMA ||");
        int[] soma = new int[10];
        for(int i = 0; i < 10; i++){
            soma[i] = x[i] + y[i];
        }
        System.out.println(Arrays.toString(soma));

        //produto entre X e Y (multiplicação de cada elemento de X com o elemento de mesma posição em Y)
        System.out.println("");
        System.out.println("|| MULTIPLICAÇÃO ||");
        int[] multi = new int[10];
        for(int i = 0; i < 10; i++){
            multi[i] = x[i] * y[i];
        }
        System.out.println(Arrays.toString(multi));

        //a interseção entre X e Y (apenas os elementos que aparecem nos dois vetores)
        System.out.println("|| INTERSEÇÃO ||");
        int[] intersecao = new int[10];
        proximolivre = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("inter X: " + x[i]);
            for(int j = 0; j < 10; j++){
                System.out.println("\tinter Y:" + y[j]);
                if(x[i] == y[i]){
                    intersecao[proximolivre] = x[i];
                    proximolivre++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(intersecao));

        leitor.close();
    }
}
