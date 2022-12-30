package lambda.functional;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PredicateExample sample = new PredicateExample();
		
		Predicate<String> prediacateLength5=(a) -> a.length()>5;
		Predicate<String> predicateContains=(a) -> a.contains("God");
		Predicate<String> predicateStart=(a) -> a.startsWith("God");
		
		String godOfJava="GodOfJava";
		String goodJava="GoodJava";
		
		sample.predicateTest(prediacateLength5, godOfJava);
		sample.predicateTest(prediacateLength5, goodJava);
		
		sample.predicateNegate(prediacateLength5,godOfJava);
		sample.predicateNegate(prediacateLength5, goodJava);
		
		sample.predicateAnd(prediacateLength5, predicateContains, godOfJava);
		sample.predicateAnd(prediacateLength5, predicateContains, goodJava);
		
		sample.predicateOr(prediacateLength5, predicateStart, godOfJava);
		sample.predicateOr(prediacateLength5, predicateStart, goodJava);
	}
	private void predicateTest(Predicate<String> p,String data) {
		System.out.println(p.test(data));
	}
	private void predicateAnd(Predicate<String> p1, Predicate<String> p2, String data) {
		System.out.println(p1.and(p2).test(data));
	}
	private void predicateOr(Predicate<String> p1, Predicate<String> p2, String data) {
		System.out.println(p1.or(p2).test(data));
	}
	private void predicateNegate(Predicate<String> p1, String data) {
		System.out.println(p1.negate().test(data));
	}

}
