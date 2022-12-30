package f.java8;

public class CalculateClassic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateClassic cc = new CalculateClassic();
		cc.calculateClassic();
		cc.calculateLambda();
		//cc.calculateSubtract();
	}
	private void calculateClassic() {
		Calculate calculateAdd= new Calculate() {
		@Override
		public int operation(int a, int b) {
			return a+b;
		}
	};
	System.out.println(calculateAdd.operation(1, 2));
	}

	private void calculateLambda() {
		Calculate calculateAdd=(a,b) -> a+b;
		System.out.println(calculateAdd.operation(1, 3));
		Calculate calculateSubtract=(a,b) -> a-b;
		System.out.println(calculateSubtract.operation(1, 2));
	}

}
