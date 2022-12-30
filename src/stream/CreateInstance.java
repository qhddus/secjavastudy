package stream;

public class CreateInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateInstance ci = new CreateInstance();
		ci.createInstance();
	}

	private void createInstance() {
		MakeString makeString = String::new;
		char[] chars= {'G','o','d','O','f','J','a','v','a'};
		String madeString=makeString.fromBytes(chars);
		System.out.println(madeString);
		}
	}
