public class PrimitiveAndObject {
	public static void main(String[] args) {
		int x = 100;
		Integer y = Integer.valueOf(x); // boxing -> primitive x to obj y
		int z = y.intValue(); //unboxing -> obj y to primitive z
	}
}
