import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        /*84)Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os códigos de dez contas e os seus respectivos saldos.
        Os códigos devem ser armazenados em um vetor de números inteiros (não pode haver mais que uma conta com o mesmo código) e os saldos devem
        ser armazenados em um vetor de números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 for
        armazenada na quinta posição do vetor de saldos. Depois de fazer a leitura dos valores, mostrar o seguinte menu na tela:
 
        i.    Efetuar depósito
        ii.    Efetuar saque
        iii.    Consultar o ativo bancário (ou seja, o somatório dos saldos de todos os clientes)
        iv.    Finalizar o programa

        - Para efetuar depósito deve-se solicitar o código da conta e o valor a ser depositado. Se a conta não estiver cadastrada, mostrar a
        mensagem "conta não encontrada" e voltar ao menu. Se a conta existir, atualizar o seu saldo.
        - Para efetuar saque deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver cadastrada, mostrar a mensagem
        Conta não encontrada e voltar ao menu. Se a conta existir, verificar se o seu saldo é suficiente para cobrir o saque. (Estamos supondo
        que a conta não pode ficar com o saldo negativo). Se o saldo for suficiente, realizar o saque e voltar ao menu. Caso contrário mostrar
        a mensagem "Saldo insuficiente" e voltar ao menu.
        - Para consultar o ativo bancário deve-se somar o saldo de todas as contas do banco. Depois de mostrar esse valor, voltar ao menu.
        O programa só termina quando for digitada a opção 4 – Finalizar o programa.   */

        Integer[] codigos = new Integer[10];
        Float[] saldos = new Float[10];
        String[] sequencia = {"Primeira ","Segunda ","Terceira ","Quarta ","Quinta ","Sexta ","Sétima ","Oitava ", "Nona ","Décima "};
        int opcao = 0;
        int codConta = 0;
        float deposito = 0;
        float saque = 0;
        boolean procura = false;

        Scanner leitor = new Scanner(System.in);

        for(int c = 0; c < 10; c++){
            System.out.println(" ");
            System.out.println(sequencia[c] + "conta:");
            System.out.print("Insira o código da conta bancária: ");
            codigos[c] = Integer.parseInt(leitor.nextLine());

            for(int i = 0; i < c; i++){
                if(codigos[c].equals(codigos[i])){
                    System.out.println("Codigo já existente");
                    procura = true;
                    c--;
                }
            }

            if(procura == false){
                System.out.print("Insira o saldo: R$");
                saldos[c] = Float.parseFloat(leitor.nextLine());
            }

            procura = false;
        }

        while(opcao != 4){
            procura = false;
            System.out.println(" ");
            System.out.println("                             MENU                             ");
            System.out.println("+------------------------------------------------------------+");
            System.out.println("|1. Efetuar depósito                  2. Efetuar saque       |");
            System.out.println("|                                                            |");
            System.out.println("|3. Consultar o ativo bancário        4. Finalizar o programa|");
            System.out.println("+------------------------------------------------------------+");

            System.out.print("Opção:");
            opcao = Integer.parseInt(leitor.nextLine());

            if(opcao == 1){
                System.out.println("  ");
                System.out.println("DEPÓSITO");
                System.out.print("Insira o código da conta: ");
                codConta = Integer.parseInt(leitor.nextLine());

                for(int i = 0; i < codigos.length; i++){
                    if(codigos[i] == codConta){
                        procura = true;
                        System.out.print("Insira o valor a ser depositado: R$");
                        deposito = Float.parseFloat(leitor.nextLine());
                        saldos[i] = saldos[i] + deposito;
                        System.out.println("Operação realizada");
                        System.out.println("Saldo atual: R$" + saldos[i]);
                        break;
                    }
                }

                if(procura == false){
                    System.out.println("Conta não encontrada");   
                }

            }else{
                if(opcao == 2){
                    System.out.println("  ");
                    System.out.println("SAQUE");
                    System.out.print("Insira o código da conta: ");
                    codConta = Integer.parseInt(leitor.nextLine());

                    for(int i = 0; i < codigos.length; i++){
                        if(codigos[i] == codConta){
                            procura = true;
                            System.out.print("Insira o valor do saque: R$");
                            saque = Float.parseFloat(leitor.nextLine());
                            if(saldos[i] < saque){
                                System.out.println("Saldo insuficiente");
                            }else{
                                saldos[i] = saldos[i] - saque;
                                System.out.println("Operação realizada");
                                System.out.println("Saldo atual: R$" + saldos[i]);
                            }
                        }
                    }

                    if(procura == false){
                        System.out.println("Conta não encontrada");   
                    }

                }else{
                    if(opcao == 3){
                        System.out.println("  ");
                        int soma = 0;

                        for(int i = 0; i < saldos.length; i++){
                            soma += saldos[i];
                        }

                        System.out.println("Ativo Bancário: R$" + soma);

                    }else{
                        if(opcao == 4){
                            break;
                        }else{
                            System.out.println("  ");
                            System.out.println("Opção inexistente");
                            continue;
                        }
                    }
                }
            }
        }
        System.out.println("  ");
        System.out.println("Programa finalizado.");

        leitor.close();
    }
}
