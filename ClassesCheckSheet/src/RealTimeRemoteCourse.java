import java.util.Arrays;

public class RealTimeRemoteCourse extends OnlineCourse{

	@Override
	public String toString() {
		return "RealTimeRemoteCourse [zoomInfo=" + Arrays.toString(zoomInfo) + ", getCourseNumber()="
				+ getCourseNumber() + ", getNumStudents()=" + getNumStudents() + ", getMaxStudents()="
				+ getMaxStudents() + ", getCredits()=" + getCredits() + "]";
	}

	private String[] zoomInfo;

	public RealTimeRemoteCourse() {
		super();
	}

	public String[] getZoomInfo() {
		return zoomInfo;
	}

	public void setZoomInfo(String[] zoomInfo) {
		this.zoomInfo = zoomInfo;
	}

	public RealTimeRemoteCourse(String[] zoomInfo) {
		super();
		this.zoomInfo = zoomInfo;
	}
}
