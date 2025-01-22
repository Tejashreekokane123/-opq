package task1;

public class A {
	public A() {
		this(10.30f);
		System.out.println("non para A");
	}
	public A(int i) {
		this();
		System.out.println("int para A");
	}
	public A(double s) {
		System.out.println("Double para A ");
	}

}
