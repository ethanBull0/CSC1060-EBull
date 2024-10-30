import java.util.ArrayList;
import java.util.

public class Student { //extends course?

	private String firstName;
	private String lastName;
	private int studentNumber;
	private int grade;
	private ArrayList<Course> courseList;
	
	public Student() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentNumber=" + studentNumber
				+ ", grade=" + grade + ", courseList=" + courseList + "]";
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getStudentNumber() {
		return studentNumber;
	}



	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public ArrayList<Course> getCourseList() {
		return courseList;
	}



	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}



	public Student(String firstName, String lastName, int studentNumber, int grade, ArrayList<Course> courseList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
		this.grade = grade;
		this.courseList = courseList;
	}



	public void addCourse(Course c) {
		courseList.add(c);
	}
	
	
	
	public void removeCourse(Course c) {
		courseList.remove(c);
	}

}
