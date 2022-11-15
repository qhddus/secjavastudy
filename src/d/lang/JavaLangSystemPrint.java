package d.lang;

public class JavaLangSystemPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaLangSystemPrint sample = new JavaLangSystemPrint();
		sample.printStreamCheck();
		sample.printNull();
		sample.printNullToString();
	}
	public void printStreamCheck() {
		byte b=127;
		short s=32767;
		System.out.println(b);
		System.out.println(s);
		printInt(b);
		printInt(s);
	}
	public void printInt(int value) {
		System.out.println(value);
	}
	public void printNull() {
		Object obj=null;
		System.out.println(obj);
		System.out.println(obj+" is object's value");	//new StringBuilder().append(obj).append(" is object's value")
	}
	public void printNullToString() {
		Object obj=null;
		System.out.println(obj.toString());		//예외발생 , 객체를 호출할땐 valueOf()가 안전
	}

}
