public class Exercicio56 {
    public static void main(String[] args) {
        /*56) Elabore um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.*/

        int numero = 1;
        int resto = 0;
        int soma = 0;

        while(numero <= 500){
            if(resto == numero % 2){
                soma = soma + numero;
            }
            numero++;
        }

        System.out.println(soma);
    }
}
