public class A {
	int a;

	public A(int a) {
		super();
		this.a = a;
		System.out.println("A is instantiated using parameter constructor.");
		System.out.println("Value of a:-\t"+a);
	}

	public A() {
		super();
		System.out.println("A is instantiated using Default constructor.");
	}

	public void setA(int a) {
		this.a = a;
		System.out.println("Value of A is set by setA() method.");
		System.out.println("Value of a:-\t"+a);
	}
	}
