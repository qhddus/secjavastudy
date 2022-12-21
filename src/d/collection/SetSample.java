package d.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetSample sample = new SetSample();
		String []cars=new String[] {
				"Tico","Sonata","BMW","Benz",
				"Lexus","Mustang","Grandeure",
				"The Beetle","Mini Cooper","i30"
				,"BMW","Lexus","Carnibal","Sm5",
				"SM7","SM3","Tico"
		};
		System.out.println(sample.getCarKinds(cars));
	}
	public int getCarKinds(String[] cars) {
		if(cars==null) return 0;			//cars가 비었으면 0리턴
		if(cars.length==1) return 1;		//cars의 길이가 1이면 1리턴
		Set<String> carSet=new HashSet<String>();		//Set 메소드를 이용해 carSet이라는	HashSet의 객체 생성
		for(String car:cars) {		//car에서 cars까지 반복
			carSet.add(car);		//carSet에 car를 추가?
		}
		printCarSet(carSet);
		System.out.println();
		printCarSet2(carSet);
		return carSet.size();		//carSet의 크기 리턴
	}
	public void printCarSet(Set<String> carSet) {
		for(String temp:carSet) {
			System.out.print(temp+" ");
		}
	}
	public void printCarSet2(Set<String> carSet) {
		Iterator<String> iterator = carSet.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}

}
/*	
	Hashset : 순서가 전혀 필요없는 데이터를 해시 테이블에 저장한다. set중에 가장 성능이 좋다
	Treeset : 저장된 데이터의 값에 따라서 정렬되는 셋이다. red-black이라는 트리 타입으로 값이 저장되면 ,hashset보다 성능이 느리다
	LinkedHashSet : 연결된 목록 타입으로 구현된 해시 테이블에 저장한다. 저장된 순서에 따라서 값이 정렬된다. 대신 선능이 이 셋 중에서 가장 나쁘다
*/