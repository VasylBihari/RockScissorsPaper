import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String playerChoice = input.nextLine();


        String [] words = {"rock", "scissors", "paper"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String randomWord = words[randomIndex];


        if (randomWord.equals("scissors")  && playerChoice.equals("paper")){
            System.out.println ("randomWord = " + randomWord + " and You lost");
        }
        if (randomWord.equals("scissors") && playerChoice.equals("rock")){
            System.out.println ("randomWord = " + randomWord + " and You won");
        }
        if (randomWord.equals("paper") && playerChoice.equals("rock")){
            System.out.println ("randomWord = " + randomWord + " and You lost");
        }
        if (randomWord.equals("paper") && playerChoice.equals("scissors")){
            System.out.println ("randomWord = " + randomWord +  " and You won");
        }
        if (randomWord.equals("rock") && playerChoice.equals("scissors")){
            System.out.println ("randomWord = " + randomWord + " and You lost");
        }
        if (playerChoice.equals("paper") && randomWord.equals("rock")){
            System.out.println ("randomWord = " + randomWord + " and You won");
        }
        if (playerChoice.equals(randomWord)) {
            System.out.println ("randomWord = " + randomWord + " and let's try again");
        }
        if (!playerChoice.equals("paper") && !playerChoice.equals("rock") && !playerChoice.equals("scissors")) {
            System.out.println ("entered value is incorrect");
        }
    }
}

