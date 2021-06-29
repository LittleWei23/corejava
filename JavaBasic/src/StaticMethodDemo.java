
public class StaticMethodDemo {

	public static void main(String[] args) {
		System.out.println("Inside MAIN");
		StaticMethodDemo.method1();
	}

	static void method1() {
		System.out.println("Inside method1");
	}

	static {
		System.out.println("inside STATIC block");
		StaticMethodDemo.method1();
	}
}
