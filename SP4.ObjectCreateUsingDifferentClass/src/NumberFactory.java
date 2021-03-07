import java.util.Scanner;

public class NumberFactory {
	public static NumberDisplay getNumber(){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:-");
		int x=in.nextInt();
		System.out.println("Enter the second number:-");
		int y=in.nextInt();
		return new NumberDisplay(x,y);
	}

}

