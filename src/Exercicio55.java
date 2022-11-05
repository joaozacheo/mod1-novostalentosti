public class Exercicio55 {
    public static void main(String[] args) {
        /*55) Faça um programa que apresente no final o somatório dos números de 1 até 100.*/

        int contador = 1;
        int soma = 0; //acumulador
        while(contador <= 100){
            soma = soma + contador;
            contador++;
        }

        System.out.println(soma);
    }
}
