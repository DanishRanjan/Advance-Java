public class A {
	int a;
	String b;
	public A(int a,String b) {
		super();
		this.a=a;
		this.b =b;
		System.out.println("Constructor is invoked");
	}
	public void display() {
		System.out.println(a+"\t\t"+b);
	}
	}

