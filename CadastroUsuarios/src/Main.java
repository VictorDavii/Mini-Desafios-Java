

import Model.Usuario;
import Service.UsuarioService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioService service = new UsuarioService();

        int opcao;
        do {
            System.out.println("\n=== Sistema de Cadastro de Usuários ===");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Buscar por email");
            System.out.println("4. Atualizar senha");
            System.out.println("5. Remover usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    Usuario novo = service.cadastrar(nome, email, senha);
                    System.out.println("Usuário cadastrado: " + novo);
                    break;

                case 2:
                    System.out.println("Usuários cadastrados:");
                    for (Usuario u : service.listarTodos()) {
                        System.out.println(u);
                    }
                    break;

                case 3:
                    System.out.print("Digite o email: ");
                    String emailBusca = scanner.nextLine();
                    Usuario encontrado = service.buscarPorEmail(emailBusca);
                    System.out.println(encontrado != null ? encontrado : "Usuário não encontrado.");
                    break;

                case 4:
                    System.out.print("ID do usuário: ");
                    int idSenha = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nova senha: ");
                    String novaSenha = scanner.nextLine();
                    boolean atualizado = service.atualizarSenha(idSenha, novaSenha);
                    System.out.println(atualizado ? "Senha atualizada." : "Usuário não encontrado.");
                    break;

                case 5:
                    System.out.print("ID do usuário para remover: ");
                    int idRemover = scanner.nextInt();
                    boolean removido = service.remover(idRemover);
                    System.out.println(removido ? "Usuário removido." : "Usuário não encontrado.");
                    break;
            }
        } while (opcao != 0);

        System.out.println("Encerrando...");
    }
}
