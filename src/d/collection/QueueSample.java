package d.collection;

import java.util.LinkedList;

public class QueueSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueSample sample= new QueueSample();
		sample.checkLinkedList1();
	}
	public void checkLinkedList1() {
		LinkedList<String> link=new LinkedList<String>();
		link.add("A");
		link.addFirst("B");
		System.out.println(link);
		link.offerFirst("C");
		System.out.println(link);
		link.addLast("D");
		System.out.println(link);
		link.offer("E");
		System.out.println(link);
		link.offerLast("F");
		System.out.println(link);
		link.push("G");
		System.out.println(link);
		link.add(0,"H");
		System.out.println(link);
		System.out.println("EX="+link.set(0, "I"));
		System.out.println(link);
		link.pop();
		System.out.println(link);
		link.get(0);
		System.out.println(link.get(0));
		System.out.println(link.contains(link));		//?? 데이터가 있는데 왜 false가 나오지??
		System.out.println(link.indexOf(link));			//위아같음
		System.out.println(link.lastIndexOf(link));		//위와같음
		System.out.println(link);
		System.out.println(link.remove());				//link의 맨앞데이터를 삭제하고 리턴
		System.out.println(link);
		System.out.println(link.listIterator(2));		//객체를리턴?  A부터 리턴되는줄
	}

}
