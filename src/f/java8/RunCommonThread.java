package f.java8;

public class RunCommonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunCommonThread rct = new RunCommonThread();
		rct.runCommonThread();
		rct.runThread();
		rct.runThreadSimple();
	}
	private void runCommonThread() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		new Thread(runnable).start();
	}
	private void runThread() {
		new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
		}).start();
	}
	private void runThreadSimple() {
		new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
	}	//위에서부터 아래로 코드를 축약 가능

}
