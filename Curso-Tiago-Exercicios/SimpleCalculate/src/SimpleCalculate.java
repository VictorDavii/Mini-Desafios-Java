import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int x = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int y = scanner.nextInt();


        System.out.println("Escolha a operação que deseja fazer");
        System.out.println("[1] SOMAR");
        System.out.println("[2] SUBTRAIR");
        System.out.println("[3] MULTIPLICAR");
        System.out.println("[4] DIVIDIR");
        int op = scanner.nextInt();



        switch (op) {
            case 1:
                sum(x, y);
                break;
            case 2:
                minus(x, y);
                break;
            case 3:
                multiply(x, y);
                break;
            case 4:
                System.out.println(toDivide(x, y));
                break;
            default:
                System.out.println("Nenhuma instrução encontrada!");
                return; // encerra o programa aqui se não reconheceu
        }
    }

    static void sum(int x, int y){
        System.out.println(x + y);
    }

    static void minus(int x, int y){
        System.out.println(x - y);
    }

    static void multiply(int x, int y){
        System.out.println(x * y);
    }

    static double toDivide(int x, int y){
        if(y == 0){
            throw new IllegalArgumentException("Erro: Divisão por zero!");
        }
        double result = (double) x / y ;
        return result;
    }

}