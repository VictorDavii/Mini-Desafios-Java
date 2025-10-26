import Model.Livro;
import service.ServiceBiblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ServiceBiblioteca service = new ServiceBiblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
        System.out.println("Bem-Vindo a E-stante");
        System.out.println("[1] Adicionar um novo livro");
        System.out.println("[2] Reservar um livro");
        System.out.println("[3] Devolver um livro");
        System.out.println("[0] SAIR...");
        opcao = scanner.nextInt();
            switch (opcao){
                case 1:

                    scanner.nextLine();
                    System.out.println("Digite o nome do livro: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Qual o nome do Autor: ");
                    String autor = scanner.nextLine();

                    service.addLivros(autor, titulo);
                    for (Livro livro : service.exibirEstante()) {
                        System.out.println(livro);
                    }
                    break;
                case 2:
                    for (Livro livro : service.exibirEstante()) {
                        System.out.println(livro);
                    }
                    System.out.println("Atraves do ID selecione o livro que deseja: ");
                    int ID = scanner.nextInt();
                    if (service.emprestarLivro(ID) == null) {
                        System.out.println("Livro não encontrado ou já emprestado.");
                    } else {
                    service.emprestarLivro(ID);

                    System.out.println("O livro --> "+ service.tituloLivro(ID) + " foi Reservado!" );
                    System.out.println("Tem 30 dias para devolver, ou sujeito a multa.");
                    }


                    break;
                case 3:
                    for (Livro livro : service.exibirEstante()) {
                        System.out.println(livro);
                    }
                    System.out.println("Atraves do ID Faça a Devolução: ");
                    int devolucaoID = scanner.nextInt();
                    if (service.emprestarLivro(devolucaoID) == null) {
                        System.out.println("ID Vinculado ao livro errado!.");
                    } else {
                        service.devolverLivro(devolucaoID);

                        System.out.println("O livro --> "+ service.tituloLivro(devolucaoID) + " foi devolvido!" );
                        System.out.println("Muito Obrigado, Aproveite Mais em E-stante.");
                    }

                    System.out.println("ESTANTE ATUALIZADA");
                    for (Livro livro : service.exibirEstante()) {
                        System.out.println(livro);
                    }
                    break;
            }
        } while(opcao != 0);
        System.out.println("Encerrando...");

    }
}