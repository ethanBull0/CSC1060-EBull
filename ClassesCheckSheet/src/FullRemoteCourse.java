
public class FullRemoteCourse extends OnlineCourse{
	
	private String contactEmail;
	@Override
	public String toString() {
		return "FullRemoteCourse [contactEmail=" + contactEmail + ", getCourseNumber()=" + getCourseNumber()
				+ ", getNumStudents()=" + getNumStudents() + ", getMaxStudents()=" + getMaxStudents()
				+ ", getCredits()=" + getCredits() + "]";
	}


	public FullRemoteCourse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FullRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String contactEmail) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.contactEmail = contactEmail;
	}


	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public FullRemoteCourse(String contactEmail) {
		super();
		this.contactEmail = contactEmail;
	}

}
