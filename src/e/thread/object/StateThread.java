package e.thread.object;

public class StateThread extends Thread{
	private Object monitor;
	public StateThread(Object monitor) {
		this.monitor=monitor;
	}
	public void run() {
		try {
			for(int loop=0;loop<10000;loop++) {
				String a="A";
			}
			synchronized(monitor) {
				monitor.wait();
			}	
		
		
		System.out.println(getName()+" is notified.");
		Thread.sleep(1000);		//1초간 대기 후 종료		왜 종료하지? 종료하는 명령어가없는데
	
		} catch (InterruptedException ie) {
		ie.printStackTrace();
		}
	}
}