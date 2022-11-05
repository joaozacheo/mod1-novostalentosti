public class ExemploNumerosPrimitivos {
    public static void main(String[] args) throws Exception {
      //AULA 2
        //Comentário de linha
        /*Comentário
          de bloco*/
        //System.out.println("-Partiu começar um projeto?");
        //System.out.println("-Simm!");
        
      //AULA 3
        //ENTRADAS
        int n1 = 7;
        int n2  = 2;
        System.out.println("1º número: "+ n1); //primeiro número inserido
        System.out.println("2º número: "+ n2); //segundo número inserido

        //PROCESSAMENTO
        int resultadoAdd      = n1 + n2;               //atribuição de valor
        int resultadoSub      = n1 - n2;               //atribuição de valor
        int resultadoMult     = n1 * n2;               //atribuição de valor
        float resultadoDiv    = (float)n1 / (float)n2; //atribuição de valor
        boolean resultadoComp = n1 == n2;              //atribuição de valor

        
        //SAIDA           |                   concatenação                   |
        System.out.println("O resultado da adição é: "        + resultadoAdd );                                  //resultado da soma
        System.out.println("O resultado da subtração é: "     + resultadoSub );                                  //resultado da subtração
        System.out.println("O resultado da multiplicação é: " + resultadoMult);                                  //resultado da multiplicação
        System.out.println("O resultado da divisão é: "       + resultadoDiv );                                  //resultado da divisão
        System.out.println("O resultado da comparação é: "    + (resultadoComp?"São iguais":"Não são iguais"));  //resultado da comparação
        
        //Interpolação de String:
        //System.out.println(String.format("O resultado 2 da adição é : %d",   resultadoAdd));
        //System.out.println(String.format("O resultado 2 da divisão é : %.3f", resultadoDiv));

        String nome = "J0ã0 Vict0r Zachê0";
        System.out.println(nome.replace("0", "o"));

        char umaLetra = 'a';
        System.out.println(umaLetra);
    }
}
