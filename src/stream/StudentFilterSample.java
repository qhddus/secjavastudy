package stream;

import java.util.ArrayList;
import java.util.List;

public class StudentFilterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentFilterSample sample = new StudentFilterSample();
		List<StudentDTO> studentList = new ArrayList<>();
		studentList.add(new StudentDTO("요다",43,99,10));
		studentList.add(new StudentDTO("만두",30,71,85));
		studentList.add(new StudentDTO("건빵",32,81,75));
		sample.filterWithScoreForLoop(studentList, 80);
	}
	private void filterWithScoreForLoop(List<StudentDTO> studentList, int scoreCutLine) {
		for (StudentDTO student:studentList) {
			if(student.getScoreMath()>scoreCutLine) {
				System.out.println(student.getName());
			}
		}
		//스트림으로 쓰면 밑의 문장
		studentList.stream().filter(student->student.getScoreMath()>scoreCutLine).forEach(student->System.out.println(student.getName()));
	}
	

}
