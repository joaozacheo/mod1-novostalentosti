import java.util.Arrays;

public class ExemploString {
    public static void main(String[] args) {
        String texto = "Universidade da Região de Joinville";
        char[] textoarray = texto.toCharArray();
        System.out.println(Arrays.toString(textoarray));
        // retorna um caracter na posição informada
        System.out.println(texto.charAt(26));
        // troca um ou mais caracterees por outros caracteres
        //STRING SAO OBJETOS IMUTÁVEIS
        //System.out.println(texto.replace(" ", "_"));
        texto = texto.replace(" ", "_");
        System.out.println(texto);
        // corta o texto
        System.out.println(texto.substring(26, 35));
        //Quantos caracteres tem no texto
        System.out.println(texto.length());

        System.out.println(Arrays.toString(texto.split("_")));

        //Como colocar aspas em um texto
        String outroTexto = " \"no meio\" ";
        System.out.println(" ");
        System.out.println( "+---Como colocar aspas em um texto---+");
        System.out.println("|            "+ outroTexto +"             |");
        System.out.println( "+------------------------------------+");
        System.out.println(" ");
    }
}
