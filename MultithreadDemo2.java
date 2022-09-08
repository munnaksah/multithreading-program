package threads;

public class MultithreadDemo2 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("thread execution for outer print i = " + i);

			try {
				Thread.sleep(1000);
				System.out.println("Thread execution for i = " + i);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		MultithreadDemo2 t1 = new MultithreadDemo2();
		MultithreadDemo2 t2 = new MultithreadDemo2();

		t1.start();
		t2.start();
	}
}
