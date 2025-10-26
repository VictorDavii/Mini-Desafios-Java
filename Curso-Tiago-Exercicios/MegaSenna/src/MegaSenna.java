import java.util.Random;
import java.util.Arrays;

public class MegaSenna {
    public static void main(String[] args) {

        Random random = new Random();
        int drawnNumbers[] = new int[6];
        int count = 0;

        while (count < 6){
            int number = random.nextInt(60) + 1;
            boolean alreadyDrawn = false;

            for(int i = 0; i<count; i++){
                if(drawnNumbers[i] == number){
                    alreadyDrawn = true;
                    break;
                }
            }

            if(!alreadyDrawn){
                drawnNumbers[count] = number;
                count++;
            }
        }
        //Ordendo os numeros do Array
        Arrays.sort(drawnNumbers);
        System.out.println("Números sorteados em ordem crescente: ");
        for(int i = 0; i < drawnNumbers.length; i++){
            System.out.println("Número " + (i + 1) + ": " + drawnNumbers[i]);
        }
    }
}