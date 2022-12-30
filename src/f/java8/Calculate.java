package f.java8;

@FunctionalInterface		//하나의 메소드만 선언할수있다 2개이상 선언하면 에러발생
public interface Calculate {
	int operation(int a, int b);
}
