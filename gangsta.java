////
//1/31/17
import java.util.*;//imports console reading methods
public class gangsta {
 public static void main(String[] args){
	 gangstaaaaa();//all methods need a cool name
 }
public static void gangstaaaaa(){
	Scanner console=new Scanner(System.in);//analysezz inputzz
	System.out.println("Type your name, playa:");//it tells you to enter your name
	String name=console.nextLine();//gets input from console
	String name2=name.toUpperCase();//converts to upper case for use in last name
	int space=name.indexOf(" ");//indices space (word break between first/last name)
	int end=name.length();//indices last char in string name
	System.out.println("Your gangsta name is "+name2.substring(0,1)+"."+" Diddy"+name2.substring(space,end)+" "+name.substring(0,space)+"-izzle");//you have a wide screen if you can read all of this
	}
}//greatness within this curly bracket
//EOF
