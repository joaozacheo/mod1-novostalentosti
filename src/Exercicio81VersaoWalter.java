import java.util.Arrays;

public class Exercicio81VersaoWalter {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] y = { 1, 20, 3, 40, 50, 60, 70, 80, 9, 100 };
        // TO DO: immplementar a entrada
        int[] uniao = new int[20];

        // UNIÃO
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
    }
}
