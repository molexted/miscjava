
import java.util.*;
public class GuessingGame {
	public static void main(String[] args){
		mainloop();
	}
	public static void mainloop(){
		boolean done = true;//if i started with false i'd have to while(done = false)
		int a = 0;//let's init some vars
		int b = 0;
		int tries = 0;
		int bestTries = 9999999;//9999999>1 million :)
		int games = 0;
		int guesses = 0;
		while(done){
			games = games+1;
			tries = 0;
			a = -1;//makes sure b != a
			b = RandInt();
			while(a != b){
				tries = tries+1;//increments tries for game only
				a = GetInput(/*b*/);
				/*uncomment the b here as well as on line 41 and 43
				 * to enable cheat mode (can see random number)
				 * in the method GetInput*/
				int bigger = isBigger(a,b);
				String bigness = PrintOutput(bigger, tries);
				System.out.println(bigness);
				guesses = guesses + 1;//increments total guess #
			}
			bestTries = BestTry(bestTries, tries);
			done = AskDone();
		}
		System.out.println("Games played  = "+ games);
		System.out.println("Moves/game    = "+ ((guesses*1.0)/games));
		System.out.println("Total guesses = "+ guesses);
		System.out.println("Best game     = "+bestTries);
	}
	public static int RandInt(){//grabs a random int
		Random rand = new Random();
		int a = rand.nextInt(100)+1;
		return a;
	}
	public static int GetInput(/*int b*/){//method to grab an guess
		Scanner console = new Scanner(System.in);
		System.out.print("Your guess? "/*+"(awnser is "+b+")"*/);
		int input = console.nextInt();
		return input;
	}
	public static boolean AskDone(){//method to ask another game
		Scanner console = new Scanner(System.in);
		System.out.println("play again? (y/n)");
		String input = console.next();
		if(input.equalsIgnoreCase("y")){
			return true;
		}
		else{
			return false;
		}
	}
	public static int isBigger(int a, int b){//returns an integer value for > < =
		if(a==b){
			return 0;
		}
		else if(a<b){
			return 1;
		}
		else{
			return 2;
		}
	}
	public static String PrintOutput(int a, int b){//Turns isBigger into words, special exception for first guess luck
		if(a==0){
			if(b == 1){
				return "You got it on the first try!";
			}
			else{
				return "You got it in "+b+" tries.";
			}
		}
		else if(a==1){
			return "It's higher.";
		}
		else{
			return "It's lower.";
		}
	}
	public static int BestTry(int a, int b){//comparator to return best game 
		if(a>b){
			return b;
		}
		else{
			return a;
		}
	}
}//EOF
