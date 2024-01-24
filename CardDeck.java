import java.util.Scanner;

public class CardDeck {
    public static void main(String[] args) {
    	// Opening a scanner to retrieve the user's input.
        Scanner input = new Scanner(System.in);

        // Creating a do-while loop so the user can choose when to stop the program.
        do {
        	// Asking the user for an integer input.
            System.out.print("\nEnter Card Number (1-52): ");
            int card = input.nextInt();

            // If the input is invalid the user will be prompted to try again.
            if (card < 1 || card > 52) {
                System.out.println("Invalid card number. Please enter a number between 1 and 52.");
            } else {
            	// Establishing suit and rank integer variables that select the correct card in the deck.
                int suit = (card - 1) / 13;
                int rank = (card - 1) % 13;
                // Creating two string variables to store the names of the cards' suit and rank.
                String suitName = "";
                String rankName = "";

                // Switch case built to store the names of the suits within the card deck.
                switch (suit) {
                    case 0: suitName = "Clubs"; 
                    break;
                    case 1: suitName = "Diamonds"; 
                    break;
                    case 2: suitName = "Hearts"; 
                    break;
                    case 3: suitName = "Spades"; 
                    break;
                }

                // Switch case built to store the ranks of the card deck.
                switch (rank) {
                    case 0: rankName = "Ace"; 
                    break;
                    case 1: rankName = "2"; 
                    break;
                    case 2: rankName = "3"; 
                    break;
                    case 3: rankName = "4"; 
                    break;
                    case 4: rankName = "5"; 
                    break;
                    case 5: rankName = "6"; 
                    break;
                    case 6: rankName = "7"; 
                    break;
                    case 7: rankName = "8"; 
                    break;
                    case 8: rankName = "9"; 
                    break;
                    case 9: rankName = "10"; 
                    break;
                    case 10: rankName = "Jack"; 
                    break;
                    case 11: rankName = "Queen"; 
                    break;
                    case 12: rankName = "King"; 
                    break;
                }
                // Printing out the selected card from the deck.
                System.out.println("The card you picked is " + rankName + " of " + suitName);
            }
            // Asking the user if they would like to select another card.
            System.out.print("\nWould you like to select a new card? (Y/N): ");
            String repeat = input.next();

            // If the user types in anything other than a "Y" or "y" then the program stops.
            if (!repeat.equalsIgnoreCase("Y")) {
                break; 
            }
            // The loop continues if the user types "Y" or "y".
        } while (true);
        // Closing the scanner.
        input.close();
    }
}
