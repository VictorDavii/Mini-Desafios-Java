import Model.User;
import Service.SistemaLogin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SistemaLogin servicos = new SistemaLogin();
        Scanner scanner = new Scanner(System.in);
        int resp;

        do {
            System.out.println("Menu Cadastro");
            System.out.println("[1] Cadastrar novo usuario");
            System.out.println("[2] Logar");
            System.out.println("[0] Sair...");
            resp = scanner.nextInt();
            scanner.nextLine(); //limpar bufer
            switch (resp){
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a senha:");
                    String senha = scanner.nextLine();

                    servicos.cadastrar(nome, senha);

                    break;
                case 2:
                    System.out.println("Digite o nome:");
                    String nomeLogin = scanner.nextLine();
                    System.out.println("Digite a senha:");
                    String senhaLogin = scanner.nextLine();

                    servicos.login(nomeLogin, senhaLogin);
                    break;
                case 0:
                    break;
            }
        }while(resp != 0);
        System.out.println("Encerrando...");
    }
}