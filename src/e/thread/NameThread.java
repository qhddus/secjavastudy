package e.thread;

public class NameThread extends Thread{
	private int calcNumber;
	public NameThread(String name) {
		super(name);
		this.calcNumber=calcNumber;
	}
	public void run() {
		calcNumber++;
		
	}
}
