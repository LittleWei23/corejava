
public class NonStaticMembersDemo {

	int num;

	NonStaticMembersDemo() {
		System.out.println("Inside constructor");
	}

	{
		System.out.println("inside non-stat block");
	}

	public static void main(String[] args) {
		System.out.println("inside main!");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		
		obj.doSth();
	}
	
	void doSth() {
		System.out.println("inside doSth");
	}
}
