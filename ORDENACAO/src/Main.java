import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //quantos numeros na lista deseja
        System.out.print("Quantos números deseja ordenar? ");
        int qtNumbers = scanner.nextInt();

        ArrayList<Double> listaNumeros = addNumberAtList(qtNumbers);

        System.out.println("Números em ordem crescente: " + listaCrescente(listaNumeros));
        System.out.println("Números em ordem decrescente: " + listaDecrescente(listaNumeros));

    }

    static ArrayList<Double> addNumberAtList(int qtNumber){

        Scanner scanner = new Scanner(System.in);
        //duvida entre Double e double;
        ArrayList<Double> listNumbers = new ArrayList<Double>();

        for (int i = 0; i < qtNumber; i++) {
            System.out.print("Digite o numero " + i + ":");
            double actualNumber = scanner.nextDouble();

            listNumbers.add(actualNumber);
        }
        return listNumbers;
    }

    static ArrayList<Double> listaCrescente(ArrayList<Double> lista){
        ArrayList<Double> copia = new ArrayList<>(lista); // faz uma cópia

        Collections.sort(copia);
        return copia;

    }

    static ArrayList<Double> listaDecrescente(ArrayList<Double> lista){

        ArrayList<Double> copia = new ArrayList<>(lista); // faz uma cópia
        Collections.sort(copia, Collections.reverseOrder());
        return copia;

    }

}