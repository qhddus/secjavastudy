package e.thread.support;

public class RunSupportThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunSupportThreads sample = new RunSupportThreads();
		//sample.checkThreadState1();
		sample.checkJoin();
	}
	public void checkThreadState1() {
		SleepThread thread=new SleepThread(3000);
		try {
			System.out.println("thread state="+thread.getState());
			thread.start();
			System.out.println("thread state(after start)="+thread.getState());
			
			Thread.sleep(1000);
			System.out.println("thread state(after 1sec)="+thread.getState());
			
			thread.join();
			thread.interrupt();
			System.out.println("thread state(after join)="+thread.getState());
			
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	public void checkJoin() {
		SleepThread thread=new SleepThread(3000);
		try {
			thread.start();
			thread.join(3016);
			thread.interrupt();
			System.out.println("thread state(after join)"+thread.getState());
			thread.activeCount();
			System.out.println(thread.activeCount());		//현재쓰레드가 속한 쓰레드 그룹의 쓰레드중 살아있는 쓰레드의개수를 리턴
			System.out.println(thread.currentThread());		//현재 수행중인 쓰레드의 객체를 리턴
			//System.out.println(thread.dumpStack());		//콘솔창에 현재 쓰레드의 스택정보를 출력 근데 오류남 왠지모름
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
