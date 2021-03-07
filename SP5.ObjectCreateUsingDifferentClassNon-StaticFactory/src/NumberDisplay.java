public class NumberDisplay 
{
	int a,b;

	public NumberDisplay(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}
	public void display()
	{
		System.out.println("You are enter first number is:-\t"+a);
		System.out.println("You are enter second number is:-\t"+b);
		int x=a+b;
		System.out.println("Sum of both number is:-"+x);
	}
}
