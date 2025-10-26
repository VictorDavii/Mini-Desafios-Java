import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Tela inicial para pediar os 2 numero e operador!

        System.out.println(("Didige o primeiro numero: "));
        int n1 = input.nextInt();
        System.out.println(("+ -> ira somar"));
        System.out.println(("- -> ira subtrair "));
        System.out.println(("* -> ira multiplicar  "));
        System.out.println(("/ -> ira dividir  "));

        System.out.println(("Didige o operador (+ , - , * , / ): "));
        char operador = input.next().charAt(0);

        System.out.println(("Didige o segundo numero: "));
        int n2 = input.nextInt();

        int resultado = calcular(n1, n2, operador);
        System.out.println("RESULTADO: " + resultado);

        }

        static int calcular(int x, int y, char op) {

            //solucionar divisão por 0
            //solucionr caso não digite nenhuma operação valida

            switch (op) {
                case '+':
                    return x + y;
                case '-':
                    return x - y;
                case '*':
                    return x * y;
                case '/':
                    return x / y; // cuidado divisão por 0
                default:
                    throw new IllegalArgumentException("Operador inválido!");
            }

        }
}
