import java.util.Scanner;

public class Rational implements Number {
	int p,q;
	

	public Rational(int p, int q) {
		super();
		this.p = p;
		this.q = q;
	}
	public static Number getNumber(){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Numerator part:-");
		int p=in.nextInt();
		System.out.println("Enter the Denominator part:-");
		int q=in.nextInt();
		return new Rational(p,q);
	}


	public Number add(Number n) {
		Rational r=(Rational)n;
		int x=this.p*r.q+this.q*r.p;
		int y=this.q*r.q;
		return new Rational(x,y);
	}

	
	public void display() {
		System.out.println(p+"/"+q);
	}

}
