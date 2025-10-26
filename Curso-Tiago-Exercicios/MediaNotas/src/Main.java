import java.util.*;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);


        System.out.print("Nome do Aluno: ");
        String alunoName = scanner.nextLine();

        System.out.print("Quantas notas deseja cadastrar? ");
        int totalNotas = scanner.nextInt();


        double[] notas = new double[totalNotas];
        double soma = 0.0;

        for (int i = 0; i < totalNotas; i++) {
            double nota;
            do {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                nota = scanner.nextDouble();
            } while (nota < 0.0 || nota > 10.0);

            notas[i] = nota;
            soma += nota;

        }

        aluno(alunoName, notas, soma);

    }

    static void aluno(String name, double[] notas, Double soma){
        double media = (soma / notas.length);



        String status = "";
        if(media >= 7){
            status = "Aprovado";
        } else if(media >= 5){
            status = "Recuperação";
        } else {
            status = "Reprovado";
        }

        System.out.printf("Sua nota foi %.2f\n", media);
        System.out.println("O aluno " + name + " foi " + status);
    }

}