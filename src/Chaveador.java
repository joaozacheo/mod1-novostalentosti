public class Chaveador {
    public static void main(String[] args) {
        int opcao = -1;

        if(opcao == 0){
            System.out.println("IF: Valor ZERO");
        }else{
            if(opcao == 1){
                System.out.println("IF: Valor é UM");
            }else{
                System.out.println("IF: É negativo");
            }
        }

        switch (opcao) {
            case -1:
                System.out.println("SWITCH: É negativo");
            break;

            case 0:
                System.out.println("SWITCH: Valor ZERO");
            break;

            case 1:
                System.out.println("SWITCH: Valor é UM");
            break;

            default:
                System.out.println("Nenhum dos casos anteriores");
                break;
        }
    }
}
