import java.util.Scanner;
import java.util.ArrayList;



public class vipEvent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vips = {"Joao", "Maria", "Pedro"}; //lista de convidados.

        ArrayList NomesCamarote = new ArrayList<>();
        ArrayList NomesPista = new ArrayList<>();
        int tentaramEntrar = 0;
        int barrados = 0;

        boolean sair = false; //permitir entrar no while
        while(!sair){


            System.out.print("Qual o seu nome? ");
            String nome = scanner.nextLine();
            boolean isVip = false;


            for (String vip : vips) {

                if (nome.equals(vip)) {
                    isVip = true;
                    break;
                }
            }

            System.out.print("Qual a sua idade? ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // limpa a quebra de linha
            boolean maiorDeIdade = idade >= 18;

            //depois do nome + idade podemos concluir que é uma pessoa, ai fazemos a contagem
            tentaramEntrar++;

            if (!maiorDeIdade) {
                System.out.println("Entrada negada!");
                System.out.println("Você é menor de idade " + nome);
                System.out.println("Bloqueado!");

                barrados++; //Se for menor de idade, barrado.

            } else if (isVip) {
                System.out.println("liberado! Bem-vindo à festa " + nome);
                System.out.println("Vá ao Camarote pela porta superior");
                System.out.println("Bebidas a vontade por conta da casa!");

                //Se estiver na lista VIP, entra no camarote.
                NomesCamarote.add(nome);

            } else {

                System.out.print("Tem ingresso ?  ");
                boolean ingresso = Boolean.parseBoolean(scanner.nextLine());

                if (ingresso) {
                    System.out.println("liberado! Bem-vindo à festa " + nome);
                    System.out.println("Va para a pista livre e tente o melhor lugar");
                    System.out.println("Bom show pra voce!");

                    //Se não for VIP mas tiver ingresso, entra na pista.
                    NomesPista.add(nome);

                } else {
                    System.out.println("Entrada negada!");
                    System.out.println("Você tem idade suficiente, " + nome + ", mas não está na lista VIP nem tem ingresso.");

                    barrados++; //Se não for VIP e não tiver ingresso, barrado.
                }
            }

            System.out.println("Para continuar tecle 'ENTER' ou digite 'sair' ");
            String enterSair = scanner.nextLine();

            //saida do programa.
            if(enterSair.equals("sair")){
                sair = true;

                ArrayList TotalEntraram = new ArrayList(NomesCamarote);
                TotalEntraram.addAll(NomesPista);

                System.out.println("Total de pessoas que tentaram entrar: "+ tentaramEntrar);
                System.out.println("Quantos foram barrados:  "+ barrados);
                System.out.println("Quantos foram para o camarote:  "+ NomesCamarote.size());
                System.out.println("Quantos foram para a pista:  "+ NomesPista.size());
                System.out.println("Lista com os nomes de quem entrou: "+ TotalEntraram);
            }


        }


    }
}