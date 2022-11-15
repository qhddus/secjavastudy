package d.collection;

import java.util.ArrayList;

public class ListSample {

	private static final Object[] String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListSample sample=new ListSample();
		//sample.checkArrayList1();
		//sample.checkArrayList2();
		//sample.checkArrayList3();
		//sample.checkArrayList4();
		//sample.checkArrayList5();
		//sample.checkArrayList6();
		//sample.checkArrayList7();
		//sample.checkArrayList8();
		sample.checkArrayList9();
	}
	public void checkArrayList1() {
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<String>(100);
		//list1.add(new Object());			스트링만 넣는다고했는데 object를 넣어서 예외발생
		list1.add("ArrayListSample");
		//list1.add(new Double(1));			스트링만 넣는다고했는데 더블을 넣어서 예외발생
		System.out.println(list1);
	}
	public void checkArrayList2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1,"A1");
		System.out.println(list);
		for(String tempData:list) {
			System.out.println(tempData);
		}
	}
	public void checkArrayList3() {
		ArrayList<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1,"A1");
		ArrayList<String> list2=new ArrayList<>(list);
		list2.add("0 ");
		list2.addAll(list);
		for(String tempData:list2) {
			System.out.println("List2 "+tempData);
		}
		System.out.println(list2);
		
	}
	public void checkArrayList4() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		
		ArrayList<String> list2=list;		//list2에 list를 넣어서 객체의 참조되고있는 주소까지 사용
		list.add("Oooops");
		for(String tempData:list2) {
			System.out.println(tempData);	//그래서 list2에 Oooops를 넣지않아도  A,Ooops가 됨
		}
		list2.add("B");
		System.out.println(list);			//역으로 list2에 B를 넣어도 list에 B가 추가됨
		
	}
	public void checkArrayList5() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		int listSize=list.size();
		for(int loop=0;loop<listSize;loop++) {
			System.out.println("list.get("+loop+")="+list.get(loop));
		}
	}

	public void checkArrayList6() {
		ArrayList<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		String[] strList=list.toArray(new String[0]);
		System.out.println(strList[0]);
	}
	public void checkArrayList7() {
		ArrayList<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		String[] tempArray=new String[2];
		String[] strList=list.toArray(tempArray);
		for(String temp:strList) {
			System.out.println(temp);
		}
		System.out.println(tempArray.toString());
	}
	public void checkArrayList8() {
		ArrayList<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		//System.out.println("Removed "+list.remove(0));		//0번째 객체 리무브
		//System.out.println(list.remove("A"));					//A값 리무브
		ArrayList<String> temp=new ArrayList<String>();		
		temp.add("A");											//템프에  A값 넣음
		list.removeAll(temp);									//temp값 리무브 ,	A가 들어간곳 전체 리무브
		for(int loop=0;loop<list.size();loop++) {
			System.out.println("list.get("+loop+")="+list.get(loop));		
		}
	}
	public void checkArrayList9() {
		ArrayList<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.set(1,"C");			//1번째 배열에있는걸 C로바꿈
		System.out.println(list);
		for(String temp:list) {
			System.out.println(temp);
		}
	}
}
