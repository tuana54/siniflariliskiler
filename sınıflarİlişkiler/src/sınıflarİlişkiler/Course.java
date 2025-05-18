package sınıflarİlişkiler;

public class Course {
	private String courseName;
	private String code;
	private Instructor instructor;
	
	public Course(String courseName,String code,Instructor instructor) {
		this.courseName=courseName;
		this.code=code;
		this.instructor=instructor;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String Code) {
		this.code=code;
	}
	
	public double ort(Student[] students) {
		Student st4=new Student("busenur","sansar","565","ankara",90);
		double ortalama=0;
		for(int i=0;i<students.length;i++) {
			ortalama+=students[i].getNote();
		}
		return ortalama/students.length;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor=instructor;
	}
}



