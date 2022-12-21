package d.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMapSample sample= new TreeMapSample();
		sample.checkTreeMap();
	}
	public void checkTreeMap() {
		TreeMap<String,String> map=new TreeMap<String,String>();
		map.put("A", "a");
		map.put("가", "e");
		map.put("1", "f");
		map.put("a", "g");
		Set<Map.Entry<String,String>> entries=map.entrySet();
		for(Map.Entry<String, String> tempEntry:entries) {
			System.out.println(tempEntry.getKey()+"="+tempEntry.getValue());
		}
		//System.out.println(lowerKey(a));
		//트리맵은 숫자,영어대문자,영어소문자,한글 순으로 정렬한다
	}

}
