
public class A4Loop {

	public static void main(String[] args) {
		
		int num = 5;

		// for loop:
		for (int i = 1; i <= num; i++) {
			if (i % 10 == 0) {
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i);
		}

		// while loop
		int i = 1;
		while (i <= num) {
			if (i % 10 == 0) {
				i++;
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i++);
		}

		// do-while loop
		i =1;
		do {
			if (i % 10 == 0) {
				i++;
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i++);
		} while (i <= num);
	}

}
