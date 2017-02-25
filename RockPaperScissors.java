
//All commented println lines were for debug
import java.util.*;
public class RockPaperScissors {
	public static void main(String[] args){
		loop();
	}
	public static void loop(){
	boolean repeat = true;
		int wins = 0;
		int losses = 0;
		int ties = 0;
		int games = 0;
		int cheated = 0;
		
	while(repeat){
		String a= input();//user
		int b= RandInt();//computer
		int a1 = nameToInt(a);//user
		String b1 = intToName(b);//computer
		//System.out.println("You "+a1);
		String winState= win(a1,b);
		System.out.println("Computer chose "+b1);
		System.out.println("You "+winState);
		repeat = repeat();
		wins = collectWin(winState,wins);
		losses = collectLoss(winState,losses);
		ties = collectTie(winState,ties);
		games = games+1;
		cheated = collectCheater(winState, cheated);
		//System.out.println(games);
		}
		System.out.println(displayStats( wins, losses, ties, games, cheated));
		
	
	}
	public static boolean repeat(){
		Scanner console = new Scanner(System.in);
		System.out.println("Play again? (y/n)");
		String quit = console.next();
		if(quit.equals("y")){
			return true;
		}
		else{
			return false;
		}
		
	}
	public static int RandInt(){
		Random rand = new Random();
		int a = rand.nextInt(3);
		//System.out.println("Computer "+a);
		return a;
	}
	public static String intToName(int a){
		//System.out.println(a);
		if(a==0){
			return "R";
		}
		else if(a==1){
			return "P";
		}
		else{
			return "S";
		}
	}
	public static int nameToInt(String a){
		a = a.toUpperCase();
		//System.out.println(a);
		if(a.equals("R")){
			return 0;
		}
		else if(a.equals("P")){
			return 1;
		}
		else if(a.equals("S")){
			return 2;
		}
		else if(a.equalsIgnoreCase("gun")||a.equalsIgnoreCase("g")){
			return 3;
		}
		else{
			return -1;
		}
	}
	public static String input(){
		System.out.println("Choose your weapon? (R/P/S)");
		Scanner console = new Scanner(System.in);
		String input= console.next();
		return input;
		
	}
	public static String win(int a,int b){//user, computer
		//System.out.println("You "+a+" Computer "+b);
		if(a==1 && b==1){
			return "tied";
		}
		else if(a==0 && b==0){
			return "tied";
		}
		else if(a==2 && b==2){
			return "tied";
		}
		else if(a==0 && b==1){
			return "lose";
		}
		else if(a==1 && b==2){
			return "lose";
		}
		else if(a==2 && b==0){
			return "lose";
		}
		else if(a==1 && b==0){
			return "win";
		}
		else if(a==2 && b==1){
			return "win";
		}
		else if(a==0 && b==2){
			return "win";
		}
		else if(a==3){
			/*Just gonna have some fun with whoever dares type 
			 * "gun" or "g" into a rock-paper-scissors game,
			 * because that is seriously not cool...with some 
			 * great copypasta*/
			return "cheated";
		}
		else{
			return "are completely lost";

		}
	}
	/*All the next five methods do is increment their respective counters
	 * when the applicable event happens (win, loss, tie, cheating)*/
	public static int collectWin(String a, int b){
		if(a.equals("win")){
			b = b+1;
			//System.out.println(b+"1");
		}
		else{}
		return b;
	}
	public static int collectLoss(String a, int b){
		if(a.equals("lose")){
			b = b+1;
			//System.out.println(b+"2");
		}
		else{}
		return b;
	}
	public static int collectTie(String a, int b){
		if(a.equals("tied")){
			b = b+1;
			//System.out.println(b+"3");
		}
		else{}
		return b;
	
	}
	public static int collectCheater(String a, int b){
		if(a.equals("are completely lost")){
			b = b+1;
			//System.out.println(b+"3");
		}
		else{}
		return b;
	}
	public static String displayStats(int wins, int losses, int ties, int total, int cheated){
		
		double pct=wins*100/total;
		String stats = "";
		if(cheated>0){
			stats = ("total games = "+total+"\n       wins = "+wins+"\n     losses = "+losses+
					"\n       ties = "+ties+"\n    win pct = "+pct+"%"); //prints accepted values in human-readable format
		}
		else{
			stats = copypasta();
		}
		return stats;
	}
	public static String copypasta(){
		//don't try to finger-gun your way though this game
		return "... What the f**k did you just f**king do in my game, you little b**ch?\n" +
				"I’ll have you know I graduated top of my class in the Navy Seals,\n" +
				"and I’ve been involved in numerous secret raids on Al-Quaeda,\n" +
				"and I have over 300 confirmed kills. I am trained in gorilla warfare and\n" +
				"I’m the top sniper in the entire US armed forces. You are nothing to me\n" +
				"but just another target. I will wipe you the f**k out with precision the likes\n" +
				"of which has never been seen before on this Earth, mark my f**king words.\n" +
				"You think you can get away with inputting that s**t into Rock-Paper-Scissors?\n" +
				"Think again, f**ker. As we speak I am contacting my secret network of spies \n" +
				"across the USA and your IP is being traced right now so you better prepare \n" +
				"for the storm, maggot. The storm that wipes out the pathetic little \n" +
				"thing you call your life. You’re f**king dead, kid. I can be anywhere, anytime,\n" +
				"and I can kill you in over seven hundred ways, and that’s just with my bare hands.\n" +
				"Not only am I extensively trained in unarmed combat, but I have access to the\n" +
				"entire arsenal of the United States Marine Corps and I will use it to its full\n" +
				"extent to wipe your miserable a** off the face of the continent, you little s**t.\n" +
				"If only you could have known what unholy retribution your little “clever” \n" +
				"cheat was about to bring down upon you, maybe you would have followed the rules.\n" +
				"But you couldn’t, you didn’t, and now you’re paying the price, you goddamn idiot. \n" +
				"I will s**t fury all over you and you will drown in it. You’re f**king dead, kiddo.";
	}
}//EOF
	
