public class StringConcatOperator {

	public static void main(String[] args) {

		String s = "xyz";

		int a = 10, b = 20, c = 30;

		System.out.println(s + a + b + c); //returns xyz102030 bcz evaluation starts
		//from left to right, so it appends a, b, and c to s
		System.out.println(a + b + c + s); // 60xyz
		System.out.println(a + b + s + c); //30xyz30
		System.out.println(a + s + b + c); //10xyz2030

	}

}
