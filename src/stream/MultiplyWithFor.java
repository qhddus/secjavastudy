package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyWithFor {
	static List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyWithFor mwf = new MultiplyWithFor();
		//mwf.multiplyWithFor(intList);
		
		List<StudentDTO> studentList = new ArrayList<>();
		studentList.add(new StudentDTO("요다",43,99,10));
		studentList.add(new StudentDTO("만두",30,71,85));
		studentList.add(new StudentDTO("건빵",32,81,75));
		List<String> nameList = studentList.stream().map(student->student.getName()).collect(Collectors.toList());
		System.out.println(nameList);
	}
	private void multiplyWithFor(List<Integer> intList) {
		for(int value:intList) {
			int tempValue=value*3;
			System.out.println(tempValue);
		}
		//for(int value:intList) System.out.println(value*3);  1,2,3,4,5 ... 의 3배
		//intList.stream().forEach(value->System.out.println(value*3)); 리스트 숫자의 3배를 출력
		
		
		//리스트 숫자를 3배로 바꿈
		intList.stream().map(x->x*3).forEach(System.out::println);
		//3,6,9,12,... 
		
	}

}
