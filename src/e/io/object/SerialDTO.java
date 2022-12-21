package e.io.object;

import java.io.Serializable;

public class SerialDTO implements Serializable{
	private String bookName;
	transient private int bookOrder;		//transient 라는예약어는 Serializable의 대상에서 제외된다,보안상중요변수나 저장할필요없는변수에 사용한다
	private boolean bestSeller;
	private long soldPerDay;
	private String bookTypes="IT";
	public SerialDTO(String bookName,int bookOrder, boolean bestSeller,long soldPerDay) {
		super();
		this.bookName = bookName;
		this.bookOrder = bookOrder;
		this.bestSeller = bestSeller ;
		this.soldPerDay = soldPerDay;
	}
	
	@Override
	public String toString() {
		return "SerialDTO [bookName="+bookName+", bookOrder="+bookOrder+
				", bestSeller=" +bestSeller+", soldPerDay="+soldPerDay+", bookTypes="+bookTypes+"]";
									//bookTypes란 변수가 없는데 실행하면 책에선 값이 null로 떠야하나 InvalidClass예외가 나옴
	}
}
