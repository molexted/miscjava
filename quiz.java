import java.util.*;//imports console reading methods
public class quiz {
public static void main(String[] args){
	 quiz();//all methods need a cool name	 
}
public static void quiz(){
	boolean hard = false;//initializes boolean for hard question, since getting it right is a T/F
	Scanner console=new Scanner(System.in);//analysezz inputzz
	System.out.println("What is f'(2) if f(x)=2x^5?");
	int q1=console.nextInt();//gets input from console
	System.out.println("What is f''(2) if f(x)=2x^5?");//unfortunately my questions are a bit.. derivative
	int q2=console.nextInt();//gets input from console
	System.out.println("What is f(2) if f'(x)=2x^5 and c = 0?");//decided to integrate a little harder question
	double q3=console.nextDouble();//gets input from console
	int correct = 0;
	if(q1 == 160){
		correct = correct +1;//increments # of correct awnsers by one if correct
	}
	else{
		System.out.println("The correct awnser for #1 is 160");//prints correct awnser if wrong
	}
	if(q2 == 320){
		correct = correct +1;
	}
	else{
		System.out.println("The correct awnser for #2 is 320");
	}
	if(q3 == 12.8){
		correct = correct +1;
		hard = true;
	}
	else{
		System.out.println("The correct awnser for #3 is 12.8");
	}
	if(correct==0){
		System.out.println("Are you sure you're not from Green River?");
	}
	if(correct==1){
		if(hard == true){
			System.out.println("You may have passed Calc 2, but where were you in Calc 1?");
		}
		else{
			System.out.println("You may want to consider that degree in literary criticism");
		}	
	}
	if(correct==2){
		if(hard == true){
			System.out.println("Derivatives appearently weren't integral to your sucess.");
		}
		else{
			System.out.println("You need to step it up, Math 151 rookie!");
		}
	}
	if(correct==3){
		System.out.println("You looked at the source code!");
	}
}
}//greatness within this curly bracket
//EOF