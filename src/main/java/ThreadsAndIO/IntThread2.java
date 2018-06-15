package ThreadsAndIO;

public class IntThread2 extends Thread {

	@Override
	public void run() {

		while (true) {
			System.out.println("him");
		}
	}

	public static void main(String[] args) {

		IntThread2 t = new IntThread2();
		t.run();
		System.out.println("======================================================================");
		t.stop();
	}

}
