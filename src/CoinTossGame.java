import java.util.Scanner;

public class CoinTossGame {

	public static void main(String[] args) {
		int correctCount=0;
		
		
		
		Scanner scan = new Scanner(System.in);
		//Random rand = new Random();
		
		
		//Correctly gets user input from the console.
		//Stores first user input in a variable named headsOrTailsGuess
		//Stores second user input in a numeric variable named numberOfFlips.
		
		System.out.println("Guess which will have more: heads or tails?");
		String headsOrTailsGuess = scan.nextLine();
		
		System.out.println("How many times shall we flip a coin?");
		int numberOfFlips = scan.nextInt();
		
		System.out.print("\n");

		//Loops the correct number of times.
		//Generates random numbers each time
		//Correctly generates and displays a random heads or tails each time.
		//Adds to correctCount accurately.

		
		if (numberOfFlips < 2) {
			System.out.println("Error! Number chosen is too small.");
		} else {
			
		for (int i = 0; i < numberOfFlips; i++) {
			if(Math.random() > 0.5) {
				System.out.println("heads");
				if(headsOrTailsGuess.matches("heads")) {
					correctCount++;
				}
			} else {
				System.out.println("tails");
				if(headsOrTailsGuess.matches("tails")) {
					correctCount++;
				}
			}
		}
			
			
		}	
		
		//Displays the user choice at the end (either heads or tails).
		//Displays the correct count at the end.
		//Displays the correct percentage at the end.
		
	    System.out.println("\n");
	    
	    System.out.print("\n");
		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s)!");
		System.out.print("That's ");
		System.out.printf("%.2f", (double) correctCount/numberOfFlips * 100);
		System.out.print("%!");
		
		

	}

}
