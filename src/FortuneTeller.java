import java.util.Scanner;

@SuppressWarnings("unused")
public class FortuneTeller {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hmm...Let's see what your future has in store for you. Choose your favorite number, 1-10.");
		String favoriteNumber = scanner.nextLine();
		switch (favoriteNumber) {
		case "1":
			System.out.println("Oh no! You're going to sink in quicksand! It's just a matter of time...");
			break;
		case "2":
			System.out.println("You will soon be gifted an abundance of money. Be careful, don't spend it all in one place...");
			break;
		case "3":
			System.out.println("In a short amount of time, you will reach career fulfillment.");
			break;
		case "4":
			System.out.println("The next bridge you choose to walk on will collapse into dust...I would suggest swimming lessons.");
			break;
		case "5":
			System.out.println("It would be in your best interest to stock up on supplies. A world disaster is upon us...");
			break;
		case "6":
			System.out.println("You will soon complete the final task in order to become a mysterious giant...A larger home is recommended.");
			break;
		case "7":
			System.out.println("You will experience tremendous agony throughout your next trek...Prepare accordingly.");
			break;
		case "8":
			System.out.println("The next time you lie, your fingers will turn to earthworms.");
			break;
		case "9":
			System.out.println("Fill your gas tank even if not empty, a major adventure is coming your way...");
			break;
		case "10":
			System.out.println("You must step up to face your greatest challenge. The folks in your city are counting on you...");
			break;
	}
		
	}
}
