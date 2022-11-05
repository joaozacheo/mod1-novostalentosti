public class ParouImpar {
    public static void main(String[] args) {
        int numero = 9;
        int resultado = numero / 2;
        int resto = numero % 2;
        System.out.println("Resultado: " + resultado);
        System.out.println("Resto: " + resto);
        System.out.println(resto==0?"PAR":"IMPAR");
    }
}
