import java.util.Scanner;


public class Hangman {
	public static void main(String[] args){
		mainloop();
	}
	public static void mainloop(){
		boolean isNotDead = true;
		int errors = 0;
		String allGuesses = "";
		String input = "";
		String word = word();
		String[] guessed = new String[word.length()];
		String[] blanked = blanker(guessed);
		while(isNotDead){
			allGuesses = allGuesses+goodGuess(word,input,blanked);
			System.out.println(allGuesses);
			input = input();
			letters(word ,input , blanked);
			errors = error(word,input,blanked,errors);
			isNotDead = gallows(errors);
		}
		System.out.println("You lose. The correct word was "+word());
	}
	public static String input(){
		System.out.print("Pick a letter: ");
		Scanner console = new Scanner(System.in);
		String input= console.next();
		String u_input = input.toLowerCase();
		return u_input;
	}
	public static String[] blanker(String guessed[]){
		for(int i = 0; i<guessed.length ; i++){
			guessed[i] = "_";
		}
		return guessed;
	}
	
	public static String word(){
		return "mississippi";
	}
	
	public static String[] letters(String word, String guess, String guessed[]){
		String [] letters = new String[word.length()];
		int correct = 0;
		for(int i = 0; i<word.length(); i++){
			letters[i]=word.substring(i,i+1);
			
			if (letters[i].equals(guess)){
				guessed[i] = letters[i];
				correct = 1;
			}
			System.out.print(guessed[i]);
		}
		if (correct == 0){
			
			System.out.println("\nWrong");
		}
			
		return guessed;
	}
	public static String goodGuess(String word, String guess, String guessed[]){
		String [] letters = new String[word.length()];
		int correct = 0;
		for(int i = 0; i<word.length(); i++){
			letters[i]=word.substring(i,i+1);
			
			if (letters[i].equals(guess)){
				guessed[i] = letters[i];
				correct = 1;
			}
		}
		if (correct == 0){
			return guess;
		}
		
			
		return "";
	}
	public static int error(String word, String guess, String guessed[], int wrong){
		String [] letters = new String[word.length()];
		int correct = 0;
		for(int i = 0; i<word.length(); i++){
			letters[i]=word.substring(i,i+1);
			if (letters[i].equals(guess)){
				correct = 1;
			}
		}
		if (correct == 0){
			wrong++;
		}
			
		return wrong;
	}
	public static boolean gallows(int a){
		System.out.println("______\n|   |");
		if(a==0){
			epost();
			epost();
			epost();
			epost();
			footer();
			return true;
		}
		else if(a==1){
			post();
			head();
			epost();
			epost();
			epost();
			footer();
			return true;
		}
		else if(a==2){
			post();
			head();
			post();
			body();
			epost();
			epost();
			footer();
			return true;
		}
		else if(a==3){
			post();
			head();
			post();
			leftarm();
			epost();
			epost();
			footer();
			return true;
		}
		else if(a==4){
			post();
			head();
			post();
			rightarm();
			epost();
			epost();
			footer();
			return true;
		}
		else if(a==5){
			post();
			head();
			post();
			rightarm();
			post();
			leftleg();
			epost();
			footer();
			return true;
		}
		else {
			post();
			System.out.println("(ded)");
			post();
			rightarm();
			post();
			rightleg();
			epost();
			footer();
			return false;
		}
		
	}
	public static void footer(){
		System.out.println("|_______");
	}
	public static void head(){
		System.out.println("('n')");
	}
	public static void body(){
		System.out.println("  |");
	}
	public static void leftarm(){
		System.out.println(" /| ");
	}
	public static void rightarm(){
		System.out.println(" /|\\");
	}
	public static void leftleg(){
		System.out.println(" /");
	}
	public static void rightleg(){
		System.out.println(" / \\");
	}
	public static void post(){
		System.out.print("| ");
	}
	public static void epost(){
		System.out.println("| ");
	}
}
