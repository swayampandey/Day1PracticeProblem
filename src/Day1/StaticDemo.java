package Day1;

public class StaticDemo {
	/**
	 * Taking static variables
	 */
	static int a =10;
	static double d=10.5;
	/**
	 * 
	 * static method
	 */
	static void display() {
		System.out.println("Static method");
	}
	/**
	 * 
	 * static block
	 */
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(d);
		display();
		

	}

}
