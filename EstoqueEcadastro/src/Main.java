import Model.Produto;
import Service.Estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Estoque serviceEstoque = new Estoque();



        int opcao;
        do {
            System.out.println("\n=== Sistema de Cadastro de Usuários ===");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Buscar Produto Por Filtro");
            System.out.println("4. Atualizar Produto");
            System.out.println("5. Remover Produto");
            System.out.println("6. Relatório Estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double price = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int qtn = scanner.nextInt();
                    Produto novo = serviceEstoque.addProduto(nome, price, qtn);
                    System.out.println("Usuário cadastrado: " + novo);
                    break;

                case 2:
                    System.out.println("Usuários cadastrados:");
                    serviceEstoque.listaTodos();
                    break;

                case 3:
                    System.out.println("Escolha por qual filtro vai buscar ");
                    System.out.println("1. ID: ");
                    System.out.println("2. Nome: ");
                    int filtro = scanner.nextInt();
                    scanner.nextLine(); // <-- limpa o buffer antes de ler o próximo texto
                    switch (filtro){
                        case 1:
                            System.out.println("Digite o ID do Produto: ");
                            int id = scanner.nextInt();
                            Produto p1 = serviceEstoque.filtrarID(id);
                            System.out.println(p1 != null ? p1 : "Produto não encontrado!");
                            break;
                        case 2:
                            System.out.println("Digite o nome do Produto: ");
                            String name = scanner.nextLine(); // agora vai funcionar
                            Produto p2 = serviceEstoque.filtrarName(name);
                            System.out.println(p2 != null ? p2 : "Produto não encontrado!");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Atualizar Produtos Por ");
                    System.out.println("1. Nome: ");
                    System.out.println("2. Preço: ");
                    int atualizar = scanner.nextInt();
                    scanner.nextLine(); // <-- limpa o buffer antes de ler o próximo texto
                    switch (atualizar){
                        case 1:
                            System.out.println("Digite o nome do produto que deseja alterar : ");
                            String oldName = scanner.nextLine();


                            System.out.println("Digite o novo nome:");
                            String newName = scanner.nextLine();

                            Produto p1 = serviceEstoque.atualizarName(oldName, newName);

                            System.out.println(p1 != null ? p1 : "Produto não encontrado!");
                            break;
                        case 2:
                            System.out.println("Digite o nome do Produto: ");
                            String findName = scanner.nextLine(); // agora vai funcionar


                            System.out.println("Digite o novo Preço:");
                            double newPrice = scanner.nextDouble();

                            Produto p2 = serviceEstoque.atualizarPrice(findName, newPrice);

                            System.out.println(p2 != null ? p2 : "Produto não encontrado!");
                            break;
                    }

                case 5:
                    System.out.print("ID do produto para remover: ");
                    int idRemover = scanner.nextInt();
                    boolean removido = serviceEstoque.removerProduto(idRemover);
                    System.out.println(removido ? "Produto removido." : "Produto não encontrado.");
                    break;
                case 6:
                    double total = serviceEstoque.calcularValorTotal();
                    ArrayList<Produto> baixoEstoque = serviceEstoque.produtosBaixoEstoque();
                    System.out.println("Valor total do estoque: " + total);
                    System.out.println("Produtos com menos de 5 unidades: " + baixoEstoque);
                    break;
            }
        } while (opcao != 0);

        System.out.println("Encerrando...");
    }
}