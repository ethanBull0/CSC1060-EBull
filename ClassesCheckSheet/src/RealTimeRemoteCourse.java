
public class RealTimeRemoteCourse extends OnlineCourse{

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
