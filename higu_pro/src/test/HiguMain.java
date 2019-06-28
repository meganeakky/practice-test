package test;
import java.util.Arrays;

public class HiguMain {

	private static final Object lock = new Object();
	private static final ThreadTest obj = new ThreadTest(1);
	public static void main(String[] args) {

		for (int i=0; i<1000; i++){
			ThreadTest obj = new ThreadTest(i);
			Runnable r = new Runnable() {

				@Override
				public void run() {
					obj.testA();
				}
			};
			Thread t = new Thread(r);
			t.start();
		}
	}

	private static class ThreadTest {

		private final int instanceNumber;
		private static String errCd = "";

		public ThreadTest(int i){
			instanceNumber = i;
		}

		void testA(){
			synchronized(lock){
				System.out.printf("%3d : ", instanceNumber);
				for (String s : Arrays.asList("A", "B", "C")){
					System.out.print(s);
				}
				errCd = "err" + instanceNumber;
				System.out.println(" error -> " + errCd + " result -> "
				+ (errCd.equals("err"+instanceNumber)));

			}
		}

		synchronized void testB(){
			errCd = "err" + instanceNumber;
			System.out.printf("%3d : error -> " + errCd + " result -> "
			+ (errCd.equals("err"+instanceNumber)) + "\n", instanceNumber);

		}
	}

}
