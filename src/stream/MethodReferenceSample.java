package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class MethodReferenceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceSample sample = new MethodReferenceSample();
		String[] stringArray = {"요다","만두","건빵"};
		sample.staticReference(stringArray);
		sample.objectReference(stringArray);
	}
	private static void printResult(String value) {
		System.out.println(value);
	}
	private void staticReference(String[] stringArray) {
		Stream.of(stringArray).forEach(MethodReferenceSample::printResult);
	}

	private void objectReference(String[] stringArray) {
		Arrays.sort(stringArray,String :: compareToIgnoreCase);//임의 객체 참조
		System.out.println();
		Arrays.asList(stringArray).stream().forEach(System.out :: println); // 인스턴스 메소드 참조
	}
	/*public int compareToIgnoreCase(String str) {
		return CASE_INSENSITIVE_ORDER.compare(this, str);
	}*/
}
