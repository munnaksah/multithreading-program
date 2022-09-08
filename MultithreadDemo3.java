package threads;

public class MultithreadDemo3 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("this is run method");
				Thread.sleep(300);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		MultithreadDemo3 t1 = new MultithreadDemo3();
		t1.start();
		t1.join(300);
		for (int i = 0; i < 5; i++) {
			System.out.println("this is main method");

		}

	}

}
