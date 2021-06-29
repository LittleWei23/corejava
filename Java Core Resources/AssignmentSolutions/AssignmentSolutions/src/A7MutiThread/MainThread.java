package A7MutiThread;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		OddNumbersThread odd = new OddNumbersThread();
		Thread ot = new Thread(odd);
		EvenNumberThread even = new EvenNumberThread();
		Thread et = new Thread(even);
		
		ot.start();
		
		synchronized(ot) {
			et.start();
			ot.wait();	
		}

	}

}
