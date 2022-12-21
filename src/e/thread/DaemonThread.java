package e.thread;

public class DaemonThread extends Thread{
	public static void main(String args[]) {
		DaemonThread daemon=new DaemonThread();
		daemon.runDaemonThread();
	}
	public void run() {
		try {
			Thread.sleep(Long.MAX_VALUE);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void runCommonThread() {
		DaemonThread thread=new DaemonThread();
		thread.start();
	}
	public void runDaemonThread() {
		DaemonThread thread=new DaemonThread();
		thread.setDaemon(true);
		thread.start();
	}
}
