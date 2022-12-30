package stream;

public class StudentDTO {
	String name;
	int age;
	int scoreMath;
	int scoreEnglish;
	public StudentDTO(String name, int age, int scoreMath, int scoreEnglish) {
		this.name = name;
		this.age = age;
		this.scoreMath = scoreMath;
		this.scoreEnglish = scoreEnglish;
	}
	
	public String getName() {return name;}
	public void setname(String name) { this.name=name;}
	public int getAge() {return age;}
	public void setAge(int age) { this.age =age;}
	public int getScoreMath() {return scoreMath;}
	public void setScoreMath() {this.scoreMath=scoreMath;}
	public int getScoreEnglish() {return scoreEnglish;}
	public void setScoreEnglish() {this.scoreEnglish=scoreEnglish;}

}

