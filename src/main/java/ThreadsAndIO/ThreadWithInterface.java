package ThreadsAndIO;

public class ThreadWithInterface implements Runnable {

	public static void main(String[] args) {

		ThreadWithInterface tt = new ThreadWithInterface();
		Thread t = new Thread(tt);
		t.start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 34; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
