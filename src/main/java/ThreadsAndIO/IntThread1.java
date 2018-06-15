package ThreadsAndIO;

public class IntThread1 extends Thread {

	@Override
	public void run() {

		while (true) {
			System.out.println("him");
		}
	}

	public static void main(String[] args) {

		IntThread1 t = new IntThread1();
		t.start();
		System.out.println("======================================================================");
		t.stop();
	}

}
