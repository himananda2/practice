package ThreadsAndIO;

public class Thread1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.class);
		System.out.println(Thread.currentThread());
		System.out.println(Thread.getAllStackTraces());
		Thread1 t = new Thread1();
		
		String[] st = null;
		
		Thread1.main(st);

	}

}
