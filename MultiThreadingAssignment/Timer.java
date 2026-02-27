package MultiThreadingAssignment;

public class Timer implements Runnable {
	static int i = 0;

	@Override
	public void run() {
		while (true) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
			if (i == 11) {
				i = 0;
			}
		}
	}

	public static void main(String[] args) {
		Timer timer = new Timer();
		Thread t1 = new Thread(timer);

		t1.start();

	}
}
