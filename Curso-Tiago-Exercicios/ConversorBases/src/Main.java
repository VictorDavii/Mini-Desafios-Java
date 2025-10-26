import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("DIGITE O ALGARISMO: ");
            String number = scanner.nextLine();

            System.out.println("DESEJA FAZER QUAL CONVERSÃO: ");
            System.out.println("[1] Decimal --> Binario ");
            System.out.println("[2] Binario --> Decimal ");
            System.out.println("[0] Sair");
            int choice = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (choice) {
                case 1:
                    toBinario(number);
                    break;
                case 2:
                    toDecimal(number);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    static void toDecimal(String binario){


        StringBuilder sb = new StringBuilder(binario);
        sb.reverse();


        int decimalTotal = 0;

        for (int i = 0; i < sb.length() ; i++) {
            int number = Integer.parseInt(String.valueOf(sb.charAt(i)));

            if (number == 1 || number == 0) {
                int converted = (int) (number * Math.pow(2, i));
                decimalTotal += converted;
            } else {
                System.out.println("Erro: número binário inválido.");
                return;
            }
        }
           System.out.println("Decimal: " + decimalTotal);

    }


    static void toBinario(String decimal){

        int convertedDecimal = Integer.parseInt(decimal);
        int number = 0;
        StringBuilder binario = new StringBuilder();

        while(convertedDecimal > 0){

            number = convertedDecimal % 2;
            binario.append(number);

            convertedDecimal = convertedDecimal / 2;

        }


        System.out.println("Binário: " + binario.reverse());
    }
}