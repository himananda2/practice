package ThreadsAndIO;

public class SampleThread extends Thread {

	public void run() {

		for (int i = 0; i < 24; i++) {
			System.out.println(i);
			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		SampleThread t1 = new SampleThread();
		SampleThread t2 = new SampleThread();
		t1.start();
		t2.start();

	}

}
