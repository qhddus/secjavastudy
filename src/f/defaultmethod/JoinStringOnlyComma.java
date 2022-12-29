package f.defaultmethod;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoinStringOnlyComma {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JoinStringOnlyComma jsoc = new JoinStringOnlyComma();
		jsoc.joinStringOnlyComma(args);
		jsoc.joinString(args);
		jsoc.withCollector(args);
	}
	public void joinStringOnlyComma(String[] stringArray) {
		
		StringJoiner joiner = new StringJoiner(",");
		for(String string:stringArray) {
			joiner.add(string);
		}
		System.out.println(joiner);
	}
	public void joinString(String[] stringArray) {
		StringJoiner joiner=new StringJoiner(",","(",")");
		for(String string:stringArray) {
			joiner.add(string);
		}
		System.out.println(joiner);
	}
	public void withCollector(String[] stringArray) {
		List<String> stringList= Arrays.asList(stringArray);
		String result = stringList.stream().collect(Collectors.joining(","));
		System.out.println(result);
	}

}
