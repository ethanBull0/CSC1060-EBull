
public class InPersonCourse extends Course{
	
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
	private String building;
	private int roomNumber;

}
