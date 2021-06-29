package p1;

public class B {

	public static void main(String[] args) {
		
		A aObject = new A();
		//System.out.println(aObject.a); won't work because a is private to class A
		System.out.println(aObject.b);
		System.out.println(aObject.c);
		System.out.println(aObject.d);

	}

}
