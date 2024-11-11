
public class InPersonCourse extends Course{
	private String building;
	private int roomNumber;
	
	@Override
	public String toString() {
		return "InPersonCourse [building=" + building + ", roomNumber=" + roomNumber + ", getCourseNumber()="
				+ getCourseNumber() + ", getNumStudents()=" + getNumStudents() + ", getMaxStudents()="
				+ getMaxStudents() + ", getCredits()=" + getCredits() + "]";
	}
	public InPersonCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InPersonCourse(String courseNumber, int numStudents, int maxStudents, int credits, String building, int roomNumber) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.building = building;
		this.roomNumber = roomNumber;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public InPersonCourse(String building, int roomNumber) {
		super();
		this.building = building;
		this.roomNumber = roomNumber;
	}

}
