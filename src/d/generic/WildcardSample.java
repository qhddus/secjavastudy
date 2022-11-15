package d.generic;

public class WildcardSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildcardSample sample = new WildcardSample();
		sample.callWildcardMethod();
	}

	public void callWildcardMethod() {
		WildcardGeneric<String> wildcard=new WildcardGeneric<String>();
		wildcard.setWildcard("A");
		wildcardStringMethod(wildcard);
	}
	public void wildcardStringMethod(WildcardGeneric<String> c) {
		String value=c.getWildcard();
		System.out.println(value);
	}
	/*public void wildcardStringMethod(WildcardGeneric<?> c) { 	위에 메소드를 지금처럼바꾸면 제네릭으로 바꾼것 <>안에 ?를 너어준다
		Object value=c.getWildcard();			String대신에 Object를 써준다					?를 wildcard타입이라고 부른다
		System.out.println(value);				
	}*/
}
