public class Exercicio59 {
    public static void main(String[] args) {
        /*59) Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit,
        de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
        O programa deverá apresentar os valores das duas temperaturas. */

        for(float celsius = 10; celsius <= 100; celsius = celsius + 10){
            float fahrenheit = 0;

            fahrenheit = (1.8f * celsius) + 32;

            System.out.println(String.format("Celsius: %.2fºC", celsius));
            System.out.println(String.format("Fahrenheit: %.2fºF", fahrenheit));
            System.out.println("  ");
        }
    }
}
