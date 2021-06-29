package A7MutiThread;

public class EvenNumberThread extends Thread {

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
					this.notify();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}