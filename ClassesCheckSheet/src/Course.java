import java.util.ArrayList;

public class Course {

	private String courseNumber;
	private int numStudents;
	private int maxStudents;
	private int credits;
	private int id;
	private ArrayList<Student> studentList;
	
	public Course () {
		
	}
	public Course(String courseNumber, int numStudents, int maxStudents, int credits) {
		this.courseNumber = courseNumber;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public void addStudent(Student s) {
		studentList.add(s);
	}
	
	public void removeStudent(Student s) {
		studentList.remove(s);
	}

	@Override
	public String toString() {
		return "Course [\ncourseNumber=" + courseNumber + "\nnumStudents=" + numStudents + "\nmaxStudents=" + maxStudents
				+ "\ncredits=" + credits + "\n]";
	}
}
