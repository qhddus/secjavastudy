package e.thread;

public class RunEndlessThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunEndlessThreads sample = new RunEndlessThreads();
		sample.endless();
	}
	public void endless() {
		EndlessThread thread= new EndlessThread();
		thread.start();
	}

}
