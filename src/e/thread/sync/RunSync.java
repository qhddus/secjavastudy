package e.thread.sync;

public class RunSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunSync runSync=new RunSync();
		for(int loop=0;loop<5;loop++) {
			runSync.runCommonCalculate();	
		}
		
		
	}
	public void runCommonCalculate() {
		CommonCalculate calc=new CommonCalculate();
		ModifyAmountThread thread1=new ModifyAmountThread(calc,true);
		ModifyAmountThread thread2=new ModifyAmountThread(calc,true);	//답이 0 이나오게하기 모름
		/* thread1,thread2가 같은 calc객체를 참조해서 synchronized 를 사용한다
		 *  thread2가 calc2를 참조하면 synchronized를 사용할 필요 없음
		 */
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
			System.out.println("Final value is "+calc.getAmount());
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
