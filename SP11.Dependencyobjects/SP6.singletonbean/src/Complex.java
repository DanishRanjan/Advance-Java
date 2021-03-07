import java.util.Scanner;

public class Complex implements Number 
{
	int r,i;
	public Complex(int r, int i) 
	{
		super();
		this.r = r;
		this.i = i;
	}
	public static Number getNumber()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rational part:-");
		int x=in.nextInt();
		System.out.println("Enter the imagenary part:-");
		int y=in.nextInt();
		return new Complex(x,y);
	}

	
	public Number add(Number n) 
	{
		Complex c=(Complex)n;
		int x=this.r+c.r;
		int y=this.i+c.i;
		return new Complex(x,y);
	}

	
	public void display() 
	{
		System.out.println(r+"+"+i+"i");
	}

}