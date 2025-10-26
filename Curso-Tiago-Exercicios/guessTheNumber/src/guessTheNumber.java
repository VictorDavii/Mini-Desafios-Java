import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        boolean correctNumber = false;
        int attempt = 0;
        int limitAttempt = 3;

        System.out.println("O numero do cofre é de 1 a 100, voce tem 3 tentativas de acertar!");
            
        while(!correctNumber && attempt < limitAttempt){

            System.out.print("Digite a senha do cofre: ");
            String tryNumber = input.nextLine();

            if(tryNumber.equals(secretNumber)){
                correctNumber = true;
                System.out.println(("Cofre aberto com sucesso!"));
            } else {
                attempt++;
                int remainingAttempts = limitAttempt - attempt;

                if(remainingAttempts > 0){
                    System.out.println("❌ Senha incorreta. Tentativas restantes: " + remainingAttempts);
                }
            }
        }

        if(!correctNumber){
            System.out.println("🚫 Cofre bloqueado! Número de tentativas excedido.");
        }
        System.out.println(secretNumber);
        input.close();

    }
}