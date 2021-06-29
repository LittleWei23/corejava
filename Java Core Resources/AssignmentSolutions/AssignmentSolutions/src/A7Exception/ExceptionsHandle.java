package A7Exception;

public class ExceptionsHandle{
	public static void main(String[] args) {
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
			 throw new MyThreadException("exception!");

		}
	}
}
