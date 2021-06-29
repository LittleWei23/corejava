package A5Abstraction;

public class Test {

	public static void main(String[] args) {
		TouchScreenLaptop hp = new HPNotebook();
		TouchScreenLaptop dell = new DELLNotebook();
		
		hp.click();
		hp.scroll();
		dell.click();
		dell.scroll();
		
	}

}
