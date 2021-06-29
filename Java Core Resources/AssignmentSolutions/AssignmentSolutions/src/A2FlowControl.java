
public class A2FlowControl {

	public static void main(String[] args) {
		int math, physics, chemistry;
		math = 60;
		physics = 50;
		chemistry = 55;
		if (math < 35 | physics < 35 | chemistry < 35) {
			System.out.println("Failed");
		} else if ((math + physics + chemistry) / 3 <= 59) {
			System.out.println("C Grade");
		} else if ((math + physics + chemistry) / 3 <= 69) {
			System.out.println("B Grade");
		} else {
			System.out.println("A Grade");
		}
	}
}
