/*************************************************************************
 *  2) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;


public class ConversorDolarReal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cotaDollar, valorDollar, valorReal;
        String valoRealFormated;

        System.out.println("Qual a Cotação do $Dollar Agora: ");
        cotaDollar = input.nextDouble();

        System.out.println("Qual o Valor a ser convertido $: ");
        valorDollar = input.nextDouble();

        DecimalFormat df = new DecimalFormat("#.00"); //formatar casa decimal

        valorReal = valorDollar * cotaDollar;

        valoRealFormated = df.format(valorReal);


        System.out.println("Esse é o seu valor em R$ " + valoRealFormated);




    }
}