package e.thread;

public class RunnableSample implements Runnable{
	public static void main(String[] args) {
		RunnableSample sample=new RunnableSample();
		sample.run();
	}
	public void run() {
		System.out.println("This is RunnableSample's run() method");
	}
}
