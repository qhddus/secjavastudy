package e.thread;

public class RunThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunThreads threads=new RunThreads();
		threads.runBasic();
	}
	public void runBasic() {
		RunnableSample runnable=new RunnableSample();
		new Thread(runnable).start();
		
		ThreadSample thread=new ThreadSample();
		thread.start();
		System.out.println("RunThreads.runBasic() method is ended.");
	}

}
