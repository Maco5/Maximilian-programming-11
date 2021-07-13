import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wins= 0;
        int losses= 0;
        System.out.print("Choose 'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'\n");
        while(true){
            System.out.println("****************************************");
            System.out.print("Wins: "+wins);
            System.out.print("\tLosses: "+losses);
            System.out.println("\nPlayer choice:");
            String playerChoice = scan.next();
            if (playerChoice.equals("x")){
                break;
            }
            if (!playerChoice.equals("r") && !playerChoice.equals("p") && !playerChoice.equals("s")) {
                System.out.println("Invalid input, please play again");
            } else {
                int random = (int) (Math.random() * 3);
                String computerChoice="";
                if (random == 0) {
                    computerChoice = "r";
                } else if (random == 1) {
                    computerChoice = "p";
                } else {
                    computerChoice = "s";
                }
                if (playerChoice.equals(computerChoice)) {
                    System.out.println("Draw!");
                } else if (playerChoice.equals("r") && computerChoice.equals("s")
                        || playerChoice.equals("p") && computerChoice.equals("r")
                        || playerChoice.equals("s") && computerChoice.equals("p")) {
                    System.out.println("You win!");
                    wins ++;
                } else {
                    System.out.println("You lose!");
                    losses++;
                }
                if (computerChoice.equals("r")) {
                    System.out.print("Computer choice: rock");
                } else if (computerChoice.equals("s")) {
                    System.out.print("Computer choice: scissors");
                } else {
                    System.out.print("Computer choice: paper");
                }
                if (playerChoice.equals("r")) {
                    System.out.print("\tPlayer choice: rock\n");
                } else if (playerChoice.equals("s")) {
                    System.out.print("\tPlayer choice: scissors\n");
                } else {
                    System.out.print("\tPlayer choice: paper\n");
                }
            }
        }
        System.out.println("Thank you for playing!");
    }
}