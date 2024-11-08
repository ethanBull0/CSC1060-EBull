
public class FullRemoteCourse extends OnlineCourse{
	
	private String contactEmail;

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
