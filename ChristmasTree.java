//Alex Foster 2/1/17
//Xmas tree creator
public class ChristmasTree {
    public static void main(String[] args) {
        drawTree(3, 4);//sample tree sizes
        drawTree(2, 5);
    }
    public static void drawTree(int num1, int scalar){
    	for(int i=0;i<num1;i++){//number of triangles in stack
				for (int line=1;line<=scalar;line++){//triangle creator, analagous to rocket
					for(int space=num1-i; space>=0;space--){
						System.out.print(" ");
					}
					for(int spaces=1; spaces<=line*-1+(scalar);spaces++){
						System.out.print(" ");
					}
					for(int dots=1; dots<=line+i;dots++){
						System.out.print("*");
					}
					for(int dots=1; dots<(line+i);dots++){
						System.out.print("*");
					}
					for(int spaces=1; spaces<=line*-1+(scalar);spaces++){
						System.out.print(" ");
					}
					System.out.print("\n");
					
				}
    	}
		for(int space=scalar+num1-1; space>=0;space--){//offsets base 
			System.out.print(" ");
		}
		System.out.println("*");
		for(int space=scalar+num1-1; space>=0;space--){// " "
			System.out.print(" ");
		}
		System.out.println("*");
		for(int space=scalar-4+num1; space>=0;space--){// " "
			System.out.print(" ");
		}
		System.out.println("*******\n");
    }
}
//EOF
 


