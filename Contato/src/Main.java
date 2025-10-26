import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int choice;

        do {
            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Buscar contato");
            System.out.println("[3] Lista de contatos");
            System.out.println("[0] Sair...");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nome do Contato: ");
                    String nomeContato = scanner.nextLine();

                    System.out.println("Numero de telefone: ");
                    String telefone = scanner.nextLine();

                    agenda.adicionarContato(nomeContato, telefone);

                    System.out.println("O contato" + nomeContato + "foi Adicionado a lista");
                    break;
                case 2:
                    System.out.println("Digite o nome: ");
                    String name = scanner.nextLine();
                    agenda.buscarContato(name);
                    break;
                case 3:
                    System.out.println("Lista Completa de Contatos");
                    agenda.listarContato();

            }
        } while(choice != 0);
    }
}