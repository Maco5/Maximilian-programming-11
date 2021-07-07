//Set up java Scanner
import java.util.Scanner;

public class Randoms {
    public static void main(String[] args) {
        //Set scanner so to get user input
        Scanner scan = new Scanner(System.in);
        //Prompt the user to type in answer once question appears
        System.out.println("Choose rock paper or scissors.\t'r' for rock, 'p' for paper and 's' for scissors.");
        String playerChoice = scan.next();
        //Need to verify that the player's choice is valid
        if (!playerChoice.equals("r") && !playerChoice.equals("p") && !playerChoice.equals("s")) {
            System.out.println("Invalid selection please play again.");
        } else {
            //Randomly generate computer's choice to get random input (0,1,2)
            // We need 3 letters so we need a random integer between 0 and 3. To do this we multiply "Math.Random" by 3
            int random = (int) (Math.random() * 3);
            String computerChoice = "";
            //Now we need to put our if, else if, and else statement for the computer's choice
            if (random == 0) {
                computerChoice = "r";
            } else if (random == 1) {
                computerChoice = "p";
            } else {
                computerChoice = "s";
            }
            //Determine whether the player won, tied, or lost
            if (playerChoice.equals(computerChoice)) {
                System.out.println("Draw!");
            } else if ((playerChoice.equals("r") && computerChoice.equals("s"))
                    || (playerChoice.equals("s") && computerChoice.equals("p"))
                    || (playerChoice.equals("p") && computerChoice.equals("r"))) {
                System.out.println( "You win!");
            } else {
                System.out.println("You lose!");
            }
            //Print the choice of the computer with variables
            if (computerChoice.equals("s")){
                System.out.print("Computer choice: scissors");
            }
            else if (computerChoice.equals("r")){
                System.out.print("Computer choice: rock");
            }
            else {
                System.out.print("Computer choice: paper");
            }
        }
        //Print the choice of player with variables
        if (playerChoice.equals("s")){
            System.out.print("\tPlayer choice: scissors");
        }
        else if (playerChoice.equals("r")){
            System.out.print("\tPlayer choice: rock");
        }
        else if (playerChoice.equals("p")) {
            System.out.print("\tPlayer choice: paper");
    }
    }
}