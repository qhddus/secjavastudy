package stream;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentForEachSample sample = new StudentForEachSample();
		List<StudentDTO> studentList=new ArrayList<>();
		studentList.add(new StudentDTO("요다",43,99,10));
		studentList.add(new StudentDTO("만두",30,71,85));
		studentList.add(new StudentDTO("건빵",32,81,75));
		
		sample.printStudentName(studentList);
	}
	public void printStudentName(List<StudentDTO> students) {
		students.stream().forEach(student -> System.out.println(student.getName()));
		System.out.println();
		for(StudentDTO student:students) System.out.println(student.getName());
		System.out.println();
		students.stream().map(student->student.getName()).forEach(name->System.out.println(name));
		//students.stream().forEach(student -> System.out.println(student.getName() ,student.getScoreMath(),student.getScoreEnglish()));
	}

}
