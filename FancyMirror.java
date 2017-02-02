//????????
public class FancyMirror {//it's just bigger/smaller, not even sure why it's fancy anyway
	public static int scalar = 25;//embiggens the noblest spirit, or at the very least gives them a bigger mirror
	public static void main(String[] args){
		Line();//calls Line();
		Loop();//calls Loop();
		Loop2();//calls Loop2();
		Line();//calls Line(); *again* as long as Line() hasn't gotten tired yet
	}//this is a closing bracket
	public static void Line(){
		/*we take in a single scalar and by that
		 *a magical ASCII line rides out into the sunset
		 *
		 *which is magically four times the size of the scalar
		 *
		 *amazing
		 */
		System.out.print("#");
		for(int size=1; size<=scalar*4; size++){
			System.out.print("=");//generates equality
		}
		System.out.println("#");//#=========# is a terrible hashtag
	}
	
	public static void Loop() {
		/*This is some magic code right here
		 * It takes in a single constraint scalar
		 * and by putting for *inside* for
		 * we get out a diamond
		 * 
		 * pretty cool huh*/
		for (int line=1;line<=scalar;line++){
			System.out.print("|");
			for(int spaces=1; spaces<=line*-2+(scalar*2);spaces++){
				System.out.print(" ");
			}
			System.out.print("<>");//it's a rhombus!
			for(int dots=1; dots<=(line*4-4);dots++){
				System.out.print(".");
			}
			System.out.print("<>");
			for(int spaces=1; spaces<=line*-2+(scalar*2);spaces++){
				System.out.print(" ");
			}
			System.out.print("|\n");
		}
	}
	public static void Loop2() {//Loop2() is lazy, copied its strategy from Loop(), so don't give it too much credit
		for (int line=1;line<=scalar;line++){
			System.out.print("|");//prints a vertical line, pretty cool huh?
			for(int spaces=1; spaces<=line*2-2;spaces++){
				System.out.print(" ");
			}
			System.out.print("<>");//compact html parser
			for(int dots=1; dots<=line*-4+scalar*4;dots++){
				System.out.print(".");
			}
			System.out.print("<>");
			for(int spaces=1; spaces<=line*2-2;spaces++){
				System.out.print(" ");
			}
			System.out.print("|\n");
		}

	}
}
/* This is the end of the file 
 * 
 * j/k going to end on line 69 haha */
