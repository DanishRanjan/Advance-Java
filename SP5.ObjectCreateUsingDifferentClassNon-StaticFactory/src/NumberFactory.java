import java.util.Scanner;

public class NumberFactory 
{
	static final int NumberDisplay=1;
	int number;
	
	public NumberFactory(int number)
	{
		super();
		this.number = number;
	}
	public void getNumberFactory()
	{
		number=NumberDisplay;	
	}

	public NumberDisplay getNumber()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:-");
		int x=in.nextInt();
		System.out.println("Enter the second number:-");
		int y=in.nextInt();
		return new NumberDisplay(x,y);
	}
}