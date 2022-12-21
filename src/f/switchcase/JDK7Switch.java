package f.switchcase;

public class JDK7Switch {
	//private final int ENGINEER=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDK7Switch switchSample = new JDK7Switch();
		//System.out.println(switchSample.salaryIncreaseAmount(3));
		System.out.println(switchSample.salaryIncreaseAmount("Engineer"));
	}
	public double salaryIncreaseAmount(String employeeLevel) {
		
		switch(employeeLevel) {
		case "CEO" : //CEO
			return 10.0;
		case "Manager" : //Manager
			return 15.0;
		case "Engineer" : //Engineer, Developer
		case "Developer" :
			return 100.0;
		//case 4 : //Designer, Planner
		case "Designer" :
		case "Planner" :
			return 20.0;
		}
		return 0.0;
	}

}
