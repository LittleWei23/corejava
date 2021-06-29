
public class A3CheckPrime {

	public static void main(String[] args) {
		int n = 94;
		boolean PrimFlag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				PrimFlag = false;
			}
		}
		if (PrimFlag == false) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}

}
