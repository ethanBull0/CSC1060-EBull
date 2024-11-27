import java.util.Arrays;

public class RealTimeRemoteCourse extends OnlineCourse{

	@Override
	public String toString() {
		return "RealTimeRemoteCourse [zoomInfo=" + zoomInfo + ", getCourseNumber()="
				+ getCourseNumber() + ", getNumStudents()=" + getNumStudents() + ", getMaxStudents()="
				+ getMaxStudents() + ", getCredits()=" + getCredits() + "]";
	}

	private String zoomInfo;

	public RealTimeRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String zoomInfo) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.zoomInfo = zoomInfo;
		// TODO Auto-generated constructor stub
	}

	public RealTimeRemoteCourse() {
		super();
	}

	public String getZoomInfo() {
		return zoomInfo;
	}

	public void setZoomInfo(String zoomInfo) {
		this.zoomInfo = zoomInfo;
	}

	public RealTimeRemoteCourse(String zoomInfo) {
		super();
		this.zoomInfo = zoomInfo;
	}
}
