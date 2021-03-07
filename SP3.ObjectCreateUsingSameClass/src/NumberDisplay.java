import java.util.Scanner;

public class NumberDisplay
{
	int a,b;

	public NumberDisplay(int a, int b) 
	{
	
		this.a = a;
		this.b = b;
	}
	public static NumberDisplay getNumber()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:-");
		int x=in.nextInt();
		System.out.println("Enter the second number:-");
		int y=in.nextInt();
		return new NumberDisplay(x,y);
	}
	public void display()
	{
		System.out.println("You are enter first number is:-\t"+a);
		System.out.println("You are enter second number is:-\t"+b);
		int x=a+b;
		System.out.println("Sum of both number is:-"+x);
	}

}