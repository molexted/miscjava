//Alex Foster and Jonah Huang 2/21/17
import java.util.*;//import scanner
public class digitSum {
public static void main(String[] args){
	System.out.println(digitSum());
}
public static int digitSum(){
	Scanner console=new Scanner(System.in);
	int sum = 0;//initializes vars
	int number = 0;
	int temp = 0;
	System.out.println("Enter a #");
	number= console.nextInt();
	int length = String.valueOf(number).length();//string operates on the int number to find length
	for( int i=1; i<=length;i=i+1){//no need for a while loop while length of number is known
		temp = number%(10);//mods last digit
		number = number/10;//removes last digit
		sum=temp+sum;//adds last digit to total
	}
	return sum;
}
}//EOF
