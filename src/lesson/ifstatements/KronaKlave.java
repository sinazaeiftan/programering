package lesson.ifstatements;

import java.util.Random;
import java.util.Scanner;

public class KronaKlave {

	public static void main(String[] args) {
		//scanner random selector.//
		// Till f�r att l�sa vad anv�ndaren skriver
		Scanner usersGuess = new Scanner(System.in);
		// tar in text fr�n anv�ndaren.
        String userspick = usersGuess.nextLine().toLowerCase();
        // 
        Random randomGenerator = new Random();
        boolean coinFlippValue = randomGenerator.nextBoolean();
        System.out.println(coinFlippValue); 
        if (coinFlippValue == true){
        	System.out.println("Computer - Heads");
        } else {
        	System.out.println("Computer - Tails");
	    }
	    
        System.out.println("select head or Tails");  
        String usersPick = usersGuess.nextLine();
        

        if (coinFlippValue == true && usersPick.equals("heads") ||  coinFlippValue == false && usersPick.equals("tails")){
        	System.out.println("YOU WAN!");
        } else {
        	System.out.println("YOU LOST!!!!!");
        }
	}
}